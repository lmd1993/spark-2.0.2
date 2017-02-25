package org.apache.spark.sql.execution.columnar.compression;
public  class TestCompressibleColumnBuilder<T extends org.apache.spark.sql.types.AtomicType> extends org.apache.spark.sql.execution.columnar.NativeColumnBuilder<T> implements org.apache.spark.sql.execution.columnar.NullableColumnBuilder, org.apache.spark.sql.execution.columnar.compression.CompressibleColumnBuilder<T> {
  static public <T extends org.apache.spark.sql.types.AtomicType> org.apache.spark.sql.execution.columnar.compression.TestCompressibleColumnBuilder<T> apply (org.apache.spark.sql.execution.columnar.ColumnStats columnStats, org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType, org.apache.spark.sql.execution.columnar.compression.CompressionScheme scheme)  { throw new RuntimeException(); }
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
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.execution.columnar.compression.Encoder<T>> compressionEncoders ()  { throw new RuntimeException(); }
  static public  void compressionEncoders_$eq (scala.collection.Seq<org.apache.spark.sql.execution.columnar.compression.Encoder<T>> x$1)  { throw new RuntimeException(); }
  static public  void initialize (int initialSize, java.lang.String columnName, boolean useCompression)  { throw new RuntimeException(); }
  static public  void appendFrom (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  static public  java.nio.ByteBuffer build ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.columnar.ColumnStats columnStats ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.columnar.compression.CompressionScheme> schemes ()  { throw new RuntimeException(); }
  // not preceding
  public   TestCompressibleColumnBuilder (org.apache.spark.sql.execution.columnar.ColumnStats columnStats, org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType, scala.collection.Seq<org.apache.spark.sql.execution.columnar.compression.CompressionScheme> schemes)  { throw new RuntimeException(); }
  protected  boolean isWorthCompressing (org.apache.spark.sql.execution.columnar.compression.Encoder<T> encoder)  { throw new RuntimeException(); }
}
