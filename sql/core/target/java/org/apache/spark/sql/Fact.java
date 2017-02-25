package org.apache.spark.sql;
public  class Fact implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int date ()  { throw new RuntimeException(); }
  public  int hour ()  { throw new RuntimeException(); }
  public  int minute ()  { throw new RuntimeException(); }
  public  java.lang.String room_name ()  { throw new RuntimeException(); }
  public  double temp ()  { throw new RuntimeException(); }
  // not preceding
  public   Fact (int date, int hour, int minute, java.lang.String room_name, double temp)  { throw new RuntimeException(); }
}
