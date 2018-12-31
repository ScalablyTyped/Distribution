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

