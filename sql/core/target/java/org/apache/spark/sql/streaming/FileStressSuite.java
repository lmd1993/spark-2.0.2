package org.apache.spark.sql.streaming;
/**
 * A stress test for streaming queries that read and write files.  This test consists of
 * two threads:
 *  - one that writes out <code>numRecords</code> distinct integers to files of random sizes (the total
 *    number of records is fixed but each files size / creation time is random).
 *  - another that continually restarts a buggy streaming query (i.e. fails with 5% probability on
 *    any partition).
 * <p>
 * At the end, the resulting files are loaded and the answer is checked.
 */
public  class FileStressSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.streaming.StreamTest {
  public   FileStressSuite ()  { throw new RuntimeException(); }
  public  void stressTest (boolean partitionWrites)  { throw new RuntimeException(); }
}
