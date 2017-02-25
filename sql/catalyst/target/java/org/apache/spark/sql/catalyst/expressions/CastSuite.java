package org.apache.spark.sql.catalyst.expressions;
/**
 * Test suite for data type casting expression {@link Cast}.
 */
public  class CastSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.expressions.ExpressionEvalHelper {
  public   CastSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Cast cast (Object v, org.apache.spark.sql.types.DataType targetType)  { throw new RuntimeException(); }
  private  void checkCast (Object v, Object expected)  { throw new RuntimeException(); }
  private  void checkNullCast (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
}
