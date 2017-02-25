package org.apache.spark.sql.hive.execution;
/**
 * A collection of hive query tests where we generate the answers ourselves instead of depending on
 * Hive to generate them (in contrast to HiveQuerySuite).  Often this is because the query is
 * valid, but Hive currently cannot execute it.
 */
public  class SQLQuerySuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SQLTestUtils, org.apache.spark.sql.hive.test.TestHiveSingleton {
  public   SQLQuerySuite ()  { throw new RuntimeException(); }
  public  void checkRelation (java.lang.String tableName, boolean isDataSourceParquet, java.lang.String format, scala.Option<java.lang.String> userSpecifiedLocation)  { throw new RuntimeException(); }
  public  boolean testCommandAvailable (java.lang.String command)  { throw new RuntimeException(); }
}
