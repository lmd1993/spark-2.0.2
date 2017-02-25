package org.apache.spark.streaming;
/**
 * Helper methods for testing StreamingContextSuite
 * This includes methods to access private methods and fields in StreamingContext and MetricsSystem
 */
public  class StreamingContextSuite$ implements org.scalatest.PrivateMethodTester, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StreamingContextSuite$ MODULE$ = null;
  public   StreamingContextSuite$ ()  { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.collection.mutable.ArrayBuffer<org.apache.spark.metrics.source.Source>> _sources ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.metrics.source.Source> getSources (org.apache.spark.metrics.MetricsSystem metricsSystem)  { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<org.apache.spark.streaming.StreamingSource> _streamingSource ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.StreamingSource getStreamingSource (org.apache.spark.streaming.StreamingContext streamingContext)  { throw new RuntimeException(); }
}
