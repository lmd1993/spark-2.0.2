package org.apache.spark.sql;
public  class NullResultAgg$ extends org.apache.spark.sql.expressions.Aggregator<org.apache.spark.sql.AggData, org.apache.spark.sql.AggData, org.apache.spark.sql.AggData> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NullResultAgg$ MODULE$ = null;
  public   NullResultAgg$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.AggData zero ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.AggData reduce (org.apache.spark.sql.AggData b, org.apache.spark.sql.AggData a)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.AggData finish (org.apache.spark.sql.AggData reduction)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.AggData merge (org.apache.spark.sql.AggData b1, org.apache.spark.sql.AggData b2)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<org.apache.spark.sql.AggData> bufferEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<org.apache.spark.sql.AggData> outputEncoder ()  { throw new RuntimeException(); }
}
