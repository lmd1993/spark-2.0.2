package org.apache.spark.sql.hive.execution;
public  class Order implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  java.lang.String make ()  { throw new RuntimeException(); }
  public  java.lang.String type ()  { throw new RuntimeException(); }
  public  int price ()  { throw new RuntimeException(); }
  public  java.lang.String pdate ()  { throw new RuntimeException(); }
  public  java.lang.String customer ()  { throw new RuntimeException(); }
  public  java.lang.String city ()  { throw new RuntimeException(); }
  public  java.lang.String state ()  { throw new RuntimeException(); }
  public  int month ()  { throw new RuntimeException(); }
  // not preceding
  public   Order (int id, java.lang.String make, java.lang.String type, int price, java.lang.String pdate, java.lang.String customer, java.lang.String city, java.lang.String state, int month)  { throw new RuntimeException(); }
}
