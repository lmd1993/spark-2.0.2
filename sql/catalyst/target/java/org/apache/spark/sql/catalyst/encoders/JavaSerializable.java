package org.apache.spark.sql.catalyst.encoders;
/** For testing Java serialization based encoder. */
public  class JavaSerializable implements scala.Serializable {
  public  int value ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaSerializable (int value)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
}
