package org.apache.spark.sql.execution.datasources;
public  class MockDistributedFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  public   MockDistributedFileSystem ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.BlockLocation[] getFileBlockLocations (org.apache.hadoop.fs.FileStatus file, long start, long len)  { throw new RuntimeException(); }
}
