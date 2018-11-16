package typings
package zenDashObservableDashTsLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ZenObservableNs {
  type Subscriber[T] = js.Function1[
    /* observer */ SubscriptionObserver[T], 
    scala.Unit | js.Function0[scala.Unit] | Subscription
  ]
}
