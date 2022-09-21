package typings.zipkin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin", "ExplicitContext")
@js.native
open class ExplicitContext ()
  extends StObject
     with Context[TraceId] {
  
  /* CompleteClass */
  override def getContext(): TraceId = js.native
  
  /* CompleteClass */
  override def letContext[V](ctx: TraceId, callback: js.Function0[V]): V = js.native
  
  /* CompleteClass */
  override def scoped[V](callback: js.Function0[V]): V = js.native
  
  /* CompleteClass */
  override def setContext(ctx: TraceId): Unit = js.native
}
