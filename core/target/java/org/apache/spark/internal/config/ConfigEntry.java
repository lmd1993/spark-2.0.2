package org.apache.spark.internal.config;
/**
 * An entry contains all meta information for a configuration.
 * <p>
 * param:  key the key for the configuration
 * param:  defaultValue the default value for the configuration
 * param:  valueConverter how to convert a string to the value. It should throw an exception if the
 *                       string does not have the required format.
 * param:  stringConverter how to convert a value to a string that the user can use it as a valid
 *                        string value. It's usually <code>toString</code>. But sometimes, a custom converter
 *                        is necessary. E.g., if T is List[String], <code>a, b, c</code> is better than
 *                        <code>List(a, b, c)</code>.
 * param:  doc the documentation for the configuration
 * param:  isPublic if this configuration is public to the user. If it's <code>false</code>, this
 *                 configuration is only used internally and we should not expose it to users.
 * @tparam T the value type
 */
 abstract class ConfigEntry<T extends java.lang.Object> {
  public  java.lang.String key ()  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.String, T> valueConverter ()  { throw new RuntimeException(); }
  public  scala.Function1<T, java.lang.String> stringConverter ()  { throw new RuntimeException(); }
  public  java.lang.String doc ()  { throw new RuntimeException(); }
  public  boolean isPublic ()  { throw new RuntimeException(); }
  // not preceding
  public   ConfigEntry (java.lang.String key, scala.Function1<java.lang.String, T> valueConverter, scala.Function1<T, java.lang.String> stringConverter, java.lang.String doc, boolean isPublic)  { throw new RuntimeException(); }
  public abstract  java.lang.String defaultValueString ()  ;
  public abstract  T readFrom (org.apache.spark.SparkConf conf)  ;
  public  scala.Option<T> defaultValue ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
