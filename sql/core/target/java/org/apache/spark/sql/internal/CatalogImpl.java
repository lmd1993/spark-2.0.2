package org.apache.spark.sql.internal;
/**
 * Internal implementation of the user-facing {@link Catalog}.
 */
public  class CatalogImpl extends org.apache.spark.sql.catalog.Catalog {
  static public <T extends org.apache.spark.sql.catalyst.DefinedByConstructorParams> org.apache.spark.sql.Dataset<T> makeDataset (scala.collection.Seq<T> data, org.apache.spark.sql.SparkSession sparkSession, scala.reflect.api.TypeTags.TypeTag<T> evidence$1)  { throw new RuntimeException(); }
  public   CatalogImpl (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.SessionCatalog sessionCatalog ()  { throw new RuntimeException(); }
  private  void requireDatabaseExists (java.lang.String dbName)  { throw new RuntimeException(); }
  private  void requireTableExists (java.lang.String dbName, java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Returns the current default database in this session.
   * @return (undocumented)
   */
  public  java.lang.String currentDatabase ()  { throw new RuntimeException(); }
  /**
   * Sets the current default database in this session.
   * @param dbName (undocumented)
   */
  public  void setCurrentDatabase (java.lang.String dbName) throws org.apache.spark.sql.AnalysisException { throw new RuntimeException(); }
  /**
   * Returns a list of databases available across all sessions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Database> listDatabases ()  { throw new RuntimeException(); }
  /**
   * Returns a list of tables in the current database.
   * This includes all temporary tables.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Table> listTables ()  { throw new RuntimeException(); }
  /**
   * Returns a list of tables in the specified database.
   * This includes all temporary tables.
   * @param dbName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Table> listTables (java.lang.String dbName) throws org.apache.spark.sql.AnalysisException { throw new RuntimeException(); }
  /**
   * Returns a list of functions registered in the current database.
   * This includes all temporary functions
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Function> listFunctions ()  { throw new RuntimeException(); }
  /**
   * Returns a list of functions registered in the specified database.
   * This includes all temporary functions
   * @param dbName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Function> listFunctions (java.lang.String dbName) throws org.apache.spark.sql.AnalysisException { throw new RuntimeException(); }
  /**
   * Returns a list of columns for the given table in the current database.
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Column> listColumns (java.lang.String tableName) throws org.apache.spark.sql.AnalysisException { throw new RuntimeException(); }
  /**
   * Returns a list of columns for the given table in the specified database.
   * @param dbName (undocumented)
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Column> listColumns (java.lang.String dbName, java.lang.String tableName) throws org.apache.spark.sql.AnalysisException { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Column> listColumns (org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Creates an external table from the given path and returns the corresponding DataFrame.
   * It will use the default data source configured by spark.sql.sources.default.
   * <p>
   * @group ddl_ops
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Creates an external table from the given path based on a data source
   * and returns the corresponding DataFrame.
   * <p>
   * @group ddl_ops
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param path (undocumented)
   * @param source (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String path, java.lang.String source)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Creates an external table from the given path based on a data source and a set of options.
   * Then, returns the corresponding DataFrame.
   * <p>
   * @group ddl_ops
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Scala-specific)
   * Creates an external table from the given path based on a data source and a set of options.
   * Then, returns the corresponding DataFrame.
   * <p>
   * @group ddl_ops
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Create an external table from the given path based on a data source, a schema and
   * a set of options. Then, returns the corresponding DataFrame.
   * <p>
   * @group ddl_ops
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param schema (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, org.apache.spark.sql.types.StructType schema, java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Scala-specific)
   * Create an external table from the given path based on a data source, a schema and
   * a set of options. Then, returns the corresponding DataFrame.
   * <p>
   * @group ddl_ops
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param schema (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Drops the temporary view with the given view name in the catalog.
   * If the view has been cached/persisted before, it's also unpersisted.
   * <p>
   * @param viewName the name of the view to be dropped.
   * @group ddl_ops
   * @since 2.0.0
   */
  public  void dropTempView (java.lang.String viewName)  { throw new RuntimeException(); }
  /**
   * Returns true if the table is currently cached in-memory.
   * <p>
   * @group cachemgmt
   * @since 2.0.0
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public  boolean isCached (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Caches the specified table in-memory.
   * <p>
   * @group cachemgmt
   * @since 2.0.0
   * @param tableName (undocumented)
   */
  public  void cacheTable (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Removes the specified table from the in-memory cache.
   * <p>
   * @group cachemgmt
   * @since 2.0.0
   * @param tableName (undocumented)
   */
  public  void uncacheTable (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Removes all cached tables from the in-memory cache.
   * <p>
   * @group cachemgmt
   * @since 2.0.0
   */
  public  void clearCache ()  { throw new RuntimeException(); }
  /**
   * Returns true if the {@link Dataset} is currently cached in-memory.
   * <p>
   * @group cachemgmt
   * @since 2.0.0
   * @param qName (undocumented)
   * @return (undocumented)
   */
  protected  boolean isCached (org.apache.spark.sql.Dataset<?> qName)  { throw new RuntimeException(); }
  /**
   * Refresh the cache entry for a table, if any. For Hive metastore table, the metadata
   * is refreshed.
   * <p>
   * @group cachemgmt
   * @since 2.0.0
   * @param tableName (undocumented)
   */
  public  void refreshTable (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Refresh the cache entry and the associated metadata for all dataframes (if any), that contain
   * the given data source path.
   * <p>
   * @group cachemgmt
   * @since 2.0.0
   * @param resourcePath (undocumented)
   */
  public  void refreshByPath (java.lang.String resourcePath)  { throw new RuntimeException(); }
}
