package org.apache.spark.sql.execution.datasources;
/**
 * An interface for objects capable of enumerating the files that comprise a relation as well
 * as the partitioning characteristics of those files.
 */
public  interface FileCatalog {
  /** Returns the list of input paths from which the catalog will get files. */
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> paths ()  ;
  /** Returns the specification of the partitions inferred from the data. */
  public  org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec ()  ;
  /**
   * Returns all valid files grouped into partitions when the data is partitioned. If the data is
   * unpartitioned, this will return a single partition with no partition values.
   * <p>
   * @param filters The filters used to prune which partitions are returned.  These filters must
   *                only refer to partition columns and this method will only return files
   *                where these predicates are guaranteed to evaluate to <code>true</code>.  Thus, these
   *                filters will not need to be evaluated again on the returned data.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.Partition> listFiles (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  ;
  /** Returns all the valid files. */
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> allFiles ()  ;
  /** Refresh the file listing */
  public  void refresh ()  ;
}
