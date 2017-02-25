package org.apache.spark.examples.connector

/**
  * Created by MingdaLi on 2/21/17.
  */
final class Configuration(val host: String,
                          val port: String,
                          val frameSize: Int,
                          val nFrames: Int,
                          val nReaders: Int,
                          val prefetchThreshold: Int) extends Serializable

object Configuration {

  /**
    * AsterixDB HTTP API host address.
    *
    * Required.
    */
  val AsterixDBHost = "spark.asterix.connection.host"

  /**
    * AsterixDB HTTP API port number.
    *
    * Required.
    */
  val AsterixDBPort = "spark.asterix.connection.port"

  /**
    * AsterixDB compiler frame size.
    * This can be found in your AsterixDB configuration file
    *
    * Required
    */
  val AsterixDBFrameSize = "spark.asterix.frame.size"


  //OPTIONAL Configurations

  /**
    * Number of AsterixDB frames to read at a time.
    * This should NOT be big as the intermediate result can consume large amount memory.
    *
    * Optional.
    * Default: 1
    */
  val AsterixDBFrameNumber = "spark.asterix.frame.number"

  /**
    * The number of parallel readers per AsterixDB result partition.
    *
    * Optional.
    * Default: 2
    */
  val AsterixDBNumberOfReaders = "spark.asterix.reader.number"

  /**
    * The remaining number of unread tuples before trigger the pre-fetcher.
    * This should NOT be big as the intermediate result can consume large amount memory.
    *
    * Optional.
    * Default: 2
    */
  val AsterixDBPrefetchThreshold = "spark.asterix.prefetch.threshold"
}
