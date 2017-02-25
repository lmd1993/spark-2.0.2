package org.apache.spark.sql.catalyst.analysis;
  class UngroupableUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.sql.catalyst.analysis.UngroupableData> {
  public   UngroupableUDT ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType sqlType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.util.MapData serialize (org.apache.spark.sql.catalyst.analysis.UngroupableData ungroupableData)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.UngroupableData deserialize (Object datum)  { throw new RuntimeException(); }
  public  java.lang.Class<org.apache.spark.sql.catalyst.analysis.UngroupableData> userClass ()  { throw new RuntimeException(); }
    org.apache.spark.sql.catalyst.analysis.UngroupableUDT asNullable ()  { throw new RuntimeException(); }
}
