package org.apache.spark.ml.feature;
public  class NGramTestData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String[] inputTokens ()  { throw new RuntimeException(); }
  public  java.lang.String[] wantedNGrams ()  { throw new RuntimeException(); }
  // not preceding
  public   NGramTestData (java.lang.String[] inputTokens, java.lang.String[] wantedNGrams)  { throw new RuntimeException(); }
}
