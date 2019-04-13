package typings
package zenDashPushLib.zenDashPushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushStream[T] extends js.Object {
  val observable: zenDashObservableLib.zenDashObservableMod.^[T] = js.native
  val observed: scala.Double = js.native
  def complete(): scala.Unit = js.native
  def complete(x: js.Any): scala.Unit = js.native
  def error(e: stdLib.Error): scala.Unit = js.native
  def next(x: T): scala.Unit = js.native
}

