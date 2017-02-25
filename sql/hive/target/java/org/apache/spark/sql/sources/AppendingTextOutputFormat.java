package org.apache.spark.sql.sources;
public  class AppendingTextOutputFormat extends org.apache.hadoop.mapreduce.lib.output.TextOutputFormat<org.apache.hadoop.io.NullWritable, org.apache.hadoop.io.Text> {
  public   AppendingTextOutputFormat (org.apache.hadoop.fs.Path outputFile)  { throw new RuntimeException(); }
  public  java.text.NumberFormat numberFormat ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.Path getDefaultWorkFile (org.apache.hadoop.mapreduce.TaskAttemptContext context, java.lang.String extension)  { throw new RuntimeException(); }
}
