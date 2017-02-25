package org.apache.spark.sql.execution.columnar;
  class ARRAY extends org.apache.spark.sql.execution.columnar.ColumnType<org.apache.spark.sql.catalyst.expressions.UnsafeArrayData> implements org.apache.spark.sql.execution.columnar.DirectCopyColumnType<org.apache.spark.sql.catalyst.expressions.UnsafeArrayData>, scala.Product, scala.Serializable {
  static public  void copyField (org.apache.spark.sql.catalyst.InternalRow from, int fromOrdinal, org.apache.spark.sql.catalyst.expressions.MutableRow to, int toOrdinal)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.ArrayType dataType ()  { throw new RuntimeException(); }
  // not preceding
  public   ARRAY (org.apache.spark.sql.types.ArrayType dataType)  { throw new RuntimeException(); }
  public  int defaultSize ()  { throw new RuntimeException(); }
  public  void setField (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal, org.apache.spark.sql.catalyst.expressions.UnsafeArrayData value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeArrayData getField (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  public  int actualSize (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  public  void append (org.apache.spark.sql.catalyst.expressions.UnsafeArrayData value, java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeArrayData extract (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeArrayData clone (org.apache.spark.sql.catalyst.expressions.UnsafeArrayData v)  { throw new RuntimeException(); }
}
