package org.apache.spark.sql.catalyst.optimizer;
public  class SimplifyConditionalSuite extends org.apache.spark.sql.catalyst.plans.PlanTest implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  public   SimplifyConditionalSuite ()  { throw new RuntimeException(); }
  public  class Optimize extends org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   Optimize ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> batches ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.optimizer.SimplifyConditionalSuite.Optimize$ Optimize ()  { throw new RuntimeException(); }
  protected  void assertEquivalent (org.apache.spark.sql.catalyst.expressions.Expression e1, org.apache.spark.sql.catalyst.expressions.Expression e2)  { throw new RuntimeException(); }
  private  scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Literal, org.apache.spark.sql.catalyst.expressions.Literal> trueBranch ()  { throw new RuntimeException(); }
  private  scala.Tuple2<org.apache.spark.sql.catalyst.expressions.NonFoldableLiteral, org.apache.spark.sql.catalyst.expressions.Literal> normalBranch ()  { throw new RuntimeException(); }
  private  scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Literal, org.apache.spark.sql.catalyst.expressions.Literal> unreachableBranch ()  { throw new RuntimeException(); }
  private  scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Literal, org.apache.spark.sql.catalyst.expressions.Literal> nullBranch ()  { throw new RuntimeException(); }
}
