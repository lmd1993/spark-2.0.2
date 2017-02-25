package org.apache.spark.sql.execution.datasources;
public  class CompressionCodecs {
  static private  scala.collection.immutable.Map<java.lang.String, java.lang.String> shortCompressionCodecNames ()  { throw new RuntimeException(); }
  /**
   * Return the full version of the given codec class.
   * If it is already a class name, just return it.
   * @param name (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String getCodecClassName (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Set compression configurations to Hadoop <code>Configuration</code>.
   * <code>codec</code> should be a full class path
   * @param conf (undocumented)
   * @param codec (undocumented)
   */
  static public  void setCodecConfiguration (org.apache.hadoop.conf.Configuration conf, java.lang.String codec)  { throw new RuntimeException(); }
}
