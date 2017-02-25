package org.apache.spark.rdd;
public  class AsyncRDDActionsSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll, org.scalatest.concurrent.Timeouts {
  public   AsyncRDDActionsSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.EmptyRDD<java.lang.Object> zeroPartRdd ()  { throw new RuntimeException(); }
  private <R extends java.lang.Object> void testAsyncAction (scala.Function1<org.apache.spark.rdd.RDD<java.lang.Object>, org.apache.spark.FutureAction<R>> action)  { throw new RuntimeException(); }
}
