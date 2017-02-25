package org.apache.spark.sql.execution.datasources.json;
public  class JacksonGenerator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JacksonGenerator$ MODULE$ = null;
  public   JacksonGenerator$ ()  { throw new RuntimeException(); }
  /** Transforms a single InternalRow to JSON using Jackson
   * <p>
   * TODO: make the code shared with the other apply method.
   * <p>
   * @param rowSchema the schema object used for conversion
   * @param gen a JsonGenerator object
   * @param row The row to convert
   * @param options (undocumented)
   */
  public  void apply (org.apache.spark.sql.types.StructType rowSchema, com.fasterxml.jackson.core.JsonGenerator gen, org.apache.spark.sql.execution.datasources.json.JSONOptions options, org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}
