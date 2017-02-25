package org.apache.spark.examples.connector

/**
  * Created by MingdaLi on 2/21/17.
  */
import java.io.InputStream
import java.net.URLEncoder

import org.apache.http.client.methods.{CloseableHttpResponse, HttpGet, HttpPost}
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.{CloseableHttpClient, HttpClients}
import org.apache.hyracks.api.dataset.DatasetDirectoryRecord.Status
import org.apache.hyracks.api.dataset.ResultSetId
import org.apache.hyracks.api.job.JobId
import org.apache.spark.internal.Logging
import net.liftweb.json._
import net.liftweb.json.Serialization.{write, _}
import org.json.JSONObject
import org.apache.spark.examples.connector.Configuration
case class Handle(jobId: JobId, resultSetId: ResultSetId)
case class AddressPortPair(address: String, port: String)
case class ResultLocations(handle:Handle, locations:Seq[AddressPortPair])

//For JSON deserialization purposes
private[this] case class LocationsJson(locations:Seq[AddressPortPair])
private[this] case class HandleJson(handle: Seq[Long])

case class Handle(jobId: JobId, resultSetId: ResultSetId)
class AsterixHttpAPI (configuration: Configuration) extends Logging{
  private val apiURL = s"http://${configuration.host}:${configuration.port}/"

  private def getHandleJson(handle: Handle) : HandleJson = HandleJson(Seq[Long](handle.jobId.getId,
    handle.resultSetId.getId))

  private implicit val formats = DefaultFormats

  def executeAQL(query: String): Handle =
  {
    val jsonString = executeQuery(query, async = true, QueryType.AQL)
    getHandle(jsonString)
  }

  def executeSQLPP(query: String): Handle =
  {
    val jsonString = executeQuery(query, async = true, QueryType.SQLPP)
    getHandle(jsonString)
  }

  private def getHandle(response: String): Handle = {
    response.contains("error-code") match {
      case true =>
        val startOffset = response.indexOf(",")
        val endOffset = response.indexOf("]")
        throw new AsterixConnectorException(response.substring(startOffset + 1, endOffset));
      case false =>
    }

    val handleJson = read[HandleJson](response)
    val jobId = new JobId(handleJson.handle.head)
    val resultSetId = new ResultSetId(handleJson.handle(1))
    val handle = Handle(jobId, resultSetId)
    log.info(handle.toString)
    handle
  }

  def getStatus(handle: Handle) : Status = {
    val handleJSON = getHandleJson(handle: Handle)
    val handleJSONString = URLEncoder.encode(write(handleJSON),"UTF-8")

    log.debug("Get status of: " + handleJSONString)

    val url = apiURL + "query/status?handle=" + handleJSONString

    val response = new JSONObject(getRequest(url))

    response.getString("status") match {
      case "RUNNUMG" => Status.RUNNING
      case "SUCCESS" => Status.SUCCESS
      case _ => Status.FAILED
    }

  }

  def getResultSchema(handle: Handle) : JSONObject = {
    val httpclient: CloseableHttpClient = HttpClients.createDefault

    val handleJSON = getHandleJson(handle: Handle)
    val handleJSONString = URLEncoder.encode(write(handleJSON),"UTF-8")

    log.debug("Get schema of: " + handleJSONString)

    val url = apiURL + "query/result/schema?handle=" + handleJSONString + "&schema-format=ADM_AND_DUMMY_JSON"
    val response = getRequest(url)
    new JSONObject(response)
  }


  def getResultLocations(handle: Handle) : ResultLocations = {

    val handleJSON = getHandleJson(handle: Handle)
    val handleJSONString = URLEncoder.encode(write(handleJSON),"UTF-8")

    log.debug("Get locations of: " + handleJSONString)

    val url = apiURL + "query/result/location?handle=" + handleJSONString

    val response = getRequest(url)
    log.info("Result Locations: " + response)
    val locations = read[LocationsJson](response)
    ResultLocations(handle, locations.locations)
  }

  private def executeQuery(query :String, async:Boolean = false, queryType: QueryType) : String= {
    val url = async match {
      case true => apiURL + s"$queryType?mode=asynchronous&schema-inferencer=Spark"
      case false => apiURL + queryType
    }
    val response = postRequest(url, query)

    if (async) {
      log.info("Response Handle: " + response)
    } else {
      log.debug("Response: " + response)
    }

    response
  }

  private def getRequest(url: String) : String = {
    val httpclient: CloseableHttpClient = HttpClients.createDefault
    val httpGet: HttpGet = new HttpGet(url)
    val response: CloseableHttpResponse = httpclient.execute(httpGet)
    val responseContent: InputStream = response.getEntity.getContent
    val responseString = scala.io.Source.fromInputStream(responseContent).mkString
    httpclient.close()
    responseString
  }

  private def postRequest(url: String , entity:String) : String = {
    val httpclient: CloseableHttpClient = HttpClients.createDefault
    val httpPost: HttpPost = new HttpPost(url)
    httpPost.setEntity(new StringEntity(entity, "UTF-8"))
    val response: CloseableHttpResponse = httpclient.execute(httpPost)
    val responseContent: InputStream = response.getEntity.getContent
    val responseString = scala.io.Source.fromInputStream(responseContent).mkString
    response.close()
    httpclient.close()
    responseString
  }

}
