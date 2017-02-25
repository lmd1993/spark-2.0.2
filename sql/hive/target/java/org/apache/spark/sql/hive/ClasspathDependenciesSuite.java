package org.apache.spark.sql.hive;
/**
 * Verify that some classes load and that others are not found on the classpath.
 * <p>
 * This is used to detect classpath and shading conflicts.
 */
public  class ClasspathDependenciesSuite extends org.apache.spark.SparkFunSuite {
  public   ClasspathDependenciesSuite ()  { throw new RuntimeException(); }
  private  java.lang.ClassLoader classloader ()  { throw new RuntimeException(); }
  private  void assertLoads (java.lang.String classname)  { throw new RuntimeException(); }
  private  java.net.URL findResource (java.lang.String classname)  { throw new RuntimeException(); }
  private  java.lang.String resourceName (java.lang.String classname)  { throw new RuntimeException(); }
  private  void assertClassNotFound (java.lang.String classname)  { throw new RuntimeException(); }
  private  java.lang.String STD_INSTANTIATOR ()  { throw new RuntimeException(); }
}
