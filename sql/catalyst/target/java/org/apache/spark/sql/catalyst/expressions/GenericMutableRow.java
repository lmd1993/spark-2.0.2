package org.apache.spark.sql.catalyst.expressions;
public  class GenericMutableRow extends org.apache.spark.sql.catalyst.expressions.MutableRow implements org.apache.spark.sql.catalyst.expressions.BaseGenericInternalRow {
  public   GenericMutableRow (java.lang.Object[] values)  { throw new RuntimeException(); }
  /** No-arg constructor for serialization. */
  protected   GenericMutableRow ()  { throw new RuntimeException(); }
  public   GenericMutableRow (int size)  { throw new RuntimeException(); }
  protected  Object genericGet (int ordinal)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> toSeq (scala.collection.Seq<org.apache.spark.sql.types.DataType> fieldTypes)  { throw new RuntimeException(); }
  public  int numFields ()  { throw new RuntimeException(); }
  public  void setNullAt (int i)  { throw new RuntimeException(); }
  public  void update (int i, Object value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow copy ()  { throw new RuntimeException(); }
}
