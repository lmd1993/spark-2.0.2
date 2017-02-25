package org.apache.spark.sql.execution.datasources.jdbc;
/**
 * Util functions for JDBC tables.
 */
public  class JdbcUtils {
  static public  java.lang.String JDBC_BATCH_FETCH_SIZE ()  { throw new RuntimeException(); }
  static public  java.lang.String JDBC_BATCH_INSERT_SIZE ()  { throw new RuntimeException(); }
  /**
   * Returns a factory for creating connections to the given JDBC URL.
   * <p>
   * @param url the JDBC url to connect to.
   * @param properties JDBC connection properties.
   * @return (undocumented)
   */
  static public  scala.Function0<java.sql.Connection> createConnectionFactory (java.lang.String url, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Returns true if the table already exists in the JDBC database.
   * @param conn (undocumented)
   * @param url (undocumented)
   * @param table (undocumented)
   * @return (undocumented)
   */
  static public  boolean tableExists (java.sql.Connection conn, java.lang.String url, java.lang.String table)  { throw new RuntimeException(); }
  /**
   * Drops a table from the JDBC database.
   * @param conn (undocumented)
   * @param table (undocumented)
   */
  static public  void dropTable (java.sql.Connection conn, java.lang.String table)  { throw new RuntimeException(); }
  /**
   * Returns a PreparedStatement that inserts a row into table via conn.
   * @param conn (undocumented)
   * @param table (undocumented)
   * @param rddSchema (undocumented)
   * @param dialect (undocumented)
   * @return (undocumented)
   */
  static public  java.sql.PreparedStatement insertStatement (java.sql.Connection conn, java.lang.String table, org.apache.spark.sql.types.StructType rddSchema, org.apache.spark.sql.jdbc.JdbcDialect dialect)  { throw new RuntimeException(); }
  /**
   * Retrieve standard jdbc types.
   * @param dt The datatype (e.g. {@link org.apache.spark.sql.types.StringType})
   * @return The default JdbcType for this DataType
   */
  static public  scala.Option<org.apache.spark.sql.jdbc.JdbcType> getCommonJDBCType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.jdbc.JdbcType getJdbcType (org.apache.spark.sql.types.DataType dt, org.apache.spark.sql.jdbc.JdbcDialect dialect)  { throw new RuntimeException(); }
  /**
   * Saves a partition of a DataFrame to the JDBC database.  This is done in
   * a single database transaction in order to avoid repeatedly inserting
   * data as much as possible.
   * <p>
   * It is still theoretically possible for rows in a DataFrame to be
   * inserted into the database more than once if a stage somehow fails after
   * the commit occurs but before the stage can return successfully.
   * <p>
   * This is not a closure inside saveTable() because apparently cosmetic
   * implementation changes elsewhere might easily render such a closure
   * non-Serializable.  Instead, we explicitly close over all variables that
   * are used.
   * @param getConnection (undocumented)
   * @param table (undocumented)
   * @param iterator (undocumented)
   * @param rddSchema (undocumented)
   * @param nullTypes (undocumented)
   * @param batchSize (undocumented)
   * @param dialect (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Iterator<java.lang.Object> savePartition (scala.Function0<java.sql.Connection> getConnection, java.lang.String table, scala.collection.Iterator<org.apache.spark.sql.Row> iterator, org.apache.spark.sql.types.StructType rddSchema, int[] nullTypes, int batchSize, org.apache.spark.sql.jdbc.JdbcDialect dialect)  { throw new RuntimeException(); }
  /**
   * Compute the schema string for this RDD.
   * @param df (undocumented)
   * @param url (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String schemaString (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String url)  { throw new RuntimeException(); }
  /**
   * Saves the RDD to the database in a single transaction.
   * @param df (undocumented)
   * @param url (undocumented)
   * @param table (undocumented)
   * @param properties (undocumented)
   */
  static public  void saveTable (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String url, java.lang.String table, java.util.Properties properties)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
}
