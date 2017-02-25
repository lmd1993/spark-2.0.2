package org.apache.spark.sql.streaming;
/** Companion object, primarily for creating StreamingQueryInfo instances internally */
public  class StreamingQueryStatus$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StreamingQueryStatus$ MODULE$ = null;
  public   StreamingQueryStatus$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamingQueryStatus apply (java.lang.String name, long id, long timestamp, double inputRate, double processingRate, scala.Option<java.lang.Object> latency, org.apache.spark.sql.streaming.SourceStatus[] sourceStatuses, org.apache.spark.sql.streaming.SinkStatus sinkStatus, scala.collection.immutable.Map<java.lang.String, java.lang.String> triggerDetails)  { throw new RuntimeException(); }
  public  java.lang.String indent (scala.collection.Iterable<java.lang.String> strings)  { throw new RuntimeException(); }
  public  java.lang.String indent (java.lang.String string)  { throw new RuntimeException(); }
  /** Create an instance of status for python testing */
  public  org.apache.spark.sql.streaming.StreamingQueryStatus testStatus ()  { throw new RuntimeException(); }
}
