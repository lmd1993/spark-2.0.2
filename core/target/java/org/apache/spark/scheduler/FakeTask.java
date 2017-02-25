package org.apache.spark.scheduler;
public  class FakeTask extends org.apache.spark.scheduler.Task<java.lang.Object> {
  /**
   * Utility method to create a TaskSet, potentially setting a particular sequence of preferred
   * locations for each task (given as varargs) if this sequence is not empty.
   * @param numTasks (undocumented)
   * @param prefLocs (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.scheduler.TaskSet createTaskSet (int numTasks, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> prefLocs)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.TaskSet createTaskSet (int numTasks, int stageAttemptId, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> prefLocs)  { throw new RuntimeException(); }
  static public  int stageId ()  { throw new RuntimeException(); }
  static public  int stageAttemptId ()  { throw new RuntimeException(); }
  static public  int partitionId ()  { throw new RuntimeException(); }
  static public  org.apache.spark.executor.TaskMetrics metrics ()  { throw new RuntimeException(); }
  static public  java.util.Properties localProperties ()  { throw new RuntimeException(); }
  static public  void localProperties_$eq (java.util.Properties x$1)  { throw new RuntimeException(); }
  static public final  T run (long taskAttemptId, int attemptNumber, org.apache.spark.metrics.MetricsSystem metricsSystem)  { throw new RuntimeException(); }
  static public  void setTaskMemoryManager (org.apache.spark.memory.TaskMemoryManager taskMemoryManager)  { throw new RuntimeException(); }
  static public  long epoch ()  { throw new RuntimeException(); }
  static public  void epoch_$eq (long x$1)  { throw new RuntimeException(); }
  static protected  org.apache.spark.TaskContextImpl context ()  { throw new RuntimeException(); }
  static protected  void context_$eq (org.apache.spark.TaskContextImpl x$1)  { throw new RuntimeException(); }
  static protected  long _executorDeserializeTime ()  { throw new RuntimeException(); }
  static protected  void _executorDeserializeTime_$eq (long x$1)  { throw new RuntimeException(); }
  static public  boolean killed ()  { throw new RuntimeException(); }
  static public  long executorDeserializeTime ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> collectAccumulatorUpdates (boolean taskFailed)  { throw new RuntimeException(); }
  static public  void kill (boolean interruptThread)  { throw new RuntimeException(); }
  static public  boolean collectAccumulatorUpdates$default$1 ()  { throw new RuntimeException(); }
  public   FakeTask (int stageId, scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> prefLocs)  { throw new RuntimeException(); }
  public  int runTask (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> preferredLocations ()  { throw new RuntimeException(); }
}
