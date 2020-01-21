package typings.zenObservable.mod._Global_.ZenObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var closed: Boolean
  def unsubscribe(): Unit
}

object Subscription {
  @scala.inline
  def apply(closed: Boolean, unsubscribe: () => Unit): Subscription = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[Subscription]
  }
}

