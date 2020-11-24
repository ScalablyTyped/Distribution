package typings.zipkin.mod

import typings.zipkin.mod.model.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used by the HttpLogger transport to convert spans to JSON */
@js.native
trait JsonEncoder_ extends js.Object {
  
  def encode(span: Span): String = js.native
}
object JsonEncoder_ {
  
  @scala.inline
  def apply(encode: Span => String): JsonEncoder_ = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[JsonEncoder_]
  }
  
  @scala.inline
  implicit class JsonEncoder_Ops[Self <: JsonEncoder_] (val x: Self) extends AnyVal {
    
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
    def setEncode(value: Span => String): Self = this.set("encode", js.Any.fromFunction1(value))
  }
}
