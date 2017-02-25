package org.apache.spark.sql.catalyst.encoders;
public  class ExpressionEncoderSuite extends org.apache.spark.sql.catalyst.plans.PlanTest implements org.apache.spark.sql.catalyst.analysis.AnalysisTest {
  public   ExpressionEncoderSuite ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> encoder (scala.reflect.api.TypeTags.TypeTag<T> evidence$1)  { throw new RuntimeException(); }
  private <T extends scala.Product> void productTest (T input, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> evidence$2)  { throw new RuntimeException(); }
  public  class InnerClass implements scala.Product, scala.Serializable {
    public  int i ()  { throw new RuntimeException(); }
    // not preceding
    public   InnerClass (int i)  { throw new RuntimeException(); }
  }
  public  class InnerClass extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.InnerClass> implements scala.Serializable {
    public   InnerClass ()  { throw new RuntimeException(); }
  }
  private <T extends java.lang.Object> void encodeDecodeTest (T input, java.lang.String testName, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> evidence$4)  { throw new RuntimeException(); }
}
