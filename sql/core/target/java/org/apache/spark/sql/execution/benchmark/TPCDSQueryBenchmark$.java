package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure TPCDS query performance.
 * To run this:
 *  spark-submit --class <this class> --jars <spark sql test jar>
 */
public  class TPCDSQueryBenchmark$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TPCDSQueryBenchmark$ MODULE$ = null;
  public   TPCDSQueryBenchmark$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tables ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> setupTables (java.lang.String dataLocation)  { throw new RuntimeException(); }
  public  void tpcdsAll (java.lang.String dataLocation, scala.collection.Seq<java.lang.String> queries)  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
