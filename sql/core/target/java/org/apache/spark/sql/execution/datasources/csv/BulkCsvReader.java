package org.apache.spark.sql.execution.datasources.csv;
/**
 * Parser for parsing lines in bulk. Use this when efficiency is desired.
 * <p>
 * param:  iter iterator over lines in the file
 * param:  params Parameters object
 * param:  headers headers for the columns
 */
  class BulkCsvReader extends org.apache.spark.sql.execution.datasources.csv.CsvReader implements scala.collection.Iterator<java.lang.String[]> {
  public   BulkCsvReader (scala.collection.Iterator<java.lang.String> iter, org.apache.spark.sql.execution.datasources.csv.CSVOptions params, scala.collection.Seq<java.lang.String> headers)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.csv.StringIteratorReader reader ()  { throw new RuntimeException(); }
  private  java.lang.String[] nextRecord ()  { throw new RuntimeException(); }
  /**
   * get the next parsed line.
   * @return array of strings where each string is a field in the CSV record
   */
  public  java.lang.String[] next ()  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
}
