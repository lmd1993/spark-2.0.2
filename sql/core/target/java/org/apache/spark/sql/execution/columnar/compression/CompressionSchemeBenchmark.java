package org.apache.spark.sql.execution.columnar.compression;
/**
 * Benchmark to decoders using various compression schemes.
 */
public  class CompressionSchemeBenchmark {
  static private  java.nio.ByteBuffer allocateLocal (int size)  { throw new RuntimeException(); }
  static private  scala.Function0<java.lang.Object> genLowerSkewData ()  { throw new RuntimeException(); }
  static private  scala.Function0<java.lang.Object> genHigherSkewData ()  { throw new RuntimeException(); }
  static private <T extends org.apache.spark.sql.types.AtomicType> scala.Tuple3<scala.Function2<java.nio.ByteBuffer, java.nio.ByteBuffer, java.nio.ByteBuffer>, java.lang.Object, java.nio.ByteBuffer> prepareEncodeInternal (int count, org.apache.spark.sql.execution.columnar.NativeColumnType<T> tpe, org.apache.spark.sql.execution.columnar.compression.CompressionScheme supportedScheme, java.nio.ByteBuffer input)  { throw new RuntimeException(); }
  static private <T extends org.apache.spark.sql.types.AtomicType> void runEncodeBenchmark (java.lang.String name, int iters, int count, org.apache.spark.sql.execution.columnar.NativeColumnType<T> tpe, java.nio.ByteBuffer input)  { throw new RuntimeException(); }
  static private <T extends org.apache.spark.sql.types.AtomicType> void runDecodeBenchmark (java.lang.String name, int iters, int count, org.apache.spark.sql.execution.columnar.NativeColumnType<T> tpe, java.nio.ByteBuffer input)  { throw new RuntimeException(); }
  static public  void bitEncodingBenchmark (int iters)  { throw new RuntimeException(); }
  static public  void shortEncodingBenchmark (int iters)  { throw new RuntimeException(); }
  static public  void intEncodingBenchmark (int iters)  { throw new RuntimeException(); }
  static public  void longEncodingBenchmark (int iters)  { throw new RuntimeException(); }
  static public  void stringEncodingBenchmark (int iters)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.execution.columnar.compression.CompressionScheme> schemes ()  { throw new RuntimeException(); }
}
