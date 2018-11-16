package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "ExplicitContext")
@js.native
class ExplicitContext ()
  extends zipkinLib.zipkinMod.zipkinNs.ExplicitContext {
  /* CompleteClass */
  override def getContext(): zipkinLib.zipkinMod.zipkinNs.TraceId = js.native
  /* CompleteClass */
  override def letContext[V](ctx: zipkinLib.zipkinMod.zipkinNs.TraceId, callback: js.Function0[V]): V = js.native
  /* CompleteClass */
  override def scoped[V](callback: js.Function0[V]): V = js.native
  /* CompleteClass */
  override def setContext(ctx: zipkinLib.zipkinMod.zipkinNs.TraceId): scala.Unit = js.native
}

