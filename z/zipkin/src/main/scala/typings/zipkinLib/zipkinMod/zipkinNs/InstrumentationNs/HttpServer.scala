package typings
package zipkinLib.zipkinMod.zipkinNs.InstrumentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpServer extends js.Object {
  def recordRequest(
    method: java.lang.String,
    requestUrl: java.lang.String,
    readHeader: js.Function1[/* header */ java.lang.String, zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[_]]
  ): zipkinLib.zipkinMod.zipkinNs.TraceId = js.native
  def recordResponse(traceId: zipkinLib.zipkinMod.zipkinNs.TraceId, statusCode: java.lang.String): scala.Unit = js.native
  def recordResponse(traceId: zipkinLib.zipkinMod.zipkinNs.TraceId, statusCode: java.lang.String, error: stdLib.Error): scala.Unit = js.native
}

