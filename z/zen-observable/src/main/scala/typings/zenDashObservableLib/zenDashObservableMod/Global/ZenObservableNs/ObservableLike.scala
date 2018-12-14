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

