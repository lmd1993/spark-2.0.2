package org.apache.spark.sql.hive.client;
/**
 * A simple set of tests that call the methods of a {@link HiveClient}, loading different version
 * of hive from maven central.  These tests are simple in that they are mostly just testing to make
 * sure that reflective calls are not throwing NoSuchMethod error, but the actually functionality
 * is not fully tested.
 */
public  class VersionsSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.internal.Logging {
  public   VersionsSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> ivyPath ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> buildConf ()  { throw new RuntimeException(); }
  private  java.lang.String getNestedMessages (java.lang.Throwable e)  { throw new RuntimeException(); }
  private  java.lang.String emptyDir ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> versions ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.client.HiveClient client ()  { throw new RuntimeException(); }
}
