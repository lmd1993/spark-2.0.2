package org.apache.spark.sql.catalyst;
/**
 * Interface for configuration options used in the catalyst module.
 */
public  interface CatalystConf {
  public  boolean caseSensitiveAnalysis ()  ;
  public  boolean orderByOrdinal ()  ;
  public  boolean groupByOrdinal ()  ;
  public  int optimizerMaxIterations ()  ;
  public  int optimizerInSetConversionThreshold ()  ;
  public  int maxCaseBranchesForCodegen ()  ;
  public  boolean runSQLonFile ()  ;
  public  java.lang.String warehousePath ()  ;
  /**
   * Returns the {@link Resolver} for the current configuration, which can be used to determine if two
   * identifiers are equal.
   * @return (undocumented)
   */
  public  scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver ()  ;
}
