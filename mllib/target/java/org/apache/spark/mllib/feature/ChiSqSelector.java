package org.apache.spark.mllib.feature;
/**
 * Creates a ChiSquared feature selector.
 * param:  numTopFeatures number of features that selector will select
 *                       (ordered by statistic value descending)
 *                       Note that if the number of features is less than numTopFeatures,
 *                       then this will select all features.
 */
public  class ChiSqSelector implements scala.Serializable {
  public  int numTopFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public   ChiSqSelector (int numTopFeatures)  { throw new RuntimeException(); }
  /**
   * Returns a ChiSquared feature selector.
   * <p>
   * @param data an <code>RDD[LabeledPoint]</code> containing the labeled dataset with categorical features.
   *             Real-valued features will be treated as categorical for each distinct value.
   *             Apply feature discretizer before using this function.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.ChiSqSelectorModel fit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data)  { throw new RuntimeException(); }
}
