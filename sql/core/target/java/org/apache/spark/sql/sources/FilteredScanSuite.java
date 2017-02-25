package org.apache.spark.sql.sources;
public  class FilteredScanSuite extends org.apache.spark.sql.sources.DataSourceTest implements org.apache.spark.sql.test.SharedSQLContext, org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  public   FilteredScanSuite ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void testPushDown (java.lang.String sqlString, int expectedCount, scala.collection.immutable.Set<java.lang.String> requiredColumnNames)  { throw new RuntimeException(); }
  public  void testPushDown (java.lang.String sqlString, int expectedCount, scala.collection.immutable.Set<java.lang.String> requiredColumnNames, scala.collection.immutable.Set<org.apache.spark.sql.sources.Filter> expectedUnhandledFilters)  { throw new RuntimeException(); }
}
