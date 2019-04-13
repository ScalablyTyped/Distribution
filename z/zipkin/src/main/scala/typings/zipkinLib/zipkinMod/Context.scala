package typings
package zipkinLib.zipkinMod

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
    getContext: () => T,
    letContext: (T, js.Function0[js.Any]) => js.Any,
    scoped: js.Function0[js.Any] => js.Any,
    setContext: T => scala.Unit
  ): Context[T] = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), letContext = js.Any.fromFunction2(letContext), scoped = js.Any.fromFunction1(scoped), setContext = js.Any.fromFunction1(setContext))
  
    __obj.asInstanceOf[Context[T]]
  }
}

