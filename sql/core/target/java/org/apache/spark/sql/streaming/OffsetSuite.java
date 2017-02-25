package org.apache.spark.sql.streaming;
public  interface OffsetSuite {
  /** Creates test to check all the comparisons of offsets given a `one` that is less than `two`. */
  public  void compare (org.apache.spark.sql.execution.streaming.Offset one, org.apache.spark.sql.execution.streaming.Offset two)  ;
}
