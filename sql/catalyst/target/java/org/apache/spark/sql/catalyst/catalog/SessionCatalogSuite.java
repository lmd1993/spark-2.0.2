package org.apache.spark.sql.catalyst.catalog;
/**
 * Tests for {@link SessionCatalog} that assume that {@link InMemoryCatalog} is correctly implemented.
 * <p>
 * Note: many of the methods here are very similar to the ones in {@link ExternalCatalogSuite}.
 * This is because {@link SessionCatalog} and {@link ExternalCatalog} share many similar method
 * signatures but do not extend a common parent. This is largely by design but
 * unfortunately leads to very similar test code in two places.
 */
public  class SessionCatalogSuite extends org.apache.spark.SparkFunSuite {
  public   SessionCatalogSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.CatalogTestUtils utils ()  { throw new RuntimeException(); }
}
