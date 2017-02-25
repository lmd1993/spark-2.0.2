package org.apache.spark.mllib.classification;
public  class NaiveBayesSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NaiveBayesSuite$ MODULE$ = null;
  public   NaiveBayesSuite$ ()  { throw new RuntimeException(); }
  private  int calcLabel (double p, double[] pi)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> generateNaiveBayesInput (double[] pi, double[][] theta, int nPoints, int seed, java.lang.String modelType, int sample)  { throw new RuntimeException(); }
  /** Bernoulli NaiveBayes with binary labels, 3 features */
  private  org.apache.spark.mllib.classification.NaiveBayesModel binaryBernoulliModel ()  { throw new RuntimeException(); }
  /** Multinomial NaiveBayes with binary labels, 3 features */
  private  org.apache.spark.mllib.classification.NaiveBayesModel binaryMultinomialModel ()  { throw new RuntimeException(); }
}
