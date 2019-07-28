package typings.zenDashObservable.zenDashObservableMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ZenObservableNs {
  type Subscriber[T] = js.Function1[/* observer */ SubscriptionObserver[T], Unit | js.Function0[Unit] | Subscription]
}
