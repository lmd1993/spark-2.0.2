package org.apache.spark.sql.execution;
public  interface DataSourceScanExec extends org.apache.spark.sql.execution.LeafExecNode {
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> rdd ()  ;
  public  org.apache.spark.sql.sources.BaseRelation relation ()  ;
  public  scala.Option<org.apache.spark.sql.catalyst.TableIdentifier> metastoreTableIdentifier ()  ;
  public  java.lang.String nodeName ()  ;
  public  boolean sameResult (org.apache.spark.sql.execution.SparkPlan plan)  ;
}
