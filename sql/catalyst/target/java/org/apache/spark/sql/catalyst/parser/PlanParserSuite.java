package org.apache.spark.sql.catalyst.parser;
/**
 * Parser test cases for rules defined in {@link CatalystSqlParser} / {@link AstBuilder}.
 * <p>
 * There is also SparkSqlParserSuite in sql/core module for parser rules defined in sql/core module.
 */
public  class PlanParserSuite extends org.apache.spark.sql.catalyst.plans.PlanTest {
  public   PlanParserSuite ()  { throw new RuntimeException(); }
  private  void assertEqual (java.lang.String sqlCommand, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  private  void intercept (java.lang.String sqlCommand, scala.collection.Seq<java.lang.String> messages)  { throw new RuntimeException(); }
}
