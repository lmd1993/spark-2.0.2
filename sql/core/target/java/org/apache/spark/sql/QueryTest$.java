package org.apache.spark.sql;
public  class QueryTest$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final QueryTest$ MODULE$ = null;
  public   QueryTest$ ()  { throw new RuntimeException(); }
  /**
   * Runs the plan and makes sure the answer matches the expected result.
   * If there was exception during the execution or the contents of the DataFrame does not
   * match the expected result, an error message will be returned. Otherwise, a {@link None} will
   * be returned.
   * <p>
   * @param df the {@link DataFrame} to be executed
   * @param expectedAnswer the expected result in a {@link Seq} of {@link Row}s.
   * @param checkToRDD whether to verify deserialization to an RDD. This runs the query twice.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> checkAnswer (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer, boolean checkToRDD)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> prepareAnswer (scala.collection.Seq<org.apache.spark.sql.Row> answer, boolean isSorted)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Row prepareRow (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> sameRows (scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer, scala.collection.Seq<org.apache.spark.sql.Row> sparkAnswer, boolean isSorted)  { throw new RuntimeException(); }
  /**
   * Runs the plan and makes sure the answer is within absTol of the expected result.
   * <p>
   * @param actualAnswer the actual result in a {@link Row}.
   * @param expectedAnswer the expected result in a{@link Row}.
   * @param absTol the absolute tolerance between actual and expected answers.
   */
  protected  void checkAggregatesWithTol (org.apache.spark.sql.Row actualAnswer, org.apache.spark.sql.Row expectedAnswer, double absTol)  { throw new RuntimeException(); }
  public  java.lang.String checkAnswer (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.util.List<org.apache.spark.sql.Row> expectedAnswer)  { throw new RuntimeException(); }
}
