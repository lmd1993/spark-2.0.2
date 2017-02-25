package org.apache.spark.sql.execution.streaming;
/**
 * Class that manages all the metrics related to a StreamingQuery. It does the following.
 * - Calculates metrics (rates, latencies, etc.) based on information reported by StreamExecution.
 * - Allows the current metric values to be queried
 * - Serves some of the metrics through Codahale/DropWizard metrics
 * <p>
 * param:  sources Unique set of sources in a query
 * param:  triggerClock Clock used for triggering in StreamExecution
 * param:  codahaleSourceName Root name for all the Codahale metrics
 */
public  class StreamMetrics implements org.apache.spark.metrics.source.Source, org.apache.spark.internal.Logging {
  /** Simple utility class to calculate rate while avoiding DivideByZero */
  static public  class RateCalculator {
    public   RateCalculator ()  { throw new RuntimeException(); }
    private  scala.Option<java.lang.Object> rate ()  { throw new RuntimeException(); }
    public  void update (long numRows, long timeGapMs)  { throw new RuntimeException(); }
    public  double currentRate ()  { throw new RuntimeException(); }
    public  void stop ()  { throw new RuntimeException(); }
  }
  static public  java.lang.String TRIGGER_ID ()  { throw new RuntimeException(); }
  static public  java.lang.String IS_TRIGGER_ACTIVE ()  { throw new RuntimeException(); }
  static public  java.lang.String IS_DATA_PRESENT_IN_TRIGGER ()  { throw new RuntimeException(); }
  static public  java.lang.String STATUS_MESSAGE ()  { throw new RuntimeException(); }
  static public  java.lang.String START_TIMESTAMP ()  { throw new RuntimeException(); }
  static public  java.lang.String GET_OFFSET_TIMESTAMP ()  { throw new RuntimeException(); }
  static public  java.lang.String GET_BATCH_TIMESTAMP ()  { throw new RuntimeException(); }
  static public  java.lang.String FINISH_TIMESTAMP ()  { throw new RuntimeException(); }
  static public  java.lang.String GET_OFFSET_LATENCY ()  { throw new RuntimeException(); }
  static public  java.lang.String GET_BATCH_LATENCY ()  { throw new RuntimeException(); }
  static public  java.lang.String OFFSET_WAL_WRITE_LATENCY ()  { throw new RuntimeException(); }
  static public  java.lang.String OPTIMIZER_LATENCY ()  { throw new RuntimeException(); }
  static public  java.lang.String TRIGGER_LATENCY ()  { throw new RuntimeException(); }
  static public  java.lang.String SOURCE_GET_OFFSET_LATENCY ()  { throw new RuntimeException(); }
  static public  java.lang.String SOURCE_GET_BATCH_LATENCY ()  { throw new RuntimeException(); }
  static public  java.lang.String NUM_INPUT_ROWS ()  { throw new RuntimeException(); }
  static public  java.lang.String NUM_SOURCE_INPUT_ROWS ()  { throw new RuntimeException(); }
  static public  java.lang.String NUM_TOTAL_STATE_ROWS (int aggId)  { throw new RuntimeException(); }
  static public  java.lang.String NUM_UPDATED_STATE_ROWS (int aggId)  { throw new RuntimeException(); }
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
  public   StreamMetrics (scala.collection.immutable.Set<org.apache.spark.sql.execution.streaming.Source> sources, org.apache.spark.util.Clock triggerClock, java.lang.String codahaleSourceName)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> triggerDetails ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.sql.execution.streaming.Source, scala.collection.mutable.HashMap<java.lang.String, java.lang.String>> sourceTriggerDetails ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.sql.execution.streaming.Source, org.apache.spark.sql.execution.streaming.StreamMetrics.RateCalculator> inputRates ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.sql.execution.streaming.Source, org.apache.spark.sql.execution.streaming.StreamMetrics.RateCalculator> processingRates ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.sql.execution.streaming.Source, java.lang.Object> numInputRows ()  { throw new RuntimeException(); }
  private  long currentTriggerStartTimestamp ()  { throw new RuntimeException(); }
  private  long previousTriggerStartTimestamp ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> latency ()  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  public  void reportTriggerStarted (long triggerId)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> void reportTriggerDetail (java.lang.String key, T value)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> void reportSourceTriggerDetail (org.apache.spark.sql.execution.streaming.Source source, java.lang.String key, T value)  { throw new RuntimeException(); }
  public  void reportNumInputRows (scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.Source, java.lang.Object> inputRows)  { throw new RuntimeException(); }
  public  void reportTriggerFinished ()  { throw new RuntimeException(); }
  public  double currentInputRate ()  { throw new RuntimeException(); }
  public  double currentSourceInputRate (org.apache.spark.sql.execution.streaming.Source source)  { throw new RuntimeException(); }
  public  double currentProcessingRate ()  { throw new RuntimeException(); }
  public  double currentSourceProcessingRate (org.apache.spark.sql.execution.streaming.Source source)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> currentLatency ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> currentTriggerDetails ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> currentSourceTriggerDetails (org.apache.spark.sql.execution.streaming.Source source)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> void registerGauge (java.lang.String name, scala.Function0<T> f, scala.math.Numeric<T> num)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
