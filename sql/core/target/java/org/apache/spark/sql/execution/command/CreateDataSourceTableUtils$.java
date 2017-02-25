package org.apache.spark.sql.execution.command;
public  class CreateDataSourceTableUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CreateDataSourceTableUtils$ MODULE$ = null;
  public   CreateDataSourceTableUtils$ ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_PROVIDER ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_WRITEJOBUUID ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_OUTPUTPATH ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_NUMPARTS ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_NUMPARTCOLS ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_NUMSORTCOLS ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_NUMBUCKETS ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_NUMBUCKETCOLS ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_PART_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_PARTCOL_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_BUCKETCOL_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_SORTCOL_PREFIX ()  { throw new RuntimeException(); }
  /**
   * Checks if the given name conforms the Hive standard ("[a-zA-z_0-9]+"),
   * i.e. if this name only contains characters, numbers, and _.
   * <p>
   * This method is intended to have the same behavior of
   * org.apache.hadoop.hive.metastore.MetaStoreUtils.validateName.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  boolean validateName (java.lang.String name)  { throw new RuntimeException(); }
  public  void createDataSourceTable (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.catalyst.TableIdentifier tableIdent, scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema, java.lang.String[] partitionColumns, scala.Option<org.apache.spark.sql.execution.datasources.BucketSpec> bucketSpec, java.lang.String provider, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, boolean isExternal)  { throw new RuntimeException(); }
}
