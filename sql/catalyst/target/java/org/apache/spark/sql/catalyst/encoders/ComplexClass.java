package org.apache.spark.sql.catalyst.encoders;
public  class ComplexClass implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long a ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.StringLongClass b ()  { throw new RuntimeException(); }
  // not preceding
  public   ComplexClass (long a, org.apache.spark.sql.catalyst.encoders.StringLongClass b)  { throw new RuntimeException(); }
}
