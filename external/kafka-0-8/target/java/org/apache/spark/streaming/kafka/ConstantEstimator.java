package org.apache.spark.streaming.kafka;
  class ConstantEstimator implements org.apache.spark.streaming.scheduler.rate.RateEstimator {
  private  long rate ()  { throw new RuntimeException(); }
  // not preceding
  public   ConstantEstimator (long rate)  { throw new RuntimeException(); }
  public  void updateRate (long newRate)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> compute (long time, long elements, long processingDelay, long schedulingDelay)  { throw new RuntimeException(); }
}
