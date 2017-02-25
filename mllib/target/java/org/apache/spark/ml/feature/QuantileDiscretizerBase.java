package org.apache.spark.ml.feature;
/**
 * Params for {@link QuantileDiscretizer}.
 */
  interface QuantileDiscretizerBase extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /**
   * Number of buckets (quantiles, or categories) into which data points are grouped. Must
   * be >= 2.
   * default: 2
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numBuckets ()  ;
  /** @group getParam */
  public  int getNumBuckets ()  ;
  /**
   * Relative error (see documentation for
   * {@link org.apache.spark.sql.DataFrameStatFunctions.approxQuantile approxQuantile} for description)
   * Must be in the range [0, 1].
   * default: 0.001
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam relativeError ()  ;
  /** @group getParam */
  public  double getRelativeError ()  ;
}
