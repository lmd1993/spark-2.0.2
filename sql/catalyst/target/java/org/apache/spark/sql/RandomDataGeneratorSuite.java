package org.apache.spark.sql;
/**
 * Tests of {@link RandomDataGenerator}.
 */
public  class RandomDataGeneratorSuite extends org.apache.spark.SparkFunSuite {
  public   RandomDataGeneratorSuite ()  { throw new RuntimeException(); }
  /**
   * Tests random data generation for the given type by using it to generate random values then
   * converting those values into their Catalyst equivalents using CatalystTypeConverters.
   * @param dataType (undocumented)
   * @param nullable (undocumented)
   */
  public  void testRandomDataGeneration (org.apache.spark.sql.types.DataType dataType, boolean nullable)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.types.DataType> atomicTypesWithDataGenerators ()  { throw new RuntimeException(); }
}
