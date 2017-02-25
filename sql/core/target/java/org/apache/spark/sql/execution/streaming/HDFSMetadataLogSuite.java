package org.apache.spark.sql.execution.streaming;
public  class HDFSMetadataLogSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.test.SharedSQLContext {
  public   HDFSMetadataLogSuite ()  { throw new RuntimeException(); }
  /** To avoid caching of FS objects */
  protected  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  private <A extends java.lang.Object> scala.Option<A> toOption (A a)  { throw new RuntimeException(); }
  /** Basic test case for {@link FileManager} implementation. */
  private  void testFileManager (org.apache.hadoop.fs.Path basePath, org.apache.spark.sql.execution.streaming.HDFSMetadataLog.FileManager fm)  { throw new RuntimeException(); }
}
