package org.apache.spark.sql.execution.streaming;
public  class TextSocketStreamSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.streaming.StreamTest, org.apache.spark.sql.test.SharedSQLContext, org.scalatest.BeforeAndAfterEach {
  public   TextSocketStreamSuite ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.TextSocketStreamSuite.ServerThread serverThread ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.Source source ()  { throw new RuntimeException(); }
  private  class ServerThread extends java.lang.Thread implements org.apache.spark.internal.Logging {
    public   ServerThread ()  { throw new RuntimeException(); }
    private  java.net.ServerSocket serverSocket ()  { throw new RuntimeException(); }
    private  java.util.concurrent.LinkedBlockingQueue<java.lang.String> messageQueue ()  { throw new RuntimeException(); }
    public  int port ()  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
    public  void enqueue (java.lang.String line)  { throw new RuntimeException(); }
  }
}
