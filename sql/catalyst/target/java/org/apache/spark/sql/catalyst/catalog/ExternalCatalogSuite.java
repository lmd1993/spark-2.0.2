package org.apache.spark.sql.catalyst.catalog;
/**
 * A reasonable complete test suite (i.e. behaviors) for a {@link ExternalCatalog}.
 * <p>
 * Implementations of the {@link ExternalCatalog} interface can create test suites by extending this.
 */
public abstract class ExternalCatalogSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterEach {
  public   ExternalCatalogSuite ()  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.sql.catalyst.catalog.CatalogTestUtils utils ()  ;
  protected  void resetState ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  private  boolean exists (java.lang.String uri, scala.collection.Seq<java.lang.String> children)  { throw new RuntimeException(); }
}
