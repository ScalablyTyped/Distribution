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

object Context {
  @scala.inline
  def apply[T](
    getContext: js.Function0[T],
    letContext: js.Function2[T, js.Function0[js.Any], js.Any],
    scoped: js.Function1[js.Function0[js.Any], js.Any],
    setContext: js.Function1[T, scala.Unit]
  ): Context[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContext")(getContext)
    __obj.updateDynamic("letContext")(letContext)
    __obj.updateDynamic("scoped")(scoped)
    __obj.updateDynamic("setContext")(setContext)
    __obj.asInstanceOf[Context[T]]
  }
}

