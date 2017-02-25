package org.apache.spark.sql.sources;
public  class CommitFailureTestSource extends org.apache.spark.sql.sources.SimpleTextSource {
  public   CommitFailureTestSource ()  { throw new RuntimeException(); }
  /**
   * Prepares a write job and returns an
   * {@link org.apache.spark.sql.execution.datasources.OutputWriterFactory}.
   * Client side job preparation can
   * be put here.  For example, user defined output committer can be configured here
   * by setting the output committer class in the conf of spark.sql.sources.outputCommitterClass.
   * @param sparkSession (undocumented)
   * @param job (undocumented)
   * @param options (undocumented)
   * @param dataSchema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.OutputWriterFactory prepareWrite (org.apache.spark.sql.SparkSession sparkSession, org.apache.hadoop.mapreduce.Job job, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
}
