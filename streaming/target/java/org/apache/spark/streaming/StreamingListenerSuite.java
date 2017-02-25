package org.apache.spark.streaming;
public  class StreamingListenerSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.TestSuiteBase, org.scalatest.Matchers {
  public   StreamingListenerSuite ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Seq<scala.collection.Seq<java.lang.Object>> input ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.spark.streaming.dstream.DStream<java.lang.Object>, org.apache.spark.streaming.dstream.DStream<java.lang.Object>> operation ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  public  void afterFunction ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration batchDuration ()  { throw new RuntimeException(); }
  public  boolean actuallyWait ()  { throw new RuntimeException(); }
  private  void startStreamingContextAndCallStop (org.apache.spark.streaming.StreamingContext _ssc)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.Object, java.lang.String> startStreamingContextAndCollectFailureReasons (org.apache.spark.streaming.StreamingContext _ssc, boolean isFailed)  { throw new RuntimeException(); }
  /** Check if a sequence of numbers is in increasing order */
  public  boolean isInIncreasingOrder (scala.collection.Iterable<java.lang.Object> data)  { throw new RuntimeException(); }
}
