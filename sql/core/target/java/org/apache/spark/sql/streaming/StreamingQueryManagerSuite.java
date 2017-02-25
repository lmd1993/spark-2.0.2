package org.apache.spark.sql.streaming;
public  class StreamingQueryManagerSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.streaming.StreamTest, org.scalatest.BeforeAndAfter {
  public   StreamingQueryManagerSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.time.Span streamingTimeout ()  { throw new RuntimeException(); }
  /** Run a body of code by defining a query on each dataset */
  private  void withQueriesOn (scala.collection.Seq<org.apache.spark.sql.Dataset<?>> datasets, scala.Function1<scala.collection.Seq<org.apache.spark.sql.streaming.StreamingQuery>, scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  /** Test the behavior of awaitAnyTermination */
  private  void testAwaitAnyTermination (org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectedBehavior expectedBehavior, boolean expectedReturnedValue, org.scalatest.time.Span awaitTimeout, org.scalatest.time.Span testBehaviorFor)  { throw new RuntimeException(); }
  /** Stop a random active query either with `stop()` or with an error */
  private  org.apache.spark.sql.streaming.StreamingQuery stopRandomQueryAsync (org.scalatest.time.Span stopAfter, boolean withError)  { throw new RuntimeException(); }
  private  scala.Tuple2<org.apache.spark.sql.execution.streaming.MemoryStream<java.lang.Object>, org.apache.spark.sql.Dataset<java.lang.Object>> makeDataset ()  { throw new RuntimeException(); }
}
