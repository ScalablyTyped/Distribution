package typings.zipkinTransportHttp.anon

import org.scalablytyped.runtime.StringDictionary
import typings.node.urlMod.URL_
import typings.zipkin.mod.JsonEncoder_
import typings.zipkinTransportHttp.mod.ErrorLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agent extends js.Object {
  var agent: js.UndefOr[
    typings.zipkinTransportHttp.mod.Agent | (js.Function1[/* url */ URL_, typings.zipkinTransportHttp.mod.Agent])
  ] = js.undefined
  var endpoint: String
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var httpInterval: js.UndefOr[Double] = js.undefined
  var jsonEncoder: js.UndefOr[JsonEncoder_] = js.undefined
  var log: js.UndefOr[ErrorLogger] = js.undefined
  var maxPayloadSize: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Agent {
  @scala.inline
  def apply(
    endpoint: String,
    agent: typings.zipkinTransportHttp.mod.Agent | (js.Function1[/* url */ URL_, typings.zipkinTransportHttp.mod.Agent]) = null,
    headers: StringDictionary[String] = null,
    httpInterval: js.UndefOr[Double] = js.undefined,
    jsonEncoder: JsonEncoder_ = null,
    log: ErrorLogger = null,
    maxPayloadSize: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): Agent = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(httpInterval)) __obj.updateDynamic("httpInterval")(httpInterval.get.asInstanceOf[js.Any])
    if (jsonEncoder != null) __obj.updateDynamic("jsonEncoder")(jsonEncoder.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPayloadSize)) __obj.updateDynamic("maxPayloadSize")(maxPayloadSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Agent]
  }
}

