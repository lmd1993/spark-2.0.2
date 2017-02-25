package org.apache.spark.sql.catalyst.optimizer;
/**
 * Typed {@link Filter} is by default surrounded by a {@link DeserializeToObject} beneath it and a
 * {@link SerializeFromObject} above it.  If these serializations can't be eliminated, we should embed
 * the deserializer in filter condition to save the extra serialization at last.
 */
public  class EmbedSerializerInFilter$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EmbedSerializerInFilter$ MODULE$ = null;
  public   EmbedSerializerInFilter$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  boolean samePrimitiveType (org.apache.spark.sql.types.StructType lhs, org.apache.spark.sql.types.StructType rhs)  { throw new RuntimeException(); }
}
