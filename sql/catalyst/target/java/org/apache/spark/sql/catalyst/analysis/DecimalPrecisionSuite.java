package org.apache.spark.sql.catalyst.analysis;
public  class DecimalPrecisionSuite extends org.apache.spark.sql.catalyst.plans.PlanTest implements org.scalatest.BeforeAndAfter {
  public   DecimalPrecisionSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.SimpleCatalystConf conf ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.analysis.Analyzer analyzer ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.LocalRelation relation ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression i ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression d1 ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression d2 ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression u ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression f ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression b ()  { throw new RuntimeException(); }
  private  void checkType (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.types.DataType expectedType)  { throw new RuntimeException(); }
  private  void checkComparison (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.types.DataType expectedType)  { throw new RuntimeException(); }
  private  void checkUnion (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right, org.apache.spark.sql.types.DataType expectedType)  { throw new RuntimeException(); }
  /** strength reduction for integer/decimal comparisons */
  public  void ruleTest (org.apache.spark.sql.catalyst.expressions.Expression initial, org.apache.spark.sql.catalyst.expressions.Expression transformed)  { throw new RuntimeException(); }
}
