package org.apache.spark.sql.streaming;
/**
 * :: Experimental ::
 * Exception that stopped a {@link StreamingQuery}. Use <code>cause</code> get the actual exception
 * that caused the failure.
 * param:  query      Query that caused the exception
 * param:  message     Message of this exception
 * param:  cause       Internal cause of this exception
 * param:  startOffset Starting offset (if known) of the range of data in which exception occurred
 * param:  endOffset   Ending offset (if known) of the range of data in exception occurred
 * @since 2.0.0
 */
public  class StreamingQueryException extends java.lang.Exception {
  static public  java.lang.String getMessage ()  { throw new RuntimeException(); }
  static public  java.lang.String getLocalizedMessage ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable getCause ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable initCause (java.lang.Throwable x$1)  { throw new RuntimeException(); }
  static public  void printStackTrace ()  { throw new RuntimeException(); }
  static public  void printStackTrace (java.io.PrintStream x$1)  { throw new RuntimeException(); }
  static public  void printStackTrace (java.io.PrintWriter x$1)  { throw new RuntimeException(); }
  static public  java.lang.Throwable fillInStackTrace ()  { throw new RuntimeException(); }
  static public  java.lang.StackTraceElement[] getStackTrace ()  { throw new RuntimeException(); }
  static public  void setStackTrace (java.lang.StackTraceElement[] x$1)  { throw new RuntimeException(); }
  static   int getStackTraceDepth ()  { throw new RuntimeException(); }
  static   java.lang.StackTraceElement getStackTraceElement (int x$1)  { throw new RuntimeException(); }
  static public final  void addSuppressed (java.lang.Throwable x$1)  { throw new RuntimeException(); }
  static public final  java.lang.Throwable[] getSuppressed ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamingQuery query ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  public  java.lang.Throwable cause ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.Offset> startOffset ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.Offset> endOffset ()  { throw new RuntimeException(); }
  // not preceding
     StreamingQueryException (org.apache.spark.sql.streaming.StreamingQuery query, java.lang.String message, java.lang.Throwable cause, scala.Option<org.apache.spark.sql.execution.streaming.Offset> startOffset, scala.Option<org.apache.spark.sql.execution.streaming.Offset> endOffset)  { throw new RuntimeException(); }
  /** Time when the exception occurred */
  public  long time ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
