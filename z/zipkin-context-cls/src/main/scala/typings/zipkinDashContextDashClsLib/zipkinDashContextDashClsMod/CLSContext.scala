package typings
package zipkinDashContextDashClsLib.zipkinDashContextDashClsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CLSContext
  extends zipkinLib.zipkinMod.Context[js.Any] {
  def letContext[V](ctx: zipkinLib.zipkinMod.TraceId, callback: js.Function0[V]): V
  def setContext(ctx: zipkinLib.zipkinMod.TraceId): scala.Unit
}

object CLSContext {
  @scala.inline
  def apply(
    getContext: () => zipkinLib.zipkinMod.TraceId,
    letContext: (zipkinLib.zipkinMod.TraceId, js.Function0[js.Any]) => js.Any,
    scoped: js.Function0[js.Any] => js.Any,
    setContext: zipkinLib.zipkinMod.TraceId => scala.Unit
  ): CLSContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), letContext = js.Any.fromFunction2(letContext), scoped = js.Any.fromFunction1(scoped), setContext = js.Any.fromFunction1(setContext))
  
    __obj.asInstanceOf[CLSContext]
  }
}

