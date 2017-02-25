package org.apache.spark.util.collection.unsafe.sort;
public  class RadixSortSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.internal.Logging {
  public   RadixSortSuite ()  { throw new RuntimeException(); }
  private  int N ()  { throw new RuntimeException(); }
  /**
   * Describes a type of sort to test, e.g. two's complement descending. Each sort type has
   * a defined reference ordering as well as radix sort parameters that can be used to
   * reproduce the given ordering.
   */
  public  class RadixSortType implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.util.collection.unsafe.sort.PrefixComparator referenceComparator ()  { throw new RuntimeException(); }
    public  int startByteIdx ()  { throw new RuntimeException(); }
    public  int endByteIdx ()  { throw new RuntimeException(); }
    public  boolean descending ()  { throw new RuntimeException(); }
    public  boolean signed ()  { throw new RuntimeException(); }
    // not preceding
    public   RadixSortType (java.lang.String name, org.apache.spark.util.collection.unsafe.sort.PrefixComparator referenceComparator, int startByteIdx, int endByteIdx, boolean descending, boolean signed)  { throw new RuntimeException(); }
  }
  public  class RadixSortType extends scala.runtime.AbstractFunction6<java.lang.String, org.apache.spark.util.collection.unsafe.sort.PrefixComparator, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.util.collection.unsafe.sort.RadixSortSuite.RadixSortType> implements scala.Serializable {
    public   RadixSortType ()  { throw new RuntimeException(); }
  }
  public  scala.collection.Seq<org.apache.spark.util.collection.unsafe.sort.RadixSortSuite.RadixSortType> SORT_TYPES_TO_TEST ()  { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.Long[], org.apache.spark.unsafe.array.LongArray> generateTestData (int size, scala.Function0<java.lang.Object> rand)  { throw new RuntimeException(); }
  private  scala.Tuple2<org.apache.spark.unsafe.array.LongArray, org.apache.spark.unsafe.array.LongArray> generateKeyPrefixTestData (int size, scala.Function0<java.lang.Object> rand)  { throw new RuntimeException(); }
  private  long[] collectToArray (org.apache.spark.unsafe.array.LongArray array, int offset, int length)  { throw new RuntimeException(); }
  private  java.util.Comparator<java.lang.Long> toJavaComparator (org.apache.spark.util.collection.unsafe.sort.PrefixComparator p)  { throw new RuntimeException(); }
  private  void referenceKeyPrefixSort (org.apache.spark.unsafe.array.LongArray buf, int lo, int hi, org.apache.spark.util.collection.unsafe.sort.PrefixComparator refCmp)  { throw new RuntimeException(); }
  private  void fuzzTest (java.lang.String name, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> testFn)  { throw new RuntimeException(); }
  public  long randomBitMask (scala.util.Random rand)  { throw new RuntimeException(); }
}
