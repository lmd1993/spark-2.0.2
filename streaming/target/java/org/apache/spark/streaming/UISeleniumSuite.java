package org.apache.spark.streaming;
/**
 * Selenium tests for the Spark Streaming Web UI.
 */
public  class UISeleniumSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.selenium.WebBrowser, org.scalatest.Matchers, org.scalatest.BeforeAndAfterAll, org.apache.spark.streaming.TestSuiteBase {
  public   UISeleniumSuite ()  { throw new RuntimeException(); }
  public  org.openqa.selenium.WebDriver webDriver ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  /**
   * Create a test SparkStreamingContext with the SparkUI enabled.
   * @return (undocumented)
   */
  private  org.apache.spark.streaming.StreamingContext newSparkStreamingContext ()  { throw new RuntimeException(); }
  private  void setupStreams (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
}
