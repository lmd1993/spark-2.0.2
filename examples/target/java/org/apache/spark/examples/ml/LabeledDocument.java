package org.apache.spark.examples.ml;
public  class LabeledDocument implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long id ()  { throw new RuntimeException(); }
  public  java.lang.String text ()  { throw new RuntimeException(); }
  public  double label ()  { throw new RuntimeException(); }
  // not preceding
  public   LabeledDocument (long id, java.lang.String text, double label)  { throw new RuntimeException(); }
}
