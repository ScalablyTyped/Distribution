package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveOptions[TContext] extends StObject {
  
  var context: js.UndefOr[TContext] = js.undefined
  
  var parent: js.UndefOr[Any] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object ResolveOptions {
  
  inline def apply[TContext](): ResolveOptions[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveOptions[TContext]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveOptions[?], TContext] (val x: Self & ResolveOptions[TContext]) extends AnyVal {
    
    inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
