package org.apache.spark.sql.execution.streaming;
public  class FileStreamSourceLog extends org.apache.spark.sql.execution.streaming.CompactibleFileStreamLog<org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry> {
  static public  java.lang.String VERSION ()  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path metadataPath ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.streaming.HDFSMetadataLog.FileManager fileManager ()  { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<java.lang.Object, T>> getLatest ()  { throw new RuntimeException(); }
  static public  void purge (long thresholdBatchId)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path batchIdToPath (long batchId)  { throw new RuntimeException(); }
  static public  long pathToBatchId (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  static public  boolean isBatchFile (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  static public  void serialize (java.lang.Object logData, java.io.OutputStream out)  { throw new RuntimeException(); }
  static public  java.lang.Object deserialize (java.io.InputStream in)  { throw new RuntimeException(); }
  static public  java.lang.Object allFiles ()  { throw new RuntimeException(); }
  // not preceding
  public   FileStreamSourceLog (java.lang.String metadataLogVersion, org.apache.spark.sql.SparkSession sparkSession, java.lang.String path)  { throw new RuntimeException(); }
  protected  int compactInterval ()  { throw new RuntimeException(); }
  protected  long fileCleanupDelayMs ()  { throw new RuntimeException(); }
  protected  boolean isDeletingExpiredLog ()  { throw new RuntimeException(); }
  private  java.lang.Object formats ()  { throw new RuntimeException(); }
  private  int cacheSize ()  { throw new RuntimeException(); }
  private  java.util.LinkedHashMap<java.lang.Object, org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry[]> fileEntryCache ()  { throw new RuntimeException(); }
  protected  java.lang.String serializeData (org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry data)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry deserializeData (java.lang.String encodedString)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry> compactLogs (scala.collection.Seq<org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry> logs)  { throw new RuntimeException(); }
  public  boolean add (long batchId, org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry[] logs)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry[]>[] get (scala.Option<java.lang.Object> startId, scala.Option<java.lang.Object> endId)  { throw new RuntimeException(); }
}
