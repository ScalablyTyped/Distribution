package typings
package zenDashObservableDashTsLib.libTypesMod.ZenObservableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* errorValue */ js.Any, scala.Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
  var start: js.UndefOr[js.Function1[/* subscription */ Subscription, _]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T](
    complete: js.Function0[scala.Unit] = null,
    error: js.Function1[/* errorValue */ js.Any, scala.Unit] = null,
    next: js.Function1[/* value */ T, scala.Unit] = null,
    start: js.Function1[/* subscription */ Subscription, _] = null
  ): Observer[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (error != null) __obj.updateDynamic("error")(error)
    if (next != null) __obj.updateDynamic("next")(next)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Observer[T]]
  }
}

