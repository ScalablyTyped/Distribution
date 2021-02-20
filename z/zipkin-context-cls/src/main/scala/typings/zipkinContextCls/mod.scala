package typings.zipkinContextCls

import typings.zipkin.mod.Context
import typings.zipkin.mod.TraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipkin-context-cls", JSImport.Namespace)
  @js.native
  class ^ protected () extends CLSContext {
    def this(name: String) = this()
  }
  
  @js.native
  trait CLSContext
    extends Context[js.Any] {
    
    def letContext[V](ctx: TraceId, callback: js.Function0[V]): V = js.native
    
    def setContext(ctx: TraceId): Unit = js.native
  }
  object CLSContext {
    
    @scala.inline
    def apply(
      getContext: () => js.Any,
      letContext: (TraceId, js.Function0[js.Any]) => js.Any,
      scoped: js.Function0[js.Any] => js.Any,
      setContext: TraceId => Unit
    ): CLSContext = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), letContext = js.Any.fromFunction2(letContext), scoped = js.Any.fromFunction1(scoped), setContext = js.Any.fromFunction1(setContext))
      __obj.asInstanceOf[CLSContext]
    }
    
    @scala.inline
    implicit class CLSContextMutableBuilder[Self <: CLSContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLetContext(value: (TraceId, js.Function0[js.Any]) => js.Any): Self = StObject.set(x, "letContext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetContext(value: TraceId => Unit): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    }
  }
}
