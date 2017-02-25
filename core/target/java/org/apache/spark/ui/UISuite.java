package org.apache.spark.ui;
public  class UISuite extends org.apache.spark.SparkFunSuite {
  public   UISuite ()  { throw new RuntimeException(); }
  /**
   * Create a test SparkContext with the SparkUI enabled.
   * It is safe to <code>get</code> the SparkUI directly from the SparkContext returned here.
   * @return (undocumented)
   */
  private  org.apache.spark.SparkContext newSparkContext ()  { throw new RuntimeException(); }
  private  scala.Tuple2<org.apache.spark.SparkConf, org.apache.spark.SSLOptions> sslDisabledConf ()  { throw new RuntimeException(); }
  private  scala.Tuple2<org.apache.spark.SparkConf, org.apache.spark.SSLOptions> sslEnabledConf ()  { throw new RuntimeException(); }
  public  void stopServer (org.apache.spark.ui.ServerInfo info)  { throw new RuntimeException(); }
  public  void closeSocket (java.net.ServerSocket socket)  { throw new RuntimeException(); }
}
