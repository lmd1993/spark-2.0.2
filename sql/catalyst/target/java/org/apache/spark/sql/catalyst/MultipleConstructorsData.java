package org.apache.spark.sql.catalyst;
public  class MultipleConstructorsData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int a ()  { throw new RuntimeException(); }
  public  java.lang.String b ()  { throw new RuntimeException(); }
  public  double c ()  { throw new RuntimeException(); }
  // not preceding
  public   MultipleConstructorsData (int a, java.lang.String b, double c)  { throw new RuntimeException(); }
  public   MultipleConstructorsData (java.lang.String b, int a)  { throw new RuntimeException(); }
}
