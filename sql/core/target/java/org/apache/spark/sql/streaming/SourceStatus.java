package org.apache.spark.sql.streaming;
/**
 * :: Experimental ::
 * Status and metrics of a streaming Source.
 * <p>
 * param:  description Description of the source corresponding to this status.
 * param:  offsetDesc Description of the current offset if known.
 * param:  inputRate Current rate (rows/sec) at which data is being generated by the source.
 * param:  processingRate Current rate (rows/sec) at which the query is processing data from
 *                       the source.
 * param:  triggerDetails Low-level details of the currently active trigger (e.g. number of
 *                      rows processed in trigger, latency of intermediate steps, etc.).
 *                      If no trigger is active, then it will have details of the last completed
 *                      trigger.
 * @since 2.0.0
 */
public  class SourceStatus {
  static public  org.apache.spark.sql.streaming.SourceStatus apply (java.lang.String desc, java.lang.String offsetDesc, double inputRate, double processingRate, scala.collection.immutable.Map<java.lang.String, java.lang.String> triggerDetails)  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
  public  java.lang.String offsetDesc ()  { throw new RuntimeException(); }
  public  double inputRate ()  { throw new RuntimeException(); }
  public  double processingRate ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String> triggerDetails ()  { throw new RuntimeException(); }
  // not preceding
  private   SourceStatus (java.lang.String description, java.lang.String offsetDesc, double inputRate, double processingRate, java.util.Map<java.lang.String, java.lang.String> triggerDetails)  { throw new RuntimeException(); }
  /** The compact JSON representation of this status. */
  public  java.lang.String json ()  { throw new RuntimeException(); }
  /** The pretty (i.e. indented) JSON representation of this status. */
  public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
    java.lang.String prettyString ()  { throw new RuntimeException(); }
}
