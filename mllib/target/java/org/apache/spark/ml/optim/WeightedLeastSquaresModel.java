package org.apache.spark.ml.optim;
/**
 * Model fitted by {@link WeightedLeastSquares}.
 * param:  coefficients model coefficients
 * param:  intercept model intercept
 * param:  diagInvAtWA diagonal of matrix (A^T * W * A)^-1
 */
  class WeightedLeastSquaresModel implements scala.Serializable {
  public  org.apache.spark.ml.linalg.DenseVector coefficients ()  { throw new RuntimeException(); }
  public  double intercept ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.DenseVector diagInvAtWA ()  { throw new RuntimeException(); }
  // not preceding
  public   WeightedLeastSquaresModel (org.apache.spark.ml.linalg.DenseVector coefficients, double intercept, org.apache.spark.ml.linalg.DenseVector diagInvAtWA)  { throw new RuntimeException(); }
  public  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
}
