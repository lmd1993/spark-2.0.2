package org.apache.spark.examples
import org.apache.spark.SparkContext

import scala.language.implicitConversions
/**
  * Created by MingdaLi on 2/25/17.
  */
package object connector {
  implicit def toSparkContextFunctions(sc: SparkContext): SparkContextFunctions =
    new SparkContextFunctions(sc)
}
