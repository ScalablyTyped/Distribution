package typings.zipkinDashTransportDashHttp.zipkinDashTransportDashHttpMod

import typings.zipkin.zipkinMod.Logger
import typings.zipkin.zipkinMod.model.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin-transport-http", "HttpLogger")
@js.native
class HttpLogger protected () extends Logger {
  def this(options: Options) = this()
  /* CompleteClass */
  override def logSpan(span: Span): Unit = js.native
}

