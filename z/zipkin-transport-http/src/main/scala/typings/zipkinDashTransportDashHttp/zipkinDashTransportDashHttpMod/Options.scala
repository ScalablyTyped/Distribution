package typings.zipkinDashTransportDashHttp.zipkinDashTransportDashHttpMod

import org.scalablytyped.runtime.StringDictionary
import typings.zipkin.zipkinMod.JsonEncoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var endpoint: String
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var httpInterval: js.UndefOr[Double] = js.undefined
  var jsonEncoder: js.UndefOr[JsonEncoder] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    endpoint: String,
    headers: StringDictionary[String] = null,
    httpInterval: Int | Double = null,
    jsonEncoder: JsonEncoder = null
  ): Options = {
    val __obj = js.Dynamic.literal(endpoint = endpoint)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (httpInterval != null) __obj.updateDynamic("httpInterval")(httpInterval.asInstanceOf[js.Any])
    if (jsonEncoder != null) __obj.updateDynamic("jsonEncoder")(jsonEncoder)
    __obj.asInstanceOf[Options]
  }
}

