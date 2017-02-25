package org.apache.spark.sql.catalyst.analysis;
public  interface AnalysisTest {
  public  org.apache.spark.sql.catalyst.analysis.Analyzer caseSensitiveAnalyzer ()  ;
  public  org.apache.spark.sql.catalyst.analysis.Analyzer caseInsensitiveAnalyzer ()  ;
  public  org.apache.spark.sql.catalyst.analysis.Analyzer makeAnalyzer (boolean caseSensitive)  ;
  public  org.apache.spark.sql.catalyst.analysis.Analyzer getAnalyzer (boolean caseSensitive)  ;
  public  void checkAnalysis (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan inputPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan expectedPlan, boolean caseSensitive)  ;
  public  void assertAnalysisSuccess (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan inputPlan, boolean caseSensitive)  ;
  public  void assertAnalysisError (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan inputPlan, scala.collection.Seq<java.lang.String> expectedErrors, boolean caseSensitive)  ;
}
