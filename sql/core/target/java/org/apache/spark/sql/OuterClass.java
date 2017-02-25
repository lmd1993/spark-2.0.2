package org.apache.spark.sql;
public  class OuterClass implements scala.Serializable {
  public   OuterClass ()  { throw new RuntimeException(); }
  public  class InnerClass implements scala.Product, scala.Serializable {
    public  java.lang.String a ()  { throw new RuntimeException(); }
    // not preceding
    public   InnerClass (java.lang.String a)  { throw new RuntimeException(); }
  }
  public  class InnerClass extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.OuterClass.InnerClass> implements scala.Serializable {
    public   InnerClass ()  { throw new RuntimeException(); }
  }
}
