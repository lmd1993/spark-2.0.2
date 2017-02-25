package org.apache.spark.util.collection;
/**
 * A dummy class that always returns the same hash code, to easily test hash collisions
 */
public  class FixedHashObject implements scala.Serializable, scala.Product {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int v ()  { throw new RuntimeException(); }
  public  int h ()  { throw new RuntimeException(); }
  // not preceding
  public   FixedHashObject (int v, int h)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
}
