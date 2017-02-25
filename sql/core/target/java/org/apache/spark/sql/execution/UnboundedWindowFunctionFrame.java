package org.apache.spark.sql.execution;
/**
 * The unbounded window frame calculates frames with the following SQL forms:
 * ... (No Frame Definition)
 * ... BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING
 * <p>
 * Its results are  the same for each and every row in the partition. This class can be seen as a
 * special case of a sliding window, but is optimized for the unbound case.
 * <p>
 * param:  target to write results to.
 * param:  processor to calculate the row values with.
 */
 final class UnboundedWindowFunctionFrame extends org.apache.spark.sql.execution.WindowFunctionFrame {
  public   UnboundedWindowFunctionFrame (org.apache.spark.sql.catalyst.expressions.MutableRow target, org.apache.spark.sql.execution.AggregateProcessor processor)  { throw new RuntimeException(); }
  /** Prepare the frame for calculating a new partition. Process all rows eagerly. */
  public  void prepare (org.apache.spark.sql.execution.RowBuffer rows)  { throw new RuntimeException(); }
  /** Write the frame columns for the current row to the given target row. */
  public  void write (int index, org.apache.spark.sql.catalyst.InternalRow current)  { throw new RuntimeException(); }
}
