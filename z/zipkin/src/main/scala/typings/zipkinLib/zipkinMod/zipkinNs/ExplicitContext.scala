package typings
package zipkinLib.zipkinMod.zipkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplicitContext extends Context[TraceId]

object ExplicitContext {
  @scala.inline
  def apply(
    getContext: () => TraceId,
    letContext: (TraceId, js.Function0[js.Any]) => js.Any,
    scoped: js.Function0[js.Any] => js.Any,
    setContext: TraceId => scala.Unit
  ): ExplicitContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), letContext = js.Any.fromFunction2(letContext), scoped = js.Any.fromFunction1(scoped), setContext = js.Any.fromFunction1(setContext))
  
    __obj.asInstanceOf[ExplicitContext]
  }
}

