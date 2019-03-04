package typings
package zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableLike[T] extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.observable)
  var observable: js.Function0[zenDashObservableLib.zenDashObservableMod.Observable[T] | ObservableLike[T]]
  var subscribe: js.UndefOr[Subscriber[T]] = js.undefined
}

object ObservableLike {
  @scala.inline
  def apply[T](
    observable: js.Function0[zenDashObservableLib.zenDashObservableMod.Observable[T] | ObservableLike[T]],
    subscribe: Subscriber[T] = null
  ): ObservableLike[T] = {
    val __obj = js.Dynamic.literal(observable = observable)
    if (subscribe != null) __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[ObservableLike[T]]
  }
}

