package org.apache.spark.sql.hive.orc;
public  class Person implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  int age ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.orc.Contact> contacts ()  { throw new RuntimeException(); }
  // not preceding
  public   Person (java.lang.String name, int age, scala.collection.Seq<org.apache.spark.sql.hive.orc.Contact> contacts)  { throw new RuntimeException(); }
}
