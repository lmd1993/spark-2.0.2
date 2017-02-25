package org.apache.spark.deploy.mesos;
/**
 * An RPC endpoint that receives registration requests from Spark drivers running on Mesos.
 * It detects driver termination and calls the cleanup callback to {@link ExternalShuffleService}.
 */
  class MesosExternalShuffleBlockHandler extends org.apache.spark.network.shuffle.ExternalShuffleBlockHandler implements org.apache.spark.internal.Logging {
  public   MesosExternalShuffleBlockHandler (org.apache.spark.network.util.TransportConf transportConf, long cleanerIntervalS)  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<java.lang.String, org.apache.spark.deploy.mesos.MesosExternalShuffleBlockHandler.AppState> connectedApps ()  { throw new RuntimeException(); }
  protected  void handleMessage (org.apache.spark.network.shuffle.protocol.BlockTransferMessage message, org.apache.spark.network.client.TransportClient client, org.apache.spark.network.client.RpcResponseCallback callback)  { throw new RuntimeException(); }
  /** An extractor object for matching {@link RegisterDriver} message. */
  private  class RegisterDriverParam {
    public   RegisterDriverParam ()  { throw new RuntimeException(); }
    public  scala.Option<scala.Tuple2<java.lang.String, org.apache.spark.deploy.mesos.MesosExternalShuffleBlockHandler.AppState>> unapply (org.apache.spark.network.shuffle.protocol.mesos.RegisterDriver r)  { throw new RuntimeException(); }
  }
  private  org.apache.spark.deploy.mesos.MesosExternalShuffleBlockHandler.RegisterDriverParam$ RegisterDriverParam ()  { throw new RuntimeException(); }
  private  class Heartbeat {
    public   Heartbeat ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> unapply (org.apache.spark.network.shuffle.protocol.mesos.ShuffleServiceHeartbeat h)  { throw new RuntimeException(); }
  }
  private  org.apache.spark.deploy.mesos.MesosExternalShuffleBlockHandler.Heartbeat$ Heartbeat ()  { throw new RuntimeException(); }
  private  class AppState {
    public  long heartbeatTimeout ()  { throw new RuntimeException(); }
    public  long lastHeartbeat ()  { throw new RuntimeException(); }
    // not preceding
    public   AppState (long heartbeatTimeout, long lastHeartbeat)  { throw new RuntimeException(); }
  }
  private  class CleanerThread implements java.lang.Runnable {
    public   CleanerThread ()  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
}
