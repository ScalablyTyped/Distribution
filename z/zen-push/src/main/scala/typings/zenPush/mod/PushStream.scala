package typings.zenPush.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushStream[T] extends js.Object {
  val observable: typings.zenObservable.mod.^[T] = js.native
  val observed: Double = js.native
  def complete(): Unit = js.native
  def complete(x: js.Any): Unit = js.native
  def error(e: Error): Unit = js.native
  def next(x: T): Unit = js.native
}

