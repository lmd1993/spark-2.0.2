package org.apache.spark.deploy.mesos;
/**
 * A wrapper of {@link ExternalShuffleService} that provides an additional endpoint for drivers
 * to associate with. This allows the shuffle service to detect when a driver is terminated
 * and can clean up the associated shuffle files.
 */
  class MesosExternalShuffleService extends org.apache.spark.deploy.ExternalShuffleService {
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
  static public  void startIfEnabled ()  { throw new RuntimeException(); }
  static public  void start ()  { throw new RuntimeException(); }
  static public  void applicationRemoved (java.lang.String appId)  { throw new RuntimeException(); }
  static public  void stop ()  { throw new RuntimeException(); }
  public   MesosExternalShuffleService (org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager)  { throw new RuntimeException(); }
  protected  org.apache.spark.network.shuffle.ExternalShuffleBlockHandler newShuffleBlockHandler (org.apache.spark.network.util.TransportConf conf)  { throw new RuntimeException(); }
}
