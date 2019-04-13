package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "Request")
@js.native
object RequestNs extends js.Object {
  def addZipkinHeaders[T, H](req: T with zipkinLib.Anon_HeadersAny, traceId: zipkinLib.zipkinMod.TraceId): zipkinLib.zipkinMod.RequestZipkinHeaders[T, H] = js.native
}

