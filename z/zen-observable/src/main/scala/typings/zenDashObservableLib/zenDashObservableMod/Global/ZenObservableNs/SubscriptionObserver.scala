package typings
package zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionObserver[T] extends js.Object {
  var closed: scala.Boolean
  def complete(): scala.Unit
  def error(errorValue: js.Any): scala.Unit
  def next(value: T): scala.Unit
}

object SubscriptionObserver {
  @scala.inline
  def apply[T](
    closed: scala.Boolean,
    complete: js.Function0[scala.Unit],
    error: js.Function1[js.Any, scala.Unit],
    next: js.Function1[T, scala.Unit]
  ): SubscriptionObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closed")(closed)
    __obj.updateDynamic("complete")(complete)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[SubscriptionObserver[T]]
  }
}

