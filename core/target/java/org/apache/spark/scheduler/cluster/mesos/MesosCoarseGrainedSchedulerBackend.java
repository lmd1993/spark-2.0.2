package org.apache.spark.scheduler.cluster.mesos;
/**
 * A SchedulerBackend that runs tasks on Mesos, but uses "coarse-grained" tasks, where it holds
 * onto each Mesos node for the duration of the Spark job instead of relinquishing cores whenever
 * a task is done. It launches Spark tasks within the coarse-grained Mesos tasks using the
 * CoarseGrainedSchedulerBackend mechanism. This class is useful for lower and more predictable
 * latency.
 * <p>
 * Unfortunately this has a bit of duplication from {@link MesosFineGrainedSchedulerBackend},
 * but it seems hard to remove this.
 */
  class MesosCoarseGrainedSchedulerBackend extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend implements org.apache.mesos.Scheduler, org.apache.spark.scheduler.cluster.mesos.MesosSchedulerUtils {
  // not preceding
  public   MesosCoarseGrainedSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc, java.lang.String master, org.apache.spark.SecurityManager securityManager)  { throw new RuntimeException(); }
  public  int MAX_SLAVE_FAILURES ()  { throw new RuntimeException(); }
  public  int maxCores ()  { throw new RuntimeException(); }
  private  boolean shuffleServiceEnabled ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> coresByTaskId ()  { throw new RuntimeException(); }
  public  int totalCoresAcquired ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.scheduler.cluster.mesos.Slave> slaves ()  { throw new RuntimeException(); }
  /**
   * The total number of executors we aim to have. Undefined when not using dynamic allocation.
   * Initially set to 0 when using dynamic allocation, the executor allocation manager will send
   * the real initial limit later.
   * @return (undocumented)
   */
  private  scala.Option<java.lang.Object> executorLimitOption ()  { throw new RuntimeException(); }
  /**
   *  Return the current executor limit, which may be {@link Int.MaxValue}
   *  before properly initialized.
   * @return (undocumented)
   */
    int executorLimit ()  { throw new RuntimeException(); }
  private  java.util.concurrent.locks.ReentrantLock stateLock ()  { throw new RuntimeException(); }
  public  int extraCoresPerExecutor ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Set<java.lang.String>> slaveOfferConstraints ()  { throw new RuntimeException(); }
  private  long rejectOfferDurationForUnmetConstraints ()  { throw new RuntimeException(); }
  private  long rejectOfferDurationForReachedMaxCores ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.network.shuffle.mesos.MesosExternalShuffleClient> mesosExternalShuffleClient ()  { throw new RuntimeException(); }
  protected  org.apache.spark.network.shuffle.mesos.MesosExternalShuffleClient getShuffleClient ()  { throw new RuntimeException(); }
  public  int nextMesosTaskId ()  { throw new RuntimeException(); }
  public  java.lang.String appId ()  { throw new RuntimeException(); }
  public  java.lang.String newMesosTaskId ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  org.apache.mesos.Protos.CommandInfo createCommand (org.apache.mesos.Protos.Offer offer, int numCores, java.lang.String taskId)  { throw new RuntimeException(); }
  protected  java.lang.String driverURL ()  { throw new RuntimeException(); }
  public  void offerRescinded (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.OfferID o)  { throw new RuntimeException(); }
  public  void registered (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.FrameworkID frameworkId, org.apache.mesos.Protos.MasterInfo masterInfo)  { throw new RuntimeException(); }
  public  boolean sufficientResourcesRegistered ()  { throw new RuntimeException(); }
  public  void disconnected (org.apache.mesos.SchedulerDriver d)  { throw new RuntimeException(); }
  public  void reregistered (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.MasterInfo masterInfo)  { throw new RuntimeException(); }
  /**
   * Method called by Mesos to offer resources on slaves. We respond by launching an executor,
   * unless we've already launched more than we wanted to.
   * @param d (undocumented)
   * @param offers (undocumented)
   */
  public  void resourceOffers (org.apache.mesos.SchedulerDriver d, java.util.List<org.apache.mesos.Protos.Offer> offers)  { throw new RuntimeException(); }
  private  void declineUnmatchedOffers (org.apache.mesos.SchedulerDriver d, scala.collection.mutable.Buffer<org.apache.mesos.Protos.Offer> offers)  { throw new RuntimeException(); }
  private  void declineOffer (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.Offer offer, scala.Option<java.lang.String> reason, scala.Option<java.lang.Object> refuseSeconds)  { throw new RuntimeException(); }
  /**
   * Launches executors on accepted offers, and declines unused offers. Executors are launched
   * round-robin on offers.
   * <p>
   * @param d SchedulerDriver
   * @param offers Mesos offers that match attribute constraints
   */
  private  void handleMatchedOffers (org.apache.mesos.SchedulerDriver d, scala.collection.mutable.Buffer<org.apache.mesos.Protos.Offer> offers)  { throw new RuntimeException(); }
  /**
   * Returns a map from OfferIDs to the tasks to launch on those offers.  In order to maximize
   * per-task memory and IO, tasks are round-robin assigned to offers.
   * <p>
   * @param offers Mesos offers that match attribute constraints
   * @return A map from OfferID to a list of Mesos tasks to launch on that offer
   */
  private  scala.collection.immutable.Map<org.apache.mesos.Protos.OfferID, scala.collection.immutable.List<org.apache.mesos.Protos.TaskInfo>> buildMesosTasks (scala.collection.mutable.Buffer<org.apache.mesos.Protos.Offer> offers)  { throw new RuntimeException(); }
  private  boolean canLaunchTask (java.lang.String slaveId, java.util.List<org.apache.mesos.Protos.Resource> resources)  { throw new RuntimeException(); }
  private  int executorCores (int offerCPUs)  { throw new RuntimeException(); }
  public  void statusUpdate (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.TaskStatus status)  { throw new RuntimeException(); }
  public  void error (org.apache.mesos.SchedulerDriver d, java.lang.String message)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void frameworkMessage (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.ExecutorID e, org.apache.mesos.Protos.SlaveID s, byte[] b)  { throw new RuntimeException(); }
  /**
   * Called when a slave is lost or a Mesos task finished. Updates local view on
   * what tasks are running. It also notifies the driver that an executor was removed.
   * @param d (undocumented)
   * @param slaveId (undocumented)
   * @param taskId (undocumented)
   * @param reason (undocumented)
   */
  private  void executorTerminated (org.apache.mesos.SchedulerDriver d, java.lang.String slaveId, java.lang.String taskId, java.lang.String reason)  { throw new RuntimeException(); }
  public  void slaveLost (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.SlaveID slaveId)  { throw new RuntimeException(); }
  public  void executorLost (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.ExecutorID e, org.apache.mesos.Protos.SlaveID s, int status)  { throw new RuntimeException(); }
  public  java.lang.String applicationId ()  { throw new RuntimeException(); }
  public  scala.concurrent.Future<java.lang.Object> doRequestTotalExecutors (int requestedTotal)  { throw new RuntimeException(); }
  public  scala.concurrent.Future<java.lang.Object> doKillExecutors (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  private  int numExecutors ()  { throw new RuntimeException(); }
}
