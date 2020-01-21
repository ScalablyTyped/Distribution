package typings.zipkinContextCls.mod

import typings.zipkin.mod.TraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin-context-cls", JSImport.Namespace)
@js.native
class ^ protected () extends CLSContext {
  def this(name: String) = this()
  /* CompleteClass */
  override def getContext(): js.Any = js.native
  /* CompleteClass */
  override def letContext[V](ctx: js.Any, callback: js.Function0[V]): V = js.native
  /* CompleteClass */
  override def letContext[V](ctx: TraceId, callback: js.Function0[V]): V = js.native
  /* CompleteClass */
  override def scoped[V](callback: js.Function0[V]): V = js.native
  /* CompleteClass */
  override def setContext(ctx: js.Any): Unit = js.native
  /* CompleteClass */
  override def setContext(ctx: TraceId): Unit = js.native
}

