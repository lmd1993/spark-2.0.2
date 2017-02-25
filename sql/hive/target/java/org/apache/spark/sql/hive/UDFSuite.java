package org.apache.spark.sql.hive;
/**
 * A test suite for UDF related functionalities. Because Hive metastore is
 * case insensitive, database names and function names have both upper case
 * letters and lower case letters.
 */
public  class UDFSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SQLTestUtils, org.apache.spark.sql.hive.test.TestHiveSingleton, org.scalatest.BeforeAndAfterEach {
  public   UDFSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testDF ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedDF ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
}
