package org.apache.spark.sql;
public  class ComplexReflectData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> arrayField ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Option<java.lang.Object>> arrayFieldContainsNull ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> mapField ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, scala.Option<java.lang.Object>> mapFieldContainsNull ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Data dataField ()  { throw new RuntimeException(); }
  // not preceding
  public   ComplexReflectData (scala.collection.Seq<java.lang.Object> arrayField, scala.collection.Seq<scala.Option<java.lang.Object>> arrayFieldContainsNull, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> mapField, scala.collection.immutable.Map<java.lang.Object, scala.Option<java.lang.Object>> mapFieldContainsNull, org.apache.spark.sql.Data dataField)  { throw new RuntimeException(); }
}
