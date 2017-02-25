package org.apache.spark.sql;
public  class ReflectBinary implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  byte[] data ()  { throw new RuntimeException(); }
  // not preceding
  public   ReflectBinary (byte[] data)  { throw new RuntimeException(); }
}
