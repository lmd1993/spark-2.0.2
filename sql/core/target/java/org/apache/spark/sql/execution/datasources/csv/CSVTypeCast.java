package org.apache.spark.sql.execution.datasources.csv;
public  class CSVTypeCast {
  /**
   * Casts given string datum to specified type.
   * Currently we do not support complex types (ArrayType, MapType, StructType).
   * <p>
   * For string types, this is simply the datum. For other types.
   * For other nullable types, this is null if the string datum is empty.
   * <p>
   * @param datum string value
   * @param castType SparkSQL type
   * @param nullable (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  static public  Object castTo (java.lang.String datum, org.apache.spark.sql.types.DataType castType, boolean nullable, org.apache.spark.sql.execution.datasources.csv.CSVOptions options)  { throw new RuntimeException(); }
  /**
   * Helper method that converts string representation of a character to actual character.
   * It handles some Java escaped strings and throws exception if given string is longer than one
   * character.
   * @param str (undocumented)
   * @return (undocumented)
   */
  static public  char toChar (java.lang.String str) throws java.lang.IllegalArgumentException { throw new RuntimeException(); }
}
