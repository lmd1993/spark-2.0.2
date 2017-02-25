package org.apache.spark.sql.catalyst.plans;
/**
 * Provides helper methods for comparing plans.
 */
public abstract class PlanTest extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  public   PlanTest ()  { throw new RuntimeException(); }
  /**
   * Since attribute references are given globally unique ids during analysis,
   * we must normalize them to check if two different queries are identical.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan normalizeExprIds (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Normalizes plans:
   * - Filter the filter conditions that appear in a plan. For instance,
   *   ((expr 1 &amp;&amp; expr 2) &amp;&amp; expr 3), (expr 1 &amp;&amp; expr 2 &amp;&amp; expr 3), (expr 3 &amp;&amp; (expr 1 &amp;&amp; expr 2)
   *   etc., will all now be equivalent.
   * - Sample the seed will replaced by 0L.
   * - Join conditions will be resorted by hashCode.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan normalizePlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Rewrite {@link EqualTo} and {@link EqualNullSafe} operator to keep order. The following cases will be
   * equivalent:
   * 1. (a = b), (b = a);
   * 2. (a <=&gt; b), (b <=&gt; a).
   * @param condition (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.expressions.Expression rewriteEqual (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  /** Fails the test if the two plans do not match */
  protected  void comparePlans (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan1, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan2)  { throw new RuntimeException(); }
  /** Fails the test if the two expressions do not match */
  protected  void compareExpressions (org.apache.spark.sql.catalyst.expressions.Expression e1, org.apache.spark.sql.catalyst.expressions.Expression e2)  { throw new RuntimeException(); }
}
