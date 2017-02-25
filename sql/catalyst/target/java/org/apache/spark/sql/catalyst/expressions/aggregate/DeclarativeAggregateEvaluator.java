package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * Evaluator for a {@link DeclarativeAggregate}.
 */
public  class DeclarativeAggregateEvaluator implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate function ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> input ()  { throw new RuntimeException(); }
  // not preceding
  public   DeclarativeAggregateEvaluator (org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate function, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Projection initializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Projection updater ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Projection merger ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Projection evaluator ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow initialize ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow update (scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> values)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow merge (scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> buffers)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow eval (org.apache.spark.sql.catalyst.InternalRow buffer)  { throw new RuntimeException(); }
}
