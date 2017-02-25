package org.apache.spark.sql.test;
public  class DataFrameReaderWriterSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSQLContext, org.scalatest.BeforeAndAfter {
  public   DataFrameReaderWriterSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType userSchema ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType textSchema ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> data ()  { throw new RuntimeException(); }
  private  java.lang.String dir ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Encoder<java.lang.String> enc ()  { throw new RuntimeException(); }
  private  void testRead (scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> df, scala.collection.Seq<java.lang.String> expectedResult, org.apache.spark.sql.types.StructType expectedSchema)  { throw new RuntimeException(); }
}
