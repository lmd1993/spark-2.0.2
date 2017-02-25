package org.apache.spark.mllib.tree;
public  class DecisionTreeSuite$ extends org.apache.spark.SparkFunSuite {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DecisionTreeSuite$ MODULE$ = null;
  public   DecisionTreeSuite$ ()  { throw new RuntimeException(); }
  public  void validateClassifier (org.apache.spark.mllib.tree.model.DecisionTreeModel model, scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> input, double requiredAccuracy)  { throw new RuntimeException(); }
  public  void validateRegressor (org.apache.spark.mllib.tree.model.DecisionTreeModel model, scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> input, double requiredMSE)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateOrderedLabeledPointsWithLabel0 ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateOrderedLabeledPointsWithLabel1 ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateOrderedLabeledPoints ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateCategoricalDataPoints ()  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.mllib.regression.LabeledPoint> generateCategoricalDataPointsAsJavaList ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateCategoricalDataPointsForMulticlass ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateContinuousDataPointsForMulticlass ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateCategoricalDataPointsForMulticlassForOrderedFeatures ()  { throw new RuntimeException(); }
  /** Create a leaf node with the given node ID */
  private  org.apache.spark.mllib.tree.model.Node createLeafNode (int id)  { throw new RuntimeException(); }
  /**
   * Create an internal node with the given node ID and feature type.
   * Note: This does NOT set the child nodes.
   * @param id (undocumented)
   * @param featureType (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.mllib.tree.model.Node createInternalNode (int id, scala.Enumeration.Value featureType)  { throw new RuntimeException(); }
  /**
   * Create a tree model.  This is deterministic and contains a variety of node and feature types.
   * TODO: Update to be a correct tree (with matching probabilities, impurities, etc.): SPARK-7131
   * @param algo (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.tree.model.DecisionTreeModel createModel (scala.Enumeration.Value algo)  { throw new RuntimeException(); }
  /** Sorted Node IDs matching the model returned by {@link createModel()} */
  private  int[] createdModelNodeIds ()  { throw new RuntimeException(); }
  /**
   * Check if the two trees are exactly the same.
   * Note: I hesitate to override Node.equals since it could cause problems if users
   *       make mistakes such as creating loops of Nodes.
   * If the trees are not equal, this prints the two trees and throws an exception.
   * @param a (undocumented)
   * @param b (undocumented)
   */
    void checkEqual (org.apache.spark.mllib.tree.model.DecisionTreeModel a, org.apache.spark.mllib.tree.model.DecisionTreeModel b)  { throw new RuntimeException(); }
  /**
   * Return true iff the two nodes and their descendents are exactly the same.
   * Note: I hesitate to override Node.equals since it could cause problems if users
   *       make mistakes such as creating loops of Nodes.
   * @param a (undocumented)
   * @param b (undocumented)
   */
  private  void checkEqual (org.apache.spark.mllib.tree.model.Node a, org.apache.spark.mllib.tree.model.Node b)  { throw new RuntimeException(); }
}
