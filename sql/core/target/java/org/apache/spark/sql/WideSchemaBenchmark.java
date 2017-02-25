package org.apache.spark.sql;
/**
 * Benchmark for performance with very wide and nested DataFrames.
 * To run this:
 *  build/sbt "sql/test-only *WideSchemaBenchmark"
 * <p>
 * Results will be written to "sql/core/benchmarks/WideSchemaBenchmark-results.txt".
 */
public  class WideSchemaBenchmark extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterEach {
  public   WideSchemaBenchmark ()  { throw new RuntimeException(); }
  private  int scaleFactor ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.Object> widthsToTest ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.Object> depthsToTest ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.List<java.io.File> tmpFiles ()  { throw new RuntimeException(); }
  private  java.io.OutputStream out ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  /**
   * Writes the given DataFrame to parquet at a temporary location, and returns a DataFrame
   * backed by the written parquet files.
   * @param df (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> saveAsParquet (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  /**
   * Adds standard set of cases to a benchmark given a dataframe and field to select.
   * @param benchmark (undocumented)
   * @param df (undocumented)
   * @param desc (undocumented)
   * @param selector (undocumented)
   */
  private  void addCases (org.apache.spark.util.Benchmark benchmark, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String desc, java.lang.String selector)  { throw new RuntimeException(); }
}
