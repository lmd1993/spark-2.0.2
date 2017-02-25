package org.apache.spark.sql.catalyst.encoders;
public  class RepeatedData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> arrayField ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Integer> arrayFieldContainsNull ()  { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.Object, java.lang.Object> mapField ()  { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.Object, java.lang.Long> mapFieldNull ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.PrimitiveData structField ()  { throw new RuntimeException(); }
  // not preceding
  public   RepeatedData (scala.collection.Seq<java.lang.Object> arrayField, scala.collection.Seq<java.lang.Integer> arrayFieldContainsNull, scala.collection.Map<java.lang.Object, java.lang.Object> mapField, scala.collection.Map<java.lang.Object, java.lang.Long> mapFieldNull, org.apache.spark.sql.catalyst.PrimitiveData structField)  { throw new RuntimeException(); }
}
