package org.apache.spark.sql;
/**
 * @deprecated This suite is deprecated to silent compiler deprecation warnings. Since 2.0.0. 
*/
public  class SQLContextSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.SharedSparkContext {
  public   SQLContextSuite ()  { throw new RuntimeException(); }
  public  class DummyRule extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   DummyRule ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan p)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.SQLContextSuite.DummyRule$ DummyRule ()  { throw new RuntimeException(); }
}
