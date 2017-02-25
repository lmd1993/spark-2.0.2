package org.apache.spark.examples.connector.exam
import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkContext, SparkConf}
import org.apache.spark.sql.asterix._
import org.apache.spark.examples.connector._
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
object Baseline_SparkSQL {

}
