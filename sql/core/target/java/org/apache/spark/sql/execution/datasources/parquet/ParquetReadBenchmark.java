package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Benchmark to measure parquet read performance.
 * To run this:
 *  spark-submit --class <this class> --jars <spark sql test jar>
 */
public  class ParquetReadBenchmark {
  static public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  static public  void withTempPath (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void withTempTable (scala.collection.Seq<java.lang.String> tableNames, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void withSQLConf (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> pairs, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void intScanBenchmark (int values)  { throw new RuntimeException(); }
  static public  void intStringScanBenchmark (int values)  { throw new RuntimeException(); }
  static public  void stringDictionaryScanBenchmark (int values)  { throw new RuntimeException(); }
  static public  void partitionTableScanBenchmark (int values)  { throw new RuntimeException(); }
  static public  void stringWithNullsScanBenchmark (int values, double fractionOfNulls)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
