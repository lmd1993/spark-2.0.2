package org.apache.spark.sql.execution.datasources.parquet;
/**
 * A factory for generating OutputWriters for writing parquet files. This implemented is different
 * from the {@link ParquetOutputWriter} as this does not use any {@link OutputCommitter}. It simply
 * writes the data to the path used to generate the output writer. Callers of this factory
 * has to ensure which files are to be considered as committed.
 */
  class ParquetOutputWriterFactory extends org.apache.spark.sql.execution.datasources.OutputWriterFactory {
  public   ParquetOutputWriterFactory (org.apache.spark.sql.internal.SQLConf sqlConf, org.apache.spark.sql.types.StructType dataSchema, org.apache.hadoop.conf.Configuration hadoopConf, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  private  org.apache.spark.util.SerializableConfiguration serializableConf ()  { throw new RuntimeException(); }
  /**
   * Returns a {@link OutputWriter} that writes data to the give path without using
   * {@link OutputCommitter}.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.OutputWriter newWriter (java.lang.String path)  { throw new RuntimeException(); }
  /** Create a {@link ParquetRecordWriter} that writes the given path without using OutputCommitter */
  private  org.apache.hadoop.mapreduce.RecordWriter<java.lang.Void, org.apache.spark.sql.catalyst.InternalRow> createNoCommitterRecordWriter (java.lang.String path, org.apache.hadoop.mapreduce.TaskAttemptContext hadoopAttemptContext)  { throw new RuntimeException(); }
  /** Disable the use of the older API. */
  public  org.apache.spark.sql.execution.datasources.OutputWriter newInstance (java.lang.String path, scala.Option<java.lang.Object> bucketId, org.apache.spark.sql.types.StructType dataSchema, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
}
