package org.apache.spark.sql.execution.datasources;
/**
 * Helper methods for gathering metadata from HDFS.
 */
public  class HadoopFsRelation$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HadoopFsRelation$ MODULE$ = null;
  public   HadoopFsRelation$ ()  { throw new RuntimeException(); }
  /** Checks if we should filter out this path name. */
  public  boolean shouldFilterOut (java.lang.String pathName)  { throw new RuntimeException(); }
  /**
   * Create a LocatedFileStatus using FileStatus and block locations.
   * @param f (undocumented)
   * @param locations (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.fs.LocatedFileStatus createLocatedFileStatus (org.apache.hadoop.fs.FileStatus f, org.apache.hadoop.fs.BlockLocation[] locations)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FileStatus[] listLeafFiles (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.FileStatus status, org.apache.hadoop.fs.PathFilter filter)  { throw new RuntimeException(); }
  public  scala.collection.mutable.LinkedHashSet<org.apache.hadoop.fs.FileStatus> listLeafFilesInParallel (scala.collection.Seq<org.apache.hadoop.fs.Path> paths, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.sql.SparkSession sparkSession, boolean ignoreFileNotFound)  { throw new RuntimeException(); }
}
