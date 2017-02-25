package org.apache.spark.sql;
/**
 * Benchmark for Dataset typed operations comparing with DataFrame and RDD versions.
 */
public  class DatasetBenchmark {
  static public  class Data implements scala.Product, scala.Serializable {
    public  long l ()  { throw new RuntimeException(); }
    public  java.lang.String s ()  { throw new RuntimeException(); }
    // not preceding
    public   Data (long l, java.lang.String s)  { throw new RuntimeException(); }
  }
  static public  class Data$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.String, org.apache.spark.sql.DatasetBenchmark.Data> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Data$ MODULE$ = null;
    public   Data$ ()  { throw new RuntimeException(); }
  }
  static public  class ComplexAggregator$ extends org.apache.spark.sql.expressions.Aggregator<org.apache.spark.sql.DatasetBenchmark.Data, org.apache.spark.sql.DatasetBenchmark.Data, java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComplexAggregator$ MODULE$ = null;
    public   ComplexAggregator$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.DatasetBenchmark.Data zero ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.DatasetBenchmark.Data reduce (org.apache.spark.sql.DatasetBenchmark.Data b, org.apache.spark.sql.DatasetBenchmark.Data a)  { throw new RuntimeException(); }
    public  long finish (org.apache.spark.sql.DatasetBenchmark.Data reduction)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.DatasetBenchmark.Data merge (org.apache.spark.sql.DatasetBenchmark.Data b1, org.apache.spark.sql.DatasetBenchmark.Data b2)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Encoder<org.apache.spark.sql.DatasetBenchmark.Data> bufferEncoder ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Encoder<java.lang.Object> outputEncoder ()  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.util.Benchmark backToBackMap (org.apache.spark.sql.SparkSession spark, long numRows, int numChains)  { throw new RuntimeException(); }
  static public  org.apache.spark.util.Benchmark backToBackFilter (org.apache.spark.sql.SparkSession spark, long numRows, int numChains)  { throw new RuntimeException(); }
  static public  org.apache.spark.util.Benchmark aggregate (org.apache.spark.sql.SparkSession spark, long numRows)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
