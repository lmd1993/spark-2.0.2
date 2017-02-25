package org.apache.spark.sql.catalyst.expressions;
public  class MathFunctionsSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.expressions.ExpressionEvalHelper {
  public   MathFunctionsSuite ()  { throw new RuntimeException(); }
  /**
   * Used for testing leaf math expressions.
   * <p>
   * @param e expression
   * @param c The constants in scala.math
   * @tparam T Generic type for primitives
   */
  private <T extends java.lang.Object> void testLeaf (scala.Function0<org.apache.spark.sql.catalyst.expressions.Expression> e, T c)  { throw new RuntimeException(); }
  /**
   * Used for testing unary math expressions.
   * <p>
   * @param c expression
   * @param f The functions in scala.math or elsewhere used to generate expected results
   * @param domain The set of values to run the function with
   * @param expectNull Whether the given values should return null or not
   * @param expectNaN Whether the given values should eval to NaN or not
   * @tparam T Generic type for primitives
   * @tparam U Generic type for the output of the given function <code>f</code>
   * @param evalType (undocumented)
   */
  private <T extends java.lang.Object, U extends java.lang.Object> void testUnary (scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> c, scala.Function1<T, U> f, scala.collection.Iterable<T> domain, boolean expectNull, boolean expectNaN, org.apache.spark.sql.types.DataType evalType)  { throw new RuntimeException(); }
  /**
   * Used for testing binary math expressions.
   * <p>
   * @param c The DataFrame function
   * @param f The functions in scala.math
   * @param domain The set of values to run the function with
   * @param expectNull Whether the given values should return null or not
   * @param expectNaN Whether the given values should eval to NaN or not
   */
  private  void testBinary (scala.Function2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> c, scala.Function2<java.lang.Object, java.lang.Object, java.lang.Object> f, scala.collection.Iterable<scala.Tuple2<java.lang.Object, java.lang.Object>> domain, boolean expectNull, boolean expectNaN)  { throw new RuntimeException(); }
  private  void checkNaN (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.catalyst.InternalRow inputRow)  { throw new RuntimeException(); }
  private  void checkNaNWithoutCodegen (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.catalyst.InternalRow inputRow)  { throw new RuntimeException(); }
  private  void checkNaNWithGeneratedProjection (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.catalyst.InternalRow inputRow)  { throw new RuntimeException(); }
  private  void checkNaNWithOptimization (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.catalyst.InternalRow inputRow)  { throw new RuntimeException(); }
}
