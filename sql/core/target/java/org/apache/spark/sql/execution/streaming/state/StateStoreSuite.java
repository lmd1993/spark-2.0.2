package org.apache.spark.sql.execution.streaming.state;
public  class StateStoreSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.scalatest.PrivateMethodTester {
  static public  class Added implements org.apache.spark.sql.execution.streaming.state.StateStoreSuite.TestUpdate, scala.Product, scala.Serializable {
    public  java.lang.String key ()  { throw new RuntimeException(); }
    public  int value ()  { throw new RuntimeException(); }
    // not preceding
    public   Added (java.lang.String key, int value)  { throw new RuntimeException(); }
  }
  static public  class Added$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.Object, org.apache.spark.sql.execution.streaming.state.StateStoreSuite.Added> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Added$ MODULE$ = null;
    public   Added$ ()  { throw new RuntimeException(); }
  }
  static public  class Updated implements org.apache.spark.sql.execution.streaming.state.StateStoreSuite.TestUpdate, scala.Product, scala.Serializable {
    public  java.lang.String key ()  { throw new RuntimeException(); }
    public  int value ()  { throw new RuntimeException(); }
    // not preceding
    public   Updated (java.lang.String key, int value)  { throw new RuntimeException(); }
  }
  static public  class Updated$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.Object, org.apache.spark.sql.execution.streaming.state.StateStoreSuite.Updated> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Updated$ MODULE$ = null;
    public   Updated$ ()  { throw new RuntimeException(); }
  }
  static public  class Removed implements org.apache.spark.sql.execution.streaming.state.StateStoreSuite.TestUpdate, scala.Product, scala.Serializable {
    public  java.lang.String key ()  { throw new RuntimeException(); }
    // not preceding
    public   Removed (java.lang.String key)  { throw new RuntimeException(); }
  }
  static public  class Removed$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.execution.streaming.state.StateStoreSuite.Removed> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Removed$ MODULE$ = null;
    public   Removed$ ()  { throw new RuntimeException(); }
  }
  /** Trait and classes mirroring {@link StoreUpdate} for testing store updates iterator */
  static public  interface TestUpdate {
  }
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection strProj ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection intProj ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeRow stringToRow (java.lang.String s)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeRow intToRow (int i)  { throw new RuntimeException(); }
  static public  java.lang.String rowToString (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  static public  int rowToInt (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> rowsToIntInt (scala.Tuple2<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> row)  { throw new RuntimeException(); }
  static public  scala.Tuple2<java.lang.String, java.lang.Object> rowsToStringInt (scala.Tuple2<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> row)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<scala.Tuple2<java.lang.String, java.lang.Object>> rowsToSet (scala.collection.Iterator<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> iterator)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<org.apache.spark.sql.execution.streaming.state.StateStoreSuite.TestUpdate> updatesToSet (scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.StoreUpdate> iterator)  { throw new RuntimeException(); }
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
  static public  org.scalatest.PrivateMethodTester.Invoker anyRefToInvoker (java.lang.Object target)  { throw new RuntimeException(); }
  public   StateStoreSuite ()  { throw new RuntimeException(); }
  private  java.lang.String tempDir ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType keySchema ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType valueSchema ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<scala.Tuple2<java.lang.String, java.lang.Object>> getDataFromFiles (org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider provider, int version)  { throw new RuntimeException(); }
  public  void assertMap (scala.Option<scala.collection.mutable.HashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> testMapOption, scala.collection.immutable.Map<java.lang.String, java.lang.Object> expectedMap)  { throw new RuntimeException(); }
  public  boolean fileExists (org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider provider, long version, boolean isSnapshot)  { throw new RuntimeException(); }
  public  void deleteFilesEarlierThanVersion (org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider provider, long version)  { throw new RuntimeException(); }
  public  void corruptFile (org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider provider, long version, boolean isSnapshot)  { throw new RuntimeException(); }
  public  boolean storeLoaded (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId)  { throw new RuntimeException(); }
  public  boolean unloadStore (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider newStoreProvider (long opId, int partition, int minDeltasForSnapshot)  { throw new RuntimeException(); }
  public  void remove (org.apache.spark.sql.execution.streaming.state.StateStore store, scala.Function1<java.lang.String, java.lang.Object> condition)  { throw new RuntimeException(); }
  private  void put (org.apache.spark.sql.execution.streaming.state.StateStore store, java.lang.String key, int value)  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> get (org.apache.spark.sql.execution.streaming.state.StateStore store, java.lang.String key)  { throw new RuntimeException(); }
}
