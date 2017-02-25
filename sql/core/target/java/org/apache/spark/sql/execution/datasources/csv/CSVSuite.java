package org.apache.spark.sql.execution.datasources.csv;
public  class CSVSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSQLContext, org.apache.spark.sql.test.SQLTestUtils {
  public   CSVSuite ()  { throw new RuntimeException(); }
  private  java.lang.String carsFile ()  { throw new RuntimeException(); }
  private  java.lang.String carsMalformedFile ()  { throw new RuntimeException(); }
  private  java.lang.String carsFile8859 ()  { throw new RuntimeException(); }
  private  java.lang.String carsTsvFile ()  { throw new RuntimeException(); }
  private  java.lang.String carsAltFile ()  { throw new RuntimeException(); }
  private  java.lang.String carsUnbalancedQuotesFile ()  { throw new RuntimeException(); }
  private  java.lang.String carsNullFile ()  { throw new RuntimeException(); }
  private  java.lang.String carsBlankColName ()  { throw new RuntimeException(); }
  private  java.lang.String emptyFile ()  { throw new RuntimeException(); }
  private  java.lang.String commentsFile ()  { throw new RuntimeException(); }
  private  java.lang.String disableCommentsFile ()  { throw new RuntimeException(); }
  private  java.lang.String boolFile ()  { throw new RuntimeException(); }
  private  java.lang.String decimalFile ()  { throw new RuntimeException(); }
  private  java.lang.String simpleSparseFile ()  { throw new RuntimeException(); }
  private  java.lang.String numbersFile ()  { throw new RuntimeException(); }
  private  java.lang.String datesFile ()  { throw new RuntimeException(); }
  private  java.lang.String unescapedQuotesFile ()  { throw new RuntimeException(); }
  private  java.lang.String testFile (java.lang.String fileName)  { throw new RuntimeException(); }
  /** Verifies data and schema. */
  private  void verifyCars (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, boolean withHeader, int numCars, int numFields, boolean checkHeader, boolean checkValues, boolean checkTypes)  { throw new RuntimeException(); }
}
