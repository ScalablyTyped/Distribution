package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CastOptions1[C] extends StObject {
  
  var assert: js.UndefOr[Boolean] = js.undefined
  
  var context: js.UndefOr[C] = js.undefined
  
  var parent: js.UndefOr[Any] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var resolved: js.UndefOr[Boolean] = js.undefined
  
  var stripUnknown: js.UndefOr[Boolean] = js.undefined
}
object CastOptions1 {
  
  inline def apply[C](): CastOptions1[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CastOptions1[C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CastOptions1[?], C] (val x: Self & CastOptions1[C]) extends AnyVal {
    
    inline def setAssert(value: Boolean): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    inline def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    inline def setContext(value: C): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    
    inline def setStripUnknown(value: Boolean): Self = StObject.set(x, "stripUnknown", value.asInstanceOf[js.Any])
    
    inline def setStripUnknownUndefined: Self = StObject.set(x, "stripUnknown", js.undefined)
  }
}
