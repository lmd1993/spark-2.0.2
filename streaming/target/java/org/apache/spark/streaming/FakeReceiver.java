package org.apache.spark.streaming;
/**
 * An implementation of Receiver that is used for testing a receiver's life cycle.
 */
public  class FakeReceiver extends org.apache.spark.streaming.receiver.Receiver<java.lang.Object> {
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
  public   FakeReceiver (boolean sendData)  { throw new RuntimeException(); }
  public  java.lang.Thread otherThread ()  { throw new RuntimeException(); }
  public  boolean receiving ()  { throw new RuntimeException(); }
  public  boolean onStartCalled ()  { throw new RuntimeException(); }
  public  boolean onStopCalled ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
}
