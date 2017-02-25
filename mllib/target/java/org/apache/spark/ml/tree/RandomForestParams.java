package org.apache.spark.ml.tree;
/**
 * Parameters for Random Forest algorithms.
 */
  interface RandomForestParams extends org.apache.spark.ml.tree.TreeEnsembleParams, org.apache.spark.ml.tree.HasFeatureSubsetStrategy, org.apache.spark.ml.tree.HasNumTrees {
}
