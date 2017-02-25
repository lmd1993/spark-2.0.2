package org.apache.spark.sql;
public  class MathExpressionsSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSQLContext {
  public   MathExpressionsSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> doubleData ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nnDoubleData ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullDoubles ()  { throw new RuntimeException(); }
  private <T extends java.lang.Object, U extends java.lang.Object> void testOneToOneMathFunction (scala.Function1<org.apache.spark.sql.Column, org.apache.spark.sql.Column> c, scala.Function1<T, U> f)  { throw new RuntimeException(); }
  private  void testOneToOneNonNegativeMathFunction (scala.Function1<org.apache.spark.sql.Column, org.apache.spark.sql.Column> c, scala.Function1<java.lang.Object, java.lang.Object> f)  { throw new RuntimeException(); }
  private  void testTwoToOneMathFunction (scala.Function2<org.apache.spark.sql.Column, org.apache.spark.sql.Column, org.apache.spark.sql.Column> c, scala.Function2<org.apache.spark.sql.Column, java.lang.Object, org.apache.spark.sql.Column> d, scala.Function2<java.lang.Object, java.lang.Object, java.lang.Object> f)  { throw new RuntimeException(); }
}
