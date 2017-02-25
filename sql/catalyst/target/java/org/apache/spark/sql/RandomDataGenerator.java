package org.apache.spark.sql;
/**
 * Random data generators for Spark SQL DataTypes. These generators do not generate uniformly random
 * values; instead, they're biased to return "interesting" values (such as maximum / minimum values)
 * with higher probability.
 */
public  class RandomDataGenerator {
  /**
   * The conditional probability of a non-null value being drawn from a set of "interesting" values
   * instead of being chosen uniformly at random.
   * @return (undocumented)
   */
  static private  float PROBABILITY_OF_INTERESTING_VALUE ()  { throw new RuntimeException(); }
  /**
   * The probability of the generated value being null
   * @return (undocumented)
   */
  static private  float PROBABILITY_OF_NULL ()  { throw new RuntimeException(); }
  static public final  int MAX_STR_LEN ()  { throw new RuntimeException(); }
  static public final  int MAX_ARR_SIZE ()  { throw new RuntimeException(); }
  static public final  int MAX_MAP_SIZE ()  { throw new RuntimeException(); }
  /**
   * Helper function for constructing a biased random number generator which returns "interesting"
   * values with a higher probability.
   * @param rand (undocumented)
   * @param uniformRand (undocumented)
   * @param interestingValues (undocumented)
   * @return (undocumented)
   */
  static private <T extends java.lang.Object> scala.Some<scala.Function0<T>> randomNumeric (scala.util.Random rand, scala.Function1<scala.util.Random, T> uniformRand, scala.collection.Seq<T> interestingValues)  { throw new RuntimeException(); }
  /**
   * Returns a randomly generated schema, based on the given accepted types.
   * <p>
   * @param numFields the number of fields in this schema
   * @param acceptedTypes types to draw from.
   * @param rand (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.types.StructType randomSchema (scala.util.Random rand, int numFields, scala.collection.Seq<org.apache.spark.sql.types.DataType> acceptedTypes)  { throw new RuntimeException(); }
  /**
   * Returns a random nested schema. This will randomly generate structs and arrays drawn from
   * acceptedTypes.
   * @param rand (undocumented)
   * @param totalFields (undocumented)
   * @param acceptedTypes (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.types.StructType randomNestedSchema (scala.util.Random rand, int totalFields, scala.collection.Seq<org.apache.spark.sql.types.DataType> acceptedTypes)  { throw new RuntimeException(); }
  /**
   * Returns a function which generates random values for the given {@link DataType}, or <code>None</code> if no
   * random data generator is defined for that data type. The generated values will use an external
   * representation of the data type; for example, the random generator for {@link DateType} will return
   * instances of {@link java.sql.Date} and the generator for {@link StructType} will return a {@link Row}.
   * For a {@link UserDefinedType} for a class X, an instance of class X is returned.
   * <p>
   * @param dataType the type to generate values for
   * @param nullable whether null values should be generated
   * @param rand an optional random number generator
   * @return a function which can be called to generate random values.
   */
  static public  scala.Option<scala.Function0<java.lang.Object>> forType (org.apache.spark.sql.types.DataType dataType, boolean nullable, scala.util.Random rand)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Row randomRow (scala.util.Random rand, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
