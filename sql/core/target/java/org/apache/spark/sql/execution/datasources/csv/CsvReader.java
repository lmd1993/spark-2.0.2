package org.apache.spark.sql.execution.datasources.csv;
/**
 * Read and parse CSV-like input
 * <p>
 * param:  params Parameters object
 * param:  headers headers for the columns
 */
 abstract class CsvReader {
  public   CsvReader (org.apache.spark.sql.execution.datasources.csv.CSVOptions params, scala.collection.Seq<java.lang.String> headers)  { throw new RuntimeException(); }
  protected  com.univocity.parsers.csv.CsvParser parser ()  { throw new RuntimeException(); }
}
