package org.apache.spark.sql.hive.orc;
public abstract class OrcSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.hive.test.TestHiveSingleton, org.scalatest.BeforeAndAfterAll {
  public   OrcSuite ()  { throw new RuntimeException(); }
  public  java.io.File orcTableDir ()  { throw new RuntimeException(); }
  public  java.io.File orcTableAsDir ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
}
