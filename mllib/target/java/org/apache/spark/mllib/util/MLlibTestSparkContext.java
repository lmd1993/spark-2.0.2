package org.apache.spark.mllib.util;
public  interface MLlibTestSparkContext extends org.apache.spark.ml.util.TempDirectory {
  public  org.apache.spark.sql.SparkSession spark ()  ;
  public  org.apache.spark.SparkContext sc ()  ;
  public  java.lang.String checkpointDir ()  ;
  public  void beforeAll ()  ;
  public  void afterAll ()  ;
}
