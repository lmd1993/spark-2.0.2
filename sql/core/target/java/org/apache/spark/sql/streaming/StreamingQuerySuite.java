package org.apache.spark.sql.streaming;
public  class StreamingQuerySuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.streaming.StreamTest, org.scalatest.BeforeAndAfter, org.apache.spark.internal.Logging {
  public   StreamingQuerySuite ()  { throw new RuntimeException(); }
  public  org.scalactic.Equality<java.lang.Object> doubleEquality ()  { throw new RuntimeException(); }
  /** Create a streaming DF that only execute one batch in which it returns the given static DF */
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createSingleTriggerStreamingDF (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> triggerDF)  { throw new RuntimeException(); }
  /** Returns the query status at the end of the first trigger of streaming DF */
  private  org.apache.spark.sql.streaming.StreamingQueryStatus getFirstTriggerStatus (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> streamingDF)  { throw new RuntimeException(); }
  /**
   * A {@link StreamAction} to test the behavior of <code>StreamingQuery.awaitTermination()</code>.
   * <p>
   * param:  expectedBehavior  Expected behavior (not blocked, blocked, or exception thrown)
   * param:  timeoutMs         Timeout in milliseconds
   *                          When timeoutMs <= 0, awaitTermination() is tested (i.e. w/o timeout)
   *                          When timeoutMs > 0, awaitTermination(timeoutMs) is tested
   * param:  expectedReturnValue Expected return value when awaitTermination(timeoutMs) is used
   */
  public  class TestAwaitTermination extends org.apache.spark.sql.streaming.StreamTest.AssertOnQuery implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectedBehavior expectedBehavior ()  { throw new RuntimeException(); }
    public  int timeoutMs ()  { throw new RuntimeException(); }
    public  boolean expectedReturnValue ()  { throw new RuntimeException(); }
    // not preceding
    public   TestAwaitTermination (org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectedBehavior expectedBehavior, int timeoutMs, boolean expectedReturnValue)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  public  class TestAwaitTermination implements scala.Serializable {
    public   TestAwaitTermination ()  { throw new RuntimeException(); }
    /**
     * Tests the behavior of <code>StreamingQuery.awaitTermination</code>.
     * <p>
     * @param expectedBehavior  Expected behavior (not blocked, blocked, or exception thrown)
     * @param timeoutMs         Timeout in milliseconds
     *                          When timeoutMs <= 0, awaitTermination() is tested (i.e. w/o timeout)
     *                          When timeoutMs > 0, awaitTermination(timeoutMs) is tested
     * @param expectedReturnValue Expected return value when awaitTermination(timeoutMs) is used
     * @param q (undocumented)
     * @return (undocumented)
     */
    public  boolean assertOnQueryCondition (org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectedBehavior expectedBehavior, int timeoutMs, boolean expectedReturnValue, org.apache.spark.sql.execution.streaming.StreamExecution q)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.streaming.StreamingQuerySuite.TestAwaitTermination$ TestAwaitTermination ()  { throw new RuntimeException(); }
}
