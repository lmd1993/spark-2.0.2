package org.apache.spark.sql.hive;
/**
 * A class that holds all state shared across sessions in a given
 * {@link org.apache.spark.sql.SparkSession} backed by Hive.
 */
  class HiveSharedState extends org.apache.spark.sql.internal.SharedState {
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  // not preceding
  public   HiveSharedState (org.apache.spark.SparkContext sparkContext)  { throw new RuntimeException(); }
  /**
   * A Hive client used to interact with the metastore.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.hive.client.HiveClient metadataHive ()  { throw new RuntimeException(); }
  /**
   * A catalog that interacts with the Hive metastore.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.hive.HiveExternalCatalog externalCatalog ()  { throw new RuntimeException(); }
}
