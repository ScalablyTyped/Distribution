package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersAny extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
}

object Anon_HeadersAny {
  @scala.inline
  def apply(headers: js.Any = null): Anon_HeadersAny = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Anon_HeadersAny]
  }
}

