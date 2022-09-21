package typings.zoomist.anon

import typings.std.HTMLElement
import typings.zoomist.zoomistBooleans.`false`
import typings.zoomist.zoomistStrings.horizontal
import typings.zoomist.zoomistStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait El extends StObject {
  
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  
  var el: js.UndefOr[String | HTMLElement | `false`] = js.undefined
  
  var maxRatio: js.UndefOr[Double] = js.undefined
}
object El {
  
  inline def apply(): El = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[El]
  }
  
  extension [Self <: El](x: Self) {
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setEl(value: String | HTMLElement | `false`): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    inline def setMaxRatio(value: Double): Self = StObject.set(x, "maxRatio", value.asInstanceOf[js.Any])
    
    inline def setMaxRatioUndefined: Self = StObject.set(x, "maxRatio", js.undefined)
  }
}
