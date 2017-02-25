package org.apache.spark.sql.execution.streaming;
/**
 * A simple offset for sources that produce a single linear stream of data.
 */
public  class LongOffset implements org.apache.spark.sql.execution.streaming.Offset, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long offset ()  { throw new RuntimeException(); }
  // not preceding
  public   LongOffset (long offset)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
