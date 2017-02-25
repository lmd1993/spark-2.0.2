package org.apache.spark.examples.connector.result

/**
  * Created by MingdaLi on 2/21/17.
  */
import java.net.InetSocketAddress
import java.nio.ByteBuffer


import org.apache.spark.examples.connector.{Configuration, AsterixConnectorException, Handle, AddressPortPair,DatasetInputChannelMonitor}
import org.apache.hyracks.api.comm.{FrameHelper, IFrame}
import org.apache.hyracks.api.dataset.IDatasetInputChannelMonitor
import org.apache.hyracks.client.dataset.DatasetClientContext
import org.apache.hyracks.client.net.ClientNetworkManager
import org.apache.hyracks.comm.channels.DatasetNetworkInputChannel
import org.apache.spark.internal.Logging
/**
  * AsterixDB result reader. This class is responsible to fetch result (tuple-by-tuple)
  * for each AsterixRDD partition and converts the binaraized format to a JSON.
  *
  * @param addressPortPair the address and the port of Hyracks result partition.
  * @param partition Hyracks partition number.
  * @param handle Result handle from AsterixDB HTTP API
  * @param configuration Connector configurations
  */
class AsterixResultReader (
  addressPortPair: AddressPortPair,
  partition: Int,
  handle: Handle,
  val configuration: Configuration)
  extends Serializable with Logging{
    private val netManager = new ClientNetworkManager(configuration.nReaders)
    private val datasetClientContext = new DatasetClientContext(configuration.frameSize)
    private val monitor : IDatasetInputChannelMonitor = new DatasetInputChannelMonitor
    private val resultChannel = {
      netManager.start()
      val compute = new InetSocketAddress(addressPortPair.address, addressPortPair.port.toInt)
      val inputChannel = new DatasetNetworkInputChannel(netManager, compute,handle.jobId,
        handle.resultSetId, partition, configuration.nReaders)
      inputChannel.registerMonitor(monitor)

      inputChannel.open(datasetClientContext)

      inputChannel
    }

    def isPartitionReadComplete: Boolean = monitor.getNFramesAvailable <= 0 && monitor.eosReached()
    private def isFailed = monitor.failed()
    private def waitForNextFrame() = {
      monitor.synchronized{
        while (monitor.getNFramesAvailable <= 0 && !monitor.eosReached() && !monitor.failed())
          monitor.wait()
      }

    }

    def read(frame: IFrame) :Int = {
      frame.reset()
      var readSize = 0

      log.debug("Thread " + Thread.currentThread().getId + ": Read partition " + partition +
        " from " + addressPortPair.address)


      while(readSize < frame.getFrameSize && !isPartitionReadComplete) {
        waitForNextFrame()

        if(isFailed) {
          throw new AsterixConnectorException("Reading result failed")
        }

        if(isPartitionReadComplete)
        {
          resultChannel.close()
          frame.getBuffer.flip()
          0
        }

        //Wrap null
        val nextBuffer = Option(resultChannel.getNextBuffer)

        monitor.notifyFrameRead()
        nextBuffer match {
          case Some(byteBuffer) =>
            if (readSize <= 0) {
              val nBlocks = FrameHelper.deserializeNumOfMinFrame(byteBuffer)
              frame.ensureFrameSize(frame.getMinSize * nBlocks)
              frame.getBuffer.clear()
              frame.getBuffer.put(byteBuffer)
              resultChannel.recycleBuffer(byteBuffer)
              readSize = frame.getBuffer.position()
            }
            else {
              frame.getBuffer.put(byteBuffer)
              resultChannel.recycleBuffer(byteBuffer)
              readSize = frame.getBuffer.position()
            }
          case None => log.info ("received a null byte buffer")
        }
      }
      readSize

    }
}
