package org.apache.spark.examples.connector.result
import org.apache.spark.examples.connector.AsterixClient

/**
  * Created by MingdaLi on 2/21/17.
  */
/**
  * AsterixDB result iterator for AsterixRDD.
  *
  * @param resultReader AsterixResultReader to get the JSON format.
  * @tparam String String JSON format.
  */
class AsterixResultIterator[String] (resultReader: AsterixResultReader) extends Iterator[String] {

  private[this] val resultClient = new AsterixClient(resultReader)

  /**
    * Converts [[java.lang.String]] to [[String]]
    * @return
    */
  override def next(): String = resultClient.getResultTuple.asInstanceOf[String]

  override def hasNext: Boolean = resultClient.hasNext
}
