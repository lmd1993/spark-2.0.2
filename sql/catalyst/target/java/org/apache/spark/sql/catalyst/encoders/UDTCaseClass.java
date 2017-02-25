package org.apache.spark.sql.catalyst.encoders;
/** For testing UDT for a case class */
public  class UDTCaseClass implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.net.URI uri ()  { throw new RuntimeException(); }
  // not preceding
  public   UDTCaseClass (java.net.URI uri)  { throw new RuntimeException(); }
}
