package org.apache.spark.sql.sources;
public  class BucketedReadSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SQLTestUtils, org.apache.spark.sql.hive.test.TestHiveSingleton {
  public   BucketedReadSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullDF ()  { throw new RuntimeException(); }
  private  void checkPrunedAnswers (org.apache.spark.sql.execution.datasources.BucketSpec bucketSpec, scala.collection.Seq<java.lang.Integer> bucketValues, org.apache.spark.sql.Column filterCondition, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> originalDataFrame)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df1 ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df2 ()  { throw new RuntimeException(); }
  /**
   * A helper method to test the bucket read functionality using join.  It will save <code>df1</code> and <code>df2</code>
   * to hive tables, bucketed or not, according to the given bucket specifics.  Next we will join
   * these 2 tables, and firstly make sure the answer is corrected, and then check if the shuffle
   * exists as user expected according to the <code>shuffleLeft</code> and <code>shuffleRight</code>.
   * @param bucketSpecLeft (undocumented)
   * @param bucketSpecRight (undocumented)
   * @param joinType (undocumented)
   * @param joinCondition (undocumented)
   * @param shuffleLeft (undocumented)
   * @param shuffleRight (undocumented)
   */
  private  void testBucketing (scala.Option<org.apache.spark.sql.execution.datasources.BucketSpec> bucketSpecLeft, scala.Option<org.apache.spark.sql.execution.datasources.BucketSpec> bucketSpecRight, java.lang.String joinType, scala.Function2<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, org.apache.spark.sql.Column> joinCondition, boolean shuffleLeft, boolean shuffleRight)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Column joinCondition (scala.collection.Seq<java.lang.String> joinCols, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> left, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> right)  { throw new RuntimeException(); }
}
