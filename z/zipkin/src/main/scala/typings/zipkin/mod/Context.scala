package typings.zipkin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context[T] extends StObject {
  
  def getContext(): T
  
  def letContext[V](ctx: T, callback: js.Function0[V]): V
  
  def scoped[V](callback: js.Function0[V]): V
  
  def setContext(ctx: T): Unit
}
object Context {
  
  @scala.inline
  def apply[T](
    getContext: () => T,
    letContext: (T, js.Function0[js.Any]) => js.Any,
    scoped: js.Function0[js.Any] => js.Any,
    setContext: T => Unit
  ): Context[T] = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), letContext = js.Any.fromFunction2(letContext), scoped = js.Any.fromFunction1(scoped), setContext = js.Any.fromFunction1(setContext))
    __obj.asInstanceOf[Context[T]]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context[?], T] (val x: Self & Context[T]) extends AnyVal {
    
    @scala.inline
    def setGetContext(value: () => T): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLetContext(value: (T, js.Function0[js.Any]) => js.Any): Self = StObject.set(x, "letContext", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScoped(value: js.Function0[js.Any] => js.Any): Self = StObject.set(x, "scoped", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetContext(value: T => Unit): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
  }
}
