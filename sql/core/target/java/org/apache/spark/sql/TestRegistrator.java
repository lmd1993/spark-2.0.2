package org.apache.spark.sql;
/** Used to test user provided registrator. */
public  class TestRegistrator implements org.apache.spark.serializer.KryoRegistrator {
  static public  org.apache.spark.sql.TestRegistrator apply ()  { throw new RuntimeException(); }
  public   TestRegistrator ()  { throw new RuntimeException(); }
  public  void registerClasses (com.esotericsoftware.kryo.Kryo kryo)  { throw new RuntimeException(); }
}
