package org.apache.spark.sql.streaming;
/**
 * :: Experimental ::
 * Status and metrics of a streaming sink.
 * <p>
 * param:  description Description of the source corresponding to this status.
 * param:  offsetDesc Description of the current offsets up to which data has been written
 *                   by the sink.
 * @since 2.0.0
 */
public  class SinkStatus {
  static public  org.apache.spark.sql.streaming.SinkStatus apply (java.lang.String desc, java.lang.String offsetDesc)  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
  public  java.lang.String offsetDesc ()  { throw new RuntimeException(); }
  // not preceding
  private   SinkStatus (java.lang.String description, java.lang.String offsetDesc)  { throw new RuntimeException(); }
  /** The compact JSON representation of this status. */
  public  java.lang.String json ()  { throw new RuntimeException(); }
  /** The pretty (i.e. indented) JSON representation of this status. */
  public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
    java.lang.String prettyString ()  { throw new RuntimeException(); }
}
