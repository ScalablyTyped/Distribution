package typings
package zipkinLib.zipkinMod.zipkinNs.optionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOption[T] extends js.Object {
  var present: scala.Boolean = js.native
  var `type`: zipkinLib.zipkinLibStrings.Some | zipkinLib.zipkinLibStrings.None = js.native
  def equals(other: IOption[T]): scala.Boolean = js.native
  def flatMap[V](fn: js.Function1[/* value */ T, V]): IOption[V] = js.native
  def getOrElse[V](fnOrValue: V): T = js.native
  def getOrElse[V](fnOrValue: js.Function0[V]): T = js.native
  def ifPresent[V](fn: js.Function1[/* value */ T, V]): IOption[V] = js.native
  def map[V](fn: js.Function1[/* value */ T, V]): IOption[V] = js.native
}

