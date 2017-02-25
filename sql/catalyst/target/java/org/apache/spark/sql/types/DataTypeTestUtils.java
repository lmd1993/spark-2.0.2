package org.apache.spark.sql.types;
/**
 * Utility functions for working with DataTypes in tests.
 */
public  class DataTypeTestUtils {
  /**
   * Instances of all {@link IntegralType}s.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Set<org.apache.spark.sql.types.IntegralType> integralType ()  { throw new RuntimeException(); }
  /**
   * Instances of all {@link FractionalType}s, including both fixed- and unlimited-precision
   * decimal types.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Set<org.apache.spark.sql.types.FractionalType> fractionalTypes ()  { throw new RuntimeException(); }
  /**
   * Instances of all {@link NumericType}s.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Set<org.apache.spark.sql.types.NumericType> numericTypes ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<org.apache.spark.sql.types.DataType> numericTypeWithoutDecimal ()  { throw new RuntimeException(); }
  /**
   * Instances of all {@link NumericType}s and {@link CalendarIntervalType}
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Set<org.apache.spark.sql.types.DataType> numericAndInterval ()  { throw new RuntimeException(); }
  /**
   * All the types that support ordering
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Set<org.apache.spark.sql.types.DataType> ordered ()  { throw new RuntimeException(); }
  /**
   * All the types that we can use in a property check
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Set<org.apache.spark.sql.types.DataType> propertyCheckSupported ()  { throw new RuntimeException(); }
  /**
   * Instances of all {@link AtomicType}s.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Set<org.apache.spark.sql.types.DataType> atomicTypes ()  { throw new RuntimeException(); }
  /**
   * Instances of {@link ArrayType} for all {@link AtomicType}s. Arrays of these types may contain null.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Set<org.apache.spark.sql.types.ArrayType> atomicArrayTypes ()  { throw new RuntimeException(); }
}
