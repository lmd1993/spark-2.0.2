package org.apache.spark.sql.hive.execution;
/**
 * This suite contains a couple of Hive window tests which fail in the typical setup due to tiny
 * numerical differences or due semantic differences between Hive and Spark.
 */
public  class WindowQuerySuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SQLTestUtils, org.apache.spark.sql.hive.test.TestHiveSingleton {
  public   WindowQuerySuite ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
}
