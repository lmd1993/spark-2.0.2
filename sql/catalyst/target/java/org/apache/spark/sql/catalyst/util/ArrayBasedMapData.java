package org.apache.spark.sql.catalyst.util;
public  class ArrayBasedMapData extends org.apache.spark.sql.catalyst.util.MapData {
  static public  org.apache.spark.sql.catalyst.util.ArrayBasedMapData apply (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> map)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.util.ArrayBasedMapData apply (java.lang.Object[] keys, java.lang.Object[] values)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> toScalaMap (org.apache.spark.sql.catalyst.util.ArrayBasedMapData map)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> toScalaMap (java.lang.Object[] keys, java.lang.Object[] values)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> toScalaMap (scala.collection.Seq<java.lang.Object> keys, scala.collection.Seq<java.lang.Object> values)  { throw new RuntimeException(); }
  static public  java.util.Map<java.lang.Object, java.lang.Object> toJavaMap (java.lang.Object[] keys, java.lang.Object[] values)  { throw new RuntimeException(); }
  static public  void foreach (org.apache.spark.sql.types.DataType keyType, org.apache.spark.sql.types.DataType valueType, scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.util.ArrayData keyArray ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.util.ArrayData valueArray ()  { throw new RuntimeException(); }
  // not preceding
  public   ArrayBasedMapData (org.apache.spark.sql.catalyst.util.ArrayData keyArray, org.apache.spark.sql.catalyst.util.ArrayData valueArray)  { throw new RuntimeException(); }
  public  int numElements ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.util.MapData copy ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
