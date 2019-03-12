package typings
package zenDashObservableDashTsLib.libTypesMod.ZenObservableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionObserver[T] extends js.Object {
  var closed: scala.Boolean
  def complete(): scala.Unit
  def error(errorValue: js.Any): scala.Unit
  def next(value: T): scala.Unit
}

object SubscriptionObserver {
  @scala.inline
  def apply[T](
    closed: scala.Boolean,
    complete: () => scala.Unit,
    error: js.Any => scala.Unit,
    next: T => scala.Unit
  ): SubscriptionObserver[T] = {
    val __obj = js.Dynamic.literal(closed = closed, complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
  
    __obj.asInstanceOf[SubscriptionObserver[T]]
  }
}

