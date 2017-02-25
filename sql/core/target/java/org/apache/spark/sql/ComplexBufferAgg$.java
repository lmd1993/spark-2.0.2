package org.apache.spark.sql;
public  class ComplexBufferAgg$ extends org.apache.spark.sql.expressions.Aggregator<org.apache.spark.sql.AggData, scala.Tuple2<java.lang.Object, org.apache.spark.sql.AggData>, java.lang.Object> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ComplexBufferAgg$ MODULE$ = null;
  public   ComplexBufferAgg$ ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, org.apache.spark.sql.AggData> zero ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, org.apache.spark.sql.AggData> reduce (scala.Tuple2<java.lang.Object, org.apache.spark.sql.AggData> b, org.apache.spark.sql.AggData a)  { throw new RuntimeException(); }
  public  int finish (scala.Tuple2<java.lang.Object, org.apache.spark.sql.AggData> reduction)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, org.apache.spark.sql.AggData> merge (scala.Tuple2<java.lang.Object, org.apache.spark.sql.AggData> b1, scala.Tuple2<java.lang.Object, org.apache.spark.sql.AggData> b2)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<scala.Tuple2<java.lang.Object, org.apache.spark.sql.AggData>> bufferEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<java.lang.Object> outputEncoder ()  { throw new RuntimeException(); }
}
