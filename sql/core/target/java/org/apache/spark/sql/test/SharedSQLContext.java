package org.apache.spark.sql.test;
/**
 * Helper trait for SQL test suites where all tests share a single {@link TestSparkSession}.
 */
public  interface SharedSQLContext extends org.apache.spark.sql.test.SQLTestUtils {
  public  org.apache.spark.SparkConf sparkConf ()  ;
  /**
   * The {@link TestSparkSession} to use for all tests in this suite.
   * <p>
   * By default, the underlying {@link org.apache.spark.SparkContext} will be run in local
   * mode with the default test configurations.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.test.TestSparkSession _spark ()  ;
  /**
   * The {@link TestSparkSession} to use for all tests in this suite.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SparkSession spark ()  ;
  /**
   * The {@link TestSQLContext} to use for all tests in this suite.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SQLContext sqlContext ()  ;
  /**
   * Initialize the {@link TestSparkSession}.
   */
  public  void beforeAll ()  ;
  /**
   * Stop the underlying {@link org.apache.spark.SparkContext}, if any.
   */
  public  void afterAll ()  ;
}
