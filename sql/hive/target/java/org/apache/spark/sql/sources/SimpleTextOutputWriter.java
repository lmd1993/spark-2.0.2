package org.apache.spark.sql.sources;
public  class SimpleTextOutputWriter extends org.apache.spark.sql.execution.datasources.OutputWriter {
  public   SimpleTextOutputWriter (java.lang.String path, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  private  org.apache.hadoop.mapreduce.RecordWriter<org.apache.hadoop.io.NullWritable, org.apache.hadoop.io.Text> recordWriter ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
