package org.apache.spark.examples.connector.rdd
import org.apache.spark.examples.connector.{Handle, AddressPortPair}
import org.apache.spark.Partition
/**
  * Created by MingdaLi on 2/21/17.
  */

trait LocationPartition extends Partition{
}
/**
  * AsterixDB result partition information holder.
  * Result partition is identified by (index, address, port).
  *
  * @param index partition number
  * @param handle AsterixDB query result handle
  * @param location The address and the port of the result in Hyracks cluster.
  */
case class AsterixPartition (index: Int,
                        handle: Handle,
                        location:AddressPortPair) extends LocationPartition
