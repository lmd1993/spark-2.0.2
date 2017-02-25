package org.apache.spark.rpc;
/**
 * Common tests for an RpcEnv implementation.
 */
public abstract class RpcEnvSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll {
  public   RpcEnvSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv env ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.rpc.RpcEnv createRpcEnv (org.apache.spark.SparkConf conf, java.lang.String name, int port, boolean clientMode)  ;
  /**
   * Setup an {@link RpcEndpoint} to collect all network events.
   * <p>
   * @return the {@link RpcEndpointRef} and a <code>ConcurrentLinkedQueue</code> that contains network events.
   * @param _env (undocumented)
   * @param name (undocumented)
   */
  private  scala.Tuple2<org.apache.spark.rpc.RpcEndpointRef, java.util.concurrent.ConcurrentLinkedQueue<scala.Tuple2<java.lang.Object, java.lang.Object>>> setupNetworkEndpoint (org.apache.spark.rpc.RpcEnv _env, java.lang.String name)  { throw new RuntimeException(); }
}
