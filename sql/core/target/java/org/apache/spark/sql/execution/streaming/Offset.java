package org.apache.spark.sql.execution.streaming;
/**
 * An offset is a monotonically increasing metric used to track progress in the computation of a
 * stream. Since offsets are retrieved from a {@link Source} by a single thread, we know the global
 * ordering of two {@link Offset} instances.  We do assume that if two offsets are <code>equal</code> then no
 * new data has arrived.
 */
public  interface Offset extends scala.Serializable {
}
