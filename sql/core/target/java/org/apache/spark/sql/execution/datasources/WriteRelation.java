package org.apache.spark.sql.execution.datasources;
/** A container for all the details required when writing to a table. */
  class WriteRelation implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType dataSchema ()  { throw new RuntimeException(); }
  public  java.lang.String path ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.hadoop.mapreduce.Job, org.apache.spark.sql.execution.datasources.OutputWriterFactory> prepareJobForWrite ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.BucketSpec> bucketSpec ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteRelation (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.types.StructType dataSchema, java.lang.String path, scala.Function1<org.apache.hadoop.mapreduce.Job, org.apache.spark.sql.execution.datasources.OutputWriterFactory> prepareJobForWrite, scala.Option<org.apache.spark.sql.execution.datasources.BucketSpec> bucketSpec)  { throw new RuntimeException(); }
}
