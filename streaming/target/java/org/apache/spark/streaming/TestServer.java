package org.apache.spark.streaming;
/** This is a server to test the network input stream */
public  class TestServer implements org.apache.spark.internal.Logging {
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
  public   TestServer (int portToBind)  { throw new RuntimeException(); }
  public  java.util.concurrent.ArrayBlockingQueue<java.lang.String> queue ()  { throw new RuntimeException(); }
  public  java.net.ServerSocket serverSocket ()  { throw new RuntimeException(); }
  private  java.util.concurrent.CountDownLatch startLatch ()  { throw new RuntimeException(); }
  public  java.lang.Thread servingThread ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Wait until the server starts. Return true if the server starts in "millis" milliseconds.
   * Otherwise, return false to indicate it's timeout.
   * @param millis (undocumented)
   * @return (undocumented)
   */
  private  boolean waitForStart (long millis)  { throw new RuntimeException(); }
  public  void send (java.lang.String msg)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
}
