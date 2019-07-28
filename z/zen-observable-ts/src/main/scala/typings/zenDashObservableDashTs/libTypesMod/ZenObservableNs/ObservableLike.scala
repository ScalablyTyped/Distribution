package typings.zenDashObservableDashTs.libTypesMod.ZenObservableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableLike[T] extends js.Object {
  var subscribe: js.UndefOr[Subscriber[T]] = js.undefined
}

object ObservableLike {
  @scala.inline
  def apply[T](subscribe: Subscriber[T] = null): ObservableLike[T] = {
    val __obj = js.Dynamic.literal()
    if (subscribe != null) __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[ObservableLike[T]]
  }
}

