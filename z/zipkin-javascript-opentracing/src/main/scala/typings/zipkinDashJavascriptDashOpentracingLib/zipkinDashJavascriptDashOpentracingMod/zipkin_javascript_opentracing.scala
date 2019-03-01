package typings
package zipkinDashJavascriptDashOpentracingLib.zipkinDashJavascriptDashOpentracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait zipkin_javascript_opentracing extends js.Object {
  def extract(format: js.Any, carrier: js.Any): js.Any
  def inject(span: js.Any, format: js.Any, carrier: js.Any): scala.Unit
  def startSpan(name: js.Any, args: js.Any*): js.Any
}

object zipkin_javascript_opentracing {
  @scala.inline
  def apply(
    extract: js.Function2[js.Any, js.Any, js.Any],
    inject: js.Function3[js.Any, js.Any, js.Any, scala.Unit],
    startSpan: js.Function2[js.Any, /* repeated */ js.Any, js.Any]
  ): zipkin_javascript_opentracing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extract")(extract)
    __obj.updateDynamic("inject")(inject)
    __obj.updateDynamic("startSpan")(startSpan)
    __obj.asInstanceOf[zipkin_javascript_opentracing]
  }
}

