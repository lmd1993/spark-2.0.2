package org.apache.spark.sql.internal;
/**
 * Tests for the user-facing {@link org.apache.spark.sql.catalog.Catalog}.
 */
public  class CatalogSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterEach, org.apache.spark.sql.test.SharedSQLContext {
  public   CatalogSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.SessionCatalog sessionCatalog ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.CatalogTestUtils utils ()  { throw new RuntimeException(); }
  private  void createDatabase (java.lang.String name)  { throw new RuntimeException(); }
  private  void dropDatabase (java.lang.String name)  { throw new RuntimeException(); }
  private  void createTable (java.lang.String name, scala.Option<java.lang.String> db)  { throw new RuntimeException(); }
  private  void createTempTable (java.lang.String name)  { throw new RuntimeException(); }
  private  void dropTable (java.lang.String name, scala.Option<java.lang.String> db)  { throw new RuntimeException(); }
  private  void createFunction (java.lang.String name, scala.Option<java.lang.String> db)  { throw new RuntimeException(); }
  private  void createTempFunction (java.lang.String name)  { throw new RuntimeException(); }
  private  void dropFunction (java.lang.String name, scala.Option<java.lang.String> db)  { throw new RuntimeException(); }
  private  void dropTempFunction (java.lang.String name)  { throw new RuntimeException(); }
  private  void testListColumns (java.lang.String tableName, scala.Option<java.lang.String> dbName)  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
}
