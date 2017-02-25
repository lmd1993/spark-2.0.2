package org.apache.spark.sql.catalog;
/**
 * Catalog interface for Spark. To access this, use <code>SparkSession.catalog</code>.
 * <p>
 * @since 2.0.0
 */
public abstract class Catalog {
  public   Catalog ()  { throw new RuntimeException(); }
  /**
   * Returns the current default database in this session.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public abstract  java.lang.String currentDatabase ()  ;
  /**
   * Sets the current default database in this session.
   * <p>
   * @since 2.0.0
   * @param dbName (undocumented)
   */
  public abstract  void setCurrentDatabase (java.lang.String dbName)  ;
  /**
   * Returns a list of databases available across all sessions.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Database> listDatabases ()  ;
  /**
   * Returns a list of tables in the current database.
   * This includes all temporary tables.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Table> listTables ()  ;
  /**
   * Returns a list of tables in the specified database.
   * This includes all temporary tables.
   * <p>
   * @since 2.0.0
   * @param dbName (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Table> listTables (java.lang.String dbName) throws org.apache.spark.sql.AnalysisException ;
  /**
   * Returns a list of functions registered in the current database.
   * This includes all temporary functions
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Function> listFunctions ()  ;
  /**
   * Returns a list of functions registered in the specified database.
   * This includes all temporary functions
   * <p>
   * @since 2.0.0
   * @param dbName (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Function> listFunctions (java.lang.String dbName) throws org.apache.spark.sql.AnalysisException ;
  /**
   * Returns a list of columns for the given table in the current database or
   * the given temporary table.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Column> listColumns (java.lang.String tableName) throws org.apache.spark.sql.AnalysisException ;
  /**
   * Returns a list of columns for the given table in the specified database.
   * <p>
   * @since 2.0.0
   * @param dbName (undocumented)
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Column> listColumns (java.lang.String dbName, java.lang.String tableName) throws org.apache.spark.sql.AnalysisException ;
  /**
   * :: Experimental ::
   * Creates an external table from the given path and returns the corresponding DataFrame.
   * It will use the default data source configured by spark.sql.sources.default.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param path (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String path)  ;
  /**
   * :: Experimental ::
   * Creates an external table from the given path based on a data source
   * and returns the corresponding DataFrame.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param path (undocumented)
   * @param source (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String path, java.lang.String source)  ;
  /**
   * :: Experimental ::
   * Creates an external table from the given path based on a data source and a set of options.
   * Then, returns the corresponding DataFrame.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, java.util.Map<java.lang.String, java.lang.String> options)  ;
  /**
   * :: Experimental ::
   * (Scala-specific)
   * Creates an external table from the given path based on a data source and a set of options.
   * Then, returns the corresponding DataFrame.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  ;
  /**
   * :: Experimental ::
   * Create an external table from the given path based on a data source, a schema and
   * a set of options. Then, returns the corresponding DataFrame.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param schema (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, org.apache.spark.sql.types.StructType schema, java.util.Map<java.lang.String, java.lang.String> options)  ;
  /**
   * :: Experimental ::
   * (Scala-specific)
   * Create an external table from the given path based on a data source, a schema and
   * a set of options. Then, returns the corresponding DataFrame.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param schema (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  ;
  /**
   * Drops the temporary view with the given view name in the catalog.
   * If the view has been cached before, then it will also be uncached.
   * <p>
   * @param viewName the name of the view to be dropped.
   * @since 2.0.0
   */
  public abstract  void dropTempView (java.lang.String viewName)  ;
  /**
   * Returns true if the table is currently cached in-memory.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public abstract  boolean isCached (java.lang.String tableName)  ;
  /**
   * Caches the specified table in-memory.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   */
  public abstract  void cacheTable (java.lang.String tableName)  ;
  /**
   * Removes the specified table from the in-memory cache.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   */
  public abstract  void uncacheTable (java.lang.String tableName)  ;
  /**
   * Removes all cached tables from the in-memory cache.
   * <p>
   * @since 2.0.0
   */
  public abstract  void clearCache ()  ;
  /**
   * Invalidate and refresh all the cached metadata of the given table. For performance reasons,
   * Spark SQL or the external data source library it uses might cache certain metadata about a
   * table, such as the location of blocks. When those change outside of Spark SQL, users should
   * call this function to invalidate the cache.
   * <p>
   * If this table is cached as an InMemoryRelation, drop the original cached version and make the
   * new version cached lazily.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   */
  public abstract  void refreshTable (java.lang.String tableName)  ;
  /**
   * Invalidate and refresh all the cached data (and the associated metadata) for any dataframe that
   * contains the given data source path.
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   */
  public abstract  void refreshByPath (java.lang.String path)  ;
}
