package org.apache.spark.sql.hive;
public  class ParquetHiveCompatibilitySuite extends org.apache.spark.sql.execution.datasources.parquet.ParquetCompatibilityTest implements org.apache.spark.sql.hive.test.TestHiveSingleton {
  public   ParquetHiveCompatibilitySuite ()  { throw new RuntimeException(); }
  /**
   * Set the staging directory (and hence path to ignore Parquet files under)
   * to the default value of hive.exec.stagingdir.
   * @return (undocumented)
   */
  private  java.lang.String stagingDir ()  { throw new RuntimeException(); }
  protected  void logParquetSchema (java.lang.String path)  { throw new RuntimeException(); }
  private  void testParquetHiveCompatibility (org.apache.spark.sql.Row row, scala.collection.Seq<java.lang.String> hiveTypes)  { throw new RuntimeException(); }
}
