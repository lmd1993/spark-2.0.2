package org.apache.spark.streaming;
/**
 * Tests whether scope information is passed from DStream operations to RDDs correctly.
 */
public  class DStreamScopeSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.scalatest.BeforeAndAfterAll {
  public   DStreamScopeSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.Duration batchDuration ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  /** Assert that the RDD operation scope properties are not set in our SparkContext. */
  private  void assertPropertiesNotSet ()  { throw new RuntimeException(); }
  /** Assert that the given RDD scope inherits the name and ID of the base scope correctly. */
  private  void assertScopeCorrect (org.apache.spark.rdd.RDDOperationScope baseScope, org.apache.spark.rdd.RDDOperationScope rddScope, long batchTime)  { throw new RuntimeException(); }
  /** Assert that all the specified options are defined. */
  private <T extends java.lang.Object> void assertDefined (scala.collection.Seq<scala.Option<T>> options)  { throw new RuntimeException(); }
}
