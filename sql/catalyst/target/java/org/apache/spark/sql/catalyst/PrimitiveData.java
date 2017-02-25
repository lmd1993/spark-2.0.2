package org.apache.spark.sql.catalyst;
public  class PrimitiveData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int intField ()  { throw new RuntimeException(); }
  public  long longField ()  { throw new RuntimeException(); }
  public  double doubleField ()  { throw new RuntimeException(); }
  public  float floatField ()  { throw new RuntimeException(); }
  public  short shortField ()  { throw new RuntimeException(); }
  public  byte byteField ()  { throw new RuntimeException(); }
  public  boolean booleanField ()  { throw new RuntimeException(); }
  // not preceding
  public   PrimitiveData (int intField, long longField, double doubleField, float floatField, short shortField, byte byteField, boolean booleanField)  { throw new RuntimeException(); }
}
