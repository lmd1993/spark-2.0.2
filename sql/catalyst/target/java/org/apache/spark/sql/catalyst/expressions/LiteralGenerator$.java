package org.apache.spark.sql.catalyst.expressions;
/**
 * Property is a high-level specification of behavior that should hold for a range of data points.
 * <p>
 * For example, while we are evaluating a deterministic expression for some input, we should always
 * hold the property that the result never changes, regardless of how we get the result,
 * via interpreted or codegen.
 * <p>
 * In ScalaTest, properties are specified as functions and the data points used to check properties
 * can be supplied by either tables or generators.
 * <p>
 * Generator-driven property checks are performed via integration with ScalaCheck.
 * <p>
 * @example <pre><code>
 *   def toTest(i: Int): Boolean = if (i % 2 == 0) true else false
 *
 *   import org.scalacheck.Gen
 *
 *   test ("true if param is even") {
 *     val evenInts = for (n &lt;- Gen.choose(-1000, 1000)) yield 2 * n
 *     forAll(evenInts) { (i: Int) =&gt;
 *       assert (toTest(i) === true)
 *     }
 *   }
 * </code></pre>
 * <p>
 */
public  class LiteralGenerator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LiteralGenerator$ MODULE$ = null;
  public   LiteralGenerator$ ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> byteLiteralGen ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> shortLiteralGen ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> integerLiteralGen ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> longLiteralGen ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> floatLiteralGen ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> doubleLiteralGen ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> decimalLiteralGen (int precision, int scale)  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> stringLiteralGen ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> binaryLiteralGen ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> booleanLiteralGen ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> dateLiteralGen ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> timestampLiteralGen ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> calendarIntervalLiterGen ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> limitedIntegerLiteralGen ()  { throw new RuntimeException(); }
  public  org.scalacheck.Gen<org.apache.spark.sql.catalyst.expressions.Literal> randomGen (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
}
