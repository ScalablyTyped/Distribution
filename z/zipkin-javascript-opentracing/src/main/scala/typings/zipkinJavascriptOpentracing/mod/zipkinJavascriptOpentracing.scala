package typings.zipkinJavascriptOpentracing.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait zipkinJavascriptOpentracing extends js.Object {
  def extract(format: js.Any, carrier: js.Any): js.Any
  def inject(span: js.Any, format: js.Any, carrier: js.Any): Unit
  def startSpan(name: js.Any, args: js.Any*): js.Any
}

object zipkinJavascriptOpentracing {
  @scala.inline
  def apply(
    extract: (js.Any, js.Any) => js.Any,
    inject: (js.Any, js.Any, js.Any) => Unit,
    startSpan: (js.Any, /* repeated */ js.Any) => js.Any
  ): zipkinJavascriptOpentracing = {
    val __obj = js.Dynamic.literal(extract = js.Any.fromFunction2(extract), inject = js.Any.fromFunction3(inject), startSpan = js.Any.fromFunction2(startSpan))
  
    __obj.asInstanceOf[zipkinJavascriptOpentracing]
  }
}

