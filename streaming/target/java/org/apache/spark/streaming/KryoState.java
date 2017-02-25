package org.apache.spark.streaming;
/** A class that only supports Kryo serialization. */
 final class KryoState implements com.esotericsoftware.kryo.KryoSerializable {
  public  java.lang.String state ()  { throw new RuntimeException(); }
  // not preceding
  public   KryoState (java.lang.String state)  { throw new RuntimeException(); }
  public  void write (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Output output)  { throw new RuntimeException(); }
  public  void read (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Input input)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
