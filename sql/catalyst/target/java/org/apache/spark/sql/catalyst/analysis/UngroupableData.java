package org.apache.spark.sql.catalyst.analysis;
  class UngroupableData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> data ()  { throw new RuntimeException(); }
  // not preceding
  public   UngroupableData (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> data)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> getData ()  { throw new RuntimeException(); }
}
