package org.apache.spark.examples.connector.rdd

/**
  * Created by MingdaLi on 2/21/17.
  */
import org.apache.spark.examples.connector.result.{AsterixResultIterator, AsterixResultReader}
import org.apache.spark.examples.connector.{Configuration, Handle, ResultLocations, AsterixHttpAPI, AsterixClient}
import org.apache.spark.{TaskContext, Partition, SparkContext}
import org.apache.spark.rdd.RDD
import org.json.JSONObject

import scala.util.Try

/**
  * AsterixRDD is the bridge between AsterixDB and Spark.
  *
  * @param sc SparkContext
  * @param aql Currently not used.
  * @param api AsterixDB HTTP API client.
  * @param locations Result Locations.
  * @param handle Result handle from the HTTP API for the submitted job.
  */
class AsterixRDD (@transient sc: SparkContext,
                  @transient aql:String,
                  @transient api: AsterixHttpAPI,
                  @transient locations: ResultLocations,
                  @transient handle: Handle,
                  val configuration: Configuration)
  extends RDD[String](sc, Seq.empty){


  override def getPreferredLocations(split:Partition) : Seq[String] = {
    val location = split.asInstanceOf[AsterixPartition].location.address
    Seq(location)
  }



  override def getPartitions : Array[Partition] = {
    val resultLocations = locations
    val distinctLocations = resultLocations.locations.zipWithIndex

    val part = distinctLocations.map(x=> AsterixPartition(x._2,resultLocations.handle,x._1))
    part.toArray
  }


  @transient
  def getSchema : JSONObject = {
    api.getResultSchema(handle)
  }

  @transient
  def repartitionAsterix(numPartitions: Int): RDD[String] ={
    val count = getPartitions.length
    super.repartition(numPartitions)
  }

  override def compute(split:Partition, context:TaskContext): Iterator[String] = {
    val partition = split.asInstanceOf[AsterixPartition]

    val resultReader = new AsterixResultReader(partition.location, partition.index,
      partition.handle, configuration)

    val startTime = System.nanoTime()

    context.addTaskCompletionListener{(context) =>
      val endTime = System.nanoTime()
      logInfo("Finish from running partition:" + partition.index
        + " in " + ((endTime-startTime)/1000000000d) + "s")
    }


    new AsterixResultIterator(resultReader)
  }

}
