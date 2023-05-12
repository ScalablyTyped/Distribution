package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<yup.yup.CastOptions$1<{}>, 'path' | 'resolved'> */
trait CastOptions extends StObject {
  
  var assert: js.UndefOr[Boolean] = js.undefined
  
  var context: js.UndefOr[js.Object] = js.undefined
  
  var parent: js.UndefOr[Any] = js.undefined
  
  var stripUnknown: js.UndefOr[Boolean] = js.undefined
}
object CastOptions {
  
  inline def apply(): CastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CastOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CastOptions] (val x: Self) extends AnyVal {
    
    inline def setAssert(value: Boolean): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    inline def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setStripUnknown(value: Boolean): Self = StObject.set(x, "stripUnknown", value.asInstanceOf[js.Any])
    
    inline def setStripUnknownUndefined: Self = StObject.set(x, "stripUnknown", js.undefined)
  }
}
