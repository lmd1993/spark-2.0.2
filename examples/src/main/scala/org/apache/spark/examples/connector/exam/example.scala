package org.apache.spark.examples.connector.exam
import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkContext, SparkConf}
import org.apache.spark.examples.connector._
import org.apache.spark.sql.asterix._
/**
  * To Run this example, you need to have AsterixDB up and running.
  *
  * The frame size is specified at conf/asterix-configuration.xml file under Managix folder.
  * Default value of the frame size is 131072.
  *
  * If you're running AsterixDB using [[AsterixHyracksIntegrationUtil]] usually the
  * frame size is 32768.
  *
  * If you don't know what [[AsterixHyracksIntegrationUtil]] is, then probably the
  * frame size is 131072.
  * Note: Project->right click->Open Module Settings->Modules->Dependencies->Provide-Compile
  * Terminal-> sbt -> compile
  */
object Example {
  var sc: SparkContext = null

  val aqlQuery = """
                   |let $exampleSet := [
                   | {"name" : "Ann", "age" : 20, "salary" : 100000},
                   | {"name" : "Bob", "age" : 30, "salary" : 200000},
                   | {"name" : "Cat", "age" : 40, "salary" : 300000, "dependents" : [1, 2, 3]}
                   |]
                   |for $x in $exampleSet
                   |return $x
                   |""".stripMargin

  val sqlppQuery ="""
                    | SELECT element exampleSet
                    | FROM [
                    | {"name" : "Ann", "age" : 20, "salary" : 100000},
                    | {"name" : "Bob", "age" : 30, "salary" : 200000},
                    | {"name" : "Cat", "age" : 40, "salary" : 300000, "dependents" : [1, 2, 3]}
                    | ] as exampleSet;
                    | """.stripMargin


  def init() = {
    /**
      * Configure Spark with AsterixDB-Spark connector configurations.
      */
    val conf = new SparkConf()
      .setMaster("local[4]")
      .set("spark.asterix.connection.host", "localhost") //AsterixDB API host
      .set("spark.asterix.connection.port", "19002") //AsterixDB API port
      .set("spark.asterix.frame.size", "32768") //AsterixDB configured frame size
      .set("spark.driver.memory", "1g")
      .setAppName("AsterixDB-Spark Connector Example")

    //Initialize SparkContext with AsterixDB configuration
    sc = new SparkContext(conf)
  }

  /**
    * This example shows how to get AsterixRDD from an AQL query.
    * AsterixRDD usually is not the most useful form as it returns the result
    * as RDD[String]. Until now, AsterixDB does not provide a Java driver. Once
    * that we have it. This form can be useful and less memory intensive.
    */
  def runAsterixRDD() = {
    /* Get AstreixRDD from SparkContext using AQL query.
     * You can use sqlpp() to get the result from running SQL++ query.
     */
    val rddAql = sc.aql(aqlQuery)

    println("AQL result")
    rddAql.collect().foreach(println)
    //show all dataset and dataverse
    val sqlContext= new SQLContext(sc)
    val dataAll=sqlContext.showAll()
    dataAll.show()
    //choose one dataset in a dataverse that you want to use
    val Dataverse="tpcds3";
    val Dataset="inventory"
    val schema=sqlContext.showSchema(Dataverse,Dataset);
    println(schema)
    //use one dataset in a dataverse. Return a Dataframe
    val datasetR=sqlContext.useDataset(Dataverse,Dataset);
    datasetR.show()




  }

  /**
    * This is the best way to interact with AsterixDB using Spark.
    * the query (SQL++ or AQL) result is returned as a DataFrame which
    * can then be used with many of Spark libraries.
    */
  def runAsterixWithDataFrame() = {
    //Create SQLContext from SparkContext
    val sqlContext = new SQLContext(sc)

    /* Get DataFrame by running SQL++ query (AQL also supported by calling aql())
     * infer = true means that we tell AsterixDB to provide Spark the result schema.
     * if that throws an exception, probably you AsterixDB doesn't have the schema inferencer.
     * Therefore, let infer = false and Spark will do the job (with the cost of additional scan).
     */
    val dfSqlpp = sqlContext.sqlpp(sqlppQuery)

    println("SQL++ DataFrame result")
    dfSqlpp.filter(dfSqlpp("age")>30).show()


  }

  /**
    * Run the example.
    * @param args
    */
  def main (args: Array[String]) {
    init()
    runAsterixRDD()

    runAsterixWithDataFrame()
    sc.stop()
    //    val conf = new SparkConf().setAppName("sdfsf").setMaster("local[2]")
    //    val sc = new SparkContext(conf)
  }
}
