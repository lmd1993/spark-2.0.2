package org.apache.spark.sql.sources;
public  class SaveLoadSuite extends org.apache.spark.sql.sources.DataSourceTest implements org.apache.spark.sql.test.SharedSQLContext, org.scalatest.BeforeAndAfter {
  public   SaveLoadSuite ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  private  java.lang.String originalDefaultSource ()  { throw new RuntimeException(); }
  private  java.io.File path ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void checkLoad (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedDF, java.lang.String tbl)  { throw new RuntimeException(); }
}
