package org.apache.spark.streaming.kafka;
public  class ReliableKafkaStreamSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll, org.scalatest.BeforeAndAfter, org.scalatest.concurrent.Eventually {
  public   ReliableKafkaStreamSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.Object> data ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.kafka.KafkaTestUtils kafkaTestUtils ()  { throw new RuntimeException(); }
  private  java.lang.String groupId ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  private  java.io.File tempDirectory ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  /** Getting partition offset from Zookeeper. */
  private  scala.Option<java.lang.Object> getCommitOffset (java.lang.String groupId, java.lang.String topic, int partition)  { throw new RuntimeException(); }
}
