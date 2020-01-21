package typings.zipkin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadersAny extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
}

object AnonHeadersAny {
  @scala.inline
  def apply(headers: js.Any = null): AnonHeadersAny = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeadersAny]
  }
}

