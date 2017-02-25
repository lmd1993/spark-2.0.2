package org.apache.spark.scheduler;
/**
 * Class with methods that can be passed to runJob to test commits with a mock committer.
 */
public  class OutputCommitFunctions implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String tempDirPath ()  { throw new RuntimeException(); }
  // not preceding
  public   OutputCommitFunctions (java.lang.String tempDirPath)  { throw new RuntimeException(); }
  private  org.apache.spark.rdd.FakeOutputCommitter successfulOutputCommitter ()  { throw new RuntimeException(); }
  private  org.apache.spark.rdd.FakeOutputCommitter failingOutputCommitter ()  { throw new RuntimeException(); }
  public  void commitSuccessfully (scala.collection.Iterator<java.lang.Object> iter)  { throw new RuntimeException(); }
  public  void failFirstCommitAttempt (scala.collection.Iterator<java.lang.Object> iter)  { throw new RuntimeException(); }
  private  void runCommitWithProvidedCommitter (org.apache.spark.TaskContext ctx, scala.collection.Iterator<java.lang.Object> iter, org.apache.hadoop.mapred.OutputCommitter outputCommitter)  { throw new RuntimeException(); }
}
