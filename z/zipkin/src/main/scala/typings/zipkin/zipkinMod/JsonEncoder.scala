package typings.zipkin.zipkinMod

import typings.zipkin.zipkinMod.model.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used by the HttpLogger transport to convert spans to JSON */
trait JsonEncoder extends js.Object {
  def encode(span: Span): String
}

object JsonEncoder {
  @scala.inline
  def apply(encode: Span => String): JsonEncoder = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[JsonEncoder]
  }
}

@JSImport("zipkin", "jsonEncoder")
@js.native
object jsonEncoder extends js.Object {
  val JSON_V1: JsonEncoder = js.native
  val JSON_V2: JsonEncoder = js.native
}

