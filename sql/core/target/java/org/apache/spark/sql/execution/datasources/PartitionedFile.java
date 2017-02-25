package org.apache.spark.sql.execution.datasources;
/**
 * A single file that should be read, along with partition column values that
 * need to be prepended to each row.  The reading should start at the first
 * valid record found after <code>start</code>.
 */
public  class PartitionedFile implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow partitionValues ()  { throw new RuntimeException(); }
  public  java.lang.String filePath ()  { throw new RuntimeException(); }
  public  long start ()  { throw new RuntimeException(); }
  public  long length ()  { throw new RuntimeException(); }
  public  java.lang.String[] locations ()  { throw new RuntimeException(); }
  // not preceding
  public   PartitionedFile (org.apache.spark.sql.catalyst.InternalRow partitionValues, java.lang.String filePath, long start, long length, java.lang.String[] locations)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
