package typings
package zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* errorValue */ js.Any, scala.Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
  var start: js.UndefOr[js.Function1[/* subscription */ Subscription, _]] = js.undefined
}

