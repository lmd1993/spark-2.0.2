package org.apache.spark.sql.execution.datasources.jdbc;
/**
 * An RDD representing a table in a database accessed via JDBC.  Both the
 * driver code and the workers must be able to access the database; the driver
 * needs to fetch the schema while the workers need to fetch the data.
 */
  class JDBCRDD extends org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> {
  public  class BooleanConversion$ extends org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion implements scala.Product, scala.Serializable {
    public   BooleanConversion$ ()  { throw new RuntimeException(); }
  }
  public  class DateConversion$ extends org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion implements scala.Product, scala.Serializable {
    public   DateConversion$ ()  { throw new RuntimeException(); }
  }
  public  class DecimalConversion extends org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion implements scala.Product, scala.Serializable {
    public  int precision ()  { throw new RuntimeException(); }
    public  int scale ()  { throw new RuntimeException(); }
    // not preceding
    public   DecimalConversion (int precision, int scale)  { throw new RuntimeException(); }
  }
  public  class DecimalConversion$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.DecimalConversion> implements scala.Serializable {
    public   DecimalConversion$ ()  { throw new RuntimeException(); }
  }
  public  class DoubleConversion$ extends org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion implements scala.Product, scala.Serializable {
    public   DoubleConversion$ ()  { throw new RuntimeException(); }
  }
  public  class FloatConversion$ extends org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion implements scala.Product, scala.Serializable {
    public   FloatConversion$ ()  { throw new RuntimeException(); }
  }
  public  class IntegerConversion$ extends org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion implements scala.Product, scala.Serializable {
    public   IntegerConversion$ ()  { throw new RuntimeException(); }
  }
  public  class LongConversion$ extends org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion implements scala.Product, scala.Serializable {
    public   LongConversion$ ()  { throw new RuntimeException(); }
  }
  public  class BinaryLongConversion$ extends org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion implements scala.Product, scala.Serializable {
    public   BinaryLongConversion$ ()  { throw new RuntimeException(); }
  }
  public  class StringConversion$ extends org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion implements scala.Product, scala.Serializable {
    public   StringConversion$ ()  { throw new RuntimeException(); }
  }
  public  class TimestampConversion$ extends org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion implements scala.Product, scala.Serializable {
    public   TimestampConversion$ ()  { throw new RuntimeException(); }
  }
  public  class BinaryConversion$ extends org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion implements scala.Product, scala.Serializable {
    public   BinaryConversion$ ()  { throw new RuntimeException(); }
  }
  public  class ArrayConversion extends org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion elementConversion ()  { throw new RuntimeException(); }
    // not preceding
    public   ArrayConversion (org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion elementConversion)  { throw new RuntimeException(); }
  }
  public  class ArrayConversion$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion, org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.ArrayConversion> implements scala.Serializable {
    public   ArrayConversion$ ()  { throw new RuntimeException(); }
  }
  public abstract class JDBCConversion {
    public   JDBCConversion ()  { throw new RuntimeException(); }
  }
  /**
   * Maps a JDBC type to a Catalyst type.  This function is called only when
   * the JdbcDialect class corresponding to your database driver returns null.
   * <p>
   * @param sqlType - A field of java.sql.Types
   * @return The Catalyst type corresponding to sqlType.
   * @param precision (undocumented)
   * @param scale (undocumented)
   * @param signed (undocumented)
   */
  static private  org.apache.spark.sql.types.DataType getCatalystType (int sqlType, int precision, int scale, boolean signed)  { throw new RuntimeException(); }
  /**
   * Takes a (schema, table) specification and returns the table's Catalyst
   * schema.
   * <p>
   * @param url - The JDBC url to fetch information from.
   * @param table - The table name of the desired table.  This may also be a
   *   SQL query wrapped in parentheses.
   * <p>
   * @return A StructType giving the table's Catalyst schema.
   * @throws SQLException if the table specification is garbage.
   * @throws SQLException if the table contains an unsupported type.
   * @param properties (undocumented)
   */
  static public  org.apache.spark.sql.types.StructType resolveTable (java.lang.String url, java.lang.String table, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Prune all but the specified columns from the specified Catalyst schema.
   * <p>
   * @param schema - The Catalyst schema of the master table
   * @param columns - The list of desired columns
   * <p>
   * @return A Catalyst schema corresponding to columns in the given order.
   */
  static private  org.apache.spark.sql.types.StructType pruneSchema (org.apache.spark.sql.types.StructType schema, java.lang.String[] columns)  { throw new RuntimeException(); }
  /**
   * Converts value to SQL expression.
   * @param value (undocumented)
   * @return (undocumented)
   */
  static private  Object compileValue (Object value)  { throw new RuntimeException(); }
  static private  java.lang.String escapeSql (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Turns a single Filter into a String representing a SQL expression.
   * Returns None for an unhandled filter.
   * @param f (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.String> compileFilter (org.apache.spark.sql.sources.Filter f)  { throw new RuntimeException(); }
  /**
   * Build and return JDBCRDD from the given information.
   * <p>
   * @param sc - Your SparkContext.
   * @param schema - The Catalyst schema of the underlying database table.
   * @param url - The JDBC url to connect to.
   * @param fqTable - The fully-qualified table name (or paren'd SQL query) to use.
   * @param requiredColumns - The names of the columns to SELECT.
   * @param filters - The filters to include in all WHERE clauses.
   * @param parts - An array of JDBCPartitions specifying partition ids and
   *    per-partition WHERE clauses.
   * <p>
   * @return An RDD representing "SELECT requiredColumns FROM fqTable".
   * @param properties (undocumented)
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> scanTable (org.apache.spark.SparkContext sc, org.apache.spark.sql.types.StructType schema, java.lang.String url, java.util.Properties properties, java.lang.String fqTable, java.lang.String[] requiredColumns, org.apache.spark.sql.sources.Filter[] filters, org.apache.spark.Partition[] parts)  { throw new RuntimeException(); }
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
  static   org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.Dependency<?>> getDependencies ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  static public  int id ()  { throw new RuntimeException(); }
  static public  java.lang.String name ()  { throw new RuntimeException(); }
  static public  void name_$eq (java.lang.String x$1)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> setName (java.lang.String _name)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> persist ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> cache ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> unpersist (boolean blocking)  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.StorageLevel getStorageLevel ()  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.Dependency<?>> dependencies ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.Partition[] partitions ()  { throw new RuntimeException(); }
  static public final  int getNumPartitions ()  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<java.lang.String> preferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  static public final  scala.collection.Iterator<T> iterator (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  static   scala.collection.Seq<org.apache.spark.rdd.RDD<?>> getNarrowAncestors ()  { throw new RuntimeException(); }
  static   scala.collection.Iterator<T> computeOrReadCheckpoint (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  static   scala.collection.Iterator<T> getOrCompute (org.apache.spark.Partition partition, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  static  <U extends java.lang.Object> U withScope (scala.Function0<U> body)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> map (scala.Function1<T, U> f, scala.reflect.ClassTag<U> evidence$3)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> flatMap (scala.Function1<T, scala.collection.TraversableOnce<U>> f, scala.reflect.ClassTag<U> evidence$4)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> filter (scala.Function1<T, java.lang.Object> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> distinct (int numPartitions, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> distinct ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> repartition (int numPartitions, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> coalesce (int numPartitions, boolean shuffle, scala.Option<org.apache.spark.rdd.PartitionCoalescer> partitionCoalescer, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> sample (boolean withReplacement, double fraction, long seed)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T>[] randomSplit (double[] weights, long seed)  { throw new RuntimeException(); }
  static   org.apache.spark.rdd.RDD<T> randomSampleWithRange (double lb, double ub, long seed)  { throw new RuntimeException(); }
  static public  java.lang.Object takeSample (boolean withReplacement, int num, long seed)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> union (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> $plus$plus (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<T> sortBy (scala.Function1<T, K> f, boolean ascending, int numPartitions, scala.math.Ordering<K> ord, scala.reflect.ClassTag<K> ctag)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> intersection (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> intersection (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner partitioner, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> intersection (org.apache.spark.rdd.RDD<T> other, int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.Object> glom ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<T, U>> cartesian (org.apache.spark.rdd.RDD<U> other, scala.reflect.ClassTag<U> evidence$5)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<T>>> groupBy (scala.Function1<T, K> f, scala.reflect.ClassTag<K> kt)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<T>>> groupBy (scala.Function1<T, K> f, int numPartitions, scala.reflect.ClassTag<K> kt)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<T>>> groupBy (scala.Function1<T, K> f, org.apache.spark.Partitioner p, scala.reflect.ClassTag<K> kt, scala.math.Ordering<K> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.String> pipe (java.lang.String command)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.String> pipe (java.lang.String command, scala.collection.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.String> pipe (scala.collection.Seq<java.lang.String> command, scala.collection.Map<java.lang.String, java.lang.String> env, scala.Function1<scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> printPipeContext, scala.Function2<T, scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> printRDDElement, boolean separateWorkingDir, int bufferSize, java.lang.String encoding)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitions (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$6)  { throw new RuntimeException(); }
  static  <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsInternal (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$7)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsWithIndex (scala.Function2<java.lang.Object, scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$8)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<T, U>> zip (org.apache.spark.rdd.RDD<U> other, scala.reflect.ClassTag<U> evidence$9)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, boolean preservesPartitioning, scala.Function2<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$10, scala.reflect.ClassTag<V> evidence$11)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, scala.Function2<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$12, scala.reflect.ClassTag<V> evidence$13)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, C extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, boolean preservesPartitioning, scala.Function3<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$14, scala.reflect.ClassTag<C> evidence$15, scala.reflect.ClassTag<V> evidence$16)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, C extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, scala.Function3<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$17, scala.reflect.ClassTag<C> evidence$18, scala.reflect.ClassTag<V> evidence$19)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, org.apache.spark.rdd.RDD<D> rdd4, boolean preservesPartitioning, scala.Function4<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<D>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$20, scala.reflect.ClassTag<C> evidence$21, scala.reflect.ClassTag<D> evidence$22, scala.reflect.ClassTag<V> evidence$23)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, org.apache.spark.rdd.RDD<D> rdd4, scala.Function4<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<D>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$24, scala.reflect.ClassTag<C> evidence$25, scala.reflect.ClassTag<D> evidence$26, scala.reflect.ClassTag<V> evidence$27)  { throw new RuntimeException(); }
  static public  void foreach (scala.Function1<T, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void foreachPartition (scala.Function1<scala.collection.Iterator<T>, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  java.lang.Object collect ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<T> toLocalIterator ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> collect (scala.PartialFunction<T, U> f, scala.reflect.ClassTag<U> evidence$28)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> subtract (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> subtract (org.apache.spark.rdd.RDD<T> other, int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> subtract (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner p, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  T reduce (scala.Function2<T, T, T> f)  { throw new RuntimeException(); }
  static public  T treeReduce (scala.Function2<T, T, T> f, int depth)  { throw new RuntimeException(); }
  static public  T fold (T zeroValue, scala.Function2<T, T, T> op)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> U aggregate (U zeroValue, scala.Function2<U, T, U> seqOp, scala.Function2<U, U, U> combOp, scala.reflect.ClassTag<U> evidence$29)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> U treeAggregate (U zeroValue, scala.Function2<U, T, U> seqOp, scala.Function2<U, U, U> combOp, int depth, scala.reflect.ClassTag<U> evidence$30)  { throw new RuntimeException(); }
  static public  long count ()  { throw new RuntimeException(); }
  static public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> countApprox (long timeout, double confidence)  { throw new RuntimeException(); }
  static public  scala.collection.Map<T, java.lang.Object> countByValue (scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.partial.PartialResult<scala.collection.Map<T, org.apache.spark.partial.BoundedDouble>> countByValueApprox (long timeout, double confidence, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  long countApproxDistinct (int p, int sp)  { throw new RuntimeException(); }
  static public  long countApproxDistinct (double relativeSD)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<scala.Tuple2<T, java.lang.Object>> zipWithIndex ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<scala.Tuple2<T, java.lang.Object>> zipWithUniqueId ()  { throw new RuntimeException(); }
  static public  java.lang.Object take (int num)  { throw new RuntimeException(); }
  static public  T first ()  { throw new RuntimeException(); }
  static public  java.lang.Object top (int num, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  java.lang.Object takeOrdered (int num, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  T max (scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  T min (scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  boolean isEmpty ()  { throw new RuntimeException(); }
  static public  void saveAsTextFile (java.lang.String path)  { throw new RuntimeException(); }
  static public  void saveAsTextFile (java.lang.String path, java.lang.Class<? extends org.apache.hadoop.io.compress.CompressionCodec> codec)  { throw new RuntimeException(); }
  static public  void saveAsObjectFile (java.lang.String path)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, T>> keyBy (scala.Function1<T, K> f)  { throw new RuntimeException(); }
  static   java.lang.Object[] collectPartitions ()  { throw new RuntimeException(); }
  static public  void checkpoint ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> localCheckpoint ()  { throw new RuntimeException(); }
  static public  boolean isCheckpointed ()  { throw new RuntimeException(); }
  static   boolean isCheckpointedAndMaterialized ()  { throw new RuntimeException(); }
  static   boolean isLocallyCheckpointed ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> getCheckpointFile ()  { throw new RuntimeException(); }
  static   org.apache.spark.util.CallSite creationSite ()  { throw new RuntimeException(); }
  static   scala.Option<org.apache.spark.rdd.RDDOperationScope> scope ()  { throw new RuntimeException(); }
  static   java.lang.String getCreationSite ()  { throw new RuntimeException(); }
  static   scala.reflect.ClassTag<T> elementClassTag ()  { throw new RuntimeException(); }
  static   scala.Option<org.apache.spark.rdd.RDDCheckpointData<T>> checkpointData ()  { throw new RuntimeException(); }
  static   void checkpointData_$eq (scala.Option<org.apache.spark.rdd.RDDCheckpointData<T>> x$1)  { throw new RuntimeException(); }
  static protected <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> firstParent (scala.reflect.ClassTag<U> evidence$31)  { throw new RuntimeException(); }
  static protected <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> parent (int j, scala.reflect.ClassTag<U> evidence$32)  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkContext context ()  { throw new RuntimeException(); }
  static   org.apache.spark.rdd.RDD<T> retag (java.lang.Class<T> cls)  { throw new RuntimeException(); }
  static   org.apache.spark.rdd.RDD<T> retag (scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
  static   void doCheckpoint ()  { throw new RuntimeException(); }
  static   void markCheckpointed ()  { throw new RuntimeException(); }
  static protected  void clearDependencies ()  { throw new RuntimeException(); }
  static public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<T> toJavaRDD ()  { throw new RuntimeException(); }
  static public  long sample$default$3 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitionsWithIndex$default$2 ()  { throw new RuntimeException(); }
  static public  boolean unpersist$default$1 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> distinct$default$2 (int numPartitions)  { throw new RuntimeException(); }
  static public  boolean coalesce$default$2 ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.rdd.PartitionCoalescer> coalesce$default$3 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> coalesce$default$4 (int numPartitions, boolean shuffle, scala.Option<org.apache.spark.rdd.PartitionCoalescer> partitionCoalescer)  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> repartition$default$2 (int numPartitions)  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> subtract$default$3 (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner p)  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> intersection$default$3 (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  static public  long randomSplit$default$2 ()  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> boolean sortBy$default$2 ()  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> int sortBy$default$3 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitions$default$2 ()  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> scala.runtime.Null$ groupBy$default$4 (scala.Function1<T, K> f, org.apache.spark.Partitioner p)  { throw new RuntimeException(); }
  static public  scala.collection.Map<java.lang.String, java.lang.String> pipe$default$2 ()  { throw new RuntimeException(); }
  static public  scala.Function1<scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> pipe$default$3 ()  { throw new RuntimeException(); }
  static public  scala.Function2<T, scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> pipe$default$4 ()  { throw new RuntimeException(); }
  static public  boolean pipe$default$5 ()  { throw new RuntimeException(); }
  static public  int pipe$default$6 ()  { throw new RuntimeException(); }
  static public  java.lang.String pipe$default$7 ()  { throw new RuntimeException(); }
  static public  int treeReduce$default$2 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> int treeAggregate$default$4 (U zeroValue)  { throw new RuntimeException(); }
  static public  double countApprox$default$2 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> countByValue$default$1 ()  { throw new RuntimeException(); }
  static public  double countByValueApprox$default$2 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> countByValueApprox$default$3 (long timeout, double confidence)  { throw new RuntimeException(); }
  static public  long takeSample$default$3 ()  { throw new RuntimeException(); }
  static public  double countApproxDistinct$default$1 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitionsInternal$default$2 ()  { throw new RuntimeException(); }
  public   JDBCRDD (org.apache.spark.SparkContext sc, scala.Function0<java.sql.Connection> getConnection, org.apache.spark.sql.types.StructType schema, java.lang.String fqTable, java.lang.String[] columns, org.apache.spark.sql.sources.Filter[] filters, org.apache.spark.Partition[] partitions, java.lang.String url, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Retrieve the list of partitions corresponding to this RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  /**
   * <code>columns</code>, but as a String suitable for injection into a SQL query.
   * @return (undocumented)
   */
  private  java.lang.String columnList ()  { throw new RuntimeException(); }
  /**
   * <code>filters</code>, but as a WHERE clause suitable for injection into a SQL query.
   * @return (undocumented)
   */
  private  java.lang.String filterWhereClause ()  { throw new RuntimeException(); }
  /**
   * A WHERE clause representing both <code>filters</code>, if any, and the current partition.
   * @param part (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String getWhereClause (org.apache.spark.sql.execution.datasources.jdbc.JDBCPartition part)  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.BooleanConversion$ BooleanConversion ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.DateConversion$ DateConversion ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.DoubleConversion$ DoubleConversion ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.FloatConversion$ FloatConversion ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.IntegerConversion$ IntegerConversion ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.LongConversion$ LongConversion ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.BinaryLongConversion$ BinaryLongConversion ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.StringConversion$ StringConversion ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.TimestampConversion$ TimestampConversion ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.BinaryConversion$ BinaryConversion ()  { throw new RuntimeException(); }
  /**
   * Maps a StructType to a type tag list.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion[] getConversions (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.jdbc.JDBCRDD.JDBCConversion getConversions (org.apache.spark.sql.types.DataType dt, org.apache.spark.sql.types.Metadata metadata)  { throw new RuntimeException(); }
  /**
   * Runs the SQL query against the JDBC driver.
   * <p>
   * @param thePart (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> compute (org.apache.spark.Partition thePart, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> Object nullSafeConvert (T input, scala.Function1<T, java.lang.Object> f)  { throw new RuntimeException(); }
}
