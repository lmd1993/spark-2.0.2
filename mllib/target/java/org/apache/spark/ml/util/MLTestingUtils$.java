package org.apache.spark.ml.util;
public  class MLTestingUtils$ extends org.apache.spark.SparkFunSuite {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MLTestingUtils$ MODULE$ = null;
  public   MLTestingUtils$ ()  { throw new RuntimeException(); }
  public  void checkCopy (org.apache.spark.ml.Model<?> model)  { throw new RuntimeException(); }
  public <M extends org.apache.spark.ml.Model<M>, T extends org.apache.spark.ml.Estimator<M>> void checkNumericTypes (T estimator, org.apache.spark.sql.SparkSession spark, boolean isClassification, scala.Function2<M, M, scala.runtime.BoxedUnit> check)  { throw new RuntimeException(); }
  public  void checkNumericTypesALS (org.apache.spark.ml.recommendation.ALS estimator, org.apache.spark.sql.SparkSession spark, java.lang.String column, org.apache.spark.sql.types.NumericType baseType, scala.Function2<org.apache.spark.ml.recommendation.ALSModel, org.apache.spark.ml.recommendation.ALSModel, scala.runtime.BoxedUnit> check, scala.Function3<org.apache.spark.ml.recommendation.ALSModel, org.apache.spark.ml.recommendation.ALSModel, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> check2)  { throw new RuntimeException(); }
  public <T extends org.apache.spark.ml.evaluation.Evaluator> void checkNumericTypes (T evaluator, org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.spark.sql.types.NumericType, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> genClassifDFWithNumericLabelCol (org.apache.spark.sql.SparkSession spark, java.lang.String labelColName, java.lang.String featuresColName)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.spark.sql.types.NumericType, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> genRegressionDFWithNumericLabelCol (org.apache.spark.sql.SparkSession spark, java.lang.String labelColName, java.lang.String featuresColName, java.lang.String censorColName)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.spark.sql.types.NumericType, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> genRatingsDFWithNumericCols (org.apache.spark.sql.SparkSession spark, java.lang.String column)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.spark.sql.types.NumericType, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> genEvaluatorDFWithNumericLabelCol (org.apache.spark.sql.SparkSession spark, java.lang.String labelColName, java.lang.String predictionColName)  { throw new RuntimeException(); }
}
