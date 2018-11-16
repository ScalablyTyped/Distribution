package typings
package zipkinDashJavascriptDashOpentracingLib.zipkinDashJavascriptDashOpentracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin-javascript-opentracing", JSImport.Namespace)
@js.native
class namespaced protected () extends zipkin_javascript_opentracing {
  def this(args: js.Any*) = this()
  /* CompleteClass */
  override def extract(format: js.Any, carrier: js.Any): js.Any = js.native
  /* CompleteClass */
  override def inject(span: js.Any, format: js.Any, carrier: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def startSpan(name: js.Any, args: js.Any*): js.Any = js.native
}

@JSImport("zipkin-javascript-opentracing", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var FORMAT_BINARY: java.lang.String = js.native
  var FORMAT_HTTP_HEADERS: java.lang.String = js.native
  var FORMAT_TEXT_MAP: java.lang.String = js.native
  def makeOptional(`val`: js.Any): js.Any = js.native
}

