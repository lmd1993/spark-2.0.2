package org.apache.spark.sql.hive.execution;
public  class LongProductSum extends org.apache.spark.sql.expressions.UserDefinedAggregateFunction {
  public   LongProductSum ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType inputSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType bufferSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean deterministic ()  { throw new RuntimeException(); }
  public  void initialize (org.apache.spark.sql.expressions.MutableAggregationBuffer buffer)  { throw new RuntimeException(); }
  public  void update (org.apache.spark.sql.expressions.MutableAggregationBuffer buffer, org.apache.spark.sql.Row input)  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.sql.expressions.MutableAggregationBuffer buffer1, org.apache.spark.sql.Row buffer2)  { throw new RuntimeException(); }
  public  Object evaluate (org.apache.spark.sql.Row buffer)  { throw new RuntimeException(); }
}
