package typings.zenObservableTs.typesMod.ZenObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* errorValue */ js.Any, Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  var start: js.UndefOr[js.Function1[/* subscription */ Subscription, _]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T](
    complete: () => Unit = null,
    error: /* errorValue */ js.Any => Unit = null,
    next: /* value */ T => Unit = null,
    start: /* subscription */ Subscription => _ = null
  ): Observer[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    __obj.asInstanceOf[Observer[T]]
  }
}

