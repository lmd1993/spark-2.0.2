package org.apache.spark.sql.execution.datasources.csv;
/**
 * Parser for parsing a line at a time. Not efficient for bulk data.
 * <p>
 * param:  params Parameters object
 */
  class LineCsvReader extends org.apache.spark.sql.execution.datasources.csv.CsvReader {
  public   LineCsvReader (org.apache.spark.sql.execution.datasources.csv.CSVOptions params)  { throw new RuntimeException(); }
  /**
   * parse a line
   * <p>
   * @param line a String with no newline at the end
   * @return array of strings where each string is a field in the CSV record
   */
  public  java.lang.String[] parseLine (java.lang.String line)  { throw new RuntimeException(); }
}
