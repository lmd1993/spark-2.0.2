package org.apache.spark.deploy.mesos;
  class MesosClusterDispatcher implements org.apache.spark.internal.Logging {
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  public   MesosClusterDispatcher (org.apache.spark.deploy.mesos.MesosClusterDispatcherArguments args, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  java.lang.String publicAddress ()  { throw new RuntimeException(); }
  private  java.lang.String recoveryMode ()  { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.cluster.mesos.MesosClusterPersistenceEngineFactory engineFactory ()  { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.cluster.mesos.MesosClusterScheduler scheduler ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.rest.mesos.MesosRestServer server ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.mesos.ui.MesosClusterUI webUi ()  { throw new RuntimeException(); }
  private  java.util.concurrent.CountDownLatch shutdownLatch ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void awaitShutdown ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
