package org.apache.spark.sql.execution;
/**
 * The offset window frame calculates frames containing LEAD/LAG statements.
 * <p>
 * param:  target to write results to.
 * param:  expressions to shift a number of rows.
 * param:  inputSchema required for creating a projection.
 * param:  newMutableProjection function used to create the projection.
 * param:  offset by which rows get moved within a partition.
 */
 final class OffsetWindowFunctionFrame extends org.apache.spark.sql.execution.WindowFunctionFrame {
  public   OffsetWindowFunctionFrame (org.apache.spark.sql.catalyst.expressions.MutableRow target, int ordinal, org.apache.spark.sql.catalyst.expressions.Expression[] expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema, scala.Function2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.catalyst.expressions.MutableProjection> newMutableProjection, int offset)  { throw new RuntimeException(); }
  /** Create the projection used when the offset row DOES NOT exists. */
  public  void prepare (org.apache.spark.sql.execution.RowBuffer rows)  { throw new RuntimeException(); }
  public  void write (int index, org.apache.spark.sql.catalyst.InternalRow current)  { throw new RuntimeException(); }
}
