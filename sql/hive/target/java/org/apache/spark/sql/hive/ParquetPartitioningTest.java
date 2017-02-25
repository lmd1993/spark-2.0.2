package org.apache.spark.sql.hive;
/**
 * A collection of tests for parquet data with various forms of partitioning.
 */
public abstract class ParquetPartitioningTest extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SQLTestUtils, org.apache.spark.sql.hive.test.TestHiveSingleton {
  public   ParquetPartitioningTest ()  { throw new RuntimeException(); }
  public  java.io.File partitionedTableDir ()  { throw new RuntimeException(); }
  public  java.io.File normalTableDir ()  { throw new RuntimeException(); }
  public  java.io.File partitionedTableDirWithKey ()  { throw new RuntimeException(); }
  public  java.io.File partitionedTableDirWithComplexTypes ()  { throw new RuntimeException(); }
  public  java.io.File partitionedTableDirWithKeyAndComplexTypes ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  protected  void afterAll ()  { throw new RuntimeException(); }
  /**
   * Drop named tables if they exist
   * <p>
   * @param tableNames tables to drop
   */
  public  void dropTables (scala.collection.Seq<java.lang.String> tableNames)  { throw new RuntimeException(); }
}
