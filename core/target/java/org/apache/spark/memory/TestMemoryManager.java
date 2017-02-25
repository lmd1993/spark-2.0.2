package org.apache.spark.memory;
public  class TestMemoryManager extends org.apache.spark.memory.MemoryManager {
  public   TestMemoryManager (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    long acquireExecutionMemory (long numBytes, long taskAttemptId, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  boolean acquireStorageMemory (org.apache.spark.storage.BlockId blockId, long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  boolean acquireUnrollMemory (org.apache.spark.storage.BlockId blockId, long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  void releaseStorageMemory (long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
    void releaseExecutionMemory (long numBytes, long taskAttemptId, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  long maxOnHeapStorageMemory ()  { throw new RuntimeException(); }
  private  boolean oomOnce ()  { throw new RuntimeException(); }
  private  long available ()  { throw new RuntimeException(); }
  public  void markExecutionAsOutOfMemoryOnce ()  { throw new RuntimeException(); }
  public  void limit (long avail)  { throw new RuntimeException(); }
}
