package org.apache.spark.sql;
/**
 * A test suite for functions added for compatibility with other databases such as Oracle, MSSQL.
 * <p>
 * These functions are typically implemented using the trait
 * {@link org.apache.spark.sql.catalyst.expressions.RuntimeReplaceable}.
 */
public  class SQLCompatibilityFunctionSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSQLContext {
  public   SQLCompatibilityFunctionSuite ()  { throw new RuntimeException(); }
}
