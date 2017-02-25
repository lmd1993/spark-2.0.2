package org.apache.spark.sql.execution.streaming.state;
public  class StateStoreRDDSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.scalatest.BeforeAndAfterAll {
  public   StateStoreRDDSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  private  java.lang.String tempDir ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType keySchema ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType valueSchema ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<java.lang.String> makeRDD (org.apache.spark.SparkContext sc, scala.collection.Seq<java.lang.String> seq)  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.execution.streaming.state.StateStore, scala.collection.Iterator<java.lang.String>, scala.collection.Iterator<scala.Tuple2<java.lang.String, java.lang.Object>>> increment ()  { throw new RuntimeException(); }
}
