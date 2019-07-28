package typings.zipkinDashJavascriptDashOpentracing.zipkinDashJavascriptDashOpentracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin-javascript-opentracing", JSImport.Namespace)
@js.native
class ^ protected () extends zipkin_javascript_opentracing {
  def this(args: js.Any*) = this()
  /* CompleteClass */
  override def extract(format: js.Any, carrier: js.Any): js.Any = js.native
  /* CompleteClass */
  override def inject(span: js.Any, format: js.Any, carrier: js.Any): Unit = js.native
  /* CompleteClass */
  override def startSpan(name: js.Any, args: js.Any*): js.Any = js.native
}

@JSImport("zipkin-javascript-opentracing", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var FORMAT_BINARY: String = js.native
  var FORMAT_HTTP_HEADERS: String = js.native
  var FORMAT_TEXT_MAP: String = js.native
  def makeOptional(`val`: js.Any): js.Any = js.native
}

