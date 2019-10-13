package typings.zenDashObservable.zenDashObservableMod._Global_.ZenObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionObserver[T] extends js.Object {
  var closed: Boolean
  def complete(): Unit
  def error(errorValue: js.Any): Unit
  def next(value: T): Unit
}

object SubscriptionObserver {
  @scala.inline
  def apply[T](closed: Boolean, complete: () => Unit, error: js.Any => Unit, next: T => Unit): SubscriptionObserver[T] = {
    val __obj = js.Dynamic.literal(closed = closed, complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
  
    __obj.asInstanceOf[SubscriptionObserver[T]]
  }
}

