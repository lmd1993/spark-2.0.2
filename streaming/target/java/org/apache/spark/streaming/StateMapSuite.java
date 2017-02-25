package org.apache.spark.streaming;
public  class StateMapSuite extends org.apache.spark.SparkFunSuite {
  public   StateMapSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  private <T extends java.lang.Object> org.apache.spark.streaming.util.OpenHashMapBasedStateMap<T, T> testSerialization (org.apache.spark.streaming.util.OpenHashMapBasedStateMap<T, T> map, java.lang.String msg, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> org.apache.spark.streaming.util.OpenHashMapBasedStateMap<T, T> testSerialization (org.apache.spark.serializer.Serializer serializer, org.apache.spark.streaming.util.OpenHashMapBasedStateMap<T, T> map, java.lang.String msg, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> void assertMap (org.apache.spark.streaming.util.StateMap<T, T> mapToTest, org.apache.spark.streaming.util.StateMap<T, T> refMapToTestWith, long time, java.lang.String msg)  { throw new RuntimeException(); }
  private  void assertMap (org.apache.spark.streaming.util.StateMap<java.lang.Object, java.lang.Object> mapToTest, scala.collection.Map<java.lang.Object, scala.Tuple2<java.lang.Object, java.lang.Object>> refMapToTestWith, long time, java.lang.String msg)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> T serializeAndDeserialize (org.apache.spark.serializer.Serializer serializer, T t, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
}
