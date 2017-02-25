package org.apache.spark.sql.hive.orc;
  interface OrcTest extends org.apache.spark.sql.test.SQLTestUtils, org.apache.spark.sql.hive.test.TestHiveSingleton {
  /**
   * Writes <code>data</code> to a Orc file, which is then passed to <code>f</code> and will be deleted after <code>f</code>
   * returns.
   * @param data (undocumented)
   * @param f (undocumented)
   * @param evidence$1 (undocumented)
   * @param evidence$2 (undocumented)
   */
  public <T extends scala.Product> void withOrcFile (scala.collection.Seq<T> data, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f, scala.reflect.ClassTag<T> evidence$1, scala.reflect.api.TypeTags.TypeTag<T> evidence$2)  ;
  /**
   * Writes <code>data</code> to a Orc file and reads it back as a {@link DataFrame},
   * which is then passed to <code>f</code>. The Orc file will be deleted after <code>f</code> returns.
   * @param data (undocumented)
   * @param f (undocumented)
   * @param evidence$3 (undocumented)
   * @param evidence$4 (undocumented)
   */
  public <T extends scala.Product> void withOrcDataFrame (scala.collection.Seq<T> data, scala.Function1<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> f, scala.reflect.ClassTag<T> evidence$3, scala.reflect.api.TypeTags.TypeTag<T> evidence$4)  ;
  /**
   * Writes <code>data</code> to a Orc file, reads it back as a {@link DataFrame} and registers it as a
   * temporary table named <code>tableName</code>, then call <code>f</code>. The temporary table together with the
   * Orc file will be dropped/deleted after <code>f</code> returns.
   * @param data (undocumented)
   * @param tableName (undocumented)
   * @param f (undocumented)
   * @param evidence$5 (undocumented)
   * @param evidence$6 (undocumented)
   */
  public <T extends scala.Product> void withOrcTable (scala.collection.Seq<T> data, java.lang.String tableName, scala.Function0<scala.runtime.BoxedUnit> f, scala.reflect.ClassTag<T> evidence$5, scala.reflect.api.TypeTags.TypeTag<T> evidence$6)  ;
  public <T extends scala.Product> void makeOrcFile (scala.collection.Seq<T> data, java.io.File path, scala.reflect.ClassTag<T> evidence$7, scala.reflect.api.TypeTags.TypeTag<T> evidence$8)  ;
  public <T extends scala.Product> void makeOrcFile (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.io.File path, scala.reflect.ClassTag<T> evidence$9, scala.reflect.api.TypeTags.TypeTag<T> evidence$10)  ;
}
