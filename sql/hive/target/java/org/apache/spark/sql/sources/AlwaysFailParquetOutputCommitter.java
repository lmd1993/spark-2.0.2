package org.apache.spark.sql.sources;
public  class AlwaysFailParquetOutputCommitter extends org.apache.parquet.hadoop.ParquetOutputCommitter {
  public   AlwaysFailParquetOutputCommitter (org.apache.hadoop.fs.Path outputPath, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  public  void commitJob (org.apache.hadoop.mapreduce.JobContext context)  { throw new RuntimeException(); }
}
