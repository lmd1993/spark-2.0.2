package org.apache.spark.sql.catalyst.trees;
public  class TreeNode$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TreeNode$ MODULE$ = null;
  public   TreeNode$ ()  { throw new RuntimeException(); }
  public <BaseType extends org.apache.spark.sql.catalyst.trees.TreeNode<BaseType>> BaseType fromJSON (java.lang.String json, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.trees.TreeNode<?> reconstruct (org.json4s.JsonAST.JArray treeNodeJson, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  private  java.lang.Object parseFromJson (org.json4s.JsonAST.JValue value, org.apache.spark.sql.catalyst.ScalaReflection.universe expectedType, scala.collection.Seq<org.apache.spark.sql.catalyst.trees.TreeNode<?>> children, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  private  java.lang.Object parseToProduct (java.lang.String clsName, scala.collection.Seq<scala.Tuple2<java.lang.String, scala.reflect.api.Types.TypeApi>> fields, org.json4s.JsonAST.JValue value, scala.collection.Seq<org.apache.spark.sql.catalyst.trees.TreeNode<?>> children, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  private  boolean isScalaObject (org.json4s.JsonAST.JValue jValue)  { throw new RuntimeException(); }
  private  boolean isScalaProduct (org.json4s.JsonAST.JValue jValue)  { throw new RuntimeException(); }
}
