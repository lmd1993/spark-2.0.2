package org.apache.spark.sql.execution;
/**
 * Parser test cases for rules defined in {@link SparkSqlParser}.
 * <p>
 * See {@link org.apache.spark.sql.catalyst.parser.PlanParserSuite} for rules
 * defined in the Catalyst module.
 */
public  class SparkSqlParserSuite extends org.apache.spark.sql.catalyst.plans.PlanTest {
  public   SparkSqlParserSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.SparkSqlParser parser ()  { throw new RuntimeException(); }
  private  void assertEqual (java.lang.String sqlCommand, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  private  void intercept (java.lang.String sqlCommand, scala.collection.Seq<java.lang.String> messages)  { throw new RuntimeException(); }
}
