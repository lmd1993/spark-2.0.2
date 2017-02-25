package org.apache.spark.mllib.evaluation;
public  class BinaryClassificationMetricsSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.MLlibTestSparkContext {
  public   BinaryClassificationMetricsSuite ()  { throw new RuntimeException(); }
  private  boolean areWithinEpsilon (scala.Tuple2<java.lang.Object, java.lang.Object> x)  { throw new RuntimeException(); }
  private  boolean pairsWithinEpsilon (scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, scala.Tuple2<java.lang.Object, java.lang.Object>> x)  { throw new RuntimeException(); }
  private  void assertSequencesMatch (scala.collection.Seq<java.lang.Object> left, scala.collection.Seq<java.lang.Object> right)  { throw new RuntimeException(); }
  private  void assertTupleSequencesMatch (scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> left, scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> right)  { throw new RuntimeException(); }
  private  void validateMetrics (org.apache.spark.mllib.evaluation.BinaryClassificationMetrics metrics, scala.collection.Seq<java.lang.Object> expectedThresholds, scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> expectedROCCurve, scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> expectedPRCurve, scala.collection.Seq<java.lang.Object> expectedFMeasures1, scala.collection.Seq<java.lang.Object> expectedFmeasures2, scala.collection.Seq<java.lang.Object> expectedPrecisions, scala.collection.Seq<java.lang.Object> expectedRecalls)  { throw new RuntimeException(); }
}
