package org.apache.spark.sql.execution.command;
public  class DDLUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DDLUtils$ MODULE$ = null;
  public   DDLUtils$ ()  { throw new RuntimeException(); }
  public  boolean isDatasourceTable (scala.collection.immutable.Map<java.lang.String, java.lang.String> props)  { throw new RuntimeException(); }
  public  boolean isDatasourceTable (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  /**
   * If the command ALTER VIEW is to alter a table or ALTER TABLE is to alter a view,
   * issue an exception {@link AnalysisException}.
   * @param catalog (undocumented)
   * @param tableIdentifier (undocumented)
   * @param isView (undocumented)
   */
  public  void verifyAlterTableType (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier, boolean isView)  { throw new RuntimeException(); }
  /**
   * If the given table properties (or SerDe properties) contains datasource properties,
   * throw an exception.
   * @param propKeys (undocumented)
   * @param operation (undocumented)
   */
  public  void verifyTableProperties (scala.collection.Seq<java.lang.String> propKeys, java.lang.String operation)  { throw new RuntimeException(); }
  public  boolean isTablePartitioned (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> getSchemaFromTableProperties (org.apache.spark.sql.catalyst.catalog.CatalogTable metadata)  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> getColumnNamesByType (scala.collection.immutable.Map<java.lang.String, java.lang.String> props, java.lang.String colType, java.lang.String typeName)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPartitionColumnsFromTableProperties (org.apache.spark.sql.catalyst.catalog.CatalogTable metadata)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.BucketSpec> getBucketSpecFromTableProperties (org.apache.spark.sql.catalyst.catalog.CatalogTable metadata)  { throw new RuntimeException(); }
}
