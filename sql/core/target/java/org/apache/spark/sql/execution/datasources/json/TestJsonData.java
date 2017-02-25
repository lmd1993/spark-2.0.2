package org.apache.spark.sql.execution.datasources.json;
  interface TestJsonData {
  public  org.apache.spark.sql.SparkSession spark ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> primitiveFieldAndType ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> primitiveFieldValueTypeConflict ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> jsonNullStruct ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> complexFieldValueTypeConflict ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> arrayElementTypeConflict ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> missingFields ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> complexFieldAndType1 ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> complexFieldAndType2 ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> mapType1 ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> mapType2 ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> nullsInArrays ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> jsonArray ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> corruptRecords ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> additionalCorruptRecords ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> emptyRecords ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> timestampAsLong ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> arrayAndStructRecords ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> floatingValueRecords ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> bigIntegerRecords ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> datesRecords ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> singleRow ()  ;
  public  org.apache.spark.rdd.RDD<java.lang.String> empty ()  ;
}
