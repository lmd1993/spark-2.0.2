package org.apache.spark.ui.exec;
  class ExecutorsPage extends org.apache.spark.ui.WebUIPage {
  /** Represent an executor's info as a map given a storage status index */
  static public  org.apache.spark.status.api.v1.ExecutorSummary getExecInfo (org.apache.spark.ui.exec.ExecutorsListener listener, int statusId, boolean isActive)  { throw new RuntimeException(); }
  static public  java.lang.String prefix ()  { throw new RuntimeException(); }
  static public  void prefix_$eq (java.lang.String x$1)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue renderJson (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  public   ExecutorsPage (org.apache.spark.ui.exec.ExecutorsTab parent, boolean threadDumpEnabled)  { throw new RuntimeException(); }
  private  org.apache.spark.ui.exec.ExecutorsListener listener ()  { throw new RuntimeException(); }
  private  double GCTimePercent ()  { throw new RuntimeException(); }
  private  int idStrToInt (java.lang.String str)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  /** Render an HTML row representing an executor */
  private  scala.collection.Seq<scala.xml.Node> execRow (org.apache.spark.status.api.v1.ExecutorSummary info, boolean logsExist)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> execSummaryRow (scala.collection.Seq<org.apache.spark.status.api.v1.ExecutorSummary> execInfo, java.lang.String rowName)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> execSummary (scala.collection.Seq<org.apache.spark.status.api.v1.ExecutorSummary> activeExecInfo, scala.collection.Seq<org.apache.spark.status.api.v1.ExecutorSummary> deadExecInfo)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> taskData (int maxTasks, int activeTasks, int failedTasks, int completedTasks, int totalTasks, long totalDuration, long totalGCTime)  { throw new RuntimeException(); }
}
