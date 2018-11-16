package typings
package zipkinLib.zipkinMod.zipkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Context[T] extends js.Object {
  def getContext(): T
  def letContext[V](ctx: T, callback: js.Function0[V]): V
  def scoped[V](callback: js.Function0[V]): V
  def setContext(ctx: T): scala.Unit
}

