package typings.zipkin.mod

import typings.zipkin.mod.model.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used by the HttpLogger transport to convert spans to JSON */
trait JsonEncoder_ extends js.Object {
  def encode(span: Span): String
}

object JsonEncoder_ {
  @scala.inline
  def apply(encode: Span => String): JsonEncoder_ = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[JsonEncoder_]
  }
}

