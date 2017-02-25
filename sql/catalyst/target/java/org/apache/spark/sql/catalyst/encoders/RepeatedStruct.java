package org.apache.spark.sql.catalyst.encoders;
public  class RepeatedStruct implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.PrimitiveData> s ()  { throw new RuntimeException(); }
  // not preceding
  public   RepeatedStruct (scala.collection.Seq<org.apache.spark.sql.catalyst.PrimitiveData> s)  { throw new RuntimeException(); }
}
