package org.apache.spark.sql.catalyst;
public  class NullableData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.Integer intField ()  { throw new RuntimeException(); }
  public  java.lang.Long longField ()  { throw new RuntimeException(); }
  public  java.lang.Double doubleField ()  { throw new RuntimeException(); }
  public  java.lang.Float floatField ()  { throw new RuntimeException(); }
  public  java.lang.Short shortField ()  { throw new RuntimeException(); }
  public  java.lang.Byte byteField ()  { throw new RuntimeException(); }
  public  java.lang.Boolean booleanField ()  { throw new RuntimeException(); }
  public  java.lang.String stringField ()  { throw new RuntimeException(); }
  public  java.math.BigDecimal decimalField ()  { throw new RuntimeException(); }
  public  java.sql.Date dateField ()  { throw new RuntimeException(); }
  public  java.sql.Timestamp timestampField ()  { throw new RuntimeException(); }
  public  byte[] binaryField ()  { throw new RuntimeException(); }
  // not preceding
  public   NullableData (java.lang.Integer intField, java.lang.Long longField, java.lang.Double doubleField, java.lang.Float floatField, java.lang.Short shortField, java.lang.Byte byteField, java.lang.Boolean booleanField, java.lang.String stringField, java.math.BigDecimal decimalField, java.sql.Date dateField, java.sql.Timestamp timestampField, byte[] binaryField)  { throw new RuntimeException(); }
}
