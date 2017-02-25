package org.apache.spark.util;
public  class FileAppenderSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.apache.spark.internal.Logging {
  public   FileAppenderSuite ()  { throw new RuntimeException(); }
  public  java.io.File testFile ()  { throw new RuntimeException(); }
  /**
   * Run the rolling file appender with data and see whether all the data was written correctly
   * across rolled over files.
   * @param appender (undocumented)
   * @param outputStream (undocumented)
   * @param textToAppend (undocumented)
   * @param sleepTimeBetweenTexts (undocumented)
   * @param isCompressed (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.io.File> testRolling (org.apache.spark.util.logging.FileAppender appender, java.io.OutputStream outputStream, scala.collection.Seq<java.lang.String> textToAppend, long sleepTimeBetweenTexts, boolean isCompressed)  { throw new RuntimeException(); }
  /** Delete all the generated rolledover files */
  public  void cleanup ()  { throw new RuntimeException(); }
  /** Used to synchronize when read is called on a stream */
  private  interface LatchedInputStream {
    public  java.util.concurrent.CountDownLatch latchReadStarted ()  ;
    public  java.util.concurrent.CountDownLatch latchReadProceed ()  ;
    public  int read ()  ;
  }
}
