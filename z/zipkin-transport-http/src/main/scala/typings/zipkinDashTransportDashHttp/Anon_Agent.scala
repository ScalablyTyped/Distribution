package typings.zipkinDashTransportDashHttp

import org.scalablytyped.runtime.StringDictionary
import typings.node.urlMod.URL
import typings.zipkin.zipkinMod.JsonEncoder
import typings.zipkinDashTransportDashHttp.zipkinDashTransportDashHttpMod.Agent
import typings.zipkinDashTransportDashHttp.zipkinDashTransportDashHttpMod.ErrorLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Agent extends js.Object {
  var agent: js.UndefOr[Agent | (js.Function1[/* url */ URL, Agent])] = js.undefined
  var endpoint: String
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var httpInterval: js.UndefOr[Double] = js.undefined
  var jsonEncoder: js.UndefOr[JsonEncoder] = js.undefined
  var log: js.UndefOr[ErrorLogger] = js.undefined
  var maxPayloadSize: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Anon_Agent {
  @scala.inline
  def apply(
    endpoint: String,
    agent: Agent | (js.Function1[/* url */ URL, Agent]) = null,
    headers: StringDictionary[String] = null,
    httpInterval: Int | Double = null,
    jsonEncoder: JsonEncoder = null,
    log: ErrorLogger = null,
    maxPayloadSize: Int | Double = null,
    timeout: Int | Double = null
  ): Anon_Agent = {
    val __obj = js.Dynamic.literal(endpoint = endpoint)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (httpInterval != null) __obj.updateDynamic("httpInterval")(httpInterval.asInstanceOf[js.Any])
    if (jsonEncoder != null) __obj.updateDynamic("jsonEncoder")(jsonEncoder)
    if (log != null) __obj.updateDynamic("log")(log)
    if (maxPayloadSize != null) __obj.updateDynamic("maxPayloadSize")(maxPayloadSize.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Agent]
  }
}

