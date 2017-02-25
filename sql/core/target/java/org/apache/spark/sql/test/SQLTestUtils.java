package org.apache.spark.sql.test;
/**
 * Helper trait that should be extended by all SQL test suites.
 * <p>
 * This allows subclasses to plugin a custom {@link SQLContext}. It comes with test data
 * prepared in advance as well as all implicit conversions used extensively by dataframes.
 * To use implicit methods, import <code>testImplicits._</code> instead of through the {@link SQLContext}.
 * <p>
 * Subclasses should *not* create {@link SQLContext}s in the test suite constructor, which is
 * prone to leaving multiple overlapping {@link org.apache.spark.SparkContext}s in the same JVM.
 */
  interface SQLTestUtils extends org.scalatest.BeforeAndAfterAll, org.apache.spark.sql.test.SQLTestData {
  /**
   * A helper object for importing SQL implicits.
   * <p>
   * Note that the alternative of importing <code>spark.implicits._</code> is not possible here.
   * This is because we create the {@link SQLContext} immediately before the first test is run,
   * but the implicits import is needed in the constructor.
   */
  protected  class testImplicits$ extends org.apache.spark.sql.SQLImplicits {
    public   testImplicits$ ()  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.SQLContext _sqlContext ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.SparkContext sparkContext ()  ;
  public  boolean loadTestDataBeforeTests ()  ;
  public  scala.Function1<java.lang.String, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sql ()  ;
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.test.SQLTestUtils.testImplicits$ testImplicits ()  ;
  public  void setupTestData ()  ;
  public  void beforeAll ()  ;
  /**
   * Sets all SQL configurations specified in <code>pairs</code>, calls <code>f</code>, and then restore all SQL
   * configurations.
   * <p>
   * @todo Probably this method should be moved to a more general place
   * @param pairs (undocumented)
   * @param f (undocumented)
   */
  public  void withSQLConf (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> pairs, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Generates a temporary path without creating the actual file/directory, then pass it to <code>f</code>. If
   * a file/directory is created there by <code>f</code>, it will be delete after <code>f</code> returns.
   * <p>
   * @todo Probably this method should be moved to a more general place
   * @param f (undocumented)
   */
  public  void withTempPath (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  ;
  /**
   * Creates a temporary directory, which is then passed to <code>f</code> and will be deleted after <code>f</code>
   * returns.
   * <p>
   * @todo Probably this method should be moved to a more general place
   * @param f (undocumented)
   */
  public  void withTempDir (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  ;
  /**
   * Drops functions after calling <code>f</code>. A function is represented by (functionName, isTemporary).
   * @param functions (undocumented)
   * @param f (undocumented)
   */
  public  void withUserDefinedFunction (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> functions, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Drops temporary table <code>tableName</code> after calling <code>f</code>.
   * @param tableNames (undocumented)
   * @param f (undocumented)
   */
  public  void withTempView (scala.collection.Seq<java.lang.String> tableNames, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Drops table <code>tableName</code> after calling <code>f</code>.
   * @param tableNames (undocumented)
   * @param f (undocumented)
   */
  public  void withTable (scala.collection.Seq<java.lang.String> tableNames, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Drops view <code>viewName</code> after calling <code>f</code>.
   * @param viewNames (undocumented)
   * @param f (undocumented)
   */
  public  void withView (scala.collection.Seq<java.lang.String> viewNames, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Creates a temporary database and switches current database to it before executing <code>f</code>.  This
   * database is dropped after <code>f</code> returns.
   * <p>
   * Note that this method doesn't switch current database before executing <code>f</code>.
   * @param f (undocumented)
   */
  public  void withTempDatabase (scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f)  ;
  /**
   * Activates database <code>db</code> before executing <code>f</code>, then switches back to <code>default</code> database after
   * <code>f</code> returns.
   * @param db (undocumented)
   * @param f (undocumented)
   */
  public  void activateDatabase (java.lang.String db, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Strip Spark-side filtering in order to check if a datasource filters rows correctly.
   * @param df (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> stripSparkFilter (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  ;
  /**
   * Turn a logical plan into a {@link DataFrame}. This should be removed once we have an easier
   * way to construct {@link DataFrame} directly out of local data without relying on implicits.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> logicalPlanToSparkQuery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  /**
   * Disable stdout and stderr when running the test. To not output the logs to the console,
   * ConsoleAppender's <code>follow</code> should be set to <code>true</code> so that it will honors reassignments of
   * System.out or System.err. Otherwise, ConsoleAppender will still output to the console even if
   * we change System.out and System.err.
   * @param name (undocumented)
   * @param f (undocumented)
   */
  public  void testQuietly (java.lang.String name, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /** Run a test on a separate {@link UninterruptibleThread}. */
  public  void testWithUninterruptibleThread (java.lang.String name, boolean quietly, scala.Function0<scala.runtime.BoxedUnit> body)  ;
}
