package org.apache.spark.ml.tree;
/**
 * Used for {@link RandomForestParams}.
 * This is separated out from {@link RandomForestParams} because of an issue with the
 * <code>numTrees</code> method conflicting with this Param in the Estimator.
 */
  interface HasNumTrees extends org.apache.spark.ml.param.Params {
  /**
   * Number of trees to train (>= 1).
   * If 1, then no bootstrapping is used.  If > 1, then bootstrapping is done.
   * TODO: Change to always do bootstrapping (simpler).  SPARK-7130
   * (default = 20)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numTrees ()  ;
  /** @group setParam */
  public  org.apache.spark.ml.tree.HasNumTrees setNumTrees (int value)  ;
  /** @group getParam */
  public  int getNumTrees ()  ;
}
