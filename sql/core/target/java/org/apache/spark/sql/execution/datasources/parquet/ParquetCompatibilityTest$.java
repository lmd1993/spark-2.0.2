package org.apache.spark.sql.execution.datasources.parquet;
public  class ParquetCompatibilityTest$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParquetCompatibilityTest$ MODULE$ = null;
  public   ParquetCompatibilityTest$ ()  { throw new RuntimeException(); }
  /**
   * Writes arbitrary messages conforming to a given <code>schema</code> to a Parquet file located by <code>path</code>.
   * Records are produced by <code>recordWriters</code>.
   * @param path (undocumented)
   * @param schema (undocumented)
   * @param recordWriters (undocumented)
   */
  public  void writeDirect (java.lang.String path, java.lang.String schema, scala.collection.Seq<scala.Function1<org.apache.parquet.io.api.RecordConsumer, scala.runtime.BoxedUnit>> recordWriters)  { throw new RuntimeException(); }
  /**
   * Writes arbitrary messages conforming to a given <code>schema</code> to a Parquet file located by <code>path</code>
   * with given user-defined key-value <code>metadata</code>. Records are produced by <code>recordWriters</code>.
   * @param path (undocumented)
   * @param schema (undocumented)
   * @param metadata (undocumented)
   * @param recordWriters (undocumented)
   */
  public  void writeDirect (java.lang.String path, java.lang.String schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> metadata, scala.collection.Seq<scala.Function1<org.apache.parquet.io.api.RecordConsumer, scala.runtime.BoxedUnit>> recordWriters)  { throw new RuntimeException(); }
}
