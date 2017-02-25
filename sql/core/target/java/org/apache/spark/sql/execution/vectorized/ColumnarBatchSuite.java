package org.apache.spark.sql.execution.vectorized;
public  class ColumnarBatchSuite extends org.apache.spark.SparkFunSuite {
  public   ColumnarBatchSuite ()  { throw new RuntimeException(); }
  private  boolean doubleEquals (double d1, double d2)  { throw new RuntimeException(); }
  private  void compareStruct (scala.collection.Seq<org.apache.spark.sql.types.StructField> fields, org.apache.spark.sql.catalyst.InternalRow r1, org.apache.spark.sql.Row r2, long seed)  { throw new RuntimeException(); }
  /**
   * This test generates a random schema data, serializes it to column batches and verifies the
   * results.
   * @param flatSchema (undocumented)
   * @param numFields (undocumented)
   */
  public  void testRandomRows (boolean flatSchema, int numFields)  { throw new RuntimeException(); }
}
