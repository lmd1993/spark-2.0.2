package org.apache.spark.streaming.scheduler;
public  class ExecutorAllocationManagerSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.scalatest.BeforeAndAfterAll, org.scalatest.mock.MockitoSugar, org.scalatest.PrivateMethodTester {
  public   ExecutorAllocationManagerSuite ()  { throw new RuntimeException(); }
  private  long batchDurationMillis ()  { throw new RuntimeException(); }
  private  org.apache.spark.ExecutorAllocationClient allocationClient ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.ManualClock clock ()  { throw new RuntimeException(); }
  private  void withAllocationManager (org.apache.spark.SparkConf conf, int numReceivers, scala.Function2<org.apache.spark.streaming.scheduler.ReceiverTracker, org.apache.spark.streaming.scheduler.ExecutorAllocationManager, scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _addBatchProcTime ()  { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _requestExecutors ()  { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _killExecutor ()  { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.Option<org.apache.spark.streaming.scheduler.ExecutorAllocationManager>> _executorAllocationManager ()  { throw new RuntimeException(); }
  private  void addBatchProcTime (org.apache.spark.streaming.scheduler.ExecutorAllocationManager manager, long timeMs)  { throw new RuntimeException(); }
  private  void requestExecutors (org.apache.spark.streaming.scheduler.ExecutorAllocationManager manager, int newExecs)  { throw new RuntimeException(); }
  private  void killExecutor (org.apache.spark.streaming.scheduler.ExecutorAllocationManager manager)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.streaming.scheduler.ExecutorAllocationManager> getExecutorAllocationManager (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  private  void withStreamingContext (org.apache.spark.SparkConf conf, scala.Function1<org.apache.spark.streaming.StreamingContext, scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
}
