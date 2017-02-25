package org.apache.spark.storage;
/**
 * Test the behavior of StorageStatusListener in response to all relevant events.
 */
public  class StorageStatusListenerSuite extends org.apache.spark.SparkFunSuite {
  public   StorageStatusListenerSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockManagerId bm1 ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockManagerId bm2 ()  { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.TaskInfo taskInfo1 ()  { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.TaskInfo taskInfo2 ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  private  void postUpdateBlock (org.apache.spark.storage.StorageStatusListener listener, scala.collection.Seq<org.apache.spark.storage.BlockUpdatedInfo> updateBlockInfos)  { throw new RuntimeException(); }
}
