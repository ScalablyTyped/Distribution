package typings.zipkinDashContextDashCls.zipkinDashContextDashClsMod

import typings.zipkin.zipkinMod.Context
import typings.zipkin.zipkinMod.TraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CLSContext
  extends Context[js.Any] {
  def letContext[V](ctx: TraceId, callback: js.Function0[V]): V
  def setContext(ctx: TraceId): Unit
}

object CLSContext {
  @scala.inline
  def apply(
    getContext: () => TraceId,
    letContext: (TraceId, js.Function0[js.Any]) => js.Any,
    scoped: js.Function0[js.Any] => js.Any,
    setContext: TraceId => Unit
  ): CLSContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), letContext = js.Any.fromFunction2(letContext), scoped = js.Any.fromFunction1(scoped), setContext = js.Any.fromFunction1(setContext))
  
    __obj.asInstanceOf[CLSContext]
  }
}

