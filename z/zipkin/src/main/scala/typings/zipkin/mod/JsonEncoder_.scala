package typings.zipkin.mod

import typings.zipkin.mod.model.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used by the HttpLogger transport to convert spans to JSON */
@js.native
trait JsonEncoder_ extends StObject {
  
  def encode(span: Span): String = js.native
}
object JsonEncoder_ {
  
  @scala.inline
  def apply(encode: Span => String): JsonEncoder_ = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[JsonEncoder_]
  }
  
  @scala.inline
  implicit class JsonEncoder_MutableBuilder[Self <: JsonEncoder_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncode(value: Span => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
  }
}
