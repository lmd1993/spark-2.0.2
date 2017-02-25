package org.apache.spark.sql.execution.datasources;
/**
 * A writer that dynamically opens files based on the given partition columns.  Internally this is
 * done by maintaining a HashMap of open files until <code>maxFiles</code> is reached.  If this occurs, the
 * writer externally sorts the remaining rows and then writes out them out one file at a time.
 */
  class DynamicPartitionWriterContainer extends org.apache.spark.sql.execution.datasources.BaseWriterContainer {
  public   DynamicPartitionWriterContainer (org.apache.spark.sql.execution.datasources.WriteRelation relation, org.apache.hadoop.mapreduce.Job job, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> partitionColumns, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataColumns, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema, java.lang.String defaultPartitionName, int maxOpenFiles, boolean isAppend)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.execution.datasources.BucketSpec> bucketSpec ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> bucketColumns ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> sortColumns ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> bucketIdExpression ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionStringExpression ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> getBucketIdFromKey (org.apache.spark.sql.catalyst.InternalRow key)  { throw new RuntimeException(); }
  /**
   * Open and returns a new OutputWriter given a partition key and optional bucket id.
   * If bucket id is specified, we will append it to the end of the file name, but before the
   * file extension, e.g. part-r-00009-ea518ad4-455a-4431-b471-d24e03814677-00002.gz.parquet
   * @param key (undocumented)
   * @param getPartitionString (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.execution.datasources.OutputWriter newOutputWriter (org.apache.spark.sql.catalyst.InternalRow key, org.apache.spark.sql.catalyst.expressions.UnsafeProjection getPartitionString)  { throw new RuntimeException(); }
  public  void writeRows (org.apache.spark.TaskContext taskContext, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iterator)  { throw new RuntimeException(); }
}
