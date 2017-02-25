package org.apache.spark.sql.execution.streaming;
public  class CompositeOffset$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CompositeOffset$ MODULE$ = null;
  public   CompositeOffset$ ()  { throw new RuntimeException(); }
  /**
   * Returns a {@link CompositeOffset} with a variable sequence of offsets.
   * <code>nulls</code> in the sequence are converted to <code>None</code>s.
   * @param offsets (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.CompositeOffset fill (scala.collection.Seq<org.apache.spark.sql.execution.streaming.Offset> offsets)  { throw new RuntimeException(); }
}
