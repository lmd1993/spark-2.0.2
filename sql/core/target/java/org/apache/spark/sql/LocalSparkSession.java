package org.apache.spark.sql;
/** Manages a local `spark` {@link SparkSession} variable, correctly stopping it after each test. */
public  interface LocalSparkSession extends org.scalatest.BeforeAndAfterEach, org.scalatest.BeforeAndAfterAll {
  public  org.apache.spark.sql.SparkSession spark ()  ;
  public  void beforeAll ()  ;
  public  void afterEach ()  ;
  public  void resetSparkContext ()  ;
}
