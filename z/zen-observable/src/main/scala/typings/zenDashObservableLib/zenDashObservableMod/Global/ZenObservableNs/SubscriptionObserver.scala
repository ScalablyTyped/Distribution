package typings
package zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SubscriptionObserver[T] extends js.Object {
  var closed: scala.Boolean
  def complete(): scala.Unit
  def error(errorValue: js.Any): scala.Unit
  def next(value: T): scala.Unit
}

