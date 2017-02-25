package org.apache.spark.sql.sources;
public  class SimpleDDLScan extends org.apache.spark.sql.sources.BaseRelation implements org.apache.spark.sql.sources.TableScan, scala.Product, scala.Serializable {
  static public  long sizeInBytes ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.sources.Filter[] unhandledFilters (org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int from ()  { throw new RuntimeException(); }
  public  int to ()  { throw new RuntimeException(); }
  public  java.lang.String table ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  // not preceding
  public   SimpleDDLScan (int from, int to, java.lang.String table, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  boolean needConversion ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> buildScan ()  { throw new RuntimeException(); }
}
