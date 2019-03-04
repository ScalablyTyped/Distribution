package typings
package zipkinDashContextDashClsLib.zipkinDashContextDashClsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CLSContext
  extends zipkinLib.zipkinMod.zipkinNs.Context[js.Any] {
  def letContext[V](ctx: zipkinLib.zipkinMod.TraceId, callback: js.Function0[V]): V
  def setContext(ctx: zipkinLib.zipkinMod.TraceId): scala.Unit
}

object CLSContext {
  @scala.inline
  def apply(
    getContext: js.Function0[zipkinLib.zipkinMod.TraceId],
    letContext: js.Function2[zipkinLib.zipkinMod.TraceId, js.Function0[js.Any], js.Any],
    scoped: js.Function1[js.Function0[js.Any], js.Any],
    setContext: js.Function1[zipkinLib.zipkinMod.TraceId, scala.Unit]
  ): CLSContext = {
    val __obj = js.Dynamic.literal(getContext = getContext, letContext = letContext, scoped = scoped, setContext = setContext)
  
    __obj.asInstanceOf[CLSContext]
  }
}

