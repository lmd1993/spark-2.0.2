package org.apache.spark.sql.catalyst.encoders;
/** For testing Kryo serialization based encoder. */
public  class KryoSerializable {
  public  int value ()  { throw new RuntimeException(); }
  // not preceding
  public   KryoSerializable (int value)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
}
