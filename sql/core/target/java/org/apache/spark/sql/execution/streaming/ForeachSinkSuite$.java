package org.apache.spark.sql.execution.streaming;
/** A global object to collect events in the executor */
public  class ForeachSinkSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ForeachSinkSuite$ MODULE$ = null;
  public   ForeachSinkSuite$ ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentLinkedQueue<scala.collection.Seq<org.apache.spark.sql.execution.streaming.ForeachSinkSuite.Event>> _allEvents ()  { throw new RuntimeException(); }
  public  void addEvents (scala.collection.Seq<org.apache.spark.sql.execution.streaming.ForeachSinkSuite.Event> events)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.execution.streaming.ForeachSinkSuite.Event>> allEvents ()  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
}
