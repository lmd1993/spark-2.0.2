package org.apache.spark.sql.sources;
public abstract class HadoopFsRelationTest extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SQLTestUtils, org.apache.spark.sql.hive.test.TestHiveSingleton {
  public   HadoopFsRelationTest ()  { throw new RuntimeException(); }
  public abstract  java.lang.String dataSourceName ()  ;
  protected  boolean supportsDataType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType dataSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testDF ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> partitionedTestDF1 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> partitionedTestDF2 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> partitionedTestDF ()  { throw new RuntimeException(); }
  public  void checkQueries (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.types.DataType> supportedDataTypes ()  { throw new RuntimeException(); }
}
