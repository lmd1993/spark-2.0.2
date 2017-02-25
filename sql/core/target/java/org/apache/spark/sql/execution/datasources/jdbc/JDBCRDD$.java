package org.apache.spark.sql.execution.datasources.jdbc;
public  class JDBCRDD$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JDBCRDD$ MODULE$ = null;
  public   JDBCRDD$ ()  { throw new RuntimeException(); }
  /**
   * Maps a JDBC type to a Catalyst type.  This function is called only when
   * the JdbcDialect class corresponding to your database driver returns null.
   * <p>
   * @param sqlType - A field of java.sql.Types
   * @return The Catalyst type corresponding to sqlType.
   * @param precision (undocumented)
   * @param scale (undocumented)
   * @param signed (undocumented)
   */
  private  org.apache.spark.sql.types.DataType getCatalystType (int sqlType, int precision, int scale, boolean signed)  { throw new RuntimeException(); }
  /**
   * Takes a (schema, table) specification and returns the table's Catalyst
   * schema.
   * <p>
   * @param url - The JDBC url to fetch information from.
   * @param table - The table name of the desired table.  This may also be a
   *   SQL query wrapped in parentheses.
   * <p>
   * @return A StructType giving the table's Catalyst schema.
   * @throws SQLException if the table specification is garbage.
   * @throws SQLException if the table contains an unsupported type.
   * @param properties (undocumented)
   */
  public  org.apache.spark.sql.types.StructType resolveTable (java.lang.String url, java.lang.String table, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Prune all but the specified columns from the specified Catalyst schema.
   * <p>
   * @param schema - The Catalyst schema of the master table
   * @param columns - The list of desired columns
   * <p>
   * @return A Catalyst schema corresponding to columns in the given order.
   */
  private  org.apache.spark.sql.types.StructType pruneSchema (org.apache.spark.sql.types.StructType schema, java.lang.String[] columns)  { throw new RuntimeException(); }
  /**
   * Converts value to SQL expression.
   * @param value (undocumented)
   * @return (undocumented)
   */
  private  Object compileValue (Object value)  { throw new RuntimeException(); }
  private  java.lang.String escapeSql (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Turns a single Filter into a String representing a SQL expression.
   * Returns None for an unhandled filter.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> compileFilter (org.apache.spark.sql.sources.Filter f)  { throw new RuntimeException(); }
  /**
   * Build and return JDBCRDD from the given information.
   * <p>
   * @param sc - Your SparkContext.
   * @param schema - The Catalyst schema of the underlying database table.
   * @param url - The JDBC url to connect to.
   * @param fqTable - The fully-qualified table name (or paren'd SQL query) to use.
   * @param requiredColumns - The names of the columns to SELECT.
   * @param filters - The filters to include in all WHERE clauses.
   * @param parts - An array of JDBCPartitions specifying partition ids and
   *    per-partition WHERE clauses.
   * <p>
   * @return An RDD representing "SELECT requiredColumns FROM fqTable".
   * @param properties (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> scanTable (org.apache.spark.SparkContext sc, org.apache.spark.sql.types.StructType schema, java.lang.String url, java.util.Properties properties, java.lang.String fqTable, java.lang.String[] requiredColumns, org.apache.spark.sql.sources.Filter[] filters, org.apache.spark.Partition[] parts)  { throw new RuntimeException(); }
}
