package org.apache.spark.sql.execution;
/**
 * The sliding window frame calculates frames with the following SQL form:
 * ... BETWEEN 1 PRECEDING AND 1 FOLLOWING
 * <p>
 * param:  target to write results to.
 * param:  processor to calculate the row values with.
 * param:  lbound comparator used to identify the lower bound of an output row.
 * param:  ubound comparator used to identify the upper bound of an output row.
 */
 final class SlidingWindowFunctionFrame extends org.apache.spark.sql.execution.WindowFunctionFrame {
  public   SlidingWindowFunctionFrame (org.apache.spark.sql.catalyst.expressions.MutableRow target, org.apache.spark.sql.execution.AggregateProcessor processor, org.apache.spark.sql.execution.BoundOrdering lbound, org.apache.spark.sql.execution.BoundOrdering ubound)  { throw new RuntimeException(); }
  /** Prepare the frame for calculating a new partition. Reset all variables. */
  public  void prepare (org.apache.spark.sql.execution.RowBuffer rows)  { throw new RuntimeException(); }
  /** Write the frame columns for the current row to the given target row. */
  public  void write (int index, org.apache.spark.sql.catalyst.InternalRow current)  { throw new RuntimeException(); }
}
