package org.apache.spark.sql;
  class MyLabeledPoint implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  double label ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.UDT.MyDenseVector features ()  { throw new RuntimeException(); }
  // not preceding
  public   MyLabeledPoint (double label, org.apache.spark.sql.UDT.MyDenseVector features)  { throw new RuntimeException(); }
  public  double getLabel ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.UDT.MyDenseVector getFeatures ()  { throw new RuntimeException(); }
}
