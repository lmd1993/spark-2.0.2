package org.apache.spark.sql.execution.streaming;
/**
 * A bus to forward events to {@link StreamingQueryListener}s. This one will send received
 * {@link StreamingQueryListener.Event}s to the Spark listener bus. It also registers itself with
 * Spark listener bus, so that it can receive {@link StreamingQueryListener.Event}s and dispatch them
 * to StreamingQueryListener.
 */
public  class StreamingQueryListenerBus extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.util.ListenerBus<org.apache.spark.sql.streaming.StreamingQueryListener, org.apache.spark.sql.streaming.StreamingQueryListener.Event> {
  public   StreamingQueryListenerBus (org.apache.spark.scheduler.LiveListenerBus sparkListenerBus)  { throw new RuntimeException(); }
  /**
   * Post a StreamingQueryListener event to the Spark listener bus asynchronously. This event will
   * be dispatched to all StreamingQueryListener in the thread of the Spark listener bus.
   * @param event (undocumented)
   */
  public  void post (org.apache.spark.sql.streaming.StreamingQueryListener.Event event)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  protected  void doPostEvent (org.apache.spark.sql.streaming.StreamingQueryListener listener, org.apache.spark.sql.streaming.StreamingQueryListener.Event event)  { throw new RuntimeException(); }
}
