package typings.zenObservable.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ZenObservable {
  
  type Subscriber[T] = js.Function1[
    /* observer */ typings.zenObservable.mod.global.ZenObservable.SubscriptionObserver[T], 
    scala.Unit | js.Function0[scala.Unit] | typings.zenObservable.mod.global.ZenObservable.Subscription
  ]
}
