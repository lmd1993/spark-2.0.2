package org.apache.spark.sql.execution.columnar;
public  class TestNullableColumnAccessor<JvmType extends java.lang.Object> extends org.apache.spark.sql.execution.columnar.BasicColumnAccessor<JvmType> implements org.apache.spark.sql.execution.columnar.NullableColumnAccessor {
  static public <JvmType extends java.lang.Object> org.apache.spark.sql.execution.columnar.TestNullableColumnAccessor<JvmType> apply (java.nio.ByteBuffer buffer, org.apache.spark.sql.execution.columnar.ColumnType<JvmType> columnType)  { throw new RuntimeException(); }
  static protected  java.nio.ByteBuffer buffer ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.columnar.ColumnType<JvmType> columnType ()  { throw new RuntimeException(); }
  static protected  void initialize ()  { throw new RuntimeException(); }
  static public  boolean hasNext ()  { throw new RuntimeException(); }
  static public  void extractTo (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal)  { throw new RuntimeException(); }
  static public  void extractSingle (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal)  { throw new RuntimeException(); }
  static protected  java.nio.ByteBuffer underlyingBuffer ()  { throw new RuntimeException(); }
  static protected  void initialize ()  { throw new RuntimeException(); }
  static public  void extractTo (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal)  { throw new RuntimeException(); }
  static public  boolean hasNext ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   TestNullableColumnAccessor (java.nio.ByteBuffer buffer, org.apache.spark.sql.execution.columnar.ColumnType<JvmType> columnType)  { throw new RuntimeException(); }
}
