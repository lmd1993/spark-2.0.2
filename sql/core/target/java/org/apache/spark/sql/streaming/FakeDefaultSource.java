package org.apache.spark.sql.streaming;
/**
 * A fake StreamSourceProvider thats creates a fake Source that cannot be reused.
 */
public  class FakeDefaultSource implements org.apache.spark.sql.sources.StreamSourceProvider {
  public   FakeDefaultSource ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType fakeSchema ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, org.apache.spark.sql.types.StructType> sourceSchema (org.apache.spark.sql.SQLContext spark, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.Source createSource (org.apache.spark.sql.SQLContext spark, java.lang.String metadataPath, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
}
