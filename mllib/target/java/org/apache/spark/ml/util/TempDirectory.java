package org.apache.spark.ml.util;
/**
 * Trait that creates a temporary directory before all tests and deletes it after all.
 */
public  interface TempDirectory extends org.scalatest.BeforeAndAfterAll {
  public  java.io.File _tempDir ()  ;
  /** Returns the temporary directory as a {@link File} instance. */
  public  java.io.File tempDir ()  ;
  public  void beforeAll ()  ;
  public  void afterAll ()  ;
}
