package typings.zipkin.mod

import typings.zipkin.anon.HeadersAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "Request")
@js.native
object Request extends js.Object {
  def addZipkinHeaders[T, H](req: T with HeadersAny, traceId: TraceId): RequestZipkinHeaders[T, H] = js.native
}

