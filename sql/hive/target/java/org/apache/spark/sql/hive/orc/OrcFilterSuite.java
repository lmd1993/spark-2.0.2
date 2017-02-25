package org.apache.spark.sql.hive.orc;
/**
 * A test suite that tests ORC filter API based filter pushdown optimization.
 */
public  class OrcFilterSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.hive.orc.OrcTest {
  public   OrcFilterSuite ()  { throw new RuntimeException(); }
  private  void checkFilterPredicate (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, org.apache.spark.sql.catalyst.expressions.Predicate predicate, scala.Function1<org.apache.hadoop.hive.ql.io.sarg.SearchArgument, scala.runtime.BoxedUnit> checker)  { throw new RuntimeException(); }
  private  void checkFilterPredicate (org.apache.spark.sql.catalyst.expressions.Predicate predicate, org.apache.hadoop.hive.ql.io.sarg.PredicateLeaf.Operator filterOperator, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  private  void checkFilterPredicate (org.apache.spark.sql.catalyst.expressions.Predicate predicate, java.lang.String stringExpr, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  private  void checkNoFilterPredicate (org.apache.spark.sql.catalyst.expressions.Predicate predicate, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
}
