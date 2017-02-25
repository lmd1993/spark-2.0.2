package org.apache.spark.sql.execution.joins;
public  class InnerJoinSuite extends org.apache.spark.sql.execution.SparkPlanTest implements org.apache.spark.sql.test.SharedSQLContext {
  public   InnerJoinSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> myUpperCaseData ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> myLowerCaseData ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> myTestData1 ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> myTestData2 ()  { throw new RuntimeException(); }
  private  void testInnerJoin (java.lang.String testName, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> leftRows, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> rightRows, scala.Function0<org.apache.spark.sql.catalyst.expressions.Expression> condition, scala.collection.Seq<scala.Product> expectedAnswer)  { throw new RuntimeException(); }
}
