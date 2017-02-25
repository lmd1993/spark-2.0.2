package org.apache.spark;
public  class InternalAccumulatorSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  public   InternalAccumulatorSuite ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  /**
   * Return the accumulable info that matches the specified name.
   * @param accums (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.scheduler.AccumulableInfo findTestAccum (scala.collection.Iterable<org.apache.spark.scheduler.AccumulableInfo> accums)  { throw new RuntimeException(); }
  /**
   * A special {@link ContextCleaner} that saves the IDs of the accumulators registered for cleanup.
   */
  private  class SaveAccumContextCleaner extends org.apache.spark.ContextCleaner {
    public   SaveAccumContextCleaner (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuffer<java.lang.Object> accumsRegistered ()  { throw new RuntimeException(); }
    public  void registerAccumulatorForCleanup (org.apache.spark.util.AccumulatorV2<?, ?> a)  { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.Object> accumsRegisteredForCleanup ()  { throw new RuntimeException(); }
  }
}
