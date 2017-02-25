package org.apache.spark.streaming;
/**
 * An object that counts the number of started / completed batches. This is implemented using a
 * StreamingListener. Constructing a new instance automatically registers a StreamingListener on
 * the given StreamingContext.
 */
public  class BatchCounter {
  public   BatchCounter (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  private  int numCompletedBatches ()  { throw new RuntimeException(); }
  private  int numStartedBatches ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.Time lastCompletedBatchTime ()  { throw new RuntimeException(); }
  private  java.lang.Object listener ()  { throw new RuntimeException(); }
  public  int getNumCompletedBatches ()  { throw new RuntimeException(); }
  public  int getNumStartedBatches ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time getLastCompletedBatchTime ()  { throw new RuntimeException(); }
  /**
   * Wait until <code>expectedNumCompletedBatches</code> batches are completed, or timeout. Return true if
   * <code>expectedNumCompletedBatches</code> batches are completed. Otherwise, return false to indicate it's
   * timeout.
   * <p>
   * @param expectedNumCompletedBatches the <code>expectedNumCompletedBatches</code> batches to wait
   * @param timeout the maximum time to wait in milliseconds.
   * @return (undocumented)
   */
  public  boolean waitUntilBatchesCompleted (int expectedNumCompletedBatches, long timeout)  { throw new RuntimeException(); }
  /**
   * Wait until <code>expectedNumStartedBatches</code> batches are completed, or timeout. Return true if
   * <code>expectedNumStartedBatches</code> batches are completed. Otherwise, return false to indicate it's
   * timeout.
   * <p>
   * @param expectedNumStartedBatches the <code>expectedNumStartedBatches</code> batches to wait
   * @param timeout the maximum time to wait in milliseconds.
   * @return (undocumented)
   */
  public  boolean waitUntilBatchesStarted (int expectedNumStartedBatches, long timeout)  { throw new RuntimeException(); }
  private  boolean waitUntilConditionBecomeTrue (scala.Function0<java.lang.Object> condition, long timeout)  { throw new RuntimeException(); }
}
