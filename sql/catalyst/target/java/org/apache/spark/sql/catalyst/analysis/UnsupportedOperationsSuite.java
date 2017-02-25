package org.apache.spark.sql.catalyst.analysis;
public  class UnsupportedOperationsSuite extends org.apache.spark.SparkFunSuite {
  public   UnsupportedOperationsSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attribute ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LocalRelation batchRelation ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.UnsupportedOperationsSuite.TestStreamingRelation streamRelation ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggExprs (java.lang.String name)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan genCogroup (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
  /**
   * Test that an unary operator correctly fails support check when it has a streaming child plan,
   * but not when it has batch child plan. There can be batch sub-plans inside a streaming plan,
   * so it is valid for the operator to have a batch child plan.
   * <p>
   * This test wraps the logical plan in a fake operator that makes the whole plan look like
   * a streaming plan even if the child plan is a batch plan. This is to test that the operator
   * supports having a batch child plan, forming a batch subplan inside a streaming plan.
   * @param operationName (undocumented)
   * @param logicalPlanGenerator (undocumented)
   * @param outputMode (undocumented)
   * @param expectedMsg (undocumented)
   */
  public  void testUnaryOperatorInStreamingPlan (java.lang.String operationName, scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> logicalPlanGenerator, org.apache.spark.sql.streaming.OutputMode outputMode, java.lang.String expectedMsg)  { throw new RuntimeException(); }
  /**
   * Test that a binary operator correctly fails support check when it has combinations of
   * streaming and batch child plans. There can be batch sub-plans inside a streaming plan,
   * so it is valid for the operator to have a batch child plan.
   * @param operationName (undocumented)
   * @param planGenerator (undocumented)
   * @param outputMode (undocumented)
   * @param streamStreamSupported (undocumented)
   * @param streamBatchSupported (undocumented)
   * @param batchStreamSupported (undocumented)
   * @param expectedMsg (undocumented)
   */
  public  void testBinaryOperationInStreamingPlan (java.lang.String operationName, scala.Function2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> planGenerator, org.apache.spark.sql.streaming.OutputMode outputMode, boolean streamStreamSupported, boolean streamBatchSupported, boolean batchStreamSupported, java.lang.String expectedMsg)  { throw new RuntimeException(); }
  /** Test output mode with and without aggregation in the streaming plan */
  public  void testOutputMode (org.apache.spark.sql.streaming.OutputMode outputMode, boolean shouldSupportAggregation)  { throw new RuntimeException(); }
  /**
   * Assert that the logical plan is supported as subplan insider a streaming plan.
   * <p>
   * To test this correctly, the given logical plan is wrapped in a fake operator that makes the
   * whole plan look like a streaming plan. Otherwise, a batch plan may throw not supported
   * exception simply for not being a streaming plan, even though that plan could exists as batch
   * subplan inside some streaming plan.
   * @param name (undocumented)
   * @param plan (undocumented)
   * @param outputMode (undocumented)
   */
  public  void assertSupportedInStreamingPlan (java.lang.String name, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  /**
   * Assert that the logical plan is not supported inside a streaming plan.
   * <p>
   * To test this correctly, the given logical plan is wrapped in a fake operator that makes the
   * whole plan look like a streaming plan. Otherwise, a batch plan may throw not supported
   * exception simply for not being a streaming plan, even though that plan could exists as batch
   * subplan inside some streaming plan.
   * @param name (undocumented)
   * @param plan (undocumented)
   * @param outputMode (undocumented)
   * @param expectedMsgs (undocumented)
   */
  public  void assertNotSupportedInStreamingPlan (java.lang.String name, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode, scala.collection.Seq<java.lang.String> expectedMsgs)  { throw new RuntimeException(); }
  /** Assert that the logical plan is supported as a batch plan */
  public  void assertSupportedInBatchPlan (java.lang.String name, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /** Assert that the logical plan is not supported as a batch plan */
  public  void assertNotSupportedInBatchPlan (java.lang.String name, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<java.lang.String> expectedMsgs)  { throw new RuntimeException(); }
  /**
   * Test whether the body of code will fail. If it does fail, then check if it has expected
   * messages.
   * @param testName (undocumented)
   * @param expectedMsgs (undocumented)
   * @param testBody (undocumented)
   */
  public  void testError (java.lang.String testName, scala.collection.Seq<java.lang.String> expectedMsgs, scala.Function0<scala.runtime.BoxedUnit> testBody)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan wrapInStreaming (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  class StreamingPlanWrapper extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
    // not preceding
    public   StreamingPlanWrapper (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
    public  boolean isStreaming ()  { throw new RuntimeException(); }
  }
  public  class StreamingPlanWrapper extends scala.runtime.AbstractFunction1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.analysis.UnsupportedOperationsSuite.StreamingPlanWrapper> implements scala.Serializable {
    public   StreamingPlanWrapper ()  { throw new RuntimeException(); }
  }
  public  class TestStreamingRelation extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements scala.Product, scala.Serializable {
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
    // not preceding
    public   TestStreamingRelation (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output)  { throw new RuntimeException(); }
    public   TestStreamingRelation (org.apache.spark.sql.catalyst.expressions.Attribute attribute)  { throw new RuntimeException(); }
    public  boolean isStreaming ()  { throw new RuntimeException(); }
  }
  public  class TestStreamingRelation extends scala.runtime.AbstractFunction1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.catalyst.analysis.UnsupportedOperationsSuite.TestStreamingRelation> implements scala.Serializable {
    public   TestStreamingRelation ()  { throw new RuntimeException(); }
  }
}
