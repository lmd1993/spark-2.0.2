package org.apache.spark.sql;
/** A {@link Serializer} that takes a {@link KryoData} and serializes it as KryoData(0). */
public  class ZeroKryoDataSerializer extends com.esotericsoftware.kryo.Serializer<org.apache.spark.sql.KryoData> {
  public   ZeroKryoDataSerializer ()  { throw new RuntimeException(); }
  public  void write (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Output output, org.apache.spark.sql.KryoData t)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.KryoData read (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Input input, java.lang.Class<org.apache.spark.sql.KryoData> aClass)  { throw new RuntimeException(); }
}
