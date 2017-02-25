package org.apache.spark.ml.classification;
/**
 * LogisticAggregator computes the gradient and loss for binary logistic loss function, as used
 * in binary classification for instances in sparse or dense vector in an online fashion.
 * <p>
 * Note that multinomial logistic loss is not supported yet!
 * <p>
 * Two LogisticAggregator can be merged together to have a summary of loss and gradient of
 * the corresponding joint dataset.
 * <p>
 * param:  numClasses the number of possible outcomes for k classes classification problem in
 *                   Multinomial Logistic Regression.
 * param:  fitIntercept Whether to fit an intercept term.
 */
public  class LogisticAggregator implements scala.Serializable {
  private  int numFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public   LogisticAggregator (int numFeatures, int numClasses, boolean fitIntercept)  { throw new RuntimeException(); }
  private  double weightSum ()  { throw new RuntimeException(); }
  private  double lossSum ()  { throw new RuntimeException(); }
  private  double[] gradientSumArray ()  { throw new RuntimeException(); }
  /**
   * Add a new training instance to this LogisticAggregator, and update the loss and gradient
   * of the objective function.
   * <p>
   * @param instance The instance of data point to be added.
   * @param coefficients The coefficients corresponding to the features.
   * @param featuresStd The standard deviation values of the features.
   * @return This LogisticAggregator object.
   */
  public  org.apache.spark.ml.classification.LogisticAggregator add (org.apache.spark.ml.feature.Instance instance, org.apache.spark.ml.linalg.Vector coefficients, double[] featuresStd)  { throw new RuntimeException(); }
  /**
   * Merge another LogisticAggregator, and update the loss and gradient
   * of the objective function.
   * (Note that it's in place merging; as a result, <code>this</code> object will be modified.)
   * <p>
   * @param other The other LogisticAggregator to be merged.
   * @return This LogisticAggregator object.
   */
  public  org.apache.spark.ml.classification.LogisticAggregator merge (org.apache.spark.ml.classification.LogisticAggregator other)  { throw new RuntimeException(); }
  public  double loss ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector gradient ()  { throw new RuntimeException(); }
}
