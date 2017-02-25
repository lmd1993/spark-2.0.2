package org.apache.spark.sql;
public  class CachedTableSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SQLTestUtils, org.apache.spark.sql.test.SharedSQLContext {
  public   CachedTableSuite ()  { throw new RuntimeException(); }
  public  int rddIdOf (java.lang.String tableName)  { throw new RuntimeException(); }
  public  boolean isMaterialized (int rddId)  { throw new RuntimeException(); }
  /**
   * Verifies that the plan for <code>df</code> contains <code>expected</code> number of Exchange operators.
   * @param df (undocumented)
   * @param expected (undocumented)
   */
  private  void verifyNumExchanges (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, int expected)  { throw new RuntimeException(); }
}
