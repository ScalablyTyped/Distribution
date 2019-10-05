package typings.zenDashObservableDashTs.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ZenObservable {
  type Subscriber[T] = js.Function1[/* observer */ SubscriptionObserver[T], Unit | js.Function0[Unit] | Subscription]
}
