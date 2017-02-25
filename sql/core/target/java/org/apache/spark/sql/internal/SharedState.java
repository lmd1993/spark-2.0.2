package org.apache.spark.sql.internal;
/**
 * A class that holds all state shared across sessions in a given {@link SQLContext}.
 */
  class SharedState implements org.apache.spark.internal.Logging {
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  // not preceding
  public   SharedState (org.apache.spark.SparkContext sparkContext)  { throw new RuntimeException(); }
  /**
   * Class for caching query results reused in future executions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.CacheManager cacheManager ()  { throw new RuntimeException(); }
  /**
   * A listener for SQL-specific {@link org.apache.spark.scheduler.SparkListenerEvent}s.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.ui.SQLListener listener ()  { throw new RuntimeException(); }
  /**
   * A catalog that interacts with external systems.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.ExternalCatalog externalCatalog ()  { throw new RuntimeException(); }
  /**
   * A classloader used to load all user-added jar.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.internal.NonClosableMutableURLClassLoader jarClassLoader ()  { throw new RuntimeException(); }
  /**
   * Create a SQLListener then add it into SparkContext, and create a SQLTab if there is SparkUI.
   * @param sc (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.execution.ui.SQLListener createListenerAndUI (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
}
