package typings.zipkin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "ExplicitContext")
@js.native
class ExplicitContext () extends Context[TraceId] {
  /* CompleteClass */
  override def getContext(): TraceId = js.native
  /* CompleteClass */
  override def letContext[V](ctx: TraceId, callback: js.Function0[V]): V = js.native
  /* CompleteClass */
  override def scoped[V](callback: js.Function0[V]): V = js.native
  /* CompleteClass */
  override def setContext(ctx: TraceId): Unit = js.native
}

