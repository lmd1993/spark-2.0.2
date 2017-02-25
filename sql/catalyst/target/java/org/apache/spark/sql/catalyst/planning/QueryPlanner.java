package org.apache.spark.sql.catalyst.planning;
/**
 * Abstract class for transforming {@link LogicalPlan}s into physical plans.
 * Child classes are responsible for specifying a list of {@link GenericStrategy} objects that
 * each of which can return a list of possible physical plan options.
 * If a given strategy is unable to plan all
 * of the remaining operators in the tree, it can call {@link planLater}, which returns a placeholder
 * object that will be filled in using other available strategies.
 * <p>
 * TODO: RIGHT NOW ONLY ONE PLAN IS RETURNED EVER...
 *       PLAN SPACE EXPLORATION WILL BE IMPLEMENTED LATER.
 * <p>
 * @tparam PhysicalPlan The type of physical plan produced by this {@link QueryPlanner}
 */
public abstract class QueryPlanner<PhysicalPlan extends org.apache.spark.sql.catalyst.trees.TreeNode<PhysicalPlan>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Select(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.sql), org.apache.spark.sql.catalyst), org.apache.spark.sql.catalyst.trees), org.apache.spark.sql.catalyst.trees.TreeNode), List(TypeTree().setOriginal(Ident(TypeName("PhysicalPlan"))))))))
  public   QueryPlanner ()  { throw new RuntimeException(); }
  /** A list of execution strategies that can be used by the planner */
  public abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.planning.GenericStrategy<PhysicalPlan>> strategies ()  ;
  public  scala.collection.Iterator<PhysicalPlan> plan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
