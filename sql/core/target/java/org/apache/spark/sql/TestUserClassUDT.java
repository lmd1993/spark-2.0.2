package org.apache.spark.sql;
  class TestUserClassUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.sql.TestUserClass> {
  public   TestUserClassUDT ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType sqlType ()  { throw new RuntimeException(); }
  public  int serialize (org.apache.spark.sql.TestUserClass input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.TestUserClass deserialize (Object datum)  { throw new RuntimeException(); }
  public  java.lang.Class<org.apache.spark.sql.TestUserClass> userClass ()  { throw new RuntimeException(); }
    org.apache.spark.sql.TestUserClassUDT asNullable ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
}
