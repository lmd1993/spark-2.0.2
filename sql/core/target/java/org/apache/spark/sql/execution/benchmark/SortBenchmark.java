package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure performance for aggregate primitives.
 * To run this:
 *  build/sbt "sql/test-only *benchmark.SortBenchmark"
 * <p>
 * Benchmarks in this file are skipped in normal builds.
 */
public  class SortBenchmark extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.execution.benchmark.BenchmarkBase {
  public   SortBenchmark ()  { throw new RuntimeException(); }
  private  void referenceKeyPrefixSort (org.apache.spark.unsafe.array.LongArray buf, int lo, int hi, org.apache.spark.util.collection.unsafe.sort.PrefixComparator refCmp)  { throw new RuntimeException(); }
  private  scala.Tuple2<org.apache.spark.unsafe.array.LongArray, org.apache.spark.unsafe.array.LongArray> generateKeyPrefixTestData (int size, scala.Function0<java.lang.Object> rand)  { throw new RuntimeException(); }
}
