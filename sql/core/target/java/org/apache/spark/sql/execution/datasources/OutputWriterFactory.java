package org.apache.spark.sql.execution.datasources;
/**
 * ::Experimental::
 * A factory that produces {@link OutputWriter}s.  A new {@link OutputWriterFactory} is created on driver
 * side for each write job issued when writing to a {@link HadoopFsRelation}, and then gets serialized
 * to executor side to create actual {@link OutputWriter}s on the fly.
 * <p>
 * @since 1.4.0
 */
public abstract class OutputWriterFactory implements scala.Serializable {
  public   OutputWriterFactory ()  { throw new RuntimeException(); }
  /**
   * When writing to a {@link HadoopFsRelation}, this method gets called by each task on executor side
   * to instantiate new {@link OutputWriter}s.
   * <p>
   * @param path Path of the file to which this {@link OutputWriter} is supposed to write.  Note that
   *        this may not point to the final output file.  For example, <code>FileOutputFormat</code> writes to
   *        temporary directories and then merge written files back to the final destination.  In
   *        this case, <code>path</code> points to a temporary output file under the temporary directory.
   * @param dataSchema Schema of the rows to be written. Partition columns are not included in the
   *        schema if the relation being written is partitioned.
   * @param context The Hadoop MapReduce task context.
   * @since 1.4.0
   * @param bucketId (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.execution.datasources.OutputWriter newInstance (java.lang.String path, scala.Option<java.lang.Object> bucketId, org.apache.spark.sql.types.StructType dataSchema, org.apache.hadoop.mapreduce.TaskAttemptContext context)  ;
  /**
   * Returns a new instance of {@link OutputWriter} that will write data to the given path.
   * This method gets called by each task on executor to write {@link InternalRow}s to
   * format-specific files. Compared to the other <code>newInstance()</code>, this is a newer API that
   * passes only the path that the writer must write to. The writer must write to the exact path
   * and not modify it (do not add subdirectories, extensions, etc.). All other
   * file-format-specific information needed to create the writer must be passed
   * through the {@link OutputWriterFactory} implementation.
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.OutputWriter newWriter (java.lang.String path)  { throw new RuntimeException(); }
}
