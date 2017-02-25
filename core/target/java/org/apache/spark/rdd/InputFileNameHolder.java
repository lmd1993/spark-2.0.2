package org.apache.spark.rdd;
/**
 * This holds file names of the current Spark task. This is used in HadoopRDD,
 * FileScanRDD, NewHadoopRDD and InputFileName function in Spark SQL.
 */
public  class InputFileNameHolder {
  /**
   * The thread variable for the name of the current file being read. This is used by
   * the InputFileName function in Spark SQL.
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.UTF8String getInputFileName ()  { throw new RuntimeException(); }
  static   void setInputFileName (java.lang.String file)  { throw new RuntimeException(); }
  static   void unsetInputFileName ()  { throw new RuntimeException(); }
}
