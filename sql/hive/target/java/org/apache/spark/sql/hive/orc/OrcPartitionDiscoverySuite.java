package org.apache.spark.sql.hive.orc;
public  class OrcPartitionDiscoverySuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.hive.test.TestHiveSingleton, org.scalatest.BeforeAndAfterAll {
  public   OrcPartitionDiscoverySuite ()  { throw new RuntimeException(); }
  public  java.lang.String defaultPartitionName ()  { throw new RuntimeException(); }
  public  void withTempDir (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  public <T extends scala.Product> void makeOrcFile (scala.collection.Seq<T> data, java.io.File path, scala.reflect.ClassTag<T> evidence$1, scala.reflect.api.TypeTags.TypeTag<T> evidence$2)  { throw new RuntimeException(); }
  public <T extends scala.Product> void makeOrcFile (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.io.File path, scala.reflect.ClassTag<T> evidence$3, scala.reflect.api.TypeTags.TypeTag<T> evidence$4)  { throw new RuntimeException(); }
  protected  void withTempTable (java.lang.String tableName, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  protected  java.io.File makePartitionDir (java.io.File basePath, java.lang.String defaultPartitionName, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> partitionCols)  { throw new RuntimeException(); }
}
