package org.apache.spark.sql.execution.stat;
public  class StatFunctions {
  /**
   * Helper class to compute approximate quantile summary.
   * This implementation is based on the algorithm proposed in the paper:
   * "Space-efficient Online Computation of Quantile Summaries" by Greenwald, Michael
   * and Khanna, Sanjeev. (http://dx.doi.org/10.1145/375663.375670)
   * <p>
   * In order to optimize for speed, it maintains an internal buffer of the last seen samples,
   * and only inserts them after crossing a certain size threshold. This guarantees a near-constant
   * runtime complexity compared to the original algorithm.
   * <p>
   * param:  compressThreshold the compression threshold.
   *   After the internal buffer of statistics crosses this size, it attempts to compress the
   *   statistics together.
   * param:  relativeError the target relative error.
   *   It is uniform across the complete range of values.
   * param:  sampled a buffer of quantile statistics.
   *   See the G-K article for more details.
   * param:  count the count of all the elements *inserted in the sampled buffer*
   *              (excluding the head buffer)
   * param:  headSampled a buffer of latest samples seen so far
   */
  static public  class QuantileSummaries implements scala.Serializable {
    public  int compressThreshold ()  { throw new RuntimeException(); }
    public  double relativeError ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries.Stats[] sampled ()  { throw new RuntimeException(); }
      long count ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<java.lang.Object> headSampled ()  { throw new RuntimeException(); }
    // not preceding
    public   QuantileSummaries (int compressThreshold, double relativeError, org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries.Stats[] sampled, long count, scala.collection.mutable.ArrayBuffer<java.lang.Object> headSampled)  { throw new RuntimeException(); }
    /**
     * Returns a summary with the given observation inserted into the summary.
     * This method may either modify in place the current summary (and return the same summary,
     * modified in place), or it may create a new summary from scratch it necessary.
     * @param x the new observation to insert into the summary
     * @return (undocumented)
     */
    public  org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries insert (double x)  { throw new RuntimeException(); }
    /**
     * Inserts an array of (unsorted samples) in a batch, sorting the array first to traverse
     * the summary statistics in a single batch.
     * <p>
     * This method does not modify the current object and returns if necessary a new copy.
     * <p>
     * @return a new quantile summary object.
     */
    private  org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries withHeadBufferInserted ()  { throw new RuntimeException(); }
    /**
     * Returns a new summary that compresses the summary statistics and the head buffer.
     * <p>
     * This implements the COMPRESS function of the GK algorithm. It does not modify the object.
     * <p>
     * @return a new summary object with compressed statistics
     */
    public  org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries compress ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries shallowCopy ()  { throw new RuntimeException(); }
    /**
     * Merges two (compressed) summaries together.
     * <p>
     * Returns a new summary.
     * @param other (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries merge (org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries other)  { throw new RuntimeException(); }
    /**
     * Runs a query for a given quantile.
     * The result follows the approximation guarantees detailed above.
     * The query can only be run on a compressed summary: you need to call compress() before using
     * it.
     * <p>
     * @param quantile the target quantile
     * @return
     */
    public  double query (double quantile)  { throw new RuntimeException(); }
  }
  static public  class QuantileSummaries$ implements scala.Serializable {
    /**
     * Statistics from the Greenwald-Khanna paper.
     * param:  value the sampled value
     * param:  g the minimum rank jump from the previous value's minimum rank
     * param:  delta the maximum span of the rank.
     */
    static public  class Stats implements scala.Product, scala.Serializable {
      public  double value ()  { throw new RuntimeException(); }
      public  int g ()  { throw new RuntimeException(); }
      public  int delta ()  { throw new RuntimeException(); }
      // not preceding
      public   Stats (double value, int g, int delta)  { throw new RuntimeException(); }
    }
    static public  class Stats$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries.Stats> implements scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final Stats$ MODULE$ = null;
      public   Stats$ ()  { throw new RuntimeException(); }
    }
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final QuantileSummaries$ MODULE$ = null;
    public   QuantileSummaries$ ()  { throw new RuntimeException(); }
    /**
     * The default value for the compression threshold.
     * @return (undocumented)
     */
    public  int defaultCompressThreshold ()  { throw new RuntimeException(); }
    /**
     * The size of the head buffer.
     * @return (undocumented)
     */
    public  int defaultHeadSize ()  { throw new RuntimeException(); }
    /**
     * The default value for the relative error (1%).
     * With this value, the best extreme percentiles that can be approximated are 1% and 99%.
     * @return (undocumented)
     */
    public  double defaultRelativeError ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries.Stats[] compressImmut (scala.collection.IndexedSeq<org.apache.spark.sql.execution.stat.StatFunctions.QuantileSummaries.Stats> currentSamples, double mergeThreshold)  { throw new RuntimeException(); }
  }
  /** Helper class to simplify tracking and merging counts. */
  static private  class CovarianceCounter implements scala.Serializable {
    public   CovarianceCounter ()  { throw new RuntimeException(); }
    public  double xAvg ()  { throw new RuntimeException(); }
    public  double yAvg ()  { throw new RuntimeException(); }
    public  double Ck ()  { throw new RuntimeException(); }
    public  double MkX ()  { throw new RuntimeException(); }
    public  double MkY ()  { throw new RuntimeException(); }
    public  long count ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.stat.StatFunctions.CovarianceCounter add (double x, double y)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.stat.StatFunctions.CovarianceCounter merge (org.apache.spark.sql.execution.stat.StatFunctions.CovarianceCounter other)  { throw new RuntimeException(); }
    public  double cov ()  { throw new RuntimeException(); }
  }
  /**
   * Calculates the approximate quantiles of multiple numerical columns of a DataFrame in one pass.
   * <p>
   * The result of this algorithm has the following deterministic bound:
   * If the DataFrame has N elements and if we request the quantile at probability <code>p</code> up to error
   * <code>err</code>, then the algorithm will return a sample <code>x</code> from the DataFrame so that the *exact* rank
   * of <code>x</code> is close to (p * N).
   * More precisely,
   * <p>
   *   floor((p - err) * N) <= rank(x) <= ceil((p + err) * N).
   * <p>
   * This method implements a variation of the Greenwald-Khanna algorithm (with some speed
   * optimizations).
   * The algorithm was first present in {@link http://dx.doi.org/10.1145/375663.375670 Space-efficient
   * Online Computation of Quantile Summaries} by Greenwald and Khanna.
   * <p>
   * @param df the dataframe
   * @param cols numerical columns of the dataframe
   * @param probabilities a list of quantile probabilities
   *   Each number must belong to [0, 1].
   *   For example 0 is the minimum, 0.5 is the median, 1 is the maximum.
   * @param relativeError The relative target precision to achieve (>= 0).
   *   If set to zero, the exact quantiles are computed, which could be very expensive.
   *   Note that values greater than 1 are accepted but give the same result as 1.
   * <p>
   * @return for each column, returns the requested approximations
   */
  static public  scala.collection.Seq<scala.collection.Seq<java.lang.Object>> multipleApproxQuantiles (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<java.lang.String> cols, scala.collection.Seq<java.lang.Object> probabilities, double relativeError)  { throw new RuntimeException(); }
  /** Calculate the Pearson Correlation Coefficient for the given columns */
  static public  double pearsonCorrelation (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<java.lang.String> cols)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.execution.stat.StatFunctions.CovarianceCounter collectStatisticalData (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<java.lang.String> cols, java.lang.String functionName)  { throw new RuntimeException(); }
  /**
   * Calculate the covariance of two numerical columns of a DataFrame.
   * @param df The DataFrame
   * @param cols the column names
   * @return the covariance of the two columns.
   */
  static public  double calculateCov (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<java.lang.String> cols)  { throw new RuntimeException(); }
  /** Generate a table of frequencies for the elements of two columns. */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> crossTabulate (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String col1, java.lang.String col2)  { throw new RuntimeException(); }
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
}
