package org.apache.spark.storage;
public  class MemoryStoreSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.PrivateMethodTester, org.scalatest.BeforeAndAfterEach, org.apache.spark.util.ResetSystemProperties {
  public   MemoryStoreSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.KryoSerializer serializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializerManager serializerManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId StringToBlockId (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.RDDBlockId rdd (int rddId, int splitId)  { throw new RuntimeException(); }
  public  void beforeEach ()  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.storage.memory.MemoryStore, org.apache.spark.storage.BlockInfoManager> makeMemoryStore (long maxMem)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> void assertSameContents (scala.collection.Seq<T> expected, scala.collection.Seq<T> actual, java.lang.String hint)  { throw new RuntimeException(); }
}
