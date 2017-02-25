package org.apache.spark.storage;
public  class PartiallySerializedBlockSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterEach, org.scalatest.PrivateMethodTester {
  public   PartiallySerializedBlockSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.TestBlockId blockId ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.memory.MemoryStore memoryStore ()  { throw new RuntimeException(); }
  private  org.apache.spark.serializer.SerializerManager serializerManager ()  { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<org.apache.spark.serializer.SerializationStream> getSerializationStream ()  { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<org.apache.spark.storage.memory.RedirectableOutputStream> getRedirectableOutputStream ()  { throw new RuntimeException(); }
  protected  void beforeEach ()  { throw new RuntimeException(); }
  private <T extends java.lang.Object> org.apache.spark.storage.memory.PartiallySerializedBlock<T> partiallyUnroll (scala.collection.Iterator<T> iter, int numItemsToBuffer, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> void testUnroll (java.lang.String testCaseName, scala.collection.Seq<T> items, int numItemsToBuffer, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
}
