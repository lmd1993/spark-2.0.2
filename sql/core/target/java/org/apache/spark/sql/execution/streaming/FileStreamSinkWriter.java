package org.apache.spark.sql.execution.streaming;
/**
 * Writes data given to a {@link FileStreamSink} to the given <code>basePath</code> in the given <code>fileFormat</code>,
 * partitioned by the given <code>partitionColumnNames</code>. This writer always appends data to the
 * directory if it already has data.
 */
public  class FileStreamSinkWriter implements scala.Serializable, org.apache.spark.internal.Logging {
  public   FileStreamSinkWriter (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, org.apache.spark.sql.execution.datasources.FileFormat fileFormat, java.lang.String basePath, scala.collection.Seq<java.lang.String> partitionColumnNames, org.apache.hadoop.conf.Configuration hadoopConf, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  private  org.apache.spark.util.SerializableConfiguration serializableConf ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType dataSchema ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> dataColumns ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> partitionColumns ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> writeColumns ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.OutputWriterFactory outputWriterFactory ()  { throw new RuntimeException(); }
  /** Expressions that given a partition key build a string like: col1=val/col2=val/... */
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionStringExpression ()  { throw new RuntimeException(); }
  /** Generate a new output writer from the writer factory */
  private  org.apache.spark.sql.execution.datasources.OutputWriter newOutputWriter (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  /** Write the dataframe to files. This gets called in the driver by the {@link FileStreamSink}. */
  public  org.apache.spark.sql.execution.streaming.SinkFileStatus[] write ()  { throw new RuntimeException(); }
  /**
   * Writes a RDD partition to a single file without dynamic partitioning.
   * This gets called in the executor, and it uses a {@link OutputWriter} to write the data.
   * @param iterator (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.SinkFileStatus writePartitionToSingleFile (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iterator)  { throw new RuntimeException(); }
  /**
   * Writes a RDD partition to multiple dynamically partitioned files.
   * This gets called in the executor. It first sorts the data based on the partitioning columns
   * and then writes the data of each key to separate files using {@link OutputWriter}s.
   * @param iterator (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.execution.streaming.SinkFileStatus> writePartitionToPartitionedFiles (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iterator)  { throw new RuntimeException(); }
}
