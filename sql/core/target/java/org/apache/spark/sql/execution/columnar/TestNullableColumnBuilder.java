package org.apache.spark.sql.execution.columnar;
public  class TestNullableColumnBuilder<JvmType extends java.lang.Object> extends org.apache.spark.sql.execution.columnar.BasicColumnBuilder<JvmType> implements org.apache.spark.sql.execution.columnar.NullableColumnBuilder {
  static public <JvmType extends java.lang.Object> org.apache.spark.sql.execution.columnar.TestNullableColumnBuilder<JvmType> apply (org.apache.spark.sql.execution.columnar.ColumnType<JvmType> columnType, int initialSize)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.columnar.ColumnStats columnStats ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.columnar.ColumnType<JvmType> columnType ()  { throw new RuntimeException(); }
  static protected  java.lang.String columnName ()  { throw new RuntimeException(); }
  static protected  void columnName_$eq (java.lang.String x$1)  { throw new RuntimeException(); }
  static protected  java.nio.ByteBuffer buffer ()  { throw new RuntimeException(); }
  static protected  void buffer_$eq (java.nio.ByteBuffer x$1)  { throw new RuntimeException(); }
  static public  void initialize (int initialSize, java.lang.String columnName, boolean useCompression)  { throw new RuntimeException(); }
  static public  void appendFrom (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  static public  java.nio.ByteBuffer build ()  { throw new RuntimeException(); }
  static public  java.lang.String initialize$default$2 ()  { throw new RuntimeException(); }
  static public  boolean initialize$default$3 ()  { throw new RuntimeException(); }
  static protected  java.nio.ByteBuffer nulls ()  { throw new RuntimeException(); }
  static protected  void nulls_$eq (java.nio.ByteBuffer x$1)  { throw new RuntimeException(); }
  static protected  int nullCount ()  { throw new RuntimeException(); }
  static protected  void nullCount_$eq (int x$1)  { throw new RuntimeException(); }
  static public  void initialize (int initialSize, java.lang.String columnName, boolean useCompression)  { throw new RuntimeException(); }
  static public  void appendFrom (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  static public  java.nio.ByteBuffer build ()  { throw new RuntimeException(); }
  static protected  java.nio.ByteBuffer buildNonNulls ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   TestNullableColumnBuilder (org.apache.spark.sql.execution.columnar.ColumnType<JvmType> columnType)  { throw new RuntimeException(); }
}
