package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression that gets replaced at runtime (currently by the optimizer) into a different
 * expression for evaluation. This is mainly used to provide compatibility with other databases.
 * For example, we use this to support "nvl" by replacing it with "coalesce".
 */
public  interface RuntimeReplaceable extends org.apache.spark.sql.catalyst.expressions.Unevaluable {
  /**
   * Method for concrete implementations to override that specifies how to construct the expression
   * that should replace the current one.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression replaceForEvaluation ()  ;
  /**
   * Method for concrete implementations to override that specifies how to coerce the input types.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression replaceForTypeCoercion ()  ;
  /** The expression that should be used during evaluation. */
  public  org.apache.spark.sql.catalyst.expressions.Expression replaced ()  ;
  public  boolean nullable ()  ;
  public  boolean foldable ()  ;
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  ;
}
