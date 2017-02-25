package org.apache.spark.deploy.rest;
/**
 * A mock standalone Master that responds with dummy messages.
 * In all responses, the success parameter is always true.
 */
public  class DummyMaster implements org.apache.spark.rpc.RpcEndpoint {
  static public final  org.apache.spark.rpc.RpcEndpointRef self ()  { throw new RuntimeException(); }
  static public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  static public  void onError (java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public  void onConnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  static public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  static public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  static public  void onStart ()  { throw new RuntimeException(); }
  static public  void onStop ()  { throw new RuntimeException(); }
  static public final  void stop ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  // not preceding
  public   DummyMaster (org.apache.spark.rpc.RpcEnv rpcEnv, java.lang.String submitId, java.lang.String submitMessage, java.lang.String killMessage, scala.Enumeration.Value state, scala.Option<java.lang.Exception> exception)  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
}
