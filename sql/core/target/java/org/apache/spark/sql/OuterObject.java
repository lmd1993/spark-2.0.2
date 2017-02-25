package org.apache.spark.sql;
public  class OuterObject {
  static public  class InnerClass implements scala.Product, scala.Serializable {
    public  java.lang.String a ()  { throw new RuntimeException(); }
    // not preceding
    public   InnerClass (java.lang.String a)  { throw new RuntimeException(); }
  }
  static public  class InnerClass$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.OuterObject.InnerClass> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final InnerClass$ MODULE$ = null;
    public   InnerClass$ ()  { throw new RuntimeException(); }
  }
}
