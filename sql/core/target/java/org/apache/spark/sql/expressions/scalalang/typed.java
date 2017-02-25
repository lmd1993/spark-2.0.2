package org.apache.spark.sql.expressions.scalalang;
/**
 * :: Experimental ::
 * Type-safe functions available for {@link Dataset} operations in Scala.
 * <p>
 * Java users should use {@link org.apache.spark.sql.expressions.javalang.typed}.
 * <p>
 * @since 2.0.0
 */
public  class typed {
  static private  org.apache.spark.sql.SQLImplicits implicits ()  { throw new RuntimeException(); }
  /**
   * Average aggregate function.
   * <p>
   * @since 2.0.0
   * @param f (undocumented)
   * @return (undocumented)
   */
  static public <IN extends java.lang.Object> org.apache.spark.sql.TypedColumn<IN, java.lang.Object> avg (scala.Function1<IN, java.lang.Object> f)  { throw new RuntimeException(); }
  /**
   * Count aggregate function.
   * <p>
   * @since 2.0.0
   * @param f (undocumented)
   * @return (undocumented)
   */
  static public <IN extends java.lang.Object> org.apache.spark.sql.TypedColumn<IN, java.lang.Object> count (scala.Function1<IN, java.lang.Object> f)  { throw new RuntimeException(); }
  /**
   * Sum aggregate function for floating point (double) type.
   * <p>
   * @since 2.0.0
   * @param f (undocumented)
   * @return (undocumented)
   */
  static public <IN extends java.lang.Object> org.apache.spark.sql.TypedColumn<IN, java.lang.Object> sum (scala.Function1<IN, java.lang.Object> f)  { throw new RuntimeException(); }
  /**
   * Sum aggregate function for integral (long, i.e. 64 bit integer) type.
   * <p>
   * @since 2.0.0
   * @param f (undocumented)
   * @return (undocumented)
   */
  static public <IN extends java.lang.Object> org.apache.spark.sql.TypedColumn<IN, java.lang.Object> sumLong (scala.Function1<IN, java.lang.Object> f)  { throw new RuntimeException(); }
}
