package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "Request")
@js.native
object RequestNs extends js.Object {
  def addZipkinHeaders[T, H](req: T with zipkinLib.Anon_Headers, traceId: zipkinLib.zipkinMod.zipkinNs.TraceId): zipkinLib.zipkinMod.zipkinNs.RequestZipkinHeaders[T, H] = js.native
}

