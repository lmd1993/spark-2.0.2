package org.apache.spark.sql;
public  class ComplexResultAgg$ extends org.apache.spark.sql.expressions.Aggregator<scala.Tuple2<java.lang.String, java.lang.Object>, scala.Tuple2<java.lang.Object, java.lang.Object>, scala.Tuple2<java.lang.Object, java.lang.Object>> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ComplexResultAgg$ MODULE$ = null;
  public   ComplexResultAgg$ ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, java.lang.Object> zero ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, java.lang.Object> reduce (scala.Tuple2<java.lang.Object, java.lang.Object> countAndSum, scala.Tuple2<java.lang.String, java.lang.Object> input)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, java.lang.Object> merge (scala.Tuple2<java.lang.Object, java.lang.Object> b1, scala.Tuple2<java.lang.Object, java.lang.Object> b2)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, java.lang.Object> finish (scala.Tuple2<java.lang.Object, java.lang.Object> reduction)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<scala.Tuple2<java.lang.Object, java.lang.Object>> bufferEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<scala.Tuple2<java.lang.Object, java.lang.Object>> outputEncoder ()  { throw new RuntimeException(); }
}
