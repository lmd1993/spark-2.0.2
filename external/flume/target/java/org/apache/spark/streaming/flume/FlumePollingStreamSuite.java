package org.apache.spark.streaming.flume;
public  class FlumePollingStreamSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll, org.apache.spark.internal.Logging {
  public   FlumePollingStreamSuite ()  { throw new RuntimeException(); }
  public  int maxAttempts ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration batchDuration ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkContext _sc ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.flume.PollingFlumeTestUtils utils ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  /**
   * Run the given test until no more java.net.BindException's are thrown.
   * Do this only up to a certain attempt limit.
   * @param test (undocumented)
   */
  private  void testMultipleTimes (scala.Function0<scala.runtime.BoxedUnit> test)  { throw new RuntimeException(); }
  private  void testFlumePolling ()  { throw new RuntimeException(); }
  private  void testFlumePollingMultipleHost ()  { throw new RuntimeException(); }
  public  void writeAndVerify (scala.collection.Seq<java.lang.Object> sinkPorts)  { throw new RuntimeException(); }
}
