package org.apache.spark.sql.execution;
public  class ExchangeCoordinatorSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll {
  public   ExchangeCoordinatorSuite ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.SparkSession> originalActiveSparkSession ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.SparkSession> originalInstantiatedSparkSession ()  { throw new RuntimeException(); }
  protected  void beforeAll ()  { throw new RuntimeException(); }
  protected  void afterAll ()  { throw new RuntimeException(); }
  private  void checkEstimation (org.apache.spark.sql.execution.exchange.ExchangeCoordinator coordinator, long[][] bytesByPartitionIdArray, int[] expectedPartitionStartIndices)  { throw new RuntimeException(); }
  public  int numInputPartitions ()  { throw new RuntimeException(); }
  public  void checkAnswer (scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> actual, scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer)  { throw new RuntimeException(); }
  public  void withSparkSession (scala.Function1<org.apache.spark.sql.SparkSession, scala.runtime.BoxedUnit> f, int targetNumPostShufflePartitions, scala.Option<java.lang.Object> minNumPostShufflePartitions)  { throw new RuntimeException(); }
}
