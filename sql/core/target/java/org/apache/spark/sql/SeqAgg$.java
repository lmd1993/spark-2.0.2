package org.apache.spark.sql;
public  class SeqAgg$ extends org.apache.spark.sql.expressions.Aggregator<org.apache.spark.sql.AggData, scala.collection.Seq<java.lang.Object>, scala.collection.Seq<java.lang.Object>> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SeqAgg$ MODULE$ = null;
  public   SeqAgg$ ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> zero ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> reduce (scala.collection.Seq<java.lang.Object> b, org.apache.spark.sql.AggData a)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> merge (scala.collection.Seq<java.lang.Object> b1, scala.collection.Seq<java.lang.Object> b2)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> finish (scala.collection.Seq<java.lang.Object> r)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> bufferEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> outputEncoder ()  { throw new RuntimeException(); }
}
