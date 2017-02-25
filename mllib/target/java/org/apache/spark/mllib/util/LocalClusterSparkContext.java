package org.apache.spark.mllib.util;
public  interface LocalClusterSparkContext extends org.scalatest.BeforeAndAfterAll {
  public  org.apache.spark.SparkContext sc ()  ;
  public  void beforeAll ()  ;
  public  void afterAll ()  ;
}
