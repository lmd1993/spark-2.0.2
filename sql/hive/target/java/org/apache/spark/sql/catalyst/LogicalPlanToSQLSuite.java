package org.apache.spark.sql.catalyst;
/**
 * A test suite for LogicalPlan-to-SQL conversion.
 * <p>
 * Each query has a golden generated SQL file in test/resources/sqlgen. The test suite also has
 * built-in functionality to automatically generate these golden files.
 * <p>
 * To re-generate golden files, run:
 *    SPARK_GENERATE_GOLDEN_FILES=1 build/sbt "hive/test-only *LogicalPlanToSQLSuite"
 */
public  class LogicalPlanToSQLSuite extends org.apache.spark.sql.catalyst.SQLBuilderTest implements org.apache.spark.sql.test.SQLTestUtils {
  public   LogicalPlanToSQLSuite ()  { throw new RuntimeException(); }
  private  boolean regenerateGoldenFiles ()  { throw new RuntimeException(); }
  private  java.lang.String goldenSQLPath ()  { throw new RuntimeException(); }
  protected  void beforeAll ()  { throw new RuntimeException(); }
  protected  void afterAll ()  { throw new RuntimeException(); }
  /**
   * Compare the generated SQL with the expected answer string.
   * @param originalSQL (undocumented)
   * @param convertedSQL (undocumented)
   * @param answerFile (undocumented)
   * @return (undocumented)
   */
  private  Object checkSQLStructure (java.lang.String originalSQL, java.lang.String convertedSQL, java.lang.String answerFile)  { throw new RuntimeException(); }
  /**
   * 1. Checks if SQL parsing succeeds.
   * 2. Checks if SQL generation succeeds.
   * 3. Checks the generated SQL against golden files.
   * 4. Verifies the execution result stays the same.
   * @param sqlString (undocumented)
   * @param answerFile (undocumented)
   */
  private  void checkSQL (java.lang.String sqlString, java.lang.String answerFile)  { throw new RuntimeException(); }
}
