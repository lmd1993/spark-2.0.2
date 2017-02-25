package org.apache.spark.examples.connector
import org.apache.spark.examples.connector.QueryType
import org.apache.spark.examples.connector.rdd.AsterixRDD
import org.apache.spark.examples.connector.AsterixClient
import org.apache.hyracks.api.dataset.DatasetDirectoryRecord.Status
import org.apache.spark.internal.Logging
import org.apache.spark.SparkContext
import scala.util.{Failure, Success, Try}
/**
  * Created by MingdaLi on 2/21/17.
  */
class SparkContextFunctions(@transient sc: SparkContext) extends Serializable with Logging{

  private val WaitTime = 100;
  private val configuration: Configuration = {
    val sparkConf = sc.getConf

    //Non-optional configurations
    val host: String = sparkConf.get(Configuration.AsterixDBHost)
    val port: String = sparkConf.get(Configuration.AsterixDBPort)
    val frameSize: String = sparkConf.get(Configuration.AsterixDBFrameSize)

    //Optional configurations
    val nFrame: Int = Try(sparkConf.get(Configuration.AsterixDBFrameNumber)) match {
      case Success(n) => n.toInt
      case Failure(e) => AsterixClient.NUM_FRAMES
    }

    val nReader: Int = Try(sparkConf.get(Configuration.AsterixDBNumberOfReaders)) match {
      case Success(n) => n.toInt
      case Failure(e) => AsterixClient.NUM_READERS
    }

    val prefetchThreshold: Int = Try(sparkConf.get(Configuration.AsterixDBPrefetchThreshold)) match {
      case Success(n) => n.toInt
      case Failure(e) => AsterixClient.PREFETCH_THRESHOLD
    }

    logInfo(Configuration.AsterixDBHost + " " + host)
    logInfo(Configuration.AsterixDBPort + " " + port)
    logInfo(Configuration.AsterixDBFrameSize + " " + frameSize)
    logInfo(Configuration.AsterixDBFrameNumber + " " + nFrame)
    logInfo(Configuration.AsterixDBNumberOfReaders + " " + nReader)
    logInfo(Configuration.AsterixDBPrefetchThreshold + " " + prefetchThreshold)

    new Configuration(
      host,
      port,
      frameSize.toInt,
      nFrame,
      nReader,
      prefetchThreshold
    )
  }

  private val api = new AsterixHttpAPI(configuration)

  def aql(aql:String): AsterixRDD = {
    executeQuery(aql, QueryType.AQL)
  }
  def sqlpp(sqlpp:String): AsterixRDD = {
    executeQuery(sqlpp, QueryType.SQLPP)
  }

  private def executeQuery(query: String, queryType: QueryType): AsterixRDD = {
    val handle = queryType match {
      case QueryType.AQL => api.executeAQL(query)
      case QueryType.SQLPP => api.executeSQLPP(query)
    }
    var isRunning = true

    while(isRunning) {
      val status = api.getStatus(handle)
      status match {
        case Status.SUCCESS => isRunning = false
        case Status.FAILED => throw new AsterixConnectorException("Job " + handle.jobId + " failed.")
        case _ => wait(WaitTime) //Status.RUNNING
      }

    }
    val resultLocations = api.getResultLocations(handle)
    val rdd = new AsterixRDD(sc, query, api, resultLocations, handle, configuration)
    rdd
  }

}

