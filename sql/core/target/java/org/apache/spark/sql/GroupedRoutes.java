package org.apache.spark.sql;
public  class GroupedRoutes implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String src ()  { throw new RuntimeException(); }
  public  java.lang.String dest ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Route> routes ()  { throw new RuntimeException(); }
  // not preceding
  public   GroupedRoutes (java.lang.String src, java.lang.String dest, scala.collection.Seq<org.apache.spark.sql.Route> routes)  { throw new RuntimeException(); }
}
