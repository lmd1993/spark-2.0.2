package org.apache.spark.ml.util;
/**
 * :: DeveloperApi ::
 * <p>
 * Helper trait for making simple {@link Params} types readable.  If a {@link Params} class stores
 * all data as {@link org.apache.spark.ml.param.Param} values, then extending this trait will provide
 * a default implementation of reading saved instances of the class.
 * This only handles simple {@link org.apache.spark.ml.param.Param} types; e.g., it will not handle
 * {@link org.apache.spark.sql.Dataset}.
 * <p>
 * @tparam T ML instance type
 * @see  {@link DefaultParamsWritable}, the counterpart to this trait
 */
public  interface DefaultParamsReadable<T extends java.lang.Object> extends org.apache.spark.ml.util.MLReadable<T> {
  public  org.apache.spark.ml.util.MLReader<T> read ()  ;
}
