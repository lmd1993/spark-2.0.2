package org.apache.spark.sql;
public  class UDT {
  static   class MyDenseVector implements scala.Serializable {
    public  double[] data ()  { throw new RuntimeException(); }
    // not preceding
    public   MyDenseVector (double[] data)  { throw new RuntimeException(); }
    public  int hashCode ()  { throw new RuntimeException(); }
    public  boolean equals (Object other)  { throw new RuntimeException(); }
  }
  static   class MyDenseVectorUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.sql.UDT.MyDenseVector> {
    public   MyDenseVectorUDT ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.DataType sqlType ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.util.ArrayData serialize (org.apache.spark.sql.UDT.MyDenseVector features)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.UDT.MyDenseVector deserialize (Object datum)  { throw new RuntimeException(); }
    public  java.lang.Class<org.apache.spark.sql.UDT.MyDenseVector> userClass ()  { throw new RuntimeException(); }
      org.apache.spark.sql.UDT.MyDenseVectorUDT asNullable ()  { throw new RuntimeException(); }
    public  int hashCode ()  { throw new RuntimeException(); }
    public  boolean equals (Object other)  { throw new RuntimeException(); }
  }
}
