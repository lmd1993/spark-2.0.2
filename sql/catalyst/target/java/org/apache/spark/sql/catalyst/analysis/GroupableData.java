package org.apache.spark.sql.catalyst.analysis;
  class GroupableData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int data ()  { throw new RuntimeException(); }
  // not preceding
  public   GroupableData (int data)  { throw new RuntimeException(); }
  public  int getData ()  { throw new RuntimeException(); }
}
