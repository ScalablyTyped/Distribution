package typings
package zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var closed: scala.Boolean
  def unsubscribe(): scala.Unit
}

object Subscription {
  @scala.inline
  def apply(closed: scala.Boolean, unsubscribe: js.Function0[scala.Unit]): Subscription = {
    val __obj = js.Dynamic.literal(closed = closed, unsubscribe = unsubscribe)
  
    __obj.asInstanceOf[Subscription]
  }
}

