package org.apache.spark.sql.catalyst.optimizer;
/**
 * This is a test for SPARK-7727 if the Optimizer is kept being extendable
 */
public  class OptimizerExtendableSuite extends org.apache.spark.SparkFunSuite {
  public   OptimizerExtendableSuite ()  { throw new RuntimeException(); }
  /**
   * Dummy rule for test batches
   */
  public  class DummyRule extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   DummyRule ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan p)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.optimizer.OptimizerExtendableSuite.DummyRule$ DummyRule ()  { throw new RuntimeException(); }
  /**
   * This class represents a dummy extended optimizer that takes the batches of the
   * Optimizer and adds custom ones.
   */
  public  class ExtendedOptimizer extends org.apache.spark.sql.catalyst.optimizer.SimpleTestOptimizer {
    public   ExtendedOptimizer ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> myBatches ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> batches ()  { throw new RuntimeException(); }
  }
}
