package org.apache.spark.sql.sources;
/**
 * A filter that evaluates to <code>true</code> iff <code>child</code> is evaluated to <code>false</code>.
 * <p>
 * @since 1.3.0
 */
public  class Not extends org.apache.spark.sql.sources.Filter implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.Filter child ()  { throw new RuntimeException(); }
  // not preceding
  public   Not (org.apache.spark.sql.sources.Filter child)  { throw new RuntimeException(); }
}
