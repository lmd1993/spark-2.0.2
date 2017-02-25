package org.apache.spark.sql.execution.datasources;
/**
 * Acts as a container for all of the metadata required to read from a datasource. All discovery,
 * resolution and merging logic for schemas and partitions has been removed.
 * <p>
 * param:  location A {@link FileCatalog} that can enumerate the locations of all the files that comprise
 *                 this relation.
 * param:  partitionSchema The schema of the columns (if any) that are used to partition the relation
 * param:  dataSchema The schema of any remaining columns.  Note that if any partition columns are
 *                   present in the actual data files as well, they are preserved.
 * param:  bucketSpec Describes the bucketing (hash-partitioning of the files by some column values).
 * param:  fileFormat A file format that can be used to read and write the data in files.
 * param:  options Configuration used when reading / writing data.
 */
public  class HadoopFsRelation extends org.apache.spark.sql.sources.BaseRelation implements org.apache.spark.sql.execution.FileRelation, scala.Product, scala.Serializable {
  static public  class FakeBlockLocation implements scala.Product, scala.Serializable {
    public  java.lang.String[] names ()  { throw new RuntimeException(); }
    public  java.lang.String[] hosts ()  { throw new RuntimeException(); }
    public  long offset ()  { throw new RuntimeException(); }
    public  long length ()  { throw new RuntimeException(); }
    // not preceding
    public   FakeBlockLocation (java.lang.String[] names, java.lang.String[] hosts, long offset, long length)  { throw new RuntimeException(); }
  }
  static public  class FakeBlockLocation$ extends scala.runtime.AbstractFunction4<java.lang.String[], java.lang.String[], java.lang.Object, java.lang.Object, org.apache.spark.sql.execution.datasources.HadoopFsRelation.FakeBlockLocation> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FakeBlockLocation$ MODULE$ = null;
    public   FakeBlockLocation$ ()  { throw new RuntimeException(); }
  }
  static public  class FakeFileStatus implements scala.Product, scala.Serializable {
    public  java.lang.String path ()  { throw new RuntimeException(); }
    public  long length ()  { throw new RuntimeException(); }
    public  boolean isDir ()  { throw new RuntimeException(); }
    public  short blockReplication ()  { throw new RuntimeException(); }
    public  long blockSize ()  { throw new RuntimeException(); }
    public  long modificationTime ()  { throw new RuntimeException(); }
    public  long accessTime ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.HadoopFsRelation.FakeBlockLocation[] blockLocations ()  { throw new RuntimeException(); }
    // not preceding
    public   FakeFileStatus (java.lang.String path, long length, boolean isDir, short blockReplication, long blockSize, long modificationTime, long accessTime, org.apache.spark.sql.execution.datasources.HadoopFsRelation.FakeBlockLocation[] blockLocations)  { throw new RuntimeException(); }
  }
  static public  class FakeFileStatus$ extends scala.runtime.AbstractFunction8<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.sql.execution.datasources.HadoopFsRelation.FakeBlockLocation[], org.apache.spark.sql.execution.datasources.HadoopFsRelation.FakeFileStatus> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FakeFileStatus$ MODULE$ = null;
    public   FakeFileStatus$ ()  { throw new RuntimeException(); }
  }
  /** Checks if we should filter out this path name. */
  static public  boolean shouldFilterOut (java.lang.String pathName)  { throw new RuntimeException(); }
  /**
   * Create a LocatedFileStatus using FileStatus and block locations.
   * @param f (undocumented)
   * @param locations (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.hadoop.fs.LocatedFileStatus createLocatedFileStatus (org.apache.hadoop.fs.FileStatus f, org.apache.hadoop.fs.BlockLocation[] locations)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileStatus[] listLeafFiles (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.FileStatus status, org.apache.hadoop.fs.PathFilter filter)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.LinkedHashSet<org.apache.hadoop.fs.FileStatus> listLeafFilesInParallel (scala.collection.Seq<org.apache.hadoop.fs.Path> paths, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.sql.SparkSession sparkSession, boolean ignoreFileNotFound)  { throw new RuntimeException(); }
  static public  boolean needConversion ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.sources.Filter[] unhandledFilters (org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.FileCatalog location ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType partitionSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType dataSchema ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.BucketSpec> bucketSpec ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.FileFormat fileFormat ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> options ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  // not preceding
  public   HadoopFsRelation (org.apache.spark.sql.execution.datasources.FileCatalog location, org.apache.spark.sql.types.StructType partitionSchema, org.apache.spark.sql.types.StructType dataSchema, scala.Option<org.apache.spark.sql.execution.datasources.BucketSpec> bucketSpec, org.apache.spark.sql.execution.datasources.FileFormat fileFormat, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> partitionSchemaOption ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec ()  { throw new RuntimeException(); }
  public  void refresh ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /** Returns the list of files that will be read when scanning this relation. */
  public  java.lang.String[] inputFiles ()  { throw new RuntimeException(); }
  public  long sizeInBytes ()  { throw new RuntimeException(); }
}
