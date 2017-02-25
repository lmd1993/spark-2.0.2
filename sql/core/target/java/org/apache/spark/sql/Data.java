package org.apache.spark.sql;
public  class Data implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> array ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Option<java.lang.Object>> arrayContainsNull ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> map ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, scala.Option<java.lang.Object>> mapContainsNul ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Nested nested ()  { throw new RuntimeException(); }
  // not preceding
  public   Data (scala.collection.Seq<java.lang.Object> array, scala.collection.Seq<scala.Option<java.lang.Object>> arrayContainsNull, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> map, scala.collection.immutable.Map<java.lang.Object, scala.Option<java.lang.Object>> mapContainsNul, org.apache.spark.sql.Nested nested)  { throw new RuntimeException(); }
}
