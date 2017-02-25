package org.apache.spark.sql;
public  class TupleClass implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, java.lang.String> data ()  { throw new RuntimeException(); }
  // not preceding
  public   TupleClass (scala.Tuple2<java.lang.Object, java.lang.String> data)  { throw new RuntimeException(); }
}
