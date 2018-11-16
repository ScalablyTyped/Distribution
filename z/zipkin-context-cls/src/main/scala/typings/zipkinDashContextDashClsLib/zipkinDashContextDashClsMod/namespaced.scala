package typings
package zipkinDashContextDashClsLib.zipkinDashContextDashClsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin-context-cls", JSImport.Namespace)
@js.native
class namespaced protected () extends CLSContext {
  def this(name: java.lang.String) = this()
  /* CompleteClass */
  override def getContext(): js.Any = js.native
  /* CompleteClass */
  override def letContext[V](ctx: js.Any, callback: js.Function0[V]): V = js.native
  /* CompleteClass */
  override def letContext[V](ctx: zipkinLib.zipkinMod.TraceId, callback: js.Function0[V]): V = js.native
  /* CompleteClass */
  override def scoped[V](callback: js.Function0[V]): V = js.native
  /* CompleteClass */
  override def setContext(ctx: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def setContext(ctx: zipkinLib.zipkinMod.TraceId): scala.Unit = js.native
}

