package org.apache.spark.scheduler.cluster.mesos;
public  class MesosCoarseGrainedSchedulerBackendSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.mock.MockitoSugar, org.scalatest.BeforeAndAfter, org.scalatest.concurrent.ScalaFutures {
  public   MesosCoarseGrainedSchedulerBackendSuite ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  private  org.apache.mesos.SchedulerDriver driver ()  { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.TaskSchedulerImpl taskScheduler ()  { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.cluster.mesos.MesosCoarseGrainedSchedulerBackend backend ()  { throw new RuntimeException(); }
  private  org.apache.spark.network.shuffle.mesos.MesosExternalShuffleClient externalShuffleClient ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef driverEndpoint ()  { throw new RuntimeException(); }
  private  boolean stopCalled ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig patienceConfig ()  { throw new RuntimeException(); }
  private  void verifyDeclinedOffer (org.apache.mesos.SchedulerDriver driver, org.apache.mesos.Protos.OfferID offerId, boolean filter)  { throw new RuntimeException(); }
  private  void offerResources (scala.collection.immutable.List<scala.Tuple2<java.lang.Object, java.lang.Object>> offers, int startId)  { throw new RuntimeException(); }
  private  java.util.Collection<org.apache.mesos.Protos.TaskInfo> verifyTaskLaunched (java.lang.String offerId)  { throw new RuntimeException(); }
  private  org.apache.mesos.Protos.TaskStatus createTaskStatus (java.lang.String taskId, java.lang.String slaveId, org.apache.mesos.Protos.TaskState state)  { throw new RuntimeException(); }
  private  org.apache.mesos.Protos.OfferID createOfferId (java.lang.String offerId)  { throw new RuntimeException(); }
  private  org.apache.mesos.Protos.SlaveID createSlaveId (java.lang.String slaveId)  { throw new RuntimeException(); }
  private  org.apache.mesos.Protos.ExecutorID createExecutorId (java.lang.String executorId)  { throw new RuntimeException(); }
  private  org.apache.mesos.Protos.TaskID createTaskId (java.lang.String taskId)  { throw new RuntimeException(); }
  private  org.apache.mesos.Protos.Offer createOffer (java.lang.String offerId, java.lang.String slaveId, int mem, int cpu)  { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.cluster.mesos.MesosCoarseGrainedSchedulerBackend createSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl taskScheduler, org.apache.mesos.SchedulerDriver driver, org.apache.spark.network.shuffle.mesos.MesosExternalShuffleClient shuffleClient, org.apache.spark.rpc.RpcEndpointRef endpoint)  { throw new RuntimeException(); }
  private  void setBackend (scala.collection.immutable.Map<java.lang.String, java.lang.String> sparkConfVars)  { throw new RuntimeException(); }
}
