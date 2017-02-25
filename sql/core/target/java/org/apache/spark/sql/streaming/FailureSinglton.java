package org.apache.spark.sql.streaming;
public  class FailureSinglton {
  static public  boolean firstTime ()  { throw new RuntimeException(); }
}
