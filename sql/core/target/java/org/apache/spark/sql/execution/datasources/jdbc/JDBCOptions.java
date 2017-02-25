package org.apache.spark.sql.execution.datasources.jdbc;
/**
 * Options for the JDBC data source.
 */
  class JDBCOptions implements scala.Serializable {
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters ()  { throw new RuntimeException(); }
  // not preceding
  public   JDBCOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  java.lang.String url ()  { throw new RuntimeException(); }
  public  java.lang.String table ()  { throw new RuntimeException(); }
  public  java.lang.String partitionColumn ()  { throw new RuntimeException(); }
  public  java.lang.String lowerBound ()  { throw new RuntimeException(); }
  public  java.lang.String upperBound ()  { throw new RuntimeException(); }
  public  java.lang.String numPartitions ()  { throw new RuntimeException(); }
}
