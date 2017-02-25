package org.apache.spark.sql.execution;
public  class WindowData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int month ()  { throw new RuntimeException(); }
  public  java.lang.String area ()  { throw new RuntimeException(); }
  public  int product ()  { throw new RuntimeException(); }
  // not preceding
  public   WindowData (int month, java.lang.String area, int product)  { throw new RuntimeException(); }
}
