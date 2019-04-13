package typings
package zipkinDashTransportDashHttpLib.zipkinDashTransportDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin-transport-http", "HttpLogger")
@js.native
class HttpLogger protected ()
  extends zipkinLib.zipkinMod.Logger {
  def this(options: Options) = this()
  /* CompleteClass */
  override def logSpan(span: zipkinLib.zipkinMod.modelNs.Span): scala.Unit = js.native
}

