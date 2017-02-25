package org.apache.spark.sql.execution.datasources.json;
/**
 * Options for the JSON data source.
 * <p>
 * Most of these map directly to Jackson's internal options, specified in {@link JsonParser.Feature}.
 */
  class JSONOptions implements org.apache.spark.internal.Logging, scala.Serializable {
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters ()  { throw new RuntimeException(); }
  // not preceding
  public   JSONOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  double samplingRatio ()  { throw new RuntimeException(); }
  public  boolean primitivesAsString ()  { throw new RuntimeException(); }
  public  boolean prefersDecimal ()  { throw new RuntimeException(); }
  public  boolean allowComments ()  { throw new RuntimeException(); }
  public  boolean allowUnquotedFieldNames ()  { throw new RuntimeException(); }
  public  boolean allowSingleQuotes ()  { throw new RuntimeException(); }
  public  boolean allowNumericLeadingZeros ()  { throw new RuntimeException(); }
  public  boolean allowNonNumericNumbers ()  { throw new RuntimeException(); }
  public  boolean allowBackslashEscapingAnyCharacter ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> compressionCodec ()  { throw new RuntimeException(); }
  private  java.lang.String parseMode ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> columnNameOfCorruptRecord ()  { throw new RuntimeException(); }
  public  org.apache.commons.lang3.time.FastDateFormat dateFormat ()  { throw new RuntimeException(); }
  public  org.apache.commons.lang3.time.FastDateFormat timestampFormat ()  { throw new RuntimeException(); }
  public  boolean failFast ()  { throw new RuntimeException(); }
  public  boolean dropMalformed ()  { throw new RuntimeException(); }
  public  boolean permissive ()  { throw new RuntimeException(); }
  /** Sets config options on a Jackson {@link JsonFactory}. */
  public  void setJacksonOptions (com.fasterxml.jackson.core.JsonFactory factory)  { throw new RuntimeException(); }
}
