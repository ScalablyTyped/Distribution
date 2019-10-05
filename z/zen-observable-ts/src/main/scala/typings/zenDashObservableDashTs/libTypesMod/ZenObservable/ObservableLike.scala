package typings.zenDashObservableDashTs.libTypesMod.ZenObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableLike[T] extends js.Object {
  var subscribe: js.UndefOr[Subscriber[T]] = js.undefined
}

object ObservableLike {
  @scala.inline
  def apply[T](
    subscribe: /* observer */ SubscriptionObserver[T] => Unit | js.Function0[Unit] | Subscription = null
  ): ObservableLike[T] = {
    val __obj = js.Dynamic.literal()
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[ObservableLike[T]]
  }
}

