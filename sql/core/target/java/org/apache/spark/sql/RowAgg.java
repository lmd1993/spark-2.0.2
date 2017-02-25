package org.apache.spark.sql;
public  class RowAgg {
  static public  int zero ()  { throw new RuntimeException(); }
  static public  int reduce (int b, org.apache.spark.sql.Row a)  { throw new RuntimeException(); }
  static public  int merge (int b1, int b2)  { throw new RuntimeException(); }
  static public  int finish (int r)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<java.lang.Object> bufferEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<java.lang.Object> outputEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.TypedColumn<IN, OUT> toColumn ()  { throw new RuntimeException(); }
}
