package org.apache.spark.streaming;
public  class ReceiverInputDStreamSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.TestSuiteBase, org.scalatest.BeforeAndAfterAll {
  public   ReceiverInputDStreamSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  private  void testWithoutWAL (java.lang.String msg, scala.Function1<org.apache.spark.streaming.dstream.ReceiverInputDStream<?>, scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  private  void testWithWAL (java.lang.String msg, scala.Function1<org.apache.spark.streaming.dstream.ReceiverInputDStream<?>, scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  private  void runTest (boolean enableWAL, scala.Function1<org.apache.spark.streaming.dstream.ReceiverInputDStream<?>, scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  /**
   * Create a block info for input to the ReceiverInputDStream.createBlockRDD
   * @param withWALInfo Create block with WAL info in it
   * @param createBlock Actually create the block in the BlockManager
   * @return
   */
  private  org.apache.spark.streaming.scheduler.ReceivedBlockInfo createBlockInfo (boolean withWALInfo, boolean createBlock)  { throw new RuntimeException(); }
}
