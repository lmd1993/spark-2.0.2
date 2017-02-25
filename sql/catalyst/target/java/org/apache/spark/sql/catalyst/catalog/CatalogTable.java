package org.apache.spark.sql.catalyst.catalog;
/**
 * A table defined in the catalog.
 * <p>
 * Note that Hive's metastore also tracks skewed columns. We should consider adding that in the
 * future once we have a better understanding of how we want to handle skewed columns.
 * <p>
 * param:  unsupportedFeatures is a list of string descriptions of features that are used by the
 *        underlying table but not supported by Spark SQL yet.
 */
public  class CatalogTable implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier identifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogTableType tableType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat storage ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogColumn> schema ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> partitionColumnNames ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> sortColumnNames ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> bucketColumnNames ()  { throw new RuntimeException(); }
  public  int numBuckets ()  { throw new RuntimeException(); }
  public  java.lang.String owner ()  { throw new RuntimeException(); }
  public  long createTime ()  { throw new RuntimeException(); }
  public  long lastAccessTime ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> viewOriginalText ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> viewText ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> comment ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> unsupportedFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public   CatalogTable (org.apache.spark.sql.catalyst.TableIdentifier identifier, org.apache.spark.sql.catalyst.catalog.CatalogTableType tableType, org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat storage, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogColumn> schema, scala.collection.Seq<java.lang.String> partitionColumnNames, scala.collection.Seq<java.lang.String> sortColumnNames, scala.collection.Seq<java.lang.String> bucketColumnNames, int numBuckets, java.lang.String owner, long createTime, long lastAccessTime, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties, scala.Option<java.lang.String> viewOriginalText, scala.Option<java.lang.String> viewText, scala.Option<java.lang.String> comment, scala.collection.Seq<java.lang.String> unsupportedFeatures)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> colNames ()  { throw new RuntimeException(); }
  private  void requireSubsetOfSchema (scala.collection.Seq<java.lang.String> cols, java.lang.String colType)  { throw new RuntimeException(); }
  /** Columns this table is partitioned by. */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogColumn> partitionColumns ()  { throw new RuntimeException(); }
  /** Return the database this table was specified to belong to, assuming it exists. */
  public  java.lang.String database ()  { throw new RuntimeException(); }
  /** Return the fully qualified name of this table, assuming the database was specified. */
  public  java.lang.String qualifiedName ()  { throw new RuntimeException(); }
  /** Syntactic sugar to update a field in `storage`. */
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable withNewStorage (scala.Option<java.lang.String> locationUri, scala.Option<java.lang.String> inputFormat, scala.Option<java.lang.String> outputFormat, boolean compressed, scala.Option<java.lang.String> serde, scala.collection.immutable.Map<java.lang.String, java.lang.String> serdeProperties)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
