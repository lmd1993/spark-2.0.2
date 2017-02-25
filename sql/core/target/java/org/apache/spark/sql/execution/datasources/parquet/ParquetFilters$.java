package org.apache.spark.sql.execution.datasources.parquet;
public  class ParquetFilters$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParquetFilters$ MODULE$ = null;
  public   ParquetFilters$ ()  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.types.DataType, scala.Function2<java.lang.String, java.lang.Object, org.apache.parquet.filter2.predicate.FilterPredicate>> makeEq ()  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.types.DataType, scala.Function2<java.lang.String, java.lang.Object, org.apache.parquet.filter2.predicate.FilterPredicate>> makeNotEq ()  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.types.DataType, scala.Function2<java.lang.String, java.lang.Object, org.apache.parquet.filter2.predicate.FilterPredicate>> makeLt ()  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.types.DataType, scala.Function2<java.lang.String, java.lang.Object, org.apache.parquet.filter2.predicate.FilterPredicate>> makeLtEq ()  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.types.DataType, scala.Function2<java.lang.String, java.lang.Object, org.apache.parquet.filter2.predicate.FilterPredicate>> makeGt ()  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.types.DataType, scala.Function2<java.lang.String, java.lang.Object, org.apache.parquet.filter2.predicate.FilterPredicate>> makeGtEq ()  { throw new RuntimeException(); }
  private  scala.PartialFunction<org.apache.spark.sql.types.DataType, scala.Function2<java.lang.String, scala.collection.immutable.Set<java.lang.Object>, org.apache.parquet.filter2.predicate.FilterPredicate>> makeInSet ()  { throw new RuntimeException(); }
  /**
   * SPARK-11955: The optional fields will have metadata StructType.metadataKeyForOptionalField.
   * These fields only exist in one side of merged schemas. Due to that, we can't push down filters
   * using such fields, otherwise Parquet library will throw exception. Here we filter out such
   * fields.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<java.lang.String, org.apache.spark.sql.types.DataType>[] getFieldMap (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Converts data sources filters to Parquet filter predicates.
   * @param schema (undocumented)
   * @param predicate (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.parquet.filter2.predicate.FilterPredicate> createFilter (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.sources.Filter predicate)  { throw new RuntimeException(); }
  private  void relaxParquetValidTypeMap ()  { throw new RuntimeException(); }
}
