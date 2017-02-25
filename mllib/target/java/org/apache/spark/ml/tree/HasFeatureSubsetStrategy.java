package org.apache.spark.ml.tree;
/** Used for {@link RandomForestParams} */
  interface HasFeatureSubsetStrategy extends org.apache.spark.ml.param.Params {
  /**
   * The number of features to consider for splits at each tree node.
   * Supported options:
   *  - "auto": Choose automatically for task:
   *            If numTrees == 1, set to "all."
   *            If numTrees > 1 (forest), set to "sqrt" for classification and
   *              to "onethird" for regression.
   *  - "all": use all features
   *  - "onethird": use 1/3 of the features
   *  - "sqrt": use sqrt(number of features)
   *  - "log2": use log2(number of features)
   *  - "n": when n is in the range (0, 1.0], use n * number of features. When n
   *         is in the range (1, number of features), use n features.
   * (default = "auto")
   * <p>
   * These various settings are based on the following references:
   *  - log2: tested in Breiman (2001)
   *  - sqrt: recommended by Breiman manual for random forests
   *  - The defaults of sqrt (classification) and onethird (regression) match the R randomForest
   *    package.
   * @see <a href="http://www.stat.berkeley.edu/~breiman/randomforest2001.pdf  Breiman (2001)"/>
   * @see {@link http://www.stat.berkeley.edu/~breiman/Using_random_forests_V3.1.pdf  Breiman manual for
   *     random forests}
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> featureSubsetStrategy ()  ;
  /** @group setParam */
  public  org.apache.spark.ml.tree.HasFeatureSubsetStrategy setFeatureSubsetStrategy (java.lang.String value)  ;
  /** @group getParam */
  public  java.lang.String getFeatureSubsetStrategy ()  ;
}
