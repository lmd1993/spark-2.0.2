package org.apache.spark.sql.hive.client;
/**
 * A set of tests for the filter conversion logic used when pushing partition pruning into the
 * metastore
 */
public  class FiltersSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.internal.Logging {
  public   FiltersSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.client.Shim_v0_13 shim ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.metadata.Table testTable ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.metastore.api.FieldSchema varCharCol ()  { throw new RuntimeException(); }
  private  void filterTest (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters, java.lang.String result)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeReference a (java.lang.String name, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
}
