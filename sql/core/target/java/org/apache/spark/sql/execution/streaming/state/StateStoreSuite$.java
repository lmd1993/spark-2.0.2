package org.apache.spark.sql.execution.streaming.state;
public  class StateStoreSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StateStoreSuite$ MODULE$ = null;
  public   StateStoreSuite$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection strProj ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection intProj ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow stringToRow (java.lang.String s)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow intToRow (int i)  { throw new RuntimeException(); }
  public  java.lang.String rowToString (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  public  int rowToInt (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, java.lang.Object> rowsToIntInt (scala.Tuple2<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> row)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, java.lang.Object> rowsToStringInt (scala.Tuple2<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> row)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<scala.Tuple2<java.lang.String, java.lang.Object>> rowsToSet (scala.collection.Iterator<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> iterator)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.execution.streaming.state.StateStoreSuite.TestUpdate> updatesToSet (scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.StoreUpdate> iterator)  { throw new RuntimeException(); }
}
