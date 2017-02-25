package org.apache.spark.streaming;
public  class MapWithStateSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.DStreamCheckpointTester, org.scalatest.BeforeAndAfterAll, org.scalatest.BeforeAndAfter {
  public   MapWithStateSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  protected  java.io.File checkpointDir ()  { throw new RuntimeException(); }
  protected  org.apache.spark.streaming.Duration batchDuration ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  private <K extends java.lang.Object, S extends java.lang.Object, T extends java.lang.Object> void testOperation (scala.collection.Seq<scala.collection.Seq<K>> input, org.apache.spark.streaming.StateSpec<K, java.lang.Object, S, T> mapWithStateSpec, scala.collection.Seq<scala.collection.Seq<T>> expectedOutputs, scala.collection.Seq<scala.collection.Seq<scala.Tuple2<K, S>>> expectedStateSnapshots, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<S> evidence$2, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  private <K extends java.lang.Object, S extends java.lang.Object, T extends java.lang.Object> scala.Tuple2<scala.collection.Seq<scala.collection.Seq<T>>, scala.collection.Seq<scala.collection.Seq<scala.Tuple2<K, S>>>> getOperationOutput (scala.collection.Seq<scala.collection.Seq<K>> input, org.apache.spark.streaming.StateSpec<K, java.lang.Object, S, T> mapWithStateSpec, int numBatches, scala.reflect.ClassTag<K> evidence$4, scala.reflect.ClassTag<S> evidence$5, scala.reflect.ClassTag<T> evidence$6)  { throw new RuntimeException(); }
}
