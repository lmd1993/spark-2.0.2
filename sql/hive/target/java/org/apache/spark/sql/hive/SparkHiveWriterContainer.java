package org.apache.spark.sql.hive;
/**
 * Internal helper class that saves an RDD using a Hive OutputFormat.
 * It is based on {@link SparkHadoopWriter}.
 */
  class SparkHiveWriterContainer implements org.apache.spark.internal.Logging, org.apache.spark.sql.hive.HiveInspectors, scala.Serializable {
  static public  org.apache.hadoop.fs.Path createPathFromString (java.lang.String path, org.apache.hadoop.mapred.JobConf conf)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.sql.types.DataType javaClassToDataType (java.lang.Class<?> clz)  { throw new RuntimeException(); }
  static public  Object unwrap (Object data, org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector oi)  { throw new RuntimeException(); }
  static protected  scala.Function1<java.lang.Object, java.lang.Object> wrapperFor (org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector oi, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  scala.Function3<java.lang.Object, org.apache.spark.sql.catalyst.expressions.MutableRow, java.lang.Object, scala.runtime.BoxedUnit> unwrapperFor (org.apache.hadoop.hive.serde2.objectinspector.StructField field)  { throw new RuntimeException(); }
  static public  java.lang.Object wrap (Object a, org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector oi, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Object[] wrap (org.apache.spark.sql.catalyst.InternalRow row, scala.collection.Seq<org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector> inspectors, java.lang.Object[] cache, org.apache.spark.sql.types.DataType[] dataTypes)  { throw new RuntimeException(); }
  static public  java.lang.Object[] wrap (scala.collection.Seq<java.lang.Object> row, scala.collection.Seq<org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector> inspectors, java.lang.Object[] cache, org.apache.spark.sql.types.DataType[] dataTypes)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector toInspector (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector toInspector (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DataType inspectorToDataType (org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector inspector)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.hive.HiveInspectors.typeInfoConversions typeInfoConversions (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  private  org.apache.hadoop.mapred.JobConf jobConf ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkHiveWriterContainer (org.apache.hadoop.mapred.JobConf jobConf, org.apache.spark.sql.hive.HiveShim.ShimFileSinkDesc fileSinkConf, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema, org.apache.spark.sql.hive.MetastoreRelation table)  { throw new RuntimeException(); }
  private  java.util.Date now ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.plan.TableDesc tableDesc ()  { throw new RuntimeException(); }
  protected  org.apache.spark.util.SerializableJobConf conf ()  { throw new RuntimeException(); }
  private  int jobID ()  { throw new RuntimeException(); }
  private  int splitID ()  { throw new RuntimeException(); }
  private  int attemptID ()  { throw new RuntimeException(); }
  private  org.apache.spark.SerializableWritable<org.apache.hadoop.mapred.JobID> jID ()  { throw new RuntimeException(); }
  private  org.apache.spark.SerializableWritable<org.apache.hadoop.mapred.TaskAttemptID> taID ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.exec.FileSinkOperator.RecordWriter writer ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.mapred.OutputCommitter committer ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.mapred.JobContextImpl jobContext ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.mapred.TaskAttemptContextImpl taskContext ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.io.HiveOutputFormat<java.lang.Object, org.apache.hadoop.io.Writable> outputFormat ()  { throw new RuntimeException(); }
  public  void driverSideSetup ()  { throw new RuntimeException(); }
  public  void executorSideSetup (int jobId, int splitId, int attemptId)  { throw new RuntimeException(); }
  protected  java.lang.String getOutputName ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void commitJob ()  { throw new RuntimeException(); }
  protected  void initWriters ()  { throw new RuntimeException(); }
  protected  void commit ()  { throw new RuntimeException(); }
  public  void abortTask ()  { throw new RuntimeException(); }
  private  void setIDs (int jobId, int splitId, int attemptId)  { throw new RuntimeException(); }
  private  void setConfParams ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.serde2.Serializer newSerializer (org.apache.hadoop.hive.ql.plan.TableDesc tableDesc)  { throw new RuntimeException(); }
  protected  scala.Tuple6<org.apache.hadoop.hive.serde2.Serializer, org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector, org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector[], scala.collection.Seq<org.apache.spark.sql.types.DataType>, scala.Function1<java.lang.Object, java.lang.Object>[], java.lang.Object[]> prepareForWrite ()  { throw new RuntimeException(); }
  public  void writeToFile (org.apache.spark.TaskContext context, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iterator)  { throw new RuntimeException(); }
}
