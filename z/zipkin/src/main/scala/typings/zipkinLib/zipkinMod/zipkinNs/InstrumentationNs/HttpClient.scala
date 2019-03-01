package typings
package zipkinLib.zipkinMod.zipkinNs.InstrumentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpClient extends js.Object {
  def recordError(traceId: zipkinLib.zipkinMod.zipkinNs.TraceId, error: stdLib.Error): scala.Unit
  def recordRequest[T](request: T, url: java.lang.String, method: java.lang.String): T
  def recordResponse(traceId: zipkinLib.zipkinMod.zipkinNs.TraceId, statusCode: java.lang.String): scala.Unit
}

object HttpClient {
  @scala.inline
  def apply(
    recordError: js.Function2[zipkinLib.zipkinMod.zipkinNs.TraceId, stdLib.Error, scala.Unit],
    recordRequest: js.Function3[js.Any, java.lang.String, java.lang.String, js.Any],
    recordResponse: js.Function2[zipkinLib.zipkinMod.zipkinNs.TraceId, java.lang.String, scala.Unit]
  ): HttpClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("recordError")(recordError)
    __obj.updateDynamic("recordRequest")(recordRequest)
    __obj.updateDynamic("recordResponse")(recordResponse)
    __obj.asInstanceOf[HttpClient]
  }
}

