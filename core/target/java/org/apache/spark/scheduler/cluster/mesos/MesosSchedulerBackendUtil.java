package org.apache.spark.scheduler.cluster.mesos;
/**
 * A collection of utility functions which can be used by both the
 * MesosSchedulerBackend and the {@link MesosFineGrainedSchedulerBackend}.
 */
public  class MesosSchedulerBackendUtil {
  /**
   * Parse a comma-delimited list of volume specs, each of which
   * takes the form [host-dir:]container-dir[:rw|:ro].
   * @param volumes (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.immutable.List<org.apache.mesos.Protos.Volume> parseVolumesSpec (java.lang.String volumes)  { throw new RuntimeException(); }
  /**
   * Parse a comma-delimited list of port mapping specs, each of which
   * takes the form host_port:container_port[:udp|:tcp]
   * <p>
   * Note:
   * the docker form is [ip:]host_port:container_port, but the DockerInfo
   * message has no field for 'ip', and instead has a 'protocol' field.
   * Docker itself only appears to support TCP, so this alternative form
   * anticipates the expansion of the docker form to allow for a protocol
   * and leaves open the chance for mesos to begin to accept an 'ip' field
   * @param portmaps (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.immutable.List<org.apache.mesos.Protos.ContainerInfo.DockerInfo.PortMapping> parsePortMappingsSpec (java.lang.String portmaps)  { throw new RuntimeException(); }
  /**
   * Construct a DockerInfo structure and insert it into a ContainerInfo
   * @param container (undocumented)
   * @param image (undocumented)
   * @param volumes (undocumented)
   * @param network (undocumented)
   * @param portmaps (undocumented)
   */
  static public  void addDockerInfo (org.apache.mesos.Protos.ContainerInfo.Builder container, java.lang.String image, scala.Option<scala.collection.immutable.List<org.apache.mesos.Protos.Volume>> volumes, scala.Option<org.apache.mesos.Protos.ContainerInfo.DockerInfo.Network> network, scala.Option<scala.collection.immutable.List<org.apache.mesos.Protos.ContainerInfo.DockerInfo.PortMapping>> portmaps)  { throw new RuntimeException(); }
  /**
   * Setup a docker containerizer
   * @param imageName (undocumented)
   * @param conf (undocumented)
   * @param builder (undocumented)
   */
  static public  void setupContainerBuilderDockerInfo (java.lang.String imageName, org.apache.spark.SparkConf conf, org.apache.mesos.Protos.ContainerInfo.Builder builder)  { throw new RuntimeException(); }
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
}
