package org.apache.spark.sql.hive.execution;
/**
 * A set of test cases expressed in Hive QL that are not covered by the tests
 * included in the hive distribution.
 */
public  class HiveQuerySuite extends org.apache.spark.sql.hive.execution.HiveComparisonTest implements org.apache.spark.sql.test.SQLTestUtils, org.scalatest.BeforeAndAfter {
  public   HiveQuerySuite ()  { throw new RuntimeException(); }
  private  java.util.TimeZone originalTimeZone ()  { throw new RuntimeException(); }
  private  java.util.Locale originalLocale ()  { throw new RuntimeException(); }
  private  boolean originalCrossJoinEnabled ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  private  void assertUnsupportedFeature (scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  private  java.lang.String spark_10484_1 ()  { throw new RuntimeException(); }
  private  java.lang.String spark_10484_2 ()  { throw new RuntimeException(); }
  private  java.lang.String spark_10484_3 ()  { throw new RuntimeException(); }
  private  java.lang.String spark_10484_4 ()  { throw new RuntimeException(); }
  public  java.lang.String delimiter ()  { throw new RuntimeException(); }
  public  boolean isExplanation (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> result)  { throw new RuntimeException(); }
}
