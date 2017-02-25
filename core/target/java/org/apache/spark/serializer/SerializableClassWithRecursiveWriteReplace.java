package org.apache.spark.serializer;
public  class SerializableClassWithRecursiveWriteReplace implements java.io.Serializable {
  public   SerializableClassWithRecursiveWriteReplace ()  { throw new RuntimeException(); }
  private  java.lang.Object writeReplace ()  { throw new RuntimeException(); }
}
