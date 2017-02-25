package org.apache.spark.rdd;
public  class FakeOutputCommitter extends org.apache.hadoop.mapred.OutputCommitter {
  static public  boolean ran ()  { throw new RuntimeException(); }
  static public  void cleanupJob (org.apache.hadoop.mapred.JobContext x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  void commitJob (org.apache.hadoop.mapred.JobContext x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  void abortJob (org.apache.hadoop.mapred.JobContext x$1, int x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean isRecoverySupported ()  { throw new RuntimeException(); }
  static public  void recoverTask (org.apache.hadoop.mapred.TaskAttemptContext x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public final  void cleanupJob (org.apache.hadoop.mapreduce.JobContext x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public final  void commitJob (org.apache.hadoop.mapreduce.JobContext x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public final  void abortJob (org.apache.hadoop.mapreduce.JobContext x$1, org.apache.hadoop.mapreduce.JobStatus.State x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public final  void recoverTask (org.apache.hadoop.mapreduce.TaskAttemptContext x$1) throws java.io.IOException { throw new RuntimeException(); }
  public   FakeOutputCommitter ()  { throw new RuntimeException(); }
  public  void setupJob (org.apache.hadoop.mapred.JobContext jobContext)  { throw new RuntimeException(); }
  public  boolean needsTaskCommit (org.apache.hadoop.mapred.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  void setupTask (org.apache.hadoop.mapred.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  void commitTask (org.apache.hadoop.mapred.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  void abortTask (org.apache.hadoop.mapred.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
}
