package org.apache.spark.sql.catalyst;
public abstract class SQLBuilderTest extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.hive.test.TestHiveSingleton {
  public   SQLBuilderTest ()  { throw new RuntimeException(); }
  protected  void checkSQL (org.apache.spark.sql.catalyst.expressions.Expression e, java.lang.String expectedSQL)  { throw new RuntimeException(); }
  protected  void checkSQL (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, java.lang.String expectedSQL)  { throw new RuntimeException(); }
  protected  void checkSQL (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String expectedSQL)  { throw new RuntimeException(); }
}
