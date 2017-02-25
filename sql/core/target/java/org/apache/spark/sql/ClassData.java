package org.apache.spark.sql;
public  class ClassData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String a ()  { throw new RuntimeException(); }
  public  int b ()  { throw new RuntimeException(); }
  // not preceding
  public   ClassData (java.lang.String a, int b)  { throw new RuntimeException(); }
}
