package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure performance for aggregate primitives.
 * To run this:
 *  build/sbt "sql/test-only *benchmark.AggregateBenchmark"
 * <p>
 * Benchmarks in this file are skipped in normal builds.
 */
public  class AggregateBenchmark extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.execution.benchmark.BenchmarkBase {
  public   AggregateBenchmark ()  { throw new RuntimeException(); }
}
