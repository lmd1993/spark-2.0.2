package org.apache.spark.sql.execution.streaming;
/**
 * An ordered collection of offsets, used to track the progress of processing data from one or more
 * {@link Source}s that are present in a streaming query. This is similar to simplified, single-instance
 * vector clock that must progress linearly forward.
 */
public  class CompositeOffset implements org.apache.spark.sql.execution.streaming.Offset, scala.Product, scala.Serializable {
  /**
   * Returns a {@link CompositeOffset} with a variable sequence of offsets.
   * <code>nulls</code> in the sequence are converted to <code>None</code>s.
   * @param offsets (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.streaming.CompositeOffset fill (scala.collection.Seq<org.apache.spark.sql.execution.streaming.Offset> offsets)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Option<org.apache.spark.sql.execution.streaming.Offset>> offsets ()  { throw new RuntimeException(); }
  // not preceding
  public   CompositeOffset (scala.collection.Seq<scala.Option<org.apache.spark.sql.execution.streaming.Offset>> offsets)  { throw new RuntimeException(); }
  /**
   * Unpacks an offset into {@link StreamProgress} by associating each offset with the order list of
   * sources.
   * <p>
   * This method is typically used to associate a serialized offset with actual sources (which
   * cannot be serialized).
   * @param sources (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.StreamProgress toStreamProgress (scala.collection.Seq<org.apache.spark.sql.execution.streaming.Source> sources)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
