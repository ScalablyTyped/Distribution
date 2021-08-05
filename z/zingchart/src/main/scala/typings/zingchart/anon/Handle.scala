package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handle extends StObject {
  
  var bar: js.UndefOr[Width] = js.undefined
  
  var handle: js.UndefOr[Bordertop] = js.undefined
  
  /**
    * Sets an x offset that will be applied to the scroll-x object. 4 | '6px' | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets a y offset that will be applied to the scroll-x object. 4 | '6px' | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
}
object Handle {
  
  inline def apply(): Handle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handle]
  }
  
  extension [Self <: Handle](x: Self) {
    
    inline def setBar(value: Width): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    inline def setHandle(value: Bordertop): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def `setOffset-x`(value: js.Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    inline def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    inline def `setOffset-y`(value: js.Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    inline def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
  }
}
