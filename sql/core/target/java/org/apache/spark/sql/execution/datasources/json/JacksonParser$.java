package org.apache.spark.sql.execution.datasources.json;
public  class JacksonParser$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JacksonParser$ MODULE$ = null;
  public   JacksonParser$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> parse (org.apache.spark.rdd.RDD<java.lang.String> input, org.apache.spark.sql.types.StructType schema, java.lang.String columnNameOfCorruptRecords, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
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
  public  Object convertRootField (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.DataType schema, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
  private  Object convertField (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.DataType schema, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
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
  private  org.apache.spark.sql.catalyst.InternalRow convertObject (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
  /**
   * Parse an object as a Map, preserving all fields
   * @param factory (undocumented)
   * @param parser (undocumented)
   * @param valueType (undocumented)
   * @param configOptions (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.util.MapData convertMap (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.DataType valueType, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.util.ArrayData convertArray (com.fasterxml.jackson.core.JsonFactory factory, com.fasterxml.jackson.core.JsonParser parser, org.apache.spark.sql.types.DataType elementType, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> parseJson (scala.collection.Iterator<java.lang.String> input, org.apache.spark.sql.types.StructType schema, java.lang.String columnNameOfCorruptRecords, org.apache.spark.sql.execution.datasources.json.JSONOptions configOptions)  { throw new RuntimeException(); }
}
