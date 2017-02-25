package org.apache.spark.sql.execution.streaming;
/** A {@link ForeachWriter} that writes collected events to ForeachSinkSuite */
public  class TestForeachWriter extends org.apache.spark.sql.ForeachWriter<java.lang.Object> {
  public   TestForeachWriter ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.execution.streaming.ForeachSinkSuite.Event> events ()  { throw new RuntimeException(); }
  public  boolean open (long partitionId, long version)  { throw new RuntimeException(); }
  public  void process (int value)  { throw new RuntimeException(); }
  public  void close (java.lang.Throwable errorOrNull)  { throw new RuntimeException(); }
}
