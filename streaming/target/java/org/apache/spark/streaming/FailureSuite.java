package org.apache.spark.streaming;
/**
 * This testsuite tests master failures at random times while the stream is running using
 * the real clock.
 */
public  class FailureSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.apache.spark.internal.Logging {
  public   FailureSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.Duration batchDuration ()  { throw new RuntimeException(); }
  private  int numBatches ()  { throw new RuntimeException(); }
  private  java.io.File directory ()  { throw new RuntimeException(); }
}
