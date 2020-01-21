package typings.zenObservableTs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ZenObservable {
  type Subscriber[T] = js.Function1[
    /* observer */ typings.zenObservableTs.typesMod.ZenObservable.SubscriptionObserver[T], 
    scala.Unit | js.Function0[scala.Unit] | typings.zenObservableTs.typesMod.ZenObservable.Subscription
  ]
}
