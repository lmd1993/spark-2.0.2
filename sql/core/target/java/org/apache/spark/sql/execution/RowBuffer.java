package org.apache.spark.sql.execution;
/**
 * The interface of row buffer for a partition
 */
 abstract class RowBuffer {
  public   RowBuffer ()  { throw new RuntimeException(); }
  /** Number of rows. */
  public abstract  int size ()  ;
  /** Return next row in the buffer, null if no more left. */
  public abstract  org.apache.spark.sql.catalyst.InternalRow next ()  ;
  /** Skip the next `n` rows. */
  public abstract  void skip (int n)  ;
  /** Return a new RowBuffer that has the same rows. */
  public abstract  org.apache.spark.sql.execution.RowBuffer copy ()  ;
}
