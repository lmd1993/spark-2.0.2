package org.apache.spark.sql.execution.datasources;
/**
 * The main class responsible for representing a pluggable Data Source in Spark SQL. In addition to
 * acting as the canonical set of parameters that can describe a Data Source, this class is used to
 * resolve a description to a concrete implementation that can be used in a query plan
 * (either batch or streaming) or to write out data using an external library.
 * <p>
 * From an end user's perspective a DataSource description can be created explicitly using
 * {@link org.apache.spark.sql.DataFrameReader} or CREATE TABLE USING DDL.  Additionally, this class is
 * used when resolving a description from a metastore to a concrete implementation.
 * <p>
 * Many of the arguments to this class are optional, though depending on the specific API being used
 * these optional arguments might be filled in during resolution using either inference or external
 * metadata.  For example, when reading a partitioned table from a file system, partition columns
 * will be inferred from the directory layout even if they are not specified.
 * <p>
 * param:  paths A list of file system paths that hold data.  These will be globbed before and
 *              qualified. This option only works when reading from a {@link FileFormat}.
 * param:  userSpecifiedSchema An optional specification of the schema of the data. When present
 *                            we skip attempting to infer the schema.
 * param:  partitionColumns A list of column names that the relation is partitioned by.  When this
 *                         list is empty, the relation is unpartitioned.
 * param:  bucketSpec An optional specification for bucketing (hash-partitioning) of the data.
 */
public  class DataSource implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  public  class SourceInfo implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.String> partitionColumns ()  { throw new RuntimeException(); }
    // not preceding
    public   SourceInfo (java.lang.String name, org.apache.spark.sql.types.StructType schema, scala.collection.Seq<java.lang.String> partitionColumns)  { throw new RuntimeException(); }
  }
  public  class SourceInfo$ extends scala.runtime.AbstractFunction3<java.lang.String, org.apache.spark.sql.types.StructType, scala.collection.Seq<java.lang.String>, org.apache.spark.sql.execution.datasources.DataSource.SourceInfo> implements scala.Serializable {
    public   SourceInfo$ ()  { throw new RuntimeException(); }
  }
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
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  public  java.lang.String className ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> paths ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> partitionColumns ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.BucketSpec> bucketSpec ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> options ()  { throw new RuntimeException(); }
  // not preceding
  public   DataSource (org.apache.spark.sql.SparkSession sparkSession, java.lang.String className, scala.collection.Seq<java.lang.String> paths, scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema, scala.collection.Seq<java.lang.String> partitionColumns, scala.Option<org.apache.spark.sql.execution.datasources.BucketSpec> bucketSpec, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  public  java.lang.Class<?> providingClass ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.DataSource.SourceInfo sourceInfo ()  { throw new RuntimeException(); }
  /** A map to maintain backward compatibility in case we move data sources around. */
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> backwardCompatibilityMap ()  { throw new RuntimeException(); }
  /**
   * Class that were removed in Spark 2.0. Used to detect incompatibility libraries for Spark 2.0.
   * @return (undocumented)
   */
  private  scala.collection.immutable.Set<java.lang.String> spark2RemovedClasses ()  { throw new RuntimeException(); }
  /** Given a provider name, look up the data source class definition. */
  private  java.lang.Class<?> lookupDataSource (java.lang.String provider0)  { throw new RuntimeException(); }
  /**
   * Infer the schema of the given FileFormat, returns a pair of schema and partition column names.
   * @param format (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<org.apache.spark.sql.types.StructType, scala.collection.Seq<java.lang.String>> inferFileFormatSchema (org.apache.spark.sql.execution.datasources.FileFormat format)  { throw new RuntimeException(); }
  /** Returns the name and schema of the source that can be used to continually read data. */
  private  org.apache.spark.sql.execution.datasources.DataSource.SourceInfo sourceSchema ()  { throw new RuntimeException(); }
  /** Returns a source that can be used to continually read data. */
  public  org.apache.spark.sql.execution.streaming.Source createSource (java.lang.String metadataPath)  { throw new RuntimeException(); }
  /** Returns a sink that can be used to continually write data. */
  public  org.apache.spark.sql.execution.streaming.Sink createSink (org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  /**
   * Returns true if there is a single path that has a metadata log indicating which files should
   * be read.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  boolean hasMetadata (scala.collection.Seq<java.lang.String> path)  { throw new RuntimeException(); }
  /**
   * Create a resolved {@link BaseRelation} that can be used to read data from or write data into this
   * {@link DataSource}
   * <p>
   * @param checkPathExist A flag to indicate whether to check the existence of path or not.
   *                       This flag will be set to false when we create an empty table (the
   *                       path of the table does not exist).
   * @return (undocumented)
   */
  public  org.apache.spark.sql.sources.BaseRelation resolveRelation (boolean checkPathExist)  { throw new RuntimeException(); }
  /** Writes the give {@link DataFrame} out to this {@link DataSource}. */
  public  org.apache.spark.sql.sources.BaseRelation write (org.apache.spark.sql.SaveMode mode, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
}
