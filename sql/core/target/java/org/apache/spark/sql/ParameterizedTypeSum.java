package org.apache.spark.sql;
public  class ParameterizedTypeSum<IN extends java.lang.Object, OUT extends java.lang.Object> extends org.apache.spark.sql.expressions.Aggregator<IN, OUT, OUT> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ParameterizedTypeSum (scala.Function1<IN, OUT> f, scala.math.Numeric<OUT> evidence$1, org.apache.spark.sql.Encoder<OUT> evidence$2)  { throw new RuntimeException(); }
  private  scala.math.Numeric<OUT> numeric ()  { throw new RuntimeException(); }
  public  OUT zero ()  { throw new RuntimeException(); }
  public  OUT reduce (OUT b, IN a)  { throw new RuntimeException(); }
  public  OUT merge (OUT b1, OUT b2)  { throw new RuntimeException(); }
  public  OUT finish (OUT reduction)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<OUT> bufferEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<OUT> outputEncoder ()  { throw new RuntimeException(); }
}
