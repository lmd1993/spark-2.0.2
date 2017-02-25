package org.apache.spark.sql.execution.streaming;
public  class FileStreamSinkLogSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.test.SharedSQLContext {
  public   FileStreamSinkLogSuite ()  { throw new RuntimeException(); }
  /**
   * Create a fake SinkFileStatus using path and action. Most of tests don't care about other fields
   * in SinkFileStatus.
   * @param path (undocumented)
   * @param action (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.execution.streaming.SinkFileStatus newFakeSinkFileStatus (java.lang.String path, java.lang.String action)  { throw new RuntimeException(); }
  private  void withFileStreamSinkLog (scala.Function1<org.apache.spark.sql.execution.streaming.FileStreamSinkLog, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}
