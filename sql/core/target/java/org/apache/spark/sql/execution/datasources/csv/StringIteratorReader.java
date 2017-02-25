package org.apache.spark.sql.execution.datasources.csv;
/**
 * A Reader that "reads" from a sequence of lines. Spark's textFile method removes newlines at
 * end of each line Univocity parser requires a Reader that provides access to the data to be
 * parsed and needs the newlines to be present
 * param:  iter iterator over RDD[String]
 */
public  class StringIteratorReader extends java.io.Reader {
  public  scala.collection.Iterator<java.lang.String> iter ()  { throw new RuntimeException(); }
  // not preceding
  public   StringIteratorReader (scala.collection.Iterator<java.lang.String> iter)  { throw new RuntimeException(); }
  private  long next ()  { throw new RuntimeException(); }
  private  long length ()  { throw new RuntimeException(); }
  private  long start ()  { throw new RuntimeException(); }
  private  java.lang.String str ()  { throw new RuntimeException(); }
  /**
   * fetch next string from iter, if done with current one
   * pretend there is a new line at the end of every string we get from from iter
   */
  private  void refill ()  { throw new RuntimeException(); }
  /**
   * read the next character, if at end of string pretend there is a new line
   * @return (undocumented)
   */
  public  int read ()  { throw new RuntimeException(); }
  /**
   * read from str into cbuf
   * @param cbuf (undocumented)
   * @param off (undocumented)
   * @param len (undocumented)
   * @return (undocumented)
   */
  public  int read (char[] cbuf, int off, int len)  { throw new RuntimeException(); }
  public  long skip (long ns)  { throw new RuntimeException(); }
  public  boolean ready ()  { throw new RuntimeException(); }
  public  boolean markSupported ()  { throw new RuntimeException(); }
  public  void mark (int readAheadLimit)  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
