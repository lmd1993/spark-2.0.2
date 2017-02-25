package org.apache.spark.sql.test;
/** Dummy provider. */
public  class DefaultSource implements org.apache.spark.sql.sources.RelationProvider, org.apache.spark.sql.sources.SchemaRelationProvider, org.apache.spark.sql.sources.CreatableRelationProvider {
  public   DefaultSource ()  { throw new RuntimeException(); }
  public  class FakeRelation extends org.apache.spark.sql.sources.BaseRelation implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
    // not preceding
    public   FakeRelation (org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  }
  public  class FakeRelation extends scala.runtime.AbstractFunction1<org.apache.spark.sql.SQLContext, org.apache.spark.sql.test.DefaultSource.FakeRelation> implements scala.Serializable {
    public   FakeRelation ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.sources.BaseRelation createRelation (org.apache.spark.sql.SQLContext sqlContext, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.BaseRelation createRelation (org.apache.spark.sql.SQLContext sqlContext, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.BaseRelation createRelation (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.SaveMode mode, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
}
