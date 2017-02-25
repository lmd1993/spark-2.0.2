package org.apache.spark.sql.catalyst.expressions;
/**
 * A few helper functions for expression evaluation testing. Mixin this trait to use them.
 */
public  interface ExpressionEvalHelper extends org.scalatest.prop.GeneratorDrivenPropertyChecks {
  public  org.apache.spark.sql.catalyst.InternalRow create_row (scala.collection.Seq<java.lang.Object> values)  ;
  public  void checkEvaluation (scala.Function0<org.apache.spark.sql.catalyst.expressions.Expression> expression, Object expected, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  /**
   * Check the equality between result of expression and expected value, it will handle
   * Array[Byte], Spread[Double], and MapData.
   * @param result (undocumented)
   * @param expected (undocumented)
   * @return (undocumented)
   */
  public  boolean checkResult (Object result, Object expected)  ;
  public  Object evaluate (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public  org.apache.spark.sql.catalyst.expressions.Projection generateProject (scala.Function0<org.apache.spark.sql.catalyst.expressions.Projection> generator, org.apache.spark.sql.catalyst.expressions.Expression expression)  ;
  public  void checkEvaluationWithoutCodegen (org.apache.spark.sql.catalyst.expressions.Expression expression, Object expected, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public  void checkEvaluationWithGeneratedMutableProjection (org.apache.spark.sql.catalyst.expressions.Expression expression, Object expected, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public  void checkEvalutionWithUnsafeProjection (org.apache.spark.sql.catalyst.expressions.Expression expression, Object expected, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public  void checkEvaluationWithOptimization (org.apache.spark.sql.catalyst.expressions.Expression expression, Object expected, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public  void checkDoubleEvaluation (scala.Function0<org.apache.spark.sql.catalyst.expressions.Expression> expression, org.scalactic.TripleEqualsSupport.Spread<java.lang.Object> expected, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  /**
   * Test evaluation results between Interpreted mode and Codegen mode, making sure we have
   * consistent result regardless of the evaluation method we use.
   * <p>
   * This method test against unary expressions by feeding them arbitrary literals of <code>dataType</code>.
   * @param c (undocumented)
   * @param dataType (undocumented)
   */
  public  void checkConsistencyBetweenInterpretedAndCodegen (scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> c, org.apache.spark.sql.types.DataType dataType)  ;
  /**
   * Test evaluation results between Interpreted mode and Codegen mode, making sure we have
   * consistent result regardless of the evaluation method we use.
   * <p>
   * This method test against binary expressions by feeding them arbitrary literals of <code>dataType1</code>
   * and <code>dataType2</code>.
   * @param c (undocumented)
   * @param dataType1 (undocumented)
   * @param dataType2 (undocumented)
   */
  public  void checkConsistencyBetweenInterpretedAndCodegen (scala.Function2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> c, org.apache.spark.sql.types.DataType dataType1, org.apache.spark.sql.types.DataType dataType2)  ;
  /**
   * Test evaluation results between Interpreted mode and Codegen mode, making sure we have
   * consistent result regardless of the evaluation method we use.
   * <p>
   * This method test against ternary expressions by feeding them arbitrary literals of <code>dataType1</code>,
   * <code>dataType2</code> and <code>dataType3</code>.
   * @param c (undocumented)
   * @param dataType1 (undocumented)
   * @param dataType2 (undocumented)
   * @param dataType3 (undocumented)
   */
  public  void checkConsistencyBetweenInterpretedAndCodegen (scala.Function3<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> c, org.apache.spark.sql.types.DataType dataType1, org.apache.spark.sql.types.DataType dataType2, org.apache.spark.sql.types.DataType dataType3)  ;
  /**
   * Test evaluation results between Interpreted mode and Codegen mode, making sure we have
   * consistent result regardless of the evaluation method we use.
   * <p>
   * This method test against expressions take Seq[Expression] as input by feeding them
   * arbitrary length Seq of arbitrary literal of <code>dataType</code>.
   * @param c (undocumented)
   * @param dataType (undocumented)
   * @param minNumElements (undocumented)
   */
  public  void checkConsistencyBetweenInterpretedAndCodegen (scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> c, org.apache.spark.sql.types.DataType dataType, int minNumElements)  ;
  public  void cmpInterpretWithCodegen (org.apache.spark.sql.catalyst.InternalRow inputRow, org.apache.spark.sql.catalyst.expressions.Expression expr)  ;
  /**
   * Check the equality between result of expression and expected value, it will handle
   * Array[Byte] and Spread[Double].
   * @param result (undocumented)
   * @param expected (undocumented)
   * @return (undocumented)
   */
  public  boolean compareResults (Object result, Object expected)  ;
}
