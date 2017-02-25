package org.apache.spark.scheduler;
/**
 * A {@link TaskResultGetter} that stores the {@link DirectTaskResult}s it receives from executors
 * _before_ modifying the results in any way.
 */
public  class MyTaskResultGetter extends org.apache.spark.scheduler.TaskResultGetter {
  public   MyTaskResultGetter (org.apache.spark.SparkEnv env, org.apache.spark.scheduler.TaskSchedulerImpl scheduler)  { throw new RuntimeException(); }
  protected  com.google.common.util.concurrent.ListeningExecutorService getTaskResultExecutor ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.scheduler.DirectTaskResult<?>> _taskResults ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.DirectTaskResult<?>> taskResults ()  { throw new RuntimeException(); }
  public  void enqueueSuccessfulTask (org.apache.spark.scheduler.TaskSetManager tsm, long tid, java.nio.ByteBuffer data)  { throw new RuntimeException(); }
}
