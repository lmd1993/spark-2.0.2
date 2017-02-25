package org.apache.spark.sql.execution.joins;
public  class ExistenceJoinSuite extends org.apache.spark.sql.execution.SparkPlanTest implements org.apache.spark.sql.test.SharedSQLContext {
  public   ExistenceJoinSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> left ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> right ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> rightUniqueKey ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression singleConditionEQ ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.And composedConditionEQ ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.And composedConditionNEQ ()  { throw new RuntimeException(); }
  private  void testExistenceJoin (java.lang.String testName, org.apache.spark.sql.catalyst.plans.JoinType joinType, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> leftRows, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> rightRows, scala.Function0<org.apache.spark.sql.catalyst.expressions.Expression> condition, scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer)  { throw new RuntimeException(); }
}
