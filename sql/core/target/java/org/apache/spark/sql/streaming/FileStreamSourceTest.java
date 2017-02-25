package org.apache.spark.sql.streaming;
public  class FileStreamSourceTest extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.streaming.StreamTest, org.apache.spark.sql.test.SharedSQLContext, org.scalatest.PrivateMethodTester {
  public   FileStreamSourceTest ()  { throw new RuntimeException(); }
  /**
   * A subclass {@link AddData} for adding data to files. This is meant to use the
   * {@link FileStreamSource} actually being used in the execution.
   */
  public abstract class AddFileData implements org.apache.spark.sql.streaming.StreamTest.AddData {
    public   AddFileData ()  { throw new RuntimeException(); }
    public  scala.Tuple2<org.apache.spark.sql.execution.streaming.Source, org.apache.spark.sql.execution.streaming.Offset> addData (scala.Option<org.apache.spark.sql.execution.streaming.StreamExecution> query)  { throw new RuntimeException(); }
    protected abstract  void addData (org.apache.spark.sql.execution.streaming.FileStreamSource source)  ;
  }
  public  class AddTextFileData extends org.apache.spark.sql.streaming.FileStreamSourceTest.AddFileData implements scala.Product, scala.Serializable {
    public  java.lang.String content ()  { throw new RuntimeException(); }
    public  java.io.File src ()  { throw new RuntimeException(); }
    public  java.io.File tmp ()  { throw new RuntimeException(); }
    // not preceding
    public   AddTextFileData (java.lang.String content, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
    public  void addData (org.apache.spark.sql.execution.streaming.FileStreamSource source)  { throw new RuntimeException(); }
  }
  public  class AddTextFileData extends scala.runtime.AbstractFunction3<java.lang.String, java.io.File, java.io.File, org.apache.spark.sql.streaming.FileStreamSourceTest.AddTextFileData> implements scala.Serializable {
    public   AddTextFileData ()  { throw new RuntimeException(); }
  }
  public  class AddParquetFileData extends org.apache.spark.sql.streaming.FileStreamSourceTest.AddFileData implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data ()  { throw new RuntimeException(); }
    public  java.io.File src ()  { throw new RuntimeException(); }
    public  java.io.File tmp ()  { throw new RuntimeException(); }
    // not preceding
    public   AddParquetFileData (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
    public  void addData (org.apache.spark.sql.execution.streaming.FileStreamSource source)  { throw new RuntimeException(); }
  }
  public  class AddParquetFileData implements scala.Serializable {
    public   AddParquetFileData ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.FileStreamSourceTest.AddParquetFileData apply (scala.collection.Seq<java.lang.String> seq, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
    /** Write parquet files in a temp dir, and move the individual files to the 'src' dir */
    public  void writeToFile (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.streaming.FileStreamSourceTest.AddParquetFileData$ AddParquetFileData ()  { throw new RuntimeException(); }
  /** Use `format` and `path` to create FileStreamSource via DataFrameReader */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createFileStream (java.lang.String format, java.lang.String path, scala.Option<org.apache.spark.sql.types.StructType> schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.FileStreamSource getSourceFromFileStream (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  protected  void withTempDirs (scala.Function2<java.io.File, java.io.File, scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType valueSchema ()  { throw new RuntimeException(); }
}
