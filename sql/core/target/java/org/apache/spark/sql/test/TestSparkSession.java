package org.apache.spark.sql.test;
/**
 * A special {@link SparkSession} prepared for testing.
 */
  class TestSparkSession extends org.apache.spark.sql.SparkSession {
  public   TestSparkSession (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public   TestSparkSession (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  public   TestSparkSession ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.internal.SessionState sessionState ()  { throw new RuntimeException(); }
  public  void loadTestData ()  { throw new RuntimeException(); }
  private  class testData implements org.apache.spark.sql.test.SQLTestData {
    public   testData ()  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  }
  private  org.apache.spark.sql.test.TestSparkSession.testData$ testData ()  { throw new RuntimeException(); }
}
