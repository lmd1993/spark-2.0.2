package org.apache.spark.sql.execution.datasources.json;
public  class JacksonParser {
  static public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> parse (org.apache.spark.rdd.RDD<java.lang.String> input, org.apache.spark.sql.types.StructType schema, java.lang.String columnNameOfCorruptRecords, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
  /**
   * Parse the current token (and related children) according to a desired schema
   * This is a wrapper for the method <code>convertField()</code> to handle a row wrapped
   * with an array.
   * @param factory (undocumented)
   * @param parser (undocumented)
   * @param schema (undocumented)
   * @param configOptions (undocumented)
   * @return (undocumented)
   */
  static public  Object convertRootField (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.DataType schema, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
  static private  Object convertField (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.DataType schema, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
  /**
   * Parse an object from the token stream into a new Row representing the schema.
   * <p>
   * Fields in the json that are not defined in the requested schema will be dropped.
   * @param factory (undocumented)
   * @param parser (undocumented)
   * @param schema (undocumented)
   * @param configOptions (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.sql.catalyst.InternalRow convertObject (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
  /**
   * Parse an object as a Map, preserving all fields
   * @param factory (undocumented)
   * @param parser (undocumented)
   * @param valueType (undocumented)
   * @param configOptions (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.sql.catalyst.util.MapData convertMap (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.DataType valueType, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.util.ArrayData convertArray (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.DataType elementType, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> parseJson (scala.collection.Iterator<java.lang.String> input, org.apache.spark.sql.types.StructType schema, java.lang.String columnNameOfCorruptRecords, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
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
