package org.apache.spark.sql.catalyst.catalog;
/**
 * Interface for the system catalog (of columns, partitions, tables, and databases).
 * <p>
 * This is only used for non-temporary items, and implementations must be thread-safe as they
 * can be accessed in multiple threads. This is an external catalog because it is expected to
 * interact with external systems.
 * <p>
 * Implementations should throw {@link NoSuchDatabaseException} when databases don't exist.
 */
public abstract class ExternalCatalog {
  public   ExternalCatalog ()  { throw new RuntimeException(); }
  protected  void requireDbExists (java.lang.String db)  { throw new RuntimeException(); }
  protected  void requireFunctionExists (java.lang.String db, java.lang.String funcName)  { throw new RuntimeException(); }
  protected  void requireFunctionNotExists (java.lang.String db, java.lang.String funcName)  { throw new RuntimeException(); }
  public abstract  void createDatabase (org.apache.spark.sql.catalyst.catalog.CatalogDatabase dbDefinition, boolean ignoreIfExists)  ;
  public abstract  void dropDatabase (java.lang.String db, boolean ignoreIfNotExists, boolean cascade)  ;
  /**
   * Alter a database whose name matches the one specified in <code>dbDefinition</code>,
   * assuming the database exists.
   * <p>
   * Note: If the underlying implementation does not support altering a certain field,
   * this becomes a no-op.
   * @param dbDefinition (undocumented)
   */
  public abstract  void alterDatabase (org.apache.spark.sql.catalyst.catalog.CatalogDatabase dbDefinition)  ;
  public abstract  org.apache.spark.sql.catalyst.catalog.CatalogDatabase getDatabase (java.lang.String db)  ;
  public abstract  boolean databaseExists (java.lang.String db)  ;
  public abstract  scala.collection.Seq<java.lang.String> listDatabases ()  ;
  public abstract  scala.collection.Seq<java.lang.String> listDatabases (java.lang.String pattern)  ;
  public abstract  void setCurrentDatabase (java.lang.String db)  ;
  public abstract  void createTable (java.lang.String db, org.apache.spark.sql.catalyst.catalog.CatalogTable tableDefinition, boolean ignoreIfExists)  ;
  public abstract  void dropTable (java.lang.String db, java.lang.String table, boolean ignoreIfNotExists)  ;
  public abstract  void renameTable (java.lang.String db, java.lang.String oldName, java.lang.String newName)  ;
  /**
   * Alter a table whose name that matches the one specified in <code>tableDefinition</code>,
   * assuming the table exists.
   * <p>
   * Note: If the underlying implementation does not support altering a certain field,
   * this becomes a no-op.
   * @param db (undocumented)
   * @param tableDefinition (undocumented)
   */
  public abstract  void alterTable (java.lang.String db, org.apache.spark.sql.catalyst.catalog.CatalogTable tableDefinition)  ;
  public abstract  org.apache.spark.sql.catalyst.catalog.CatalogTable getTable (java.lang.String db, java.lang.String table)  ;
  public abstract  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogTable> getTableOption (java.lang.String db, java.lang.String table)  ;
  public abstract  boolean tableExists (java.lang.String db, java.lang.String table)  ;
  public abstract  scala.collection.Seq<java.lang.String> listTables (java.lang.String db)  ;
  public abstract  scala.collection.Seq<java.lang.String> listTables (java.lang.String db, java.lang.String pattern)  ;
  public abstract  void loadTable (java.lang.String db, java.lang.String table, java.lang.String loadPath, boolean isOverwrite, boolean holdDDLTime)  ;
  public abstract  void loadPartition (java.lang.String db, java.lang.String table, java.lang.String loadPath, scala.collection.immutable.Map<java.lang.String, java.lang.String> partition, boolean isOverwrite, boolean holdDDLTime, boolean inheritTableSpecs, boolean isSkewedStoreAsSubdir)  ;
  public abstract  void createPartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> parts, boolean ignoreIfExists)  ;
  public abstract  void dropPartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> parts, boolean ignoreIfNotExists)  ;
  /**
   * Override the specs of one or many existing table partitions, assuming they exist.
   * This assumes index i of <code>specs</code> corresponds to index i of <code>newSpecs</code>.
   * @param db (undocumented)
   * @param table (undocumented)
   * @param specs (undocumented)
   * @param newSpecs (undocumented)
   */
  public abstract  void renamePartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> specs, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> newSpecs)  ;
  /**
   * Alter one or many table partitions whose specs that match those specified in <code>parts</code>,
   * assuming the partitions exist.
   * <p>
   * Note: If the underlying implementation does not support altering a certain field,
   * this becomes a no-op.
   * @param db (undocumented)
   * @param table (undocumented)
   * @param parts (undocumented)
   */
  public abstract  void alterPartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> parts)  ;
  public abstract  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition getPartition (java.lang.String db, java.lang.String table, scala.collection.immutable.Map<java.lang.String, java.lang.String> spec)  ;
  /**
   * List the metadata of all partitions that belong to the specified table, assuming it exists.
   * <p>
   * A partial partition spec may optionally be provided to filter the partitions returned.
   * For instance, if there exist partitions (a='1', b='2'), (a='1', b='3') and (a='2', b='4'),
   * then a partial spec of (a='1') will return the first two only.
   * @param db database name
   * @param table table name
   * @param partialSpec  partition spec
   * @return (undocumented)
   */
  public abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> listPartitions (java.lang.String db, java.lang.String table, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partialSpec)  ;
  public abstract  void createFunction (java.lang.String db, org.apache.spark.sql.catalyst.catalog.CatalogFunction funcDefinition)  ;
  public abstract  void dropFunction (java.lang.String db, java.lang.String funcName)  ;
  public abstract  void renameFunction (java.lang.String db, java.lang.String oldName, java.lang.String newName)  ;
  public abstract  org.apache.spark.sql.catalyst.catalog.CatalogFunction getFunction (java.lang.String db, java.lang.String funcName)  ;
  public abstract  boolean functionExists (java.lang.String db, java.lang.String funcName)  ;
  public abstract  scala.collection.Seq<java.lang.String> listFunctions (java.lang.String db, java.lang.String pattern)  ;
}
