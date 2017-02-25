package org.apache.spark.sql.execution.streaming;
/**
 * Manages the execution of a streaming Spark SQL query that is occurring in a separate thread.
 * Unlike a standard query, a streaming query executes repeatedly each time new data arrives at any
 * {@link Source} present in the query plan. Whenever new data arrives, a {@link QueryExecution} is created
 * and the results are committed transactionally to the given {@link Sink}.
 */
public  class StreamExecution implements org.apache.spark.sql.streaming.StreamingQuery, org.apache.spark.internal.Logging {
  public  class INITIALIZED$ implements org.apache.spark.sql.execution.streaming.StreamExecution.State, scala.Product, scala.Serializable {
    public   INITIALIZED$ ()  { throw new RuntimeException(); }
  }
  public  class ACTIVE$ implements org.apache.spark.sql.execution.streaming.StreamExecution.State, scala.Product, scala.Serializable {
    public   ACTIVE$ ()  { throw new RuntimeException(); }
  }
  public  class TERMINATED$ implements org.apache.spark.sql.execution.streaming.StreamExecution.State, scala.Product, scala.Serializable {
    public   TERMINATED$ ()  { throw new RuntimeException(); }
  }
  public  interface State {
  }
  static private  java.util.concurrent.atomic.AtomicLong _nextId ()  { throw new RuntimeException(); }
  static public  long nextId ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  public  long id ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.Sink sink ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.Trigger trigger ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.Clock triggerClock ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.OutputMode outputMode ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamExecution (org.apache.spark.sql.SparkSession sparkSession, long id, java.lang.String name, java.lang.String checkpointRoot, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan, org.apache.spark.sql.execution.streaming.Sink sink, org.apache.spark.sql.streaming.Trigger trigger, org.apache.spark.util.Clock triggerClock, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  private  long pollingDelayMs ()  { throw new RuntimeException(); }
  /**
   * A lock used to wait/notify when batches complete. Use a fair lock to avoid thread starvation.
   * @return (undocumented)
   */
  private  java.util.concurrent.locks.ReentrantLock awaitBatchLock ()  { throw new RuntimeException(); }
  private  java.util.concurrent.locks.Condition awaitBatchLockCondition ()  { throw new RuntimeException(); }
  private  java.util.concurrent.CountDownLatch startLatch ()  { throw new RuntimeException(); }
  private  java.util.concurrent.CountDownLatch terminationLatch ()  { throw new RuntimeException(); }
  /**
   * Tracks how much data we have processed and committed to the sink or state store from each
   * input source.
   * Only the scheduler thread should modify this field, and only in atomic steps.
   * Other threads should make a shallow copy if they are going to access this field more than
   * once, since the field's value may change at any time.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.StreamProgress committedOffsets ()  { throw new RuntimeException(); }
  /**
   * Tracks the offsets that are available to be processed, but have not yet be committed to the
   * sink.
   * Only the scheduler thread should modify this field, and only in atomic steps.
   * Other threads should make a shallow copy if they are going to access this field more than
   * once, since the field's value may change at any time.
   * @return (undocumented)
   */
  private  org.apache.spark.sql.execution.streaming.StreamProgress availableOffsets ()  { throw new RuntimeException(); }
  /** The current batchId or -1 if execution has not yet been initialized. */
  private  long currentBatchId ()  { throw new RuntimeException(); }
  /** All stream sources present in the query plan. */
  private  scala.collection.Seq<org.apache.spark.sql.execution.streaming.Source> sources ()  { throw new RuntimeException(); }
  /** A list of unique sources in the query plan. */
  private  scala.collection.Seq<org.apache.spark.sql.execution.streaming.Source> uniqueSources ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.ProcessingTimeExecutor triggerExecutor ()  { throw new RuntimeException(); }
  /** Defines the internal state of execution */
  private  org.apache.spark.sql.execution.streaming.StreamExecution.State state ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.QueryExecution lastExecution ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.streaming.StreamingQueryException streamDeathCause ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.CallSite callSite ()  { throw new RuntimeException(); }
  /** Metrics for this query */
  private  org.apache.spark.sql.execution.streaming.StreamMetrics streamMetrics ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.streaming.StreamingQueryStatus currentStatus ()  { throw new RuntimeException(); }
  /** Flag that signals whether any error with input metrics have already been logged */
  private  boolean metricWarningLogged ()  { throw new RuntimeException(); }
  /**
   * The thread that runs the micro-batches of this stream. Note that this thread must be
   * {@link org.apache.spark.util.UninterruptibleThread} to avoid potential deadlocks in using
   * {@link HDFSMetadataLog}. See SPARK-14131 for more details.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.StreamExecutionThread microBatchThread ()  { throw new RuntimeException(); }
  /**
   * A write-ahead-log that records the offsets that are present in each batch. In order to ensure
   * that a given batch will always consist of the same data, we write to this log *before* any
   * processing is done.  Thus, the Nth record in this log indicated data that is currently being
   * processed and the N-1th entry indicates which offsets have been durably committed to the sink.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.HDFSMetadataLog<org.apache.spark.sql.execution.streaming.CompositeOffset> offsetLog ()  { throw new RuntimeException(); }
  /** Whether the query is currently active or not */
  public  boolean isActive ()  { throw new RuntimeException(); }
  /** Returns the current status of the query. */
  public  org.apache.spark.sql.streaming.StreamingQueryStatus status ()  { throw new RuntimeException(); }
  /** Returns current status of all the sources. */
  public  org.apache.spark.sql.streaming.SourceStatus[] sourceStatuses ()  { throw new RuntimeException(); }
  /** Returns current status of the sink. */
  public  org.apache.spark.sql.streaming.SinkStatus sinkStatus ()  { throw new RuntimeException(); }
  /** Returns the {@link StreamingQueryException} if the query was terminated by an exception. */
  public  scala.Option<org.apache.spark.sql.streaming.StreamingQueryException> exception ()  { throw new RuntimeException(); }
  /** Returns the path of a file with `name` in the checkpoint directory. */
  private  java.lang.String checkpointFile (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Starts the execution. This returns only after the thread has started and {@link QueryStartedEvent}
   * has been posted to all the listeners.
   */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Repeatedly attempts to run batches as data arrives.
   * <p>
   * Note that this method ensures that {@link QueryStartedEvent} and {@link QueryTerminatedEvent} are
   * posted such that listeners are guaranteed to get a start event before a termination.
   * Furthermore, this method also ensures that {@link QueryStartedEvent} event is posted before the
   * <code>start()</code> method returns.
   */
  private  void runBatches ()  { throw new RuntimeException(); }
  /**
   * Populate the start offsets to start the execution at the current offsets stored in the sink
   * (i.e. avoid reprocessing data that we have already processed). This function must be called
   * before any processing occurs and will populate the following fields:
   *  - currentBatchId
   *  - committedOffsets
   *  - availableOffsets
   */
  private  void populateStartOffsets ()  { throw new RuntimeException(); }
  /**
   * Returns true if there is any new data available to be processed.
   * @return (undocumented)
   */
  private  boolean dataAvailable ()  { throw new RuntimeException(); }
  /**
   * Queries all of the sources to see if any new data is available. When there is new data the
   * batchId counter is incremented and a new log entry is written with the newest offsets.
   */
  private  void constructNextBatch ()  { throw new RuntimeException(); }
  /**
   * Processes any data available between <code>availableOffsets</code> and <code>committedOffsets</code>.
   */
  private  void runBatch ()  { throw new RuntimeException(); }
  private  void postEvent (org.apache.spark.sql.streaming.StreamingQueryListener.Event event)  { throw new RuntimeException(); }
  /**
   * Signals to the thread executing micro-batches that it should stop running after the next
   * batch. This method blocks until the thread stops running.
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Blocks the current thread until processing for data from the given <code>source</code> has reached at
   * least the given <code>Offset</code>. This method is intended for use primarily when writing tests.
   * @param source (undocumented)
   * @param newOffset (undocumented)
   */
    void awaitOffset (org.apache.spark.sql.execution.streaming.Source source, org.apache.spark.sql.execution.streaming.Offset newOffset)  { throw new RuntimeException(); }
  /** A flag to indicate that a batch has completed with no new data available. */
  private  boolean noNewData ()  { throw new RuntimeException(); }
  public  void processAllAvailable ()  { throw new RuntimeException(); }
  public  void awaitTermination ()  { throw new RuntimeException(); }
  public  boolean awaitTermination (long timeoutMs)  { throw new RuntimeException(); }
  /** Expose for tests */
  public  java.lang.String explainInternal (boolean extended)  { throw new RuntimeException(); }
  public  void explain (boolean extended)  { throw new RuntimeException(); }
  public  void explain ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
  /**
   * Report row metrics of the executed trigger
   * @param triggerExecutionPlan Execution plan of the trigger
   * @param triggerLogicalPlan Logical plan of the trigger, generated from the query logical plan
   * @param sourceToDF Source to DataFrame returned by the source.getBatch in this trigger
   */
  private  void reportNumRows (org.apache.spark.sql.execution.SparkPlan triggerExecutionPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan triggerLogicalPlan, scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.Source, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sourceToDF)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> T reportTimeTaken (java.lang.String triggerDetailKey, scala.Function0<T> body)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> T reportTimeTaken (org.apache.spark.sql.execution.streaming.Source source, java.lang.String triggerDetailKey, scala.Function0<T> body)  { throw new RuntimeException(); }
  private  void reportTimestamp (java.lang.String triggerDetailKey)  { throw new RuntimeException(); }
  private  void updateStatus ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.StreamExecution.INITIALIZED$ INITIALIZED ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.StreamExecution.ACTIVE$ ACTIVE ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.StreamExecution.TERMINATED$ TERMINATED ()  { throw new RuntimeException(); }
}
