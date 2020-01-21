package typings.zipkinTransportHttp

import org.scalablytyped.runtime.StringDictionary
import typings.node.urlMod.URL_
import typings.zipkin.mod.JsonEncoder_
import typings.zipkinTransportHttp.mod.Agent
import typings.zipkinTransportHttp.mod.ErrorLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAgent extends js.Object {
  var agent: js.UndefOr[Agent | (js.Function1[/* url */ URL_, Agent])] = js.undefined
  var endpoint: String
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var httpInterval: js.UndefOr[Double] = js.undefined
  var jsonEncoder: js.UndefOr[JsonEncoder_] = js.undefined
  var log: js.UndefOr[ErrorLogger] = js.undefined
  var maxPayloadSize: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object AnonAgent {
  @scala.inline
  def apply(
    endpoint: String,
    agent: Agent | (js.Function1[/* url */ URL_, Agent]) = null,
    headers: StringDictionary[String] = null,
    httpInterval: Int | Double = null,
    jsonEncoder: JsonEncoder_ = null,
    log: ErrorLogger = null,
    maxPayloadSize: Int | Double = null,
    timeout: Int | Double = null
  ): AnonAgent = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (httpInterval != null) __obj.updateDynamic("httpInterval")(httpInterval.asInstanceOf[js.Any])
    if (jsonEncoder != null) __obj.updateDynamic("jsonEncoder")(jsonEncoder.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (maxPayloadSize != null) __obj.updateDynamic("maxPayloadSize")(maxPayloadSize.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAgent]
  }
}

