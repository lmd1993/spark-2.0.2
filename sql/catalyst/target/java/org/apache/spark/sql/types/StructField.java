package org.apache.spark.sql.types;
/**
 * A field inside a StructType.
 * param:  name The name of this field.
 * param:  dataType The data type of this field.
 * param:  nullable Indicates if values of this field can be <code>null</code> values.
 * param:  metadata The metadata of this field. The metadata should be preserved during
 *                 transformation if the content of the column is not modified, e.g, in selection.
 */
public  class StructField implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Metadata metadata ()  { throw new RuntimeException(); }
  // not preceding
  public   StructField (java.lang.String name, org.apache.spark.sql.types.DataType dataType, boolean nullable, org.apache.spark.sql.types.Metadata metadata)  { throw new RuntimeException(); }
  /** No-arg constructor for kryo. */
  protected   StructField ()  { throw new RuntimeException(); }
    void buildFormattedString (java.lang.String prefix, scala.collection.mutable.StringBuilder builder)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
}
