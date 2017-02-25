package org.apache.spark.sql.execution;
public  class TakeOrderedAndProjectSuite extends org.apache.spark.sql.execution.SparkPlanTest implements org.apache.spark.sql.test.SharedSQLContext {
  public   TakeOrderedAndProjectSuite ()  { throw new RuntimeException(); }
  private  scala.util.Random rand ()  { throw new RuntimeException(); }
  private  long seed ()  { throw new RuntimeException(); }
  protected  void beforeAll ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> generateRandomInputData ()  { throw new RuntimeException(); }
  /**
   * Adds a no-op filter to the child plan in order to prevent executeCollect() from being
   * called directly on the child plan.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.execution.SparkPlan noOpFilter (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  public  int limit ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.SortOrder> sortOrder ()  { throw new RuntimeException(); }
}
