package org.apache.spark.sql;
public  class ReflectData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String stringField ()  { throw new RuntimeException(); }
  public  int intField ()  { throw new RuntimeException(); }
  public  long longField ()  { throw new RuntimeException(); }
  public  float floatField ()  { throw new RuntimeException(); }
  public  double doubleField ()  { throw new RuntimeException(); }
  public  short shortField ()  { throw new RuntimeException(); }
  public  byte byteField ()  { throw new RuntimeException(); }
  public  boolean booleanField ()  { throw new RuntimeException(); }
  public  java.math.BigDecimal decimalField ()  { throw new RuntimeException(); }
  public  java.sql.Date date ()  { throw new RuntimeException(); }
  public  java.sql.Timestamp timestampField ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> seqInt ()  { throw new RuntimeException(); }
  public  java.math.BigInteger javaBigInt ()  { throw new RuntimeException(); }
  public  scala.math.BigInt scalaBigInt ()  { throw new RuntimeException(); }
  // not preceding
  public   ReflectData (java.lang.String stringField, int intField, long longField, float floatField, double doubleField, short shortField, byte byteField, boolean booleanField, java.math.BigDecimal decimalField, java.sql.Date date, java.sql.Timestamp timestampField, scala.collection.Seq<java.lang.Object> seqInt, java.math.BigInteger javaBigInt, scala.math.BigInt scalaBigInt)  { throw new RuntimeException(); }
}
