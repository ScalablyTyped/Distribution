package typings
package zipkinLib.zipkinMod.zipkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplicitContext extends Context[TraceId]

object ExplicitContext {
  @scala.inline
  def apply(
    getContext: js.Function0[TraceId],
    letContext: js.Function2[TraceId, js.Function0[js.Any], js.Any],
    scoped: js.Function1[js.Function0[js.Any], js.Any],
    setContext: js.Function1[TraceId, scala.Unit]
  ): ExplicitContext = {
    val __obj = js.Dynamic.literal(getContext = getContext, letContext = letContext, scoped = scoped, setContext = setContext)
  
    __obj.asInstanceOf[ExplicitContext]
  }
}

