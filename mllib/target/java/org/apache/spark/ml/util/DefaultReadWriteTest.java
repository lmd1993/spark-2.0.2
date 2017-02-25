package org.apache.spark.ml.util;
public  interface DefaultReadWriteTest extends org.apache.spark.ml.util.TempDirectory {
  /**
   * Checks "overwrite" option and params.
   * This saves to and loads from {@link tempDir}, but creates a subdirectory with a random name
   * in order to avoid conflicts from multiple calls to this method.
   * <p>
   * @param instance ML instance to test saving/loading
   * @param testParams  If true, then test values of Params.  Otherwise, just test overwrite option.
   * @tparam T ML instance type
   * @return  Instance loaded from file
   */
  public <T extends org.apache.spark.ml.param.Params> T testDefaultReadWrite (T instance, boolean testParams)  ;
  /**
   * Default test for Estimator, Model pairs:
   *  - Explicitly set Params, and train model
   *  - Test save/load using {@link testDefaultReadWrite()} on Estimator and Model
   *  - Check Params on Estimator and Model
   *  - Compare model data
   * <p>
   * This requires that the {@link Estimator} and {@link Model} share the same set of {@link Param}s.
   * <p>
   * @param estimator  Estimator to test
   * @param dataset  Dataset to pass to {@link Estimator.fit()}
   * @param testParams  Set of {@link Param} values to set in estimator
   * @param checkModelData  Method which takes the original and loaded {@link Model} and compares their
   *                        data.  This method does not need to check {@link Param} values.
   * @tparam E  Type of {@link Estimator}
   * @tparam M  Type of {@link Model} produced by estimator
   */
  public <E extends org.apache.spark.ml.Estimator<M>, M extends org.apache.spark.ml.Model<M>> void testEstimatorAndModelReadWrite (E estimator, org.apache.spark.sql.Dataset<?> dataset, scala.collection.immutable.Map<java.lang.String, java.lang.Object> testParams, scala.Function2<M, M, scala.runtime.BoxedUnit> checkModelData)  ;
}
