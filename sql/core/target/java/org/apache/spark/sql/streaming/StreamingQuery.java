package org.apache.spark.sql.streaming;
/**
 * :: Experimental ::
 * A handle to a query that is executing continuously in the background as new data arrives.
 * All these methods are thread-safe.
 * @since 2.0.0
 */
public  interface StreamingQuery {
  /**
   * Returns the name of the query. This name is unique across all active queries. This can be
   * set in the {@link org.apache.spark.sql.DataStreamWriter DataStreamWriter} as
   * <code>dataframe.writeStream.queryName("query").start()</code>.
   * @since 2.0.0
   * @return (undocumented)
   */
  public  java.lang.String name ()  ;
  /**
   * Returns the unique id of this query. This id is automatically generated and is unique across
   * all queries that have been started in the current process.
   * @since 2.0.0
   * @return (undocumented)
   */
  public  long id ()  ;
  /**
   * Returns the {@link SparkSession} associated with <code>this</code>.
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SparkSession sparkSession ()  ;
  /**
   * Whether the query is currently active or not
   * @since 2.0.0
   * @return (undocumented)
   */
  public  boolean isActive ()  ;
  /**
   * Returns the {@link StreamingQueryException} if the query was terminated by an exception.
   * @since 2.0.0
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.streaming.StreamingQueryException> exception ()  ;
  /**
   * Returns the current status of the query.
   * @since 2.0.2
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.StreamingQueryStatus status ()  ;
  /**
   * Returns current status of all the sources.
   * @since 2.0.0
   * @return (undocumented)
   *
   * @deprecated use status.sourceStatuses. Since 2.0.2. 
  */
  public  org.apache.spark.sql.streaming.SourceStatus[] sourceStatuses ()  ;
  /**
   * Returns current status of the sink.
   * @since 2.0.0
   * @return (undocumented)
   *
   * @deprecated use status.sinkStatus. Since 2.0.2. 
  */
  public  org.apache.spark.sql.streaming.SinkStatus sinkStatus ()  ;
  /**
   * Waits for the termination of <code>this</code> query, either by <code>query.stop()</code> or by an exception.
   * If the query has terminated with an exception, then the exception will be thrown.
   * <p>
   * If the query has terminated, then all subsequent calls to this method will either return
   * immediately (if the query was terminated by <code>stop()</code>), or throw the exception
   * immediately (if the query has terminated with exception).
   * <p>
   * @throws StreamingQueryException, if <code>this</code> query has terminated with an exception.
   * <p>
   * @since 2.0.0
   */
  public  void awaitTermination ()  ;
  /**
   * Waits for the termination of <code>this</code> query, either by <code>query.stop()</code> or by an exception.
   * If the query has terminated with an exception, then the exception will be thrown.
   * Otherwise, it returns whether the query has terminated or not within the <code>timeoutMs</code>
   * milliseconds.
   * <p>
   * If the query has terminated, then all subsequent calls to this method will either return
   * <code>true</code> immediately (if the query was terminated by <code>stop()</code>), or throw the exception
   * immediately (if the query has terminated with exception).
   * <p>
   * @throws StreamingQueryException, if <code>this</code> query has terminated with an exception
   * <p>
   * @since 2.0.0
   * @param timeoutMs (undocumented)
   * @return (undocumented)
   */
  public  boolean awaitTermination (long timeoutMs)  ;
  /**
   * Blocks until all available data in the source has been processed and committed to the sink.
   * This method is intended for testing. Note that in the case of continually arriving data, this
   * method may block forever. Additionally, this method is only guaranteed to block until data that
   * has been synchronously appended data to a {@link org.apache.spark.sql.execution.streaming.Source}
   * prior to invocation. (i.e. <code>getOffset</code> must immediately reflect the addition).
   * @since 2.0.0
   */
  public  void processAllAvailable ()  ;
  /**
   * Stops the execution of this query if it is running. This method blocks until the threads
   * performing execution has stopped.
   * @since 2.0.0
   */
  public  void stop ()  ;
  /**
   * Prints the physical plan to the console for debugging purposes.
   * @since 2.0.0
   */
  public  void explain ()  ;
  /**
   * Prints the physical plan to the console for debugging purposes.
   * <p>
   * @param extended whether to do extended explain or not
   * @since 2.0.0
   */
  public  void explain (boolean extended)  ;
}
