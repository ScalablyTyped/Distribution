package typings.zingchart.es6Mod.zingchart

import typings.zingchart.anon.BorderBottom
import typings.zingchart.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait scrollXSCrollY extends StObject {
  
  var bar: js.UndefOr[Height] = js.undefined
  
  var handle: js.UndefOr[BorderBottom] = js.undefined
  
  /**
    * Sets an x offset that will be applied to the scroll-x object. 4 | '6px' | ...
    */
  var `offset-x`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets a y offset that will be applied to the scroll-x object. 4 | '6px' | ...
    */
  var `offset-y`: js.UndefOr[Any] = js.undefined
  
  var offsetX: js.UndefOr[Any] = js.undefined
  
  var offsetY: js.UndefOr[Any] = js.undefined
}
object scrollXSCrollY {
  
  inline def apply(): scrollXSCrollY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[scrollXSCrollY]
  }
  
  extension [Self <: scrollXSCrollY](x: Self) {
    
    inline def setBar(value: Height): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    inline def setHandle(value: BorderBottom): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def `setOffset-x`(value: Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    inline def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    inline def `setOffset-y`(value: Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    inline def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    inline def setOffsetX(value: Any): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Any): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
  }
}
