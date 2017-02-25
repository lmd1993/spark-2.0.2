package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * Test suite for {@link GenerateUnsafeRowJoiner}.
 * <p>
 * There is also a separate {@link GenerateUnsafeRowJoinerBitsetSuite} that tests specifically
 * concatenation for the bitset portion, since that is the hardest one to get right.
 */
public  class GenerateUnsafeRowJoinerSuite extends org.apache.spark.SparkFunSuite {
  public   GenerateUnsafeRowJoinerSuite ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.types.IntegerType$> fixed ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.types.AtomicType> variable ()  { throw new RuntimeException(); }
  private  void testConcat (int numFields1, int numFields2, scala.collection.Seq<org.apache.spark.sql.types.DataType> candidateTypes)  { throw new RuntimeException(); }
  private  void testConcatOnce (int numFields1, int numFields2, scala.collection.Seq<org.apache.spark.sql.types.DataType> candidateTypes)  { throw new RuntimeException(); }
}
