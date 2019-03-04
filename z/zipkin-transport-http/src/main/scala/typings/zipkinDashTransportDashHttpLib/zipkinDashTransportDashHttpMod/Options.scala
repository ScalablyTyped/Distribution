package typings
package zipkinDashTransportDashHttpLib.zipkinDashTransportDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var endpoint: java.lang.String
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var httpInterval: js.UndefOr[scala.Double] = js.undefined
  var jsonEncoder: js.UndefOr[zipkinLib.zipkinMod.zipkinNs.JsonEncoder] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    httpInterval: scala.Int | scala.Double = null,
    jsonEncoder: zipkinLib.zipkinMod.zipkinNs.JsonEncoder = null
  ): Options = {
    val __obj = js.Dynamic.literal(endpoint = endpoint)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (httpInterval != null) __obj.updateDynamic("httpInterval")(httpInterval.asInstanceOf[js.Any])
    if (jsonEncoder != null) __obj.updateDynamic("jsonEncoder")(jsonEncoder)
    __obj.asInstanceOf[Options]
  }
}

