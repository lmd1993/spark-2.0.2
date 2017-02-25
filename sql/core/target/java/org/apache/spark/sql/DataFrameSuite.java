package org.apache.spark.sql;
public  class DataFrameSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSQLContext {
  public   DataFrameSuite ()  { throw new RuntimeException(); }
  /**
   * Verifies that there is no Exchange between the Aggregations for <code>df</code>
   * @param df (undocumented)
   */
  private  void verifyNonExchangingAgg (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  /**
   * Verifies that there is an Exchange between the Aggregations for <code>df</code>
   * @param df (undocumented)
   */
  private  void verifyExchangingAgg (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  private  void verifyNullabilityInFilterExec (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String expr, scala.collection.Seq<java.lang.String> expectedNonNullableColumns)  { throw new RuntimeException(); }
}
