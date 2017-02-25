package org.apache.spark.sql.execution.benchmark;
/**
 * Common base trait for micro benchmarks that are supposed to run standalone (i.e. not together
 * with other test suites).
 */
  interface BenchmarkBase {
  public  org.apache.spark.sql.SparkSession sparkSession ()  ;
  /** Runs function `f` with whole stage codegen on and off. */
  public  void runBenchmark (java.lang.String name, long cardinality, scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
