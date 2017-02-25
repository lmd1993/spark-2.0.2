package org.apache.spark.examples.connector

/**
  * Created by MingdaLi on 2/21/17.
  */
object QueryType extends Enumeration {
  type QueryType = Value
  val AQL = Value("aql")
  val SQLPP = Value("sqlpp")
}
