package org.apache.spark.sql.catalyst.plans;
/**
 * This suite is used to test {@link LogicalPlan}'s <code>resolveOperators</code> and make sure it can correctly
 * skips sub-trees that have already been marked as analyzed.
 */
public  class LogicalPlanSuite extends org.apache.spark.SparkFunSuite {
  public   LogicalPlanSuite ()  { throw new RuntimeException(); }
  private  int invocationCount ()  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> function ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.LocalRelation testRelation ()  { throw new RuntimeException(); }
}
