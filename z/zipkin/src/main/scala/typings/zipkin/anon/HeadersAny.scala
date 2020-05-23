package typings.zipkin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersAny extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
}

object HeadersAny {
  @scala.inline
  def apply(headers: js.Any = null): HeadersAny = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersAny]
  }
}

