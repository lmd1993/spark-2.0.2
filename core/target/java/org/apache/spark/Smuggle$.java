package org.apache.spark;
public  class Smuggle$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Smuggle$ MODULE$ = null;
  public   Smuggle$ ()  { throw new RuntimeException(); }
  /**
   * Wraps the specified object to be smuggled into a serialized task without
   * being serialized itself.
   * <p>
   * @param smuggledObject
   * @tparam T
   * @return Smuggle wrapper around smuggledObject.
   */
  public <T extends java.lang.Object> org.apache.spark.Smuggle<T> apply (T smuggledObject)  { throw new RuntimeException(); }
  private  java.util.concurrent.locks.ReentrantReadWriteLock lock ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.WeakHashMap<scala.Symbol, java.lang.Object> smuggledObjects ()  { throw new RuntimeException(); }
  private <T extends java.lang.Object> T get (scala.Symbol key)  { throw new RuntimeException(); }
  /**
   * Implicit conversion of a Smuggle wrapper to the object being smuggled.
   * <p>
   * @param smuggle the wrapper to unpack.
   * @tparam T
   * @return the smuggled object represented by the wrapper.
   */
  public <T extends java.lang.Object> T unpackSmuggledObject (org.apache.spark.Smuggle<T> smuggle)  { throw new RuntimeException(); }
}
