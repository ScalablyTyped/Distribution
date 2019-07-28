package typings.zipkin.zipkinMod

import typings.zipkin.Anon_HeadersAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "Request")
@js.native
object RequestNs extends js.Object {
  def addZipkinHeaders[T, H](req: T with Anon_HeadersAny, traceId: TraceId): RequestZipkinHeaders[T, H] = js.native
}

