package typings
package zipkinLib.zipkinMod.zipkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used by the HttpLogger transport to convert spans to JSON */
trait JsonEncoder extends js.Object {
  def encode(span: zipkinLib.zipkinMod.zipkinNs.modelNs.Span): java.lang.String
}

object JsonEncoder {
  @scala.inline
  def apply(encode: zipkinLib.zipkinMod.zipkinNs.modelNs.Span => java.lang.String): JsonEncoder = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[JsonEncoder]
  }
}

