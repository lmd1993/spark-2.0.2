package org.apache.spark.sql.catalyst.encoders;
public  class ExamplePoint implements scala.Serializable {
  public  double x ()  { throw new RuntimeException(); }
  public  double y ()  { throw new RuntimeException(); }
  // not preceding
  public   ExamplePoint (double x, double y)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object that)  { throw new RuntimeException(); }
}
