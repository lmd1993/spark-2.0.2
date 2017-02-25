package org.apache.spark.streaming.scheduler;
/**
 * A custom receiver that could be stopped via StoppableReceiver.shouldStop
 */
public  class StoppableReceiver extends org.apache.spark.streaming.receiver.Receiver<java.lang.Object> {
  static public  boolean shouldStop ()  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> preferredLocation ()  { throw new RuntimeException(); }
  static public  void store (T dataItem)  { throw new RuntimeException(); }
  static public  void store (scala.collection.mutable.ArrayBuffer<T> dataBuffer)  { throw new RuntimeException(); }
  static public  void store (scala.collection.mutable.ArrayBuffer<T> dataBuffer, Object metadata)  { throw new RuntimeException(); }
  static public  void store (scala.collection.Iterator<T> dataIterator)  { throw new RuntimeException(); }
  static public  void store (java.util.Iterator<T> dataIterator, Object metadata)  { throw new RuntimeException(); }
  static public  void store (java.util.Iterator<T> dataIterator)  { throw new RuntimeException(); }
  static public  void store (scala.collection.Iterator<T> dataIterator, Object metadata)  { throw new RuntimeException(); }
  static public  void store (java.nio.ByteBuffer bytes)  { throw new RuntimeException(); }
  static public  void store (java.nio.ByteBuffer bytes, Object metadata)  { throw new RuntimeException(); }
  static public  void reportError (java.lang.String message, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static public  void restart (java.lang.String message)  { throw new RuntimeException(); }
  static public  void restart (java.lang.String message, java.lang.Throwable error)  { throw new RuntimeException(); }
  static public  void restart (java.lang.String message, java.lang.Throwable error, int millisecond)  { throw new RuntimeException(); }
  static public  void stop (java.lang.String message)  { throw new RuntimeException(); }
  static public  void stop (java.lang.String message, java.lang.Throwable error)  { throw new RuntimeException(); }
  static public  boolean isStarted ()  { throw new RuntimeException(); }
  static public  boolean isStopped ()  { throw new RuntimeException(); }
  static public  int streamId ()  { throw new RuntimeException(); }
  static   void setReceiverId (int _id)  { throw new RuntimeException(); }
  static   void attachSupervisor (org.apache.spark.streaming.receiver.ReceiverSupervisor exec)  { throw new RuntimeException(); }
  static   org.apache.spark.streaming.receiver.ReceiverSupervisor supervisor ()  { throw new RuntimeException(); }
  public   StoppableReceiver ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Thread> receivingThreadOption ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
}
