package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure whole stage codegen performance.
 * To run this:
 *  build/sbt "sql/test-only *benchmark.MiscBenchmark"
 * <p>
 * Benchmarks in this file are skipped in normal builds.
 */
public  class MiscBenchmark extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.execution.benchmark.BenchmarkBase {
  public   MiscBenchmark ()  { throw new RuntimeException(); }
}
