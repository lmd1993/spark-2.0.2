package org.apache.spark.sql.execution.streaming;
public  class StreamMetricsSuite extends org.apache.spark.SparkFunSuite {
  public   StreamMetricsSuite ()  { throw new RuntimeException(); }
  public  org.scalactic.Equality<java.lang.Object> doubleEquality ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.StreamMetrics newStreamMetrics (scala.collection.Seq<org.apache.spark.sql.execution.streaming.Source> sources)  { throw new RuntimeException(); }
  private  org.apache.spark.util.ManualClock clock ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.StreamMetricsSuite.TestSource source ()  { throw new RuntimeException(); }
  public  class TestSource implements org.apache.spark.sql.execution.streaming.Source, scala.Product, scala.Serializable {
    public  int id ()  { throw new RuntimeException(); }
    // not preceding
    public   TestSource (int id)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.execution.streaming.Offset> getOffset ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getBatch (scala.Option<org.apache.spark.sql.execution.streaming.Offset> start, org.apache.spark.sql.execution.streaming.Offset end)  { throw new RuntimeException(); }
    public  void stop ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  public  class TestSource extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.execution.streaming.StreamMetricsSuite.TestSource> implements scala.Serializable {
    public   TestSource ()  { throw new RuntimeException(); }
  }
}
