package org.apache.spark.sql.catalyst.plans.physical;
public  class SinglePartition$ implements org.apache.spark.sql.catalyst.plans.physical.Partitioning, scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SinglePartition$ MODULE$ = null;
  public   SinglePartition$ ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  boolean satisfies (org.apache.spark.sql.catalyst.plans.physical.Distribution required)  { throw new RuntimeException(); }
  public  boolean compatibleWith (org.apache.spark.sql.catalyst.plans.physical.Partitioning other)  { throw new RuntimeException(); }
  public  boolean guarantees (org.apache.spark.sql.catalyst.plans.physical.Partitioning other)  { throw new RuntimeException(); }
}
