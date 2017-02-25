package org.apache.spark.streaming;
public  class ReceivedBlockTrackerSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.scalatest.Matchers, org.apache.spark.internal.Logging {
  public   ReceivedBlockTrackerSuite ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  public  int streamId ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.streaming.scheduler.ReceivedBlockTracker> allReceivedBlockTrackers ()  { throw new RuntimeException(); }
  public  java.io.File checkpointDirectory ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  /**
   * Create tracker object with the optional provided clock. Use fake clock if you
   * want to control time by manually incrementing it to test log clean.
   * @param setCheckpointDir (undocumented)
   * @param recoverFromWriteAheadLog (undocumented)
   * @param clock (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.scheduler.ReceivedBlockTracker createTracker (boolean setCheckpointDir, boolean recoverFromWriteAheadLog, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  /** Generate blocks infos using random ids */
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo> generateBlockInfos ()  { throw new RuntimeException(); }
  /**
   * Write received block tracker events to a file manually.
   * @param filePath (undocumented)
   * @param events (undocumented)
   */
  public  void writeEventsManually (java.lang.String filePath, scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockTrackerLogEvent> events)  { throw new RuntimeException(); }
  /** Get all the data written in the given write ahead log file. */
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockTrackerLogEvent> getWrittenLogData (java.lang.String logFile)  { throw new RuntimeException(); }
  /** Get the log file name for the given log start time. */
  public  java.lang.String getLogFileName (long time, int rollingIntervalSecs)  { throw new RuntimeException(); }
  /**
   * Get all the data written in the given write ahead log files. By default, it will read all
   * files in the test log directory.
   * @param logFiles (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockTrackerLogEvent> getWrittenLogData (scala.collection.Seq<java.lang.String> logFiles)  { throw new RuntimeException(); }
  /** Get all the write ahead log files in the test directory */
  public  scala.collection.Seq<java.lang.String> getWriteAheadLogFiles ()  { throw new RuntimeException(); }
  /** Create batch allocation object from the given info */
  public  org.apache.spark.streaming.scheduler.BatchAllocationEvent createBatchAllocation (long time, scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo> blockInfos)  { throw new RuntimeException(); }
  /** Create batch clean object from the given info */
  public  org.apache.spark.streaming.scheduler.BatchCleanupEvent createBatchCleanup (long time, scala.collection.Seq<java.lang.Object> moreTimes)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time millisToTime (long milliseconds)  { throw new RuntimeException(); }
  public  long timeToMillis (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
}
