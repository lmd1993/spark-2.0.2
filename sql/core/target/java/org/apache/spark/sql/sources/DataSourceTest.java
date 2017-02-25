package org.apache.spark.sql.sources;
 abstract class DataSourceTest extends org.apache.spark.sql.QueryTest {
  public   DataSourceTest ()  { throw new RuntimeException(); }
  protected  void sqlTest (java.lang.String sqlString, scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer)  { throw new RuntimeException(); }
}
