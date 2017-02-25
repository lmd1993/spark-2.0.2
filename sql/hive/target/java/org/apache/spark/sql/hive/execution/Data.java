package org.apache.spark.sql.hive.execution;
public  class Data implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int a ()  { throw new RuntimeException(); }
  public  int B ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.execution.Nested n ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.execution.Nested> nestedArray ()  { throw new RuntimeException(); }
  // not preceding
  public   Data (int a, int B, org.apache.spark.sql.hive.execution.Nested n, scala.collection.Seq<org.apache.spark.sql.hive.execution.Nested> nestedArray)  { throw new RuntimeException(); }
}
