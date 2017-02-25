package org.apache.spark.sql.catalyst;
/**
 * An abstract class for row used internal in Spark SQL, which only contain the columns as
 * internal types.
 */
public abstract class InternalRow implements org.apache.spark.sql.catalyst.expressions.SpecializedGetters, scala.Serializable {
  /**
   * This method can be used to construct a {@link InternalRow} with the given values.
   * @param values (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.InternalRow apply (scala.collection.Seq<java.lang.Object> values)  { throw new RuntimeException(); }
  /**
   * This method can be used to construct a {@link InternalRow} from a {@link Seq} of values.
   * @param values (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.InternalRow fromSeq (scala.collection.Seq<java.lang.Object> values)  { throw new RuntimeException(); }
  /** Returns an empty {@link InternalRow}. */
  static public  org.apache.spark.sql.catalyst.InternalRow empty ()  { throw new RuntimeException(); }
  static public abstract  boolean isNullAt (int x$1)  ;
  static public abstract  boolean getBoolean (int x$1)  ;
  static public abstract  byte getByte (int x$1)  ;
  static public abstract  short getShort (int x$1)  ;
  static public abstract  int getInt (int x$1)  ;
  static public abstract  long getLong (int x$1)  ;
  static public abstract  float getFloat (int x$1)  ;
  static public abstract  double getDouble (int x$1)  ;
  static public abstract  org.apache.spark.sql.types.Decimal getDecimal (int x$1, int x$2, int x$3)  ;
  static public abstract  org.apache.spark.unsafe.types.UTF8String getUTF8String (int x$1)  ;
  static public abstract  byte[] getBinary (int x$1)  ;
  static public abstract  org.apache.spark.unsafe.types.CalendarInterval getInterval (int x$1)  ;
  static public abstract  org.apache.spark.sql.catalyst.InternalRow getStruct (int x$1, int x$2)  ;
  static public abstract  org.apache.spark.sql.catalyst.util.ArrayData getArray (int x$1)  ;
  static public abstract  org.apache.spark.sql.catalyst.util.MapData getMap (int x$1)  ;
  static public abstract  java.lang.Object get (int x$1, org.apache.spark.sql.types.DataType x$2)  ;
  public   InternalRow ()  { throw new RuntimeException(); }
  public abstract  int numFields ()  ;
  public  java.lang.String getString (int ordinal)  { throw new RuntimeException(); }
  /**
   * Make a copy of the current {@link InternalRow} object.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalyst.InternalRow copy ()  ;
  /** Returns true if there are any NULL values in this row. */
  public abstract  boolean anyNull ()  ;
  /**
   * Return a Scala Seq representing the row. Elements are placed in the same order in the Seq.
   * @param fieldTypes (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> toSeq (scala.collection.Seq<org.apache.spark.sql.types.DataType> fieldTypes)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> toSeq (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
