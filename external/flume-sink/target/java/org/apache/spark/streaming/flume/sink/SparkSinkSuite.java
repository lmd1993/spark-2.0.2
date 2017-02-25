package org.apache.spark.streaming.flume.sink;
public  class SparkSinkSuite extends org.scalatest.FunSuite {
  public   SparkSinkSuite ()  { throw new RuntimeException(); }
  public  int eventsPerBatch ()  { throw new RuntimeException(); }
  public  int channelCapacity ()  { throw new RuntimeException(); }
  public  void testMultipleConsumers (boolean failSome)  { throw new RuntimeException(); }
  private  scala.Tuple3<org.apache.flume.channel.MemoryChannel, org.apache.spark.streaming.flume.sink.SparkSink, java.util.concurrent.CountDownLatch> initializeChannelAndSink (scala.collection.immutable.Map<java.lang.String, java.lang.String> overrides, int batchCounter)  { throw new RuntimeException(); }
  private  void putEvents (org.apache.flume.channel.MemoryChannel ch, int count)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.Tuple2<org.apache.avro.ipc.NettyTransceiver, org.apache.spark.streaming.flume.sink.SparkFlumeProtocol.Callback>> getTransceiverAndClient (java.net.InetSocketAddress address, int count)  { throw new RuntimeException(); }
  private  void assertChannelIsEmpty (org.apache.flume.channel.MemoryChannel channel)  { throw new RuntimeException(); }
  private  int availableChannelSlots (org.apache.flume.channel.MemoryChannel channel)  { throw new RuntimeException(); }
}
