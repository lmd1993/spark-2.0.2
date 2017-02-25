package org.apache.spark.sql.types;
public  class DecimalSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.PrivateMethodTester {
  public   DecimalSuite ()  { throw new RuntimeException(); }
  /** Check that a Decimal has the given string representation, precision and scale */
  private  void checkDecimal (org.apache.spark.sql.types.Decimal d, java.lang.String string, int precision, int scale)  { throw new RuntimeException(); }
  /** Check that a Decimal converts to the given double and long values */
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.math.BigDecimal> decimalVal ()  { throw new RuntimeException(); }
  /** Check whether a decimal is represented compactly (passing whether we expect it to be) */
  private  void checkCompact (org.apache.spark.sql.types.Decimal d, boolean expected)  { throw new RuntimeException(); }
}
