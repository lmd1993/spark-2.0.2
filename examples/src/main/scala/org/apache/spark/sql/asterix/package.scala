package org.apache.spark.sql

import scala.language.implicitConversions
/**
  * Created by MingdaLi on 2/25/17.
  *  Makes Spark SQLContext accepts AsterixDB queries.
  */
package object asterix {
  implicit def toSparkSQLContextFunctions(sqlContext: SQLContext): SQLContextFunctions =
    new SQLContextFunctions(sqlContext)
}
