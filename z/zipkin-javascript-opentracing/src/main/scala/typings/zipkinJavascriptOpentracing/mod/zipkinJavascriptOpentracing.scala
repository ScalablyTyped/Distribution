package typings.zipkinJavascriptOpentracing.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait zipkinJavascriptOpentracing extends js.Object {
  def extract(format: js.Any, carrier: js.Any): js.Any = js.native
  def inject(span: js.Any, format: js.Any, carrier: js.Any): Unit = js.native
  def startSpan(name: js.Any, args: js.Any*): js.Any = js.native
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
  @scala.inline
  implicit class zipkinJavascriptOpentracingOps[Self <: zipkinJavascriptOpentracing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtract(value: (js.Any, js.Any) => js.Any): Self = this.set("extract", js.Any.fromFunction2(value))
    @scala.inline
    def setInject(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("inject", js.Any.fromFunction3(value))
    @scala.inline
    def setStartSpan(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = this.set("startSpan", js.Any.fromFunction2(value))
  }
  
}

