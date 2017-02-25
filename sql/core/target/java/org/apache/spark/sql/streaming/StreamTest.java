package org.apache.spark.sql.streaming;
/**
 * A framework for implementing tests for streaming queries and sources.
 * <p>
 * A test consists of a set of steps (expressed as a <code>StreamAction</code>) that are executed in order,
 * blocking as necessary to let the stream catch up.  For example, the following adds some data to
 * a stream, blocking until it can verify that the correct values are eventually produced.
 * <p>
 * <pre><code>
 *  val inputData = MemoryStream[Int]
 *  val mapped = inputData.toDS().map(_ + 1)
 *
 *  testStream(mapped)(
 *    AddData(inputData, 1, 2, 3),
 *    CheckAnswer(2, 3, 4))
 * </code></pre>
 * <p>
 * Note that while we do sleep to allow the other thread to progress without spinning,
 * <code>StreamAction</code> checks should not depend on the amount of time spent sleeping.  Instead they
 * should check the actual progress of the stream before verifying the required test condition.
 * <p>
 * Currently it is assumed that all streaming queries will eventually complete in 10 seconds to
 * avoid hanging forever in the case of failures. However, individual suites can change this
 * by overriding <code>streamingTimeout</code>.
 */
public  interface StreamTest extends org.apache.spark.sql.test.SharedSQLContext, org.scalatest.concurrent.Timeouts {
  /** How long to wait for an active stream to catch up when checking a result. */
  public  org.scalatest.time.Span streamingTimeout ()  ;
  /** A trait for actions that can be performed while testing a streaming DataFrame. */
  public  interface StreamAction {
  }
  /** A trait to mark actions that require the stream to be actively running. */
  public  interface StreamMustBeRunning {
  }
  /**
   * Adds the given data to the stream. Subsequent check answers will block until this data has
   * been processed.
   */
  public  class AddData {
    public   AddData ()  { throw new RuntimeException(); }
    public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.AddDataMemory<A> apply (org.apache.spark.sql.execution.streaming.MemoryStream<A> source, scala.collection.Seq<A> data)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.streaming.StreamTest.AddData$ AddData ()  ;
  /** A trait that can be extended when testing a source. */
  public  interface AddData extends org.apache.spark.sql.streaming.StreamTest.StreamAction {
    /**
     * Called to adding the data to a source. It should find the source to add data to from
     * the active query, and then return the source object the data was added, as well as the
     * offset of added data.
     * @param query (undocumented)
     * @return (undocumented)
     */
    public  scala.Tuple2<org.apache.spark.sql.execution.streaming.Source, org.apache.spark.sql.execution.streaming.Offset> addData (scala.Option<org.apache.spark.sql.execution.streaming.StreamExecution> query)  ;
  }
  /** A trait that can be extended when testing a source. */
  public  interface ExternalAction extends org.apache.spark.sql.streaming.StreamTest.StreamAction {
    public  void runAction ()  ;
  }
  public  class AddDataMemory<A extends java.lang.Object> implements org.apache.spark.sql.streaming.StreamTest.AddData, scala.Product, scala.Serializable {
    public  org.apache.spark.sql.execution.streaming.MemoryStream<A> source ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<A> data ()  { throw new RuntimeException(); }
    // not preceding
    public   AddDataMemory (org.apache.spark.sql.execution.streaming.MemoryStream<A> source, scala.collection.Seq<A> data)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  scala.Tuple2<org.apache.spark.sql.execution.streaming.Source, org.apache.spark.sql.execution.streaming.Offset> addData (scala.Option<org.apache.spark.sql.execution.streaming.StreamExecution> query)  { throw new RuntimeException(); }
  }
  public  class AddDataMemory implements scala.Serializable {
    public   AddDataMemory ()  { throw new RuntimeException(); }
  }
  /**
   * Checks to make sure that the current data stored in the sink matches the <code>expectedAnswer</code>.
   * This operation automatically blocks until all added data has been processed.
   */
  public  class CheckAnswer {
    public   CheckAnswer ()  { throw new RuntimeException(); }
    public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (scala.collection.Seq<A> data, org.apache.spark.sql.Encoder<A> evidence$1)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (scala.collection.Seq<org.apache.spark.sql.Row> rows)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswer$ CheckAnswer ()  ;
  /**
   * Checks to make sure that the current data stored in the sink matches the <code>expectedAnswer</code>.
   * This operation automatically blocks until all added data has been processed.
   */
  public  class CheckLastBatch {
    public   CheckLastBatch ()  { throw new RuntimeException(); }
    public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (scala.collection.Seq<A> data, org.apache.spark.sql.Encoder<A> evidence$2)  { throw new RuntimeException(); }
    public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (boolean isSorted, scala.collection.Seq<A> data, org.apache.spark.sql.Encoder<A> evidence$3)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (scala.collection.Seq<org.apache.spark.sql.Row> rows)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.streaming.StreamTest.CheckLastBatch$ CheckLastBatch ()  ;
  public  class CheckAnswerRows implements org.apache.spark.sql.streaming.StreamTest.StreamAction, org.apache.spark.sql.streaming.StreamTest.StreamMustBeRunning, scala.Product, scala.Serializable {
    public  scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer ()  { throw new RuntimeException(); }
    public  boolean lastOnly ()  { throw new RuntimeException(); }
    public  boolean isSorted ()  { throw new RuntimeException(); }
    // not preceding
    public   CheckAnswerRows (scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer, boolean lastOnly, boolean isSorted)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
    private  java.lang.String operatorName ()  { throw new RuntimeException(); }
  }
  public  class CheckAnswerRows extends scala.runtime.AbstractFunction3<scala.collection.Seq<org.apache.spark.sql.Row>, java.lang.Object, java.lang.Object, org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows> implements scala.Serializable {
    public   CheckAnswerRows ()  { throw new RuntimeException(); }
  }
  /** Stops the stream. It must currently be running. */
  public  class StopStream implements org.apache.spark.sql.streaming.StreamTest.StreamAction, org.apache.spark.sql.streaming.StreamTest.StreamMustBeRunning, scala.Product, scala.Serializable {
    public   StopStream ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.streaming.StreamTest.StopStream$ StopStream ()  ;
  /** Starts the stream, resuming if data has already been processed. It must not be running. */
  public  class StartStream implements org.apache.spark.sql.streaming.StreamTest.StreamAction, scala.Product, scala.Serializable {
    public  org.apache.spark.sql.streaming.Trigger trigger ()  { throw new RuntimeException(); }
    public  org.apache.spark.util.Clock triggerClock ()  { throw new RuntimeException(); }
    // not preceding
    public   StartStream (org.apache.spark.sql.streaming.Trigger trigger, org.apache.spark.util.Clock triggerClock)  { throw new RuntimeException(); }
  }
  public  class StartStream extends scala.runtime.AbstractFunction2<org.apache.spark.sql.streaming.Trigger, org.apache.spark.util.Clock, org.apache.spark.sql.streaming.StreamTest.StartStream> implements scala.Serializable {
    public   StartStream ()  { throw new RuntimeException(); }
  }
  /** Advance the trigger clock's time manually. */
  public  class AdvanceManualClock implements org.apache.spark.sql.streaming.StreamTest.StreamAction, scala.Product, scala.Serializable {
    public  long timeToAdd ()  { throw new RuntimeException(); }
    // not preceding
    public   AdvanceManualClock (long timeToAdd)  { throw new RuntimeException(); }
  }
  public  class AdvanceManualClock extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.streaming.StreamTest.AdvanceManualClock> implements scala.Serializable {
    public   AdvanceManualClock ()  { throw new RuntimeException(); }
  }
  /** Signals that a failure is expected and should not kill the test. */
  public  class ExpectFailure<T extends java.lang.Throwable> implements org.apache.spark.sql.streaming.StreamTest.StreamAction, scala.Product, scala.Serializable {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Select(Select(Ident(scala), scala.package), TypeName("Throwable")))))
    public   ExpectFailure (scala.reflect.ClassTag<T> evidence$4)  { throw new RuntimeException(); }
    public  java.lang.Class<T> causeClass ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  public  class ExpectFailure implements scala.Serializable {
    public   ExpectFailure ()  { throw new RuntimeException(); }
  }
  /** Assert that a body is true */
  public  class Assert implements org.apache.spark.sql.streaming.StreamTest.StreamAction {
    public  java.lang.String message ()  { throw new RuntimeException(); }
    // not preceding
    public   Assert (scala.Function0<java.lang.Object> condition, java.lang.String message)  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  public  class Assert {
    public   Assert ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.Assert apply (scala.Function0<java.lang.Object> condition, java.lang.String message)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.Assert apply (java.lang.String message, scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.Assert apply (scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.streaming.StreamTest.Assert$ Assert ()  ;
  /** Assert that a condition on the active query is true */
  public  class AssertOnQuery implements org.apache.spark.sql.streaming.StreamTest.StreamAction {
    public  scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> condition ()  { throw new RuntimeException(); }
    public  java.lang.String message ()  { throw new RuntimeException(); }
    // not preceding
    public   AssertOnQuery (scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> condition, java.lang.String message)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  public  class AssertOnQuery {
    public   AssertOnQuery ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> condition, java.lang.String message)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (java.lang.String message, scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> condition)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery$ AssertOnQuery ()  ;
  public  class AssertOnLastQueryStatus implements org.apache.spark.sql.streaming.StreamTest.StreamAction, scala.Product, scala.Serializable {
    public  scala.Function1<org.apache.spark.sql.streaming.StreamingQueryStatus, scala.runtime.BoxedUnit> condition ()  { throw new RuntimeException(); }
    // not preceding
    public   AssertOnLastQueryStatus (scala.Function1<org.apache.spark.sql.streaming.StreamingQueryStatus, scala.runtime.BoxedUnit> condition)  { throw new RuntimeException(); }
  }
  public  class AssertOnLastQueryStatus extends scala.runtime.AbstractFunction1<scala.Function1<org.apache.spark.sql.streaming.StreamingQueryStatus, scala.runtime.BoxedUnit>, org.apache.spark.sql.streaming.StreamTest.AssertOnLastQueryStatus> implements scala.Serializable {
    public   AssertOnLastQueryStatus ()  { throw new RuntimeException(); }
  }
  public  class StreamManualClock extends org.apache.spark.util.ManualClock {
    public   StreamManualClock (long time)  { throw new RuntimeException(); }
    private  scala.Option<java.lang.Object> waitStartTime ()  { throw new RuntimeException(); }
    public  long waitTillTime (long targetTime)  { throw new RuntimeException(); }
    public  boolean isStreamWaitingAt (long time)  { throw new RuntimeException(); }
  }
  public  class StreamManualClock {
    public   StreamManualClock ()  { throw new RuntimeException(); }
  }
  /**
   * Executes the specified actions on the given streaming DataFrame and provides helpful
   * error messages in the case of failures or incorrect answers.
   * <p>
   * Note that if the stream is not explicitly started before an action that requires it to be
   * running then it will be automatically started before performing any other actions.
   * @param _stream (undocumented)
   * @param outputMode (undocumented)
   * @param actions (undocumented)
   */
  public  void testStream (org.apache.spark.sql.Dataset<?> _stream, org.apache.spark.sql.streaming.OutputMode outputMode, scala.collection.Seq<org.apache.spark.sql.streaming.StreamTest.StreamAction> actions)  ;
  /**
   * Creates a stress test that randomly starts/stops/adds data/checks the result.
   * <p>
   * @param ds a dataframe that executes + 1 on a stream of integers, returning the result
   * @param addData an add data action that adds the given numbers to the stream, encoding them
   *                as needed
   * @param iterations the iteration number
   */
  public  void runStressTest (org.apache.spark.sql.Dataset<java.lang.Object> ds, scala.Function1<scala.collection.Seq<java.lang.Object>, org.apache.spark.sql.streaming.StreamTest.StreamAction> addData, int iterations)  ;
  /**
   * Creates a stress test that randomly starts/stops/adds data/checks the result.
   * <p>
   * @param ds a dataframe that executes + 1 on a stream of integers, returning the result
   * @param prepareActions actions need to run before starting the stress test.
   * @param addData an add data action that adds the given numbers to the stream, encoding them
   *                as needed
   * @param iterations the iteration number
   */
  public  void runStressTest (org.apache.spark.sql.Dataset<java.lang.Object> ds, scala.collection.Seq<org.apache.spark.sql.streaming.StreamTest.StreamAction> prepareActions, scala.Function2<scala.collection.Seq<java.lang.Object>, java.lang.Object, org.apache.spark.sql.streaming.StreamTest.StreamAction> addData, int iterations)  ;
  /**
   * Creates a stress test that randomly starts/stops/adds data/checks the result.
   * <p>
   * param:  ds a dataframe that executes + 1 on a stream of integers, returning the result
   * param:  prepareActions actions need to run before starting the stress test.
   * param:  addData an add data action that adds the given numbers to the stream, encoding them
   *                as needed
   * param:  iterations the iteration number
   */
  public  class AwaitTerminationTester {
    public   AwaitTerminationTester ()  { throw new RuntimeException(); }
    public  interface ExpectedBehavior {
    }
    /** Expect awaitTermination to not be blocked */
    public  class ExpectNotBlocked implements org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectedBehavior, scala.Product, scala.Serializable {
      public   ExpectNotBlocked ()  { throw new RuntimeException(); }
    }
    public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectNotBlocked$ ExpectNotBlocked ()  { throw new RuntimeException(); }
    /** Expect awaitTermination to get blocked */
    public  class ExpectBlocked implements org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectedBehavior, scala.Product, scala.Serializable {
      public   ExpectBlocked ()  { throw new RuntimeException(); }
    }
    public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectBlocked$ ExpectBlocked ()  { throw new RuntimeException(); }
    /** Expect awaitTermination to throw an exception */
    public  class ExpectException<E extends java.lang.Exception> implements org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectedBehavior, scala.Product, scala.Serializable {
      public  scala.reflect.ClassTag<E> t ()  { throw new RuntimeException(); }
      // not preceding
      public   ExpectException (scala.reflect.ClassTag<E> t)  { throw new RuntimeException(); }
    }
    public  class ExpectException implements scala.Serializable {
      public   ExpectException ()  { throw new RuntimeException(); }
    }
    private  org.scalatest.time.Span DEFAULT_TEST_TIMEOUT ()  { throw new RuntimeException(); }
    public  void test (org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectedBehavior expectedBehavior, scala.Function0<scala.runtime.BoxedUnit> awaitTermFunc, org.scalatest.time.Span testTimeout)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$ AwaitTerminationTester ()  ;
  public  class QueryStatusCollector extends org.apache.spark.sql.streaming.StreamingQueryListener {
    public   QueryStatusCollector ()  { throw new RuntimeException(); }
    private  org.scalatest.concurrent.AsyncAssertions.Waiter asyncTestWaiter ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamingQueryStatus startStatus ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamingQueryStatus terminationStatus ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> terminationException ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.streaming.StreamingQueryStatus> progressStatuses ()  { throw new RuntimeException(); }
    /** Get the info of the last trigger that processed data */
    public  scala.Option<org.apache.spark.sql.streaming.StreamingQueryStatus> lastTriggerStatus ()  { throw new RuntimeException(); }
    public  void reset ()  { throw new RuntimeException(); }
    public  void checkAsyncErrors ()  { throw new RuntimeException(); }
    public  void onQueryStarted (org.apache.spark.sql.streaming.StreamingQueryListener.QueryStartedEvent queryStarted)  { throw new RuntimeException(); }
    public  void onQueryProgress (org.apache.spark.sql.streaming.StreamingQueryListener.QueryProgressEvent queryProgress)  { throw new RuntimeException(); }
    public  void onQueryTerminated (org.apache.spark.sql.streaming.StreamingQueryListener.QueryTerminatedEvent queryTerminated)  { throw new RuntimeException(); }
  }
}
