package org.apache.spark.sql.streaming;
/**
 * :: Experimental ::
 * A class used to report information about the progress of a {@link StreamingQuery}.
 * <p>
 * param:  name Name of the query. This name is unique across all active queries.
 * param:  id Id of the query. This id is unique across
 *          all queries that have been started in the current process.
 * param:  timestamp Timestamp (ms) of when this query was generated.
 * param:  inputRate Current rate (rows/sec) at which data is being generated by all the sources.
 * param:  processingRate Current rate (rows/sec) at which the query is processing data from
 *                       all the sources.
 * param:  latency  Current average latency between the data being available in source and the sink
 *                   writing the corresponding output.
 * param:  sourceStatuses Current statuses of the sources.
 * param:  sinkStatus Current status of the sink.
 * param:  triggerDetails Low-level details of the currently active trigger (e.g. number of
 *                      rows processed in trigger, latency of intermediate steps, etc.).
 *                      If no trigger is active, then it will have details of the last completed
 *                      trigger.
 * @since 2.0.0
 */
public  class StreamingQueryStatus {
  static public  org.apache.spark.sql.streaming.StreamingQueryStatus apply (java.lang.String name, long id, long timestamp, double inputRate, double processingRate, scala.Option<java.lang.Object> latency, org.apache.spark.sql.streaming.SourceStatus[] sourceStatuses, org.apache.spark.sql.streaming.SinkStatus sinkStatus, scala.collection.immutable.Map<java.lang.String, java.lang.String> triggerDetails)  { throw new RuntimeException(); }
  static public  java.lang.String indent (scala.collection.Iterable<java.lang.String> strings)  { throw new RuntimeException(); }
  static public  java.lang.String indent (java.lang.String string)  { throw new RuntimeException(); }
  /** Create an instance of status for python testing */
  static public  org.apache.spark.sql.streaming.StreamingQueryStatus testStatus ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  long id ()  { throw new RuntimeException(); }
  public  long timestamp ()  { throw new RuntimeException(); }
  public  double inputRate ()  { throw new RuntimeException(); }
  public  double processingRate ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> latency ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.SourceStatus[] sourceStatuses ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.SinkStatus sinkStatus ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String> triggerDetails ()  { throw new RuntimeException(); }
  // not preceding
  private   StreamingQueryStatus (java.lang.String name, long id, long timestamp, double inputRate, double processingRate, scala.Option<java.lang.Object> latency, org.apache.spark.sql.streaming.SourceStatus[] sourceStatuses, org.apache.spark.sql.streaming.SinkStatus sinkStatus, java.util.Map<java.lang.String, java.lang.String> triggerDetails)  { throw new RuntimeException(); }
  /** The compact JSON representation of this status. */
  public  java.lang.String json ()  { throw new RuntimeException(); }
  /** The pretty (i.e. indented) JSON representation of this status. */
  public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
}
