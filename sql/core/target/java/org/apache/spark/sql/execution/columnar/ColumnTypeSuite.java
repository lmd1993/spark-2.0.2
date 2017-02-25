package org.apache.spark.sql.execution.columnar;
public  class ColumnTypeSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.internal.Logging {
  public   ColumnTypeSuite ()  { throw new RuntimeException(); }
  private  int DEFAULT_BUFFER_SIZE ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.columnar.MAP MAP_TYPE ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.columnar.ARRAY ARRAY_TYPE ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.columnar.STRUCT STRUCT_TYPE ()  { throw new RuntimeException(); }
  public <T extends org.apache.spark.sql.types.AtomicType> void testNativeColumnType (org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType)  { throw new RuntimeException(); }
  public <JvmType extends java.lang.Object> void testColumnType (org.apache.spark.sql.execution.columnar.ColumnType<JvmType> columnType)  { throw new RuntimeException(); }
  private  Object dumpBuffer (java.nio.ByteBuffer buff)  { throw new RuntimeException(); }
}
