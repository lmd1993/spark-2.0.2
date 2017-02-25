package org.apache.spark.streaming.receiver;
public  class BlockGeneratorSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter {
  public   BlockGeneratorSuite ()  { throw new RuntimeException(); }
  private  int blockIntervalMs ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.receiver.BlockGenerator blockGenerator ()  { throw new RuntimeException(); }
  /**
   * Helper method to stop the block generator with manual clock in a different thread,
   * so that the main thread can advance the clock that allows the stopping to proceed.
   * @param blockGenerator (undocumented)
   * @return (undocumented)
   */
  private  java.lang.Thread stopBlockGenerator (org.apache.spark.streaming.receiver.BlockGenerator blockGenerator)  { throw new RuntimeException(); }
  /** A listener for BlockGenerator that records the data in the callbacks */
  private  class TestBlockGeneratorListener implements org.apache.spark.streaming.receiver.BlockGeneratorListener {
    public   TestBlockGeneratorListener ()  { throw new RuntimeException(); }
    public  java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> pushedData ()  { throw new RuntimeException(); }
    public  java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> addedData ()  { throw new RuntimeException(); }
    public  java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> addedMetadata ()  { throw new RuntimeException(); }
    public  boolean onGenerateBlockCalled ()  { throw new RuntimeException(); }
    public  boolean onAddDataCalled ()  { throw new RuntimeException(); }
    public  boolean onPushBlockCalled ()  { throw new RuntimeException(); }
    public  void onPushBlock (org.apache.spark.storage.StreamBlockId blockId, scala.collection.mutable.ArrayBuffer<?> arrayBuffer)  { throw new RuntimeException(); }
    public  void onError (java.lang.String message, java.lang.Throwable throwable)  { throw new RuntimeException(); }
    public  void onGenerateBlock (org.apache.spark.storage.StreamBlockId blockId)  { throw new RuntimeException(); }
    public  void onAddData (Object data, Object metadata)  { throw new RuntimeException(); }
  }
}
