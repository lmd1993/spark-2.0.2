package org.apache.spark.sql.execution.joins;
/**
 * Test various broadcast join operators.
 * <p>
 * Tests in this suite we need to run Spark in local-cluster mode. In particular, the use of
 * unsafe map in {@link org.apache.spark.sql.execution.joins.UnsafeHashedRelation} is not triggered
 * without serializing the hashed relation, which does not happen in local mode.
 */
public  class BroadcastJoinSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SQLTestUtils {
  public   BroadcastJoinSuite ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  /**
   * Create a new {@link SparkSession} running in local-cluster mode with unsafe and codegen enabled.
   */
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  /**
   * Test whether the specified broadcast join updates the peak execution memory accumulator.
   * @param name (undocumented)
   * @param joinType (undocumented)
   * @param evidence$1 (undocumented)
   */
  private <T extends java.lang.Object> void testBroadcastJoinPeak (java.lang.String name, java.lang.String joinType, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> org.apache.spark.sql.execution.SparkPlan testBroadcastJoin (java.lang.String joinType, boolean forceBroadcast, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  private  void assertBroadcastJoin (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
}
