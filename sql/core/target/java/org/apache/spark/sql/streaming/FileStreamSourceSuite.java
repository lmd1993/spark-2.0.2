package org.apache.spark.sql.streaming;
public  class FileStreamSourceSuite extends org.apache.spark.sql.streaming.FileStreamSourceTest {
  public   FileStreamSourceSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.time.Span streamingTimeout ()  { throw new RuntimeException(); }
  /** Use `format` and `path` to create FileStreamSource via DataFrameReader */
  private  org.apache.spark.sql.execution.streaming.FileStreamSource createFileStreamSource (java.lang.String format, java.lang.String path, scala.Option<org.apache.spark.sql.types.StructType> schema)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType createFileStreamSourceAndGetSchema (scala.Option<java.lang.String> format, scala.Option<java.lang.String> path, scala.Option<org.apache.spark.sql.types.StructType> schema)  { throw new RuntimeException(); }
}
