package org.apache.spark.sql.hive.test;
public  interface TestHiveSingleton extends org.scalatest.BeforeAndAfterAll {
  public  org.apache.spark.sql.SparkSession spark ()  ;
  public  org.apache.spark.sql.hive.test.TestHiveContext hiveContext ()  ;
  public  void afterAll ()  ;
}
