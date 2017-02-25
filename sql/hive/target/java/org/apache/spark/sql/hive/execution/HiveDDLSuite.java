package org.apache.spark.sql.hive.execution;
public  class HiveDDLSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SQLTestUtils, org.apache.spark.sql.hive.test.TestHiveSingleton, org.scalatest.BeforeAndAfterEach {
  public   HiveDDLSuite ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  private  boolean tableDirectoryExists (org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier, scala.Option<java.lang.String> dbPath)  { throw new RuntimeException(); }
  private  void createDatabaseWithLocation (java.io.File tmpDir, boolean dirExists)  { throw new RuntimeException(); }
  private  java.lang.String appendTrailingSlash (java.lang.String path)  { throw new RuntimeException(); }
  private  void dropDatabase (boolean cascade, boolean tableExists)  { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> getTablePath (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  private  void checkCreateTableLike (org.apache.spark.sql.catalyst.catalog.CatalogTable sourceTable, org.apache.spark.sql.catalyst.catalog.CatalogTable targetTable)  { throw new RuntimeException(); }
}
