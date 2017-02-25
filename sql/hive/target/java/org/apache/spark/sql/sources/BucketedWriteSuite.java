package org.apache.spark.sql.sources;
public  class BucketedWriteSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SQLTestUtils, org.apache.spark.sql.hive.test.TestHiveSingleton {
  public   BucketedWriteSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df ()  { throw new RuntimeException(); }
  public  java.io.File tableDir ()  { throw new RuntimeException(); }
  /**
   * A helper method to check the bucket write functionality in low level, i.e. check the written
   * bucket files to see if the data are correct.  User should pass in a data dir that these bucket
   * files are written to, and the format of data(parquet, json, etc.), and the bucketing
   * information.
   * @param dataDir (undocumented)
   * @param source (undocumented)
   * @param numBuckets (undocumented)
   * @param bucketCols (undocumented)
   * @param sortCols (undocumented)
   */
  private  void testBucketing (java.io.File dataDir, java.lang.String source, int numBuckets, scala.collection.Seq<java.lang.String> bucketCols, scala.collection.Seq<java.lang.String> sortCols)  { throw new RuntimeException(); }
}
