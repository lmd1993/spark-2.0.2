package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure performance for wide table.
 * To run this:
 *  build/sbt "sql/test-only *benchmark.BenchmarkWideTable"
 * <p>
 * Benchmarks in this file are skipped in normal builds.
 */
public  class BenchmarkWideTable extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.execution.benchmark.BenchmarkBase {
  public   BenchmarkWideTable ()  { throw new RuntimeException(); }
}
