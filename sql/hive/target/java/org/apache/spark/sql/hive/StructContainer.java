package org.apache.spark.sql.hive;
public  class StructContainer implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int intStructField ()  { throw new RuntimeException(); }
  public  java.lang.String stringStructField ()  { throw new RuntimeException(); }
  // not preceding
  public   StructContainer (int intStructField, java.lang.String stringStructField)  { throw new RuntimeException(); }
}
