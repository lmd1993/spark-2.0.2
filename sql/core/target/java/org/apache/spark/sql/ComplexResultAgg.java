package org.apache.spark.sql;
public  class ComplexResultAgg {
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> zero ()  { throw new RuntimeException(); }
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> reduce (scala.Tuple2<java.lang.Object, java.lang.Object> countAndSum, scala.Tuple2<java.lang.String, java.lang.Object> input)  { throw new RuntimeException(); }
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> merge (scala.Tuple2<java.lang.Object, java.lang.Object> b1, scala.Tuple2<java.lang.Object, java.lang.Object> b2)  { throw new RuntimeException(); }
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> finish (scala.Tuple2<java.lang.Object, java.lang.Object> reduction)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<scala.Tuple2<java.lang.Object, java.lang.Object>> bufferEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<scala.Tuple2<java.lang.Object, java.lang.Object>> outputEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.TypedColumn<IN, OUT> toColumn ()  { throw new RuntimeException(); }
}
