package org.apache.spark.sql.catalyst.encoders;
public  class SpecificCollection implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<java.lang.Object> l ()  { throw new RuntimeException(); }
  // not preceding
  public   SpecificCollection (scala.collection.immutable.List<java.lang.Object> l)  { throw new RuntimeException(); }
}
