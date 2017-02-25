package org.apache.spark.streaming;
/**
 * Test that closures passed to DStream operations are actually cleaned.
 */
public  class DStreamClosureSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll {
  public   DStreamClosureSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  /**
   * Verify that the expected exception is thrown.
   * <p>
   * We use return statements as an indication that a closure is actually being cleaned.
   * We expect closure cleaner to find the return statements in the user provided closures.
   * @param body (undocumented)
   */
  private  void expectCorrectException (scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  private  void testMap (org.apache.spark.streaming.dstream.DStream<java.lang.Object> ds)  { throw new RuntimeException(); }
  private  void testFlatMap (org.apache.spark.streaming.dstream.DStream<java.lang.Object> ds)  { throw new RuntimeException(); }
  private  void testFilter (org.apache.spark.streaming.dstream.DStream<java.lang.Object> ds)  { throw new RuntimeException(); }
  private  void testMapPartitions (org.apache.spark.streaming.dstream.DStream<java.lang.Object> ds)  { throw new RuntimeException(); }
  private  void testReduce (org.apache.spark.streaming.dstream.DStream<java.lang.Object> ds)  { throw new RuntimeException(); }
  private  void testForeachRDD (org.apache.spark.streaming.dstream.DStream<java.lang.Object> ds)  { throw new RuntimeException(); }
  private  void testTransform (org.apache.spark.streaming.dstream.DStream<java.lang.Object> ds)  { throw new RuntimeException(); }
  private  void testTransformWith (org.apache.spark.streaming.dstream.DStream<java.lang.Object> ds)  { throw new RuntimeException(); }
  private  void testReduceByWindow (org.apache.spark.streaming.dstream.DStream<java.lang.Object> ds)  { throw new RuntimeException(); }
  private  void testReduceByKey (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<java.lang.Object, java.lang.Object>> ds)  { throw new RuntimeException(); }
  private  void testCombineByKey (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<java.lang.Object, java.lang.Object>> ds)  { throw new RuntimeException(); }
  private  void testReduceByKeyAndWindow (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<java.lang.Object, java.lang.Object>> ds)  { throw new RuntimeException(); }
  private  void testUpdateStateByKey (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<java.lang.Object, java.lang.Object>> ds)  { throw new RuntimeException(); }
  private  void testMapValues (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<java.lang.Object, java.lang.Object>> ds)  { throw new RuntimeException(); }
  private  void testFlatMapValues (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<java.lang.Object, java.lang.Object>> ds)  { throw new RuntimeException(); }
  private  void testTransform2 (org.apache.spark.streaming.StreamingContext ssc, org.apache.spark.streaming.dstream.DStream<java.lang.Object> ds)  { throw new RuntimeException(); }
}
