package org.apache.spark.util;
public  class JsonProtocolSuite extends org.apache.spark.SparkFunSuite {
  static private  long jobSubmissionTime ()  { throw new RuntimeException(); }
  static private  long jobCompletionTime ()  { throw new RuntimeException(); }
  static private  long executorAddedTime ()  { throw new RuntimeException(); }
  static private  long executorRemovedTime ()  { throw new RuntimeException(); }
  static private  void testEvent (org.apache.spark.scheduler.SparkListenerEvent event, java.lang.String jsonString)  { throw new RuntimeException(); }
  static private  void testRDDInfo (org.apache.spark.storage.RDDInfo info)  { throw new RuntimeException(); }
  static private  void testStageInfo (org.apache.spark.scheduler.StageInfo info)  { throw new RuntimeException(); }
  static private  void testStorageLevel (org.apache.spark.storage.StorageLevel level)  { throw new RuntimeException(); }
  static private  void testTaskMetrics (org.apache.spark.executor.TaskMetrics metrics)  { throw new RuntimeException(); }
  static private  void testBlockManagerId (org.apache.spark.storage.BlockManagerId id)  { throw new RuntimeException(); }
  static private  void testTaskInfo (org.apache.spark.scheduler.TaskInfo info)  { throw new RuntimeException(); }
  static private  void testJobResult (org.apache.spark.scheduler.JobResult result)  { throw new RuntimeException(); }
  static private  void testTaskEndReason (org.apache.spark.TaskEndReason reason)  { throw new RuntimeException(); }
  static private  void testBlockId (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  static private  void testExecutorInfo (org.apache.spark.scheduler.cluster.ExecutorInfo info)  { throw new RuntimeException(); }
  static private  void testAccumValue (scala.Option<java.lang.String> name, Object value, org.json4s.JsonAST.JValue expectedJson)  { throw new RuntimeException(); }
  /** -------------------------------- *
   | Util methods for comparing events |
   * @param event1 (undocumented)
   * @param event2 (undocumented)
   * --------------------------------- */
  static   void assertEquals (org.apache.spark.scheduler.SparkListenerEvent event1, org.apache.spark.scheduler.SparkListenerEvent event2)  { throw new RuntimeException(); }
  static private  void assertEquals (org.apache.spark.scheduler.StageInfo info1, org.apache.spark.scheduler.StageInfo info2)  { throw new RuntimeException(); }
  static private  void assertEquals (org.apache.spark.storage.RDDInfo info1, org.apache.spark.storage.RDDInfo info2)  { throw new RuntimeException(); }
  static private  void assertEquals (org.apache.spark.storage.StorageLevel level1, org.apache.spark.storage.StorageLevel level2)  { throw new RuntimeException(); }
  static private  void assertEquals (org.apache.spark.scheduler.TaskInfo info1, org.apache.spark.scheduler.TaskInfo info2)  { throw new RuntimeException(); }
  static private  void assertEquals (org.apache.spark.scheduler.cluster.ExecutorInfo info1, org.apache.spark.scheduler.cluster.ExecutorInfo info2)  { throw new RuntimeException(); }
  static private  void assertEquals (org.apache.spark.executor.TaskMetrics metrics1, org.apache.spark.executor.TaskMetrics metrics2)  { throw new RuntimeException(); }
  static private  void assertEquals (org.apache.spark.executor.ShuffleReadMetrics metrics1, org.apache.spark.executor.ShuffleReadMetrics metrics2)  { throw new RuntimeException(); }
  static private  void assertEquals (org.apache.spark.executor.ShuffleWriteMetrics metrics1, org.apache.spark.executor.ShuffleWriteMetrics metrics2)  { throw new RuntimeException(); }
  static private  void assertEquals (org.apache.spark.executor.InputMetrics metrics1, org.apache.spark.executor.InputMetrics metrics2)  { throw new RuntimeException(); }
  static private  void assertEquals (org.apache.spark.scheduler.JobResult result1, org.apache.spark.scheduler.JobResult result2)  { throw new RuntimeException(); }
  static private  void assertEquals (org.apache.spark.TaskEndReason reason1, org.apache.spark.TaskEndReason reason2)  { throw new RuntimeException(); }
  static private  void assertEquals (scala.collection.Map<java.lang.String, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>>> details1, scala.collection.Map<java.lang.String, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>>> details2)  { throw new RuntimeException(); }
  static private  void assertEquals (java.lang.Exception exception1, java.lang.Exception exception2)  { throw new RuntimeException(); }
  static private  void assertJsonStringEquals (java.lang.String expected, java.lang.String actual, java.lang.String metadata)  { throw new RuntimeException(); }
  static private <T extends java.lang.Object> void assertSeqEquals (scala.collection.Seq<T> seq1, scala.collection.Seq<T> seq2, scala.Function2<T, T, scala.runtime.BoxedUnit> assertEquals)  { throw new RuntimeException(); }
  static private <T extends java.lang.Object> void assertOptionEquals (scala.Option<T> opt1, scala.Option<T> opt2, scala.Function2<T, T, scala.runtime.BoxedUnit> assertEquals)  { throw new RuntimeException(); }
  /**
   * Use different names for methods we pass in to assertSeqEquals or assertOptionEquals
   * @param blocks1 (undocumented)
   * @param blocks2 (undocumented)
   */
  static private  void assertBlocksEquals (scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> blocks1, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> blocks2)  { throw new RuntimeException(); }
  static private  void assertBlockEquals (scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> b1, scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> b2)  { throw new RuntimeException(); }
  static private  void assertStackTraceElementEquals (java.lang.StackTraceElement ste1, java.lang.StackTraceElement ste2)  { throw new RuntimeException(); }
  /** ----------------------------------- *
   | Util methods for constructing events |
   * @return (undocumented)
   * ------------------------------------ */
  static private  java.util.Properties properties ()  { throw new RuntimeException(); }
  static private  java.lang.StackTraceElement[] stackTrace ()  { throw new RuntimeException(); }
  static private  org.apache.spark.storage.RDDInfo makeRddInfo (int a, int b, int c, long d, long e)  { throw new RuntimeException(); }
  static private  org.apache.spark.scheduler.StageInfo makeStageInfo (int a, int b, int c, long d, long e)  { throw new RuntimeException(); }
  static private  org.apache.spark.scheduler.TaskInfo makeTaskInfo (long a, int b, int c, long d, boolean speculative)  { throw new RuntimeException(); }
  static private  org.apache.spark.scheduler.AccumulableInfo makeAccumulableInfo (int id, boolean internal, boolean countFailedValues, scala.Option<java.lang.String> metadata)  { throw new RuntimeException(); }
  /**
   * Creates a TaskMetrics object describing a task that read data from Hadoop (if hasHadoopInput is
   * set to true) or read data from a shuffle otherwise.
   * @param a (undocumented)
   * @param b (undocumented)
   * @param c (undocumented)
   * @param d (undocumented)
   * @param e (undocumented)
   * @param f (undocumented)
   * @param hasHadoopInput (undocumented)
   * @param hasOutput (undocumented)
   * @param hasRecords (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.executor.TaskMetrics makeTaskMetrics (long a, long b, long c, long d, int e, int f, boolean hasHadoopInput, boolean hasOutput, boolean hasRecords)  { throw new RuntimeException(); }
  /** --------------------------------------- *
   | JSON string representation of each event |
   * @return (undocumented)
   * ---------------------------------------- */
  static private  java.lang.String stageSubmittedJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String stageCompletedJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String taskStartJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String taskGettingResultJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String taskEndJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String taskEndWithHadoopInputJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String taskEndWithOutputJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String jobStartJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String jobEndJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String environmentUpdateJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String blockManagerAddedJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String blockManagerRemovedJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String unpersistRDDJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String applicationStartJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String applicationStartJsonWithLogUrlsString ()  { throw new RuntimeException(); }
  static private  java.lang.String applicationEndJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String executorAddedJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String executorRemovedJsonString ()  { throw new RuntimeException(); }
  static private  java.lang.String executorMetricsUpdateJsonString ()  { throw new RuntimeException(); }
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
  static protected abstract  org.scalatest.Status runTest (java.lang.String testName, org.scalatest.Args args)  ;
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
  public   JsonProtocolSuite ()  { throw new RuntimeException(); }
}
