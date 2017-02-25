package org.apache.spark.sql.catalyst;
public  class OptionalData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> intField ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> longField ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> doubleField ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> floatField ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> shortField ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> byteField ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> booleanField ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.PrimitiveData> structField ()  { throw new RuntimeException(); }
  // not preceding
  public   OptionalData (scala.Option<java.lang.Object> intField, scala.Option<java.lang.Object> longField, scala.Option<java.lang.Object> doubleField, scala.Option<java.lang.Object> floatField, scala.Option<java.lang.Object> shortField, scala.Option<java.lang.Object> byteField, scala.Option<java.lang.Object> booleanField, scala.Option<org.apache.spark.sql.catalyst.PrimitiveData> structField)  { throw new RuntimeException(); }
}
