package typings.zipkinContextCls

import typings.zipkin.mod.Context
import typings.zipkin.mod.TraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipkin-context-cls", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with CLSContext {
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
  
  trait CLSContext
    extends StObject
       with Context[js.Any] {
    
    def letContext[V](ctx: TraceId, callback: js.Function0[V]): V
    
    def setContext(ctx: TraceId): Unit
  }
  object CLSContext {
    
    inline def apply(
      getContext: () => js.Any,
      letContext: (TraceId, js.Function0[js.Any]) => js.Any,
      scoped: js.Function0[js.Any] => js.Any,
      setContext: TraceId => Unit
    ): CLSContext = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), letContext = js.Any.fromFunction2(letContext), scoped = js.Any.fromFunction1(scoped), setContext = js.Any.fromFunction1(setContext))
      __obj.asInstanceOf[CLSContext]
    }
    
    extension [Self <: CLSContext](x: Self) {
      
      inline def setLetContext(value: (TraceId, js.Function0[js.Any]) => js.Any): Self = StObject.set(x, "letContext", js.Any.fromFunction2(value))
      
      inline def setSetContext(value: TraceId => Unit): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    }
  }
}
