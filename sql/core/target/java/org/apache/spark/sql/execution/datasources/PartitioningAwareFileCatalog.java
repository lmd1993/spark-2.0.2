package org.apache.spark.sql.execution.datasources;
/**
 * An abstract class that represents {@link FileCatalog}s that are aware of partitioned tables.
 * It provides the necessary methods to parse partition data based on a set of files.
 * <p>
 * param:  parameters as set of options to control partition discovery
 * param:  partitionSchema an optional partition schema that will be use to provide types for the
 *                        discovered partitions
 */
public abstract class PartitioningAwareFileCatalog implements org.apache.spark.sql.execution.datasources.FileCatalog, org.apache.spark.internal.Logging {
  public   PartitioningAwareFileCatalog (org.apache.spark.sql.SparkSession sparkSession, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, scala.Option<org.apache.spark.sql.types.StructType> partitionSchema)  { throw new RuntimeException(); }
  protected  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  protected abstract  scala.collection.mutable.LinkedHashMap<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus> leafFiles ()  ;
  protected abstract  scala.collection.immutable.Map<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus[]> leafDirToChildrenFiles ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.Partition> listFiles (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> allFiles ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.datasources.PartitionSpec inferPartitioning ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionDirectory> prunePartitions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates, org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec)  { throw new RuntimeException(); }
  /**
   * Contains a set of paths that are considered as the base dirs of the input datasets.
   * The partitioning discovery logic will make sure it will stop when it reaches any
   * base path.
   * <p>
   * By default, the paths of the dataset provided by users will be base paths.
   * Below are three typical examples,
   * Case 1) <code>spark.read.parquet("/path/something=true/")</code>: the base path will be
   * <code>/path/something=true/</code>, and the returned DataFrame will not contain a column of <code>something</code>.
   * Case 2) <code>spark.read.parquet("/path/something=true/a.parquet")</code>: the base path will be
   * still <code>/path/something=true/</code>, and the returned DataFrame will also not contain a column of
   * <code>something</code>.
   * Case 3) <code>spark.read.parquet("/path/")</code>: the base path will be <code>/path/</code>, and the returned
   * DataFrame will have the column of <code>something</code>.
   * <p>
   * Users also can override the basePath by setting <code>basePath</code> in the options to pass the new base
   * path to the data source.
   * For example, <code>spark.read.option("basePath", "/path/").parquet("/path/something=true/")</code>,
   * and the returned DataFrame will have the column of <code>something</code>.
   * @return (undocumented)
   */
  private  scala.collection.immutable.Set<org.apache.hadoop.fs.Path> basePaths ()  { throw new RuntimeException(); }
  private  boolean isDataPath (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
}
