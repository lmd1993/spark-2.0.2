package org.apache.spark.deploy.history;
public  class ApplicationCacheSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.internal.Logging, org.scalatest.mock.MockitoSugar, org.scalatest.Matchers {
  public   ApplicationCacheSuite ()  { throw new RuntimeException(); }
  /**
   * subclass with access to the cache internals
   * param:  retainedApplications number of retained applications
   */
  public  class TestApplicationCache extends org.apache.spark.deploy.history.ApplicationCache {
    public   TestApplicationCache (org.apache.spark.deploy.history.ApplicationCacheOperations operations, int retainedApplications, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
    public  com.google.common.cache.LoadingCache<org.apache.spark.deploy.history.CacheKey, org.apache.spark.deploy.history.CacheEntry> cache ()  { throw new RuntimeException(); }
  }
  public  class TestApplicationCache {
    public   TestApplicationCache ()  { throw new RuntimeException(); }
  }
  /**
   * Stub cache operations.
   * The state is kept in a map of {@link CacheKey} to {@link CacheEntry},
   * the <code>probeTime</code> field in the cache entry setting the timestamp of the entry
   */
  public  class StubCacheOperations implements org.apache.spark.deploy.history.ApplicationCacheOperations, org.apache.spark.internal.Logging {
    public   StubCacheOperations ()  { throw new RuntimeException(); }
    /** map to UI instances, including timestamps, which are used in update probes */
    public  scala.collection.mutable.HashMap<org.apache.spark.deploy.history.CacheKey, org.apache.spark.deploy.history.CacheEntry> instances ()  { throw new RuntimeException(); }
    /** Map of attached spark UIs */
    public  scala.collection.mutable.HashMap<org.apache.spark.deploy.history.CacheKey, org.apache.spark.ui.SparkUI> attached ()  { throw new RuntimeException(); }
    public  long getAppUICount ()  { throw new RuntimeException(); }
    public  long attachCount ()  { throw new RuntimeException(); }
    public  long detachCount ()  { throw new RuntimeException(); }
    public  long updateProbeCount ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.deploy.history.LoadedAppUI> getAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
    public  void attachSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui, boolean completed)  { throw new RuntimeException(); }
    public  org.apache.spark.ui.SparkUI putAndAttach (java.lang.String appId, scala.Option<java.lang.String> attemptId, boolean completed, long started, long ended, long timestamp)  { throw new RuntimeException(); }
    public  org.apache.spark.ui.SparkUI putAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, boolean completed, long started, long ended, long timestamp)  { throw new RuntimeException(); }
    public  void putInstance (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui, boolean completed, long timestamp)  { throw new RuntimeException(); }
    /**
     * Detach a reconstructed UI
     * <p>
     * @param ui Spark UI
     * @param appId (undocumented)
     * @param attemptId (undocumented)
     */
    public  void detachSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
    /**
     * Lookup from the internal cache of attached UIs
     * @param appId (undocumented)
     * @param attemptId (undocumented)
     * @return (undocumented)
     */
    public  scala.Option<org.apache.spark.ui.SparkUI> getAttached (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
    /**
     * The update probe.
     * @param appId application to probe
     * @param attemptId attempt to probe
     * @param updateTime timestamp of this UI load
     * @return (undocumented)
     */
      boolean updateProbe (java.lang.String appId, scala.Option<java.lang.String> attemptId, long updateTime)  { throw new RuntimeException(); }
  }
  /**
   * Create a new UI. The info/attempt info classes here are from the package
   * <code>org.apache.spark.status.api.v1</code>, not the near-equivalents from the history package
   * @param name (undocumented)
   * @param attemptId (undocumented)
   * @param completed (undocumented)
   * @param started (undocumented)
   * @param ended (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ui.SparkUI newUI (java.lang.String name, scala.Option<java.lang.String> attemptId, boolean completed, long started, long ended)  { throw new RuntimeException(); }
  /**
   * Assert that a metric counter has a specific value; failure raises an exception
   * including the cache's toString value
   * @param name counter name (for exceptions)
   * @param counter counter
   * @param expected expected value.
   * @param cache cache
   */
  public  void assertMetric (java.lang.String name, com.codahale.metrics.Counter counter, long expected, org.apache.spark.deploy.history.ApplicationCache cache)  { throw new RuntimeException(); }
  /**
   * Look up the cache entry and assert that it matches in the expected value.
   * This assertion works if the two CacheEntries are different -it looks at the fields.
   * UI are compared on object equality; the timestamp and completed flags directly.
   * @param appId application ID
   * @param attemptId attempt ID
   * @param expected expected value
   * @param cache app cache
   */
  public  void assertCacheEntryEquals (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.deploy.history.CacheEntry expected, org.apache.spark.deploy.history.ApplicationCache cache)  { throw new RuntimeException(); }
  /**
   * Assert that a key wasn't found in cache or loaded.
   * <p>
   * Looks for the specific nested exception raised by {@link ApplicationCache}
   * @param appId application ID
   * @param attemptId attempt ID
   * @param cache app cache
   */
  public  void assertNotFound (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.deploy.history.ApplicationCache cache)  { throw new RuntimeException(); }
}
