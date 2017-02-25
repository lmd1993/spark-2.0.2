package org.apache.spark.sql.execution.stat;
public  class ApproxQuantileSuite extends org.apache.spark.SparkFunSuite {
  public   ApproxQuantileSuite ()  { throw new RuntimeException(); }
  private  scala.util.Random r ()  { throw new RuntimeException(); }
  private  int n ()  { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.String, scala.collection.immutable.IndexedSeq<java.lang.Object>> increasing ()  { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.String, scala.collection.immutable.IndexedSeq<java.lang.Object>> decreasing ()  { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.String, scala.collection.Seq<java.lang.Object>> random ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries buildSummary (scala.collection.Seq<java.lang.Object> data, double epsi, int threshold)  { throw new RuntimeException(); }
  /**
   * Interleaves compression and insertions.
   * @param data (undocumented)
   * @param epsi (undocumented)
   * @param threshold (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries buildCompressSummary (scala.collection.Seq<java.lang.Object> data, double epsi, int threshold)  { throw new RuntimeException(); }
  private  void checkQuantile (double quant, scala.collection.Seq<java.lang.Object> data, org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries summary)  { throw new RuntimeException(); }
}
