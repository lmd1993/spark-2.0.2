package org.apache.spark.sql;
/**
 * End-to-end test cases for SQL queries.
 * <p>
 * Each case is loaded from a file in "spark/sql/core/src/test/resources/sql-tests/inputs".
 * Each case has a golden result file in "spark/sql/core/src/test/resources/sql-tests/results".
 * <p>
 * To run the entire test suite:
 * <pre><code>
 *   build/sbt "sql/test-only *SQLQueryTestSuite"
 * </code></pre>
 * <p>
 * To run a single test file upon change:
 * <pre><code>
 *   build/sbt "~sql/test-only *SQLQueryTestSuite -- -z inline-table.sql"
 * </code></pre>
 * <p>
 * To re-generate golden files, run:
 * <pre><code>
 *   SPARK_GENERATE_GOLDEN_FILES=1 build/sbt "sql/test-only *SQLQueryTestSuite"
 * </code></pre>
 * <p>
 * The format for input files is simple:
 *  1. A list of SQL queries separated by semicolon.
 *  2. Lines starting with -- are treated as comments and ignored.
 * <p>
 * For example:
 * <pre><code>
 *   -- this is a comment
 *   select 1, -1;
 *   select current_date;
 * </code></pre>
 * <p>
 * The format for golden result files look roughly like:
 * <pre><code>
 *   -- some header information
 *
 *   -- !query 0
 *   select 1, -1
 *   -- !query 0 schema
 *   struct&lt;...schema...&gt;
 *   -- !query 0 output
 *   ... data row 1 ...
 *   ... data row 2 ...
 *   ...
 *
 *   -- !query 1
 *   ...
 * </code></pre>
 */
public  class SQLQueryTestSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSQLContext {
  public   SQLQueryTestSuite ()  { throw new RuntimeException(); }
  private  boolean regenerateGoldenFiles ()  { throw new RuntimeException(); }
  private  java.io.File baseResourcePath ()  { throw new RuntimeException(); }
  private  java.lang.String inputFilePath ()  { throw new RuntimeException(); }
  private  java.lang.String goldenFilePath ()  { throw new RuntimeException(); }
  /** List of test cases to ignore, in lower cases. */
  private  scala.collection.immutable.Set<java.lang.String> blackList ()  { throw new RuntimeException(); }
  /** A test case. */
  private  class TestCase implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  java.lang.String inputFile ()  { throw new RuntimeException(); }
    public  java.lang.String resultFile ()  { throw new RuntimeException(); }
    // not preceding
    public   TestCase (java.lang.String name, java.lang.String inputFile, java.lang.String resultFile)  { throw new RuntimeException(); }
  }
  private  class TestCase extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.String, org.apache.spark.sql.SQLQueryTestSuite.TestCase> implements scala.Serializable {
    public   TestCase ()  { throw new RuntimeException(); }
  }
  /** A single SQL query's output. */
  private  class QueryOutput implements scala.Product, scala.Serializable {
    public  java.lang.String sql ()  { throw new RuntimeException(); }
    public  java.lang.String schema ()  { throw new RuntimeException(); }
    public  java.lang.String output ()  { throw new RuntimeException(); }
    // not preceding
    public   QueryOutput (java.lang.String sql, java.lang.String schema, java.lang.String output)  { throw new RuntimeException(); }
    public  java.lang.String toString (int queryIndex)  { throw new RuntimeException(); }
  }
  private  class QueryOutput extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.String, org.apache.spark.sql.SQLQueryTestSuite.QueryOutput> implements scala.Serializable {
    public   QueryOutput ()  { throw new RuntimeException(); }
  }
  private  void createScalaTestCase (org.apache.spark.sql.SQLQueryTestSuite.TestCase testCase)  { throw new RuntimeException(); }
  /** Run a test case. */
  private  void runTest (org.apache.spark.sql.SQLQueryTestSuite.TestCase testCase)  { throw new RuntimeException(); }
  /** Executes a query and returns the result as (schema of the output, normalized output). */
  private  scala.Tuple2<org.apache.spark.sql.types.StructType, scala.collection.Seq<java.lang.String>> getNormalizedResult (org.apache.spark.sql.SparkSession session, java.lang.String sql)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.SQLQueryTestSuite.TestCase> listTestCases ()  { throw new RuntimeException(); }
  /** Returns all the files (not directories) in a directory, recursively. */
  private  scala.collection.Seq<java.io.File> listFilesRecursively (java.io.File path)  { throw new RuntimeException(); }
  /** Load built-in test tables into the SparkSession. */
  private  void loadTestData (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  private  java.util.TimeZone originalTimeZone ()  { throw new RuntimeException(); }
  private  java.util.Locale originalLocale ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
}
