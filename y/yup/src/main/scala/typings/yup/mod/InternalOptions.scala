package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalOptions[TContext]
  extends StObject
     with ValidateOptions[TContext] {
  
  var __validating: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[js.Array[Ancester[TContext]]] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var originalValue: js.UndefOr[Any] = js.undefined
  
  var parent: js.UndefOr[Any] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var sync: js.UndefOr[Boolean] = js.undefined
}
object InternalOptions {
  
  inline def apply[TContext](): InternalOptions[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalOptions[TContext]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternalOptions[?], TContext] (val x: Self & InternalOptions[TContext]) extends AnyVal {
    
    inline def setFrom(value: js.Array[Ancester[TContext]]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: Ancester[TContext]*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOriginalValue(value: Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def set__validating(value: Boolean): Self = StObject.set(x, "__validating", value.asInstanceOf[js.Any])
    
    inline def set__validatingUndefined: Self = StObject.set(x, "__validating", js.undefined)
  }
}
