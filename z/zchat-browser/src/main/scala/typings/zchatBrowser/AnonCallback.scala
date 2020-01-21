package typings.zchatBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var jwt_fn: js.UndefOr[js.Function1[/* callback */ js.Function1[/* jwt */ String, Unit], Unit]] = js.undefined
}

object AnonCallback {
  @scala.inline
  def apply(jwt_fn: /* callback */ js.Function1[/* jwt */ String, Unit] => Unit = null): AnonCallback = {
    val __obj = js.Dynamic.literal()
    if (jwt_fn != null) __obj.updateDynamic("jwt_fn")(js.Any.fromFunction1(jwt_fn))
    __obj.asInstanceOf[AnonCallback]
  }
}

