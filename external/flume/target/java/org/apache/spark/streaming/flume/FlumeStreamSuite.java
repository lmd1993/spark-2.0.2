package org.apache.spark.streaming.flume;
public  class FlumeStreamSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.scalatest.Matchers, org.apache.spark.internal.Logging {
  public   FlumeStreamSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  /** Run test on flume stream */
  private  void testFlumeStream (boolean testCompression)  { throw new RuntimeException(); }
  /** Setup and start the streaming context */
  private  java.util.concurrent.ConcurrentLinkedQueue<scala.collection.Seq<org.apache.spark.streaming.flume.SparkFlumeEvent>> startContext (int testPort, boolean testCompression)  { throw new RuntimeException(); }
  /** Class to create socket channel with compression */
  private  class CompressionChannelFactory extends org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory {
    public   CompressionChannelFactory (int compressionLevel)  { throw new RuntimeException(); }
    public  org.jboss.netty.channel.socket.SocketChannel newChannel (org.jboss.netty.channel.ChannelPipeline pipeline)  { throw new RuntimeException(); }
  }
}
