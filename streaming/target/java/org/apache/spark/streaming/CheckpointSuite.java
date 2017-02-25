package org.apache.spark.streaming;
/**
 * This test suites tests the checkpointing functionality of DStreams -
 * the checkpointing of a DStream's RDDs as well as the checkpointing of
 * the whole DStream graph.
 */
public  class CheckpointSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.TestSuiteBase, org.apache.spark.streaming.DStreamCheckpointTester, org.apache.spark.util.ResetSystemProperties {
  static public  boolean batchThreeShouldBlockIndefinitely ()  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> org.scalactic.Equality<A> defaultEquality ()  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<T> $eq$eq$eq (T right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<T> $bang$eq$eq (T right)  { throw new RuntimeException(); }
  static public  org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<scala.runtime.Null$> $eq$eq$eq (scala.runtime.Null$ right)  { throw new RuntimeException(); }
  static public  org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<scala.runtime.Null$> $bang$eq$eq (scala.runtime.Null$ right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocationOnSpread<T> $eq$eq$eq (org.scalactic.TripleEqualsSupport.Spread<T> right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocationOnSpread<T> $bang$eq$eq (org.scalactic.TripleEqualsSupport.Spread<T> right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.Equalizer<T> convertToEqualizer (T left)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.CheckingEqualizer<T> convertToCheckingEqualizer (T left)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.LegacyEqualizer<T> convertToLegacyEqualizer (T left)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.LegacyCheckingEqualizer<T> convertToLegacyCheckingEqualizer (T left)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.Constraint<A, B> unconstrainedEquality (org.scalactic.Equality<A> equalityOfA)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.Constraint<A, B> lowPriorityTypeCheckedConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Predef.$less$colon$less<A, B> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.Constraint<A, B> convertEquivalenceToAToBConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Predef.$less$colon$less<A, B> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.Constraint<A, B> typeCheckedConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Predef.$less$colon$less<B, A> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.Constraint<A, B> convertEquivalenceToBToAConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Predef.$less$colon$less<B, A> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.Constraint<A, B> lowPriorityConversionCheckedConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Function1<A, B> cnv)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.Constraint<A, B> convertEquivalenceToAToBConversionConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Function1<A, B> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.Constraint<A, B> conversionCheckedConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Function1<B, A> cnv)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.Constraint<A, B> convertEquivalenceToBToAConversionConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Function1<B, A> ev)  { throw new RuntimeException(); }
  static public  org.scalatest.Assertions.AssertionsHelper assertionsHelper ()  { throw new RuntimeException(); }
  static   java.lang.Throwable newAssertionFailedException (scala.Option<java.lang.Object> optionalMessage, scala.Option<java.lang.Throwable> optionalCause, int stackDepth)  { throw new RuntimeException(); }
  static   java.lang.Throwable newAssertionFailedException (scala.Option<java.lang.String> optionalMessage, scala.Option<java.lang.Throwable> optionalCause, java.lang.String fileName, java.lang.String methodName, int stackDepthAdjustment)  { throw new RuntimeException(); }
  static   java.lang.Throwable newTestCanceledException (scala.Option<java.lang.String> optionalMessage, scala.Option<java.lang.Throwable> optionalCause, java.lang.String fileName, java.lang.String methodName, int stackDepthAdjustment)  { throw new RuntimeException(); }
  static public  void assume (boolean condition)  { throw new RuntimeException(); }
  static public  void assume (boolean condition, Object clue)  { throw new RuntimeException(); }
  static public  void assume (scala.Option<java.lang.String> o, Object clue)  { throw new RuntimeException(); }
  static public  void assume (scala.Option<java.lang.String> o)  { throw new RuntimeException(); }
  static public  void assertTypeError (java.lang.String code)  { throw new RuntimeException(); }
  static public  void assertDoesNotCompile (java.lang.String code)  { throw new RuntimeException(); }
  static public  void assertCompiles (java.lang.String code)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T intercept (scala.Function0<java.lang.Object> f, scala.reflect.Manifest<T> manifest)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> java.lang.Throwable trap (scala.Function0<T> f)  { throw new RuntimeException(); }
  static public  void assertResult (Object expected, Object clue, Object actual)  { throw new RuntimeException(); }
  static public  void expectResult (Object expected, Object clue, Object actual)  { throw new RuntimeException(); }
  static public  void expect (Object expected, Object clue, Object actual)  { throw new RuntimeException(); }
  static public  void assertResult (Object expected, Object actual)  { throw new RuntimeException(); }
  static public  void expectResult (Object expected, Object actual)  { throw new RuntimeException(); }
  static public  void expect (Object expected, Object actual)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail ()  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (java.lang.String message)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (java.lang.String message, java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel ()  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (java.lang.String message)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (java.lang.String message, java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T withClue (Object clue, scala.Function0<T> fun)  { throw new RuntimeException(); }
  static public final  org.scalatest.Status run (scala.Option<java.lang.String> testName, org.scalatest.Reporter reporter, org.scalatest.Stopper stopper, org.scalatest.Filter filter, scala.collection.immutable.Map<java.lang.String, java.lang.Object> configMap, scala.Option<org.scalatest.Distributor> distributor, org.scalatest.Tracker tracker)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.IndexedSeq<org.scalatest.Suite> nestedSuites ()  { throw new RuntimeException(); }
  static public final  void execute (java.lang.String testName, org.scalatest.ConfigMap configMap, boolean color, boolean durations, boolean shortstacks, boolean fullstacks, boolean stats)  { throw new RuntimeException(); }
  static public final  void execute ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Status runNestedSuites (org.scalatest.Args args)  { throw new RuntimeException(); }
  static public  java.lang.String suiteName ()  { throw new RuntimeException(); }
  static public  java.lang.String suiteId ()  { throw new RuntimeException(); }
  static public  org.scalatest.PendingNothing pending ()  { throw new RuntimeException(); }
  static public  void pendingUntilFixed (scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  int expectedTestCount (org.scalatest.Filter filter)  { throw new RuntimeException(); }
  static   org.scalatest.Reporter createCatchReporter (org.scalatest.Reporter reporter)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> rerunner ()  { throw new RuntimeException(); }
  static public final  java.lang.String execute$default$1 ()  { throw new RuntimeException(); }
  static public final  org.scalatest.ConfigMap execute$default$2 ()  { throw new RuntimeException(); }
  static public final  boolean execute$default$3 ()  { throw new RuntimeException(); }
  static public final  boolean execute$default$4 ()  { throw new RuntimeException(); }
  static public final  boolean execute$default$5 ()  { throw new RuntimeException(); }
  static public final  boolean execute$default$6 ()  { throw new RuntimeException(); }
  static public final  boolean execute$default$7 ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Informer info ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Notifier note ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Alerter alert ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Documenter markup ()  { throw new RuntimeException(); }
  static public final  void registerTest (java.lang.String testText, scala.collection.Seq<org.scalatest.Tag> testTags, scala.Function0<scala.runtime.BoxedUnit> testFun)  { throw new RuntimeException(); }
  static public final  void registerIgnoredTest (java.lang.String testText, scala.collection.Seq<org.scalatest.Tag> testTags, scala.Function0<scala.runtime.BoxedUnit> testFun)  { throw new RuntimeException(); }
  static protected  void test (java.lang.String testName, scala.collection.Seq<org.scalatest.Tag> testTags, scala.Function0<scala.runtime.BoxedUnit> testFun)  { throw new RuntimeException(); }
  static protected  void ignore (java.lang.String testName, scala.collection.Seq<org.scalatest.Tag> testTags, scala.Function0<scala.runtime.BoxedUnit> testFun)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.String> testNames ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Status runTest (java.lang.String testName, org.scalatest.Args args)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Set<java.lang.String>> tags ()  { throw new RuntimeException(); }
  static protected  org.scalatest.Status runTests (scala.Option<java.lang.String> testName, org.scalatest.Args args)  { throw new RuntimeException(); }
  static public  org.scalatest.Status run (scala.Option<java.lang.String> testName, org.scalatest.Args args)  { throw new RuntimeException(); }
  static protected  void testsFor (scala.runtime.BoxedUnit unit)  { throw new RuntimeException(); }
  static public final  java.lang.String styleName ()  { throw new RuntimeException(); }
  static public  org.scalatest.TestData testDataFor (java.lang.String testName, org.scalatest.ConfigMap theConfigMap)  { throw new RuntimeException(); }
  static public  org.scalatest.ConfigMap testDataFor$default$2 ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static protected abstract  org.scalatest.Status runNestedSuites (org.scalatest.Args args)  ;
  static protected abstract  org.scalatest.Status runTests (scala.Option<java.lang.String> testName, org.scalatest.Args args)  ;
  static public abstract  java.lang.String suiteName ()  ;
  static public abstract  java.lang.String suiteId ()  ;
  static public abstract  org.scalatest.TestData testDataFor (java.lang.String testName, org.scalatest.ConfigMap theConfigMap)  ;
  static public abstract  scala.collection.immutable.Set<java.lang.String> testNames ()  ;
  static public abstract  scala.collection.immutable.IndexedSeq<org.scalatest.Suite> nestedSuites ()  ;
  static public abstract  scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Set<java.lang.String>> tags ()  ;
  static public abstract  int expectedTestCount (org.scalatest.Filter filter)  ;
  static public abstract  scala.Option<java.lang.String> rerunner ()  ;
  static public abstract  java.lang.String styleName ()  ;
  static public  boolean invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected ()  { throw new RuntimeException(); }
  static protected  void beforeAll ()  { throw new RuntimeException(); }
  static protected  void beforeAll (org.scalatest.ConfigMap configMap)  { throw new RuntimeException(); }
  static protected  void afterAll (org.scalatest.ConfigMap configMap)  { throw new RuntimeException(); }
  static public  org.scalatest.Status run (scala.Option<java.lang.String> testName, org.scalatest.Args args)  { throw new RuntimeException(); }
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
  static protected  void afterAll ()  { throw new RuntimeException(); }
  static protected final  org.scalatest.Outcome withFixture (org.scalatest.Suite.NoArgTest test)  { throw new RuntimeException(); }
  static protected  void before (scala.Function0<java.lang.Object> fun)  { throw new RuntimeException(); }
  static protected  void after (scala.Function0<java.lang.Object> fun)  { throw new RuntimeException(); }
  static protected  org.scalatest.Status runTest (java.lang.String testName, org.scalatest.Args args)  { throw new RuntimeException(); }
  static public  org.scalatest.Status run (scala.Option<java.lang.String> testName, org.scalatest.Args args)  { throw new RuntimeException(); }
  static public  java.lang.String framework ()  { throw new RuntimeException(); }
  static public  java.lang.String master ()  { throw new RuntimeException(); }
  static public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  static public  int numInputPartitions ()  { throw new RuntimeException(); }
  static public  int maxWaitTimeMillis ()  { throw new RuntimeException(); }
  static public  boolean useManualClock ()  { throw new RuntimeException(); }
  static public  boolean actuallyWait ()  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  static public  org.scalatest.concurrent.PatienceConfiguration.Timeout eventuallyTimeout ()  { throw new RuntimeException(); }
  static public <R extends java.lang.Object> R withStreamingContext (org.apache.spark.streaming.StreamingContext ssc, scala.Function1<org.apache.spark.streaming.StreamingContext, R> block)  { throw new RuntimeException(); }
  static public <R extends java.lang.Object> R withTestServer (org.apache.spark.streaming.TestServer testServer, scala.Function1<org.apache.spark.streaming.TestServer, R> block)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.StreamingContext setupStreams (scala.collection.Seq<scala.collection.Seq<U>> input, scala.Function1<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>> operation, int numPartitions, scala.reflect.ClassTag<U> evidence$4, scala.reflect.ClassTag<V> evidence$5)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, V extends java.lang.Object, W extends java.lang.Object> org.apache.spark.streaming.StreamingContext setupStreams (scala.collection.Seq<scala.collection.Seq<U>> input1, scala.collection.Seq<scala.collection.Seq<V>> input2, scala.Function2<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>, org.apache.spark.streaming.dstream.DStream<W>> operation, scala.reflect.ClassTag<U> evidence$6, scala.reflect.ClassTag<V> evidence$7, scala.reflect.ClassTag<W> evidence$8)  { throw new RuntimeException(); }
  static public <V extends java.lang.Object> scala.collection.Seq<scala.collection.Seq<V>> runStreams (org.apache.spark.streaming.StreamingContext ssc, int numBatches, int numExpectedOutput, scala.reflect.ClassTag<V> evidence$9)  { throw new RuntimeException(); }
  static public <V extends java.lang.Object> scala.collection.Seq<scala.collection.Seq<scala.collection.Seq<V>>> runStreamsWithPartitions (org.apache.spark.streaming.StreamingContext ssc, int numBatches, int numExpectedOutput, scala.reflect.ClassTag<V> evidence$10)  { throw new RuntimeException(); }
  static public <V extends java.lang.Object> void verifyOutput (scala.collection.Seq<scala.collection.Seq<V>> output, scala.collection.Seq<scala.collection.Seq<V>> expectedOutput, boolean useSet, scala.reflect.ClassTag<V> evidence$11)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, V extends java.lang.Object> void testOperation (scala.collection.Seq<scala.collection.Seq<U>> input, scala.Function1<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>> operation, scala.collection.Seq<scala.collection.Seq<V>> expectedOutput, boolean useSet, scala.reflect.ClassTag<U> evidence$12, scala.reflect.ClassTag<V> evidence$13)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, V extends java.lang.Object> void testOperation (scala.collection.Seq<scala.collection.Seq<U>> input, scala.Function1<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>> operation, scala.collection.Seq<scala.collection.Seq<V>> expectedOutput, int numBatches, boolean useSet, scala.reflect.ClassTag<U> evidence$14, scala.reflect.ClassTag<V> evidence$15)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, V extends java.lang.Object, W extends java.lang.Object> void testOperation (scala.collection.Seq<scala.collection.Seq<U>> input1, scala.collection.Seq<scala.collection.Seq<V>> input2, scala.Function2<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>, org.apache.spark.streaming.dstream.DStream<W>> operation, scala.collection.Seq<scala.collection.Seq<W>> expectedOutput, boolean useSet, scala.reflect.ClassTag<U> evidence$16, scala.reflect.ClassTag<V> evidence$17, scala.reflect.ClassTag<W> evidence$18)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, V extends java.lang.Object, W extends java.lang.Object> void testOperation (scala.collection.Seq<scala.collection.Seq<U>> input1, scala.collection.Seq<scala.collection.Seq<V>> input2, scala.Function2<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>, org.apache.spark.streaming.dstream.DStream<W>> operation, scala.collection.Seq<scala.collection.Seq<W>> expectedOutput, int numBatches, boolean useSet, scala.reflect.ClassTag<U> evidence$19, scala.reflect.ClassTag<V> evidence$20, scala.reflect.ClassTag<W> evidence$21)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, V extends java.lang.Object> boolean testOperation$default$4 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, V extends java.lang.Object> int setupStreams$default$3 ()  { throw new RuntimeException(); }
  static protected <U extends java.lang.Object, V extends java.lang.Object> void testCheckpointedOperation (scala.collection.Seq<scala.collection.Seq<U>> input, scala.Function1<org.apache.spark.streaming.dstream.DStream<U>, org.apache.spark.streaming.dstream.DStream<V>> operation, scala.collection.Seq<scala.collection.Seq<V>> expectedOutput, int numBatchesBeforeRestart, org.apache.spark.streaming.Duration batchDuration, boolean stopSparkContextAfterTest, scala.reflect.ClassTag<U> evidence$1, scala.reflect.ClassTag<V> evidence$2)  { throw new RuntimeException(); }
  static protected  org.apache.spark.streaming.StreamingContext createContextForCheckpointOperation (org.apache.spark.streaming.Duration batchDuration)  { throw new RuntimeException(); }
  static protected <V extends java.lang.Object> org.apache.spark.streaming.TestOutputStreamWithPartitions<V> getTestOutputStream (org.apache.spark.streaming.dstream.DStream<?>[] streams, scala.reflect.ClassTag<V> evidence$3)  { throw new RuntimeException(); }
  static protected <V extends java.lang.Object> scala.collection.Seq<scala.collection.Seq<V>> generateOutput (org.apache.spark.streaming.StreamingContext ssc, org.apache.spark.streaming.Time targetBatchTime, java.lang.String checkpointDir, boolean stopSparkContext, scala.reflect.ClassTag<V> evidence$4)  { throw new RuntimeException(); }
  static protected <U extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.Duration testCheckpointedOperation$default$5 ()  { throw new RuntimeException(); }
  static protected <U extends java.lang.Object, V extends java.lang.Object> boolean testCheckpointedOperation$default$6 ()  { throw new RuntimeException(); }
  static protected  void beforeEach (org.scalatest.ConfigMap configMap)  { throw new RuntimeException(); }
  static protected  void beforeEach (org.scalatest.TestData testData)  { throw new RuntimeException(); }
  static protected  void afterEach (org.scalatest.ConfigMap configMap)  { throw new RuntimeException(); }
  static protected  void afterEach (org.scalatest.TestData testData)  { throw new RuntimeException(); }
  static protected  org.scalatest.Status runTest (java.lang.String testName, org.scalatest.Args args)  { throw new RuntimeException(); }
  static public  java.util.Properties oldProperties ()  { throw new RuntimeException(); }
  static public  void oldProperties_$eq (java.util.Properties x$1)  { throw new RuntimeException(); }
  static public  void beforeEach ()  { throw new RuntimeException(); }
  static public  void afterEach ()  { throw new RuntimeException(); }
  public   CheckpointSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration batchDuration ()  { throw new RuntimeException(); }
  public  void beforeFunction ()  { throw new RuntimeException(); }
  public  void afterFunction ()  { throw new RuntimeException(); }
  /**
   * Advances the manual clock on the streaming scheduler by given number of batches.
   * It also waits for the expected amount of time for each batch.
   * @param ssc (undocumented)
   * @param numBatches (undocumented)
   * @param evidence$6 (undocumented)
   * @return (undocumented)
   */
  public <V extends java.lang.Object> scala.collection.Iterable<scala.collection.Seq<V>> advanceTimeWithRealDelay (org.apache.spark.streaming.StreamingContext ssc, long numBatches, scala.reflect.ClassTag<V> evidence$6)  { throw new RuntimeException(); }
}
