package org.apache.spark.sql.catalyst.parser;
/**
 * Test basic expression parsing. If a type of expression is supported it should be tested here.
 * <p>
 * Please note that some of the expressions test don't have to be sound expressions, only their
 * structure needs to be valid. Unsound expressions should be caught by the Analyzer or
 * CheckAnalysis classes.
 */
public  class ExpressionParserSuite extends org.apache.spark.sql.catalyst.plans.PlanTest {
  public   ExpressionParserSuite ()  { throw new RuntimeException(); }
  public  void assertEqual (java.lang.String sqlCommand, org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  public  void intercept (java.lang.String sqlCommand, scala.collection.Seq<java.lang.String> messages)  { throw new RuntimeException(); }
}
