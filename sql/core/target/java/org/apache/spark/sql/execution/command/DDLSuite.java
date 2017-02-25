package org.apache.spark.sql.execution.command;
public  class DDLSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSQLContext, org.scalatest.BeforeAndAfterEach {
  public   DDLSuite ()  { throw new RuntimeException(); }
  private  scala.util.matching.Regex escapedIdentifier ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  /**
   * Strip backticks, if any, from the string.
   * @param ident (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String cleanIdentifier (java.lang.String ident)  { throw new RuntimeException(); }
  private  void assertUnsupported (java.lang.String query)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> void maybeWrapException (boolean expectException, scala.Function0<T> body)  { throw new RuntimeException(); }
  private  void createDatabase (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, java.lang.String name)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.CatalogTable generateTable (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
  private  void createTable (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
  private  void createTablePartition (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, scala.collection.immutable.Map<java.lang.String, java.lang.String> spec, org.apache.spark.sql.catalyst.TableIdentifier tableName)  { throw new RuntimeException(); }
  private  java.lang.String makeQualifiedPath (java.lang.String path)  { throw new RuntimeException(); }
  private  void testRecoverPartitions ()  { throw new RuntimeException(); }
  private  void testDropTable (boolean isDatasourceTable)  { throw new RuntimeException(); }
  private  void convertToDatasourceTable (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, org.apache.spark.sql.catalyst.TableIdentifier tableIdent)  { throw new RuntimeException(); }
  private  void testSetProperties (boolean isDatasourceTable)  { throw new RuntimeException(); }
  private  void testUnsetProperties (boolean isDatasourceTable)  { throw new RuntimeException(); }
  private  void testSetLocation (boolean isDatasourceTable)  { throw new RuntimeException(); }
  private  void testSetSerde (boolean isDatasourceTable)  { throw new RuntimeException(); }
  private  void testSetSerdePartition (boolean isDatasourceTable)  { throw new RuntimeException(); }
  private  void testAddPartitions (boolean isDatasourceTable)  { throw new RuntimeException(); }
  private  void testDropPartitions (boolean isDatasourceTable)  { throw new RuntimeException(); }
}
