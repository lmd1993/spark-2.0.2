package org.apache.spark.sql.execution.streaming;
/** FakeFileSystem to test fallback of the HDFSMetadataLog from FileContext to FileSystem API */
public  class FakeFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  static public  java.lang.String scheme ()  { throw new RuntimeException(); }
  static public  void setConf (org.apache.hadoop.conf.Configuration x$1)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.conf.Configuration getConf ()  { throw new RuntimeException(); }
  static public  java.lang.String getScheme ()  { throw new RuntimeException(); }
  static protected  java.net.URI getCanonicalUri ()  { throw new RuntimeException(); }
  static protected  java.net.URI canonicalizeUri (java.net.URI x$1)  { throw new RuntimeException(); }
  static protected  int getDefaultPort ()  { throw new RuntimeException(); }
  static public  java.lang.String getCanonicalServiceName ()  { throw new RuntimeException(); }
  static public  java.lang.String getName ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path makeQualified (org.apache.hadoop.fs.Path x$1)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.security.token.Token<?> getDelegationToken (java.lang.String x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.security.token.Token<?>[] addDelegationTokens (java.lang.String x$1, org.apache.hadoop.security.Credentials x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileSystem[] getChildFileSystems ()  { throw new RuntimeException(); }
  static protected  void checkPath (org.apache.hadoop.fs.Path x$1)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.BlockLocation[] getFileBlockLocations (org.apache.hadoop.fs.FileStatus x$1, long x$2, long x$3) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.BlockLocation[] getFileBlockLocations (org.apache.hadoop.fs.Path x$1, long x$2, long x$3) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FsServerDefaults getServerDefaults () throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FsServerDefaults getServerDefaults (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path resolvePath (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataInputStream open (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path x$1, boolean x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.util.Progressable x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path x$1, short x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path x$1, short x$2, org.apache.hadoop.util.Progressable x$3) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path x$1, boolean x$2, int x$3) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path x$1, boolean x$2, int x$3, org.apache.hadoop.util.Progressable x$4) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path x$1, boolean x$2, int x$3, short x$4, long x$5) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.permission.FsPermission x$2, java.util.EnumSet<org.apache.hadoop.fs.CreateFlag> x$3, int x$4, short x$5, long x$6, org.apache.hadoop.util.Progressable x$7) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.permission.FsPermission x$2, java.util.EnumSet<org.apache.hadoop.fs.CreateFlag> x$3, int x$4, short x$5, long x$6, org.apache.hadoop.util.Progressable x$7, org.apache.hadoop.fs.Options.ChecksumOpt x$8) throws java.io.IOException { throw new RuntimeException(); }
  static protected  org.apache.hadoop.fs.FSDataOutputStream primitiveCreate (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.permission.FsPermission x$2, java.util.EnumSet<org.apache.hadoop.fs.CreateFlag> x$3, int x$4, short x$5, long x$6, org.apache.hadoop.util.Progressable x$7, org.apache.hadoop.fs.Options.ChecksumOpt x$8) throws java.io.IOException { throw new RuntimeException(); }
  static protected  void primitiveMkdir (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.permission.FsPermission x$2, boolean x$3) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream createNonRecursive (org.apache.hadoop.fs.Path x$1, boolean x$2, int x$3, short x$4, long x$5, org.apache.hadoop.util.Progressable x$6) throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean createNewFile (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream append (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream append (org.apache.hadoop.fs.Path x$1, int x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  void concat (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.Path[] x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  short getReplication (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean setReplication (org.apache.hadoop.fs.Path x$1, short x$2) throws java.io.IOException { throw new RuntimeException(); }
  static protected  void rename (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.Path x$2, org.apache.hadoop.fs.Options.Rename[] x$3) throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean delete (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean deleteOnExit (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean cancelDeleteOnExit (org.apache.hadoop.fs.Path x$1)  { throw new RuntimeException(); }
  static protected  void processDeleteOnExit ()  { throw new RuntimeException(); }
  static public  boolean exists (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean isDirectory (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean isFile (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  long getLength (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.ContentSummary getContentSummary (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.RemoteIterator<org.apache.hadoop.fs.Path> listCorruptFileBlocks (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileStatus[] listStatus (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.PathFilter x$2) throws java.io.IOException, java.io.FileNotFoundException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileStatus[] listStatus (org.apache.hadoop.fs.Path[] x$1) throws java.io.IOException, java.io.FileNotFoundException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileStatus[] listStatus (org.apache.hadoop.fs.Path[] x$1, org.apache.hadoop.fs.PathFilter x$2) throws java.io.IOException, java.io.FileNotFoundException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileStatus[] globStatus (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileStatus[] globStatus (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.PathFilter x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.RemoteIterator<org.apache.hadoop.fs.LocatedFileStatus> listLocatedStatus (org.apache.hadoop.fs.Path x$1) throws java.io.IOException, java.io.FileNotFoundException { throw new RuntimeException(); }
  static protected  org.apache.hadoop.fs.RemoteIterator<org.apache.hadoop.fs.LocatedFileStatus> listLocatedStatus (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.PathFilter x$2) throws java.io.IOException, java.io.FileNotFoundException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.RemoteIterator<org.apache.hadoop.fs.LocatedFileStatus> listFiles (org.apache.hadoop.fs.Path x$1, boolean x$2) throws java.io.IOException, java.io.FileNotFoundException { throw new RuntimeException(); }
  static public  void copyFromLocalFile (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.Path x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  void moveFromLocalFile (org.apache.hadoop.fs.Path[] x$1, org.apache.hadoop.fs.Path x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  void copyFromLocalFile (boolean x$1, org.apache.hadoop.fs.Path x$2, org.apache.hadoop.fs.Path x$3) throws java.io.IOException { throw new RuntimeException(); }
  static public  void copyFromLocalFile (boolean x$1, boolean x$2, org.apache.hadoop.fs.Path[] x$3, org.apache.hadoop.fs.Path x$4) throws java.io.IOException { throw new RuntimeException(); }
  static public  void copyFromLocalFile (boolean x$1, boolean x$2, org.apache.hadoop.fs.Path x$3, org.apache.hadoop.fs.Path x$4) throws java.io.IOException { throw new RuntimeException(); }
  static public  void copyToLocalFile (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.Path x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  void moveToLocalFile (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.Path x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  void copyToLocalFile (boolean x$1, org.apache.hadoop.fs.Path x$2, org.apache.hadoop.fs.Path x$3) throws java.io.IOException { throw new RuntimeException(); }
  static public  void copyToLocalFile (boolean x$1, org.apache.hadoop.fs.Path x$2, org.apache.hadoop.fs.Path x$3, boolean x$4) throws java.io.IOException { throw new RuntimeException(); }
  static public  long getUsed () throws java.io.IOException { throw new RuntimeException(); }
  static public  long getBlockSize (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  long getDefaultBlockSize ()  { throw new RuntimeException(); }
  static public  long getDefaultBlockSize (org.apache.hadoop.fs.Path x$1)  { throw new RuntimeException(); }
  static public  short getDefaultReplication ()  { throw new RuntimeException(); }
  static public  short getDefaultReplication (org.apache.hadoop.fs.Path x$1)  { throw new RuntimeException(); }
  static protected  org.apache.hadoop.fs.Path fixRelativePart (org.apache.hadoop.fs.Path x$1)  { throw new RuntimeException(); }
  static public  void createSymlink (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.Path x$2, boolean x$3) throws java.io.IOException, org.apache.hadoop.fs.UnsupportedFileSystemException, org.apache.hadoop.fs.ParentNotDirectoryException, java.io.FileNotFoundException, org.apache.hadoop.fs.FileAlreadyExistsException, org.apache.hadoop.security.AccessControlException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileStatus getFileLinkStatus (org.apache.hadoop.fs.Path x$1) throws java.io.IOException, org.apache.hadoop.fs.UnsupportedFileSystemException, java.io.FileNotFoundException, org.apache.hadoop.security.AccessControlException { throw new RuntimeException(); }
  static public  boolean supportsSymlinks ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path getLinkTarget (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static protected  org.apache.hadoop.fs.Path resolveLink (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileChecksum getFileChecksum (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  void setVerifyChecksum (boolean x$1)  { throw new RuntimeException(); }
  static public  void setWriteChecksum (boolean x$1)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FsStatus getStatus () throws java.io.IOException { throw new RuntimeException(); }
  static public final  org.apache.hadoop.fs.Path createSnapshot (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path createSnapshot (org.apache.hadoop.fs.Path x$1, java.lang.String x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  void renameSnapshot (org.apache.hadoop.fs.Path x$1, java.lang.String x$2, java.lang.String x$3) throws java.io.IOException { throw new RuntimeException(); }
  static public  void deleteSnapshot (org.apache.hadoop.fs.Path x$1, java.lang.String x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  java.io.File pathToFile (org.apache.hadoop.fs.Path x$1)  { throw new RuntimeException(); }
  static public  void initialize (java.net.URI x$1, org.apache.hadoop.conf.Configuration x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataInputStream open (org.apache.hadoop.fs.Path x$1, int x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream append (org.apache.hadoop.fs.Path x$1, int x$2, org.apache.hadoop.util.Progressable x$3) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path x$1, boolean x$2, int x$3, short x$4, long x$5, org.apache.hadoop.util.Progressable x$6) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream createNonRecursive (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.permission.FsPermission x$2, java.util.EnumSet<org.apache.hadoop.fs.CreateFlag> x$3, int x$4, short x$5, long x$6, org.apache.hadoop.util.Progressable x$7) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.permission.FsPermission x$2, boolean x$3, int x$4, short x$5, long x$6, org.apache.hadoop.util.Progressable x$7) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataOutputStream createNonRecursive (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.permission.FsPermission x$2, boolean x$3, int x$4, short x$5, long x$6, org.apache.hadoop.util.Progressable x$7) throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean rename (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.Path x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean delete (org.apache.hadoop.fs.Path x$1, boolean x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileStatus[] listStatus (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean mkdirs (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean mkdirs (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.permission.FsPermission x$2) throws java.io.IOException { throw new RuntimeException(); }
  static protected  boolean primitiveMkdir (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.permission.FsPermission x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path getHomeDirectory ()  { throw new RuntimeException(); }
  static public  void setWorkingDirectory (org.apache.hadoop.fs.Path x$1)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path getWorkingDirectory ()  { throw new RuntimeException(); }
  static protected  org.apache.hadoop.fs.Path getInitialWorkingDirectory ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FsStatus getStatus (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  void moveFromLocalFile (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.Path x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path startLocalOutput (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.Path x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  void completeLocalOutput (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.Path x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  void close () throws java.io.IOException { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileStatus getFileStatus (org.apache.hadoop.fs.Path x$1) throws java.io.IOException { throw new RuntimeException(); }
  static public  void setOwner (org.apache.hadoop.fs.Path x$1, java.lang.String x$2, java.lang.String x$3) throws java.io.IOException { throw new RuntimeException(); }
  static public  void setPermission (org.apache.hadoop.fs.Path x$1, org.apache.hadoop.fs.permission.FsPermission x$2) throws java.io.IOException { throw new RuntimeException(); }
  static public  void setTimes (org.apache.hadoop.fs.Path x$1, long x$2, long x$3) throws java.io.IOException { throw new RuntimeException(); }
  public   FakeFileSystem ()  { throw new RuntimeException(); }
  public  java.net.URI getUri ()  { throw new RuntimeException(); }
}
