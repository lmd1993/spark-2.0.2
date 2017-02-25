package org.apache.spark.sql.hive.test;
public  class TestHiveContext$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TestHiveContext$ MODULE$ = null;
  public   TestHiveContext$ ()  { throw new RuntimeException(); }
  /**
   * A map used to store all confs that need to be overridden in sql/hive unit tests.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> overrideConfs ()  { throw new RuntimeException(); }
  /**
   * Create a {@link HiveClient} used to retrieve metadata from the Hive MetaStore.
   * @param conf (undocumented)
   * @param hadoopConf (undocumented)
   * @param warehousePath (undocumented)
   * @param scratchDirPath (undocumented)
   * @param metastoreTemporaryConf (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.hive.client.HiveClient newClientForMetadata (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, java.io.File warehousePath, java.io.File scratchDirPath, scala.collection.immutable.Map<java.lang.String, java.lang.String> metastoreTemporaryConf)  { throw new RuntimeException(); }
  /**
   * Configurations needed to create a {@link HiveClient}.
   * @param hadoopConf (undocumented)
   * @param warehousePath (undocumented)
   * @param scratchDirPath (undocumented)
   * @param metastoreTemporaryConf (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> hiveClientConfigurations (org.apache.hadoop.conf.Configuration hadoopConf, java.io.File warehousePath, java.io.File scratchDirPath, scala.collection.immutable.Map<java.lang.String, java.lang.String> metastoreTemporaryConf)  { throw new RuntimeException(); }
  public  java.io.File makeScratchDir ()  { throw new RuntimeException(); }
}
