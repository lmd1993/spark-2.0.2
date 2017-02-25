package org.apache.spark.sql.sources;
/** Check whether data is read with the given path matches the expected answer */
public  class AlwaysFailOutputCommitter extends org.apache.hadoop.mapreduce.lib.output.FileOutputCommitter {
  public   AlwaysFailOutputCommitter (org.apache.hadoop.fs.Path outputPath, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  public  void commitJob (org.apache.hadoop.mapreduce.JobContext context)  { throw new RuntimeException(); }
}
