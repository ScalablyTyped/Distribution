package typings.zoomist.anon

import typings.std.HTMLElement
import typings.zoomist.zoomistBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InEl extends StObject {
  
  var disableOnBounds: js.UndefOr[Boolean] = js.undefined
  
  var inEl: js.UndefOr[String | HTMLElement | `false`] = js.undefined
  
  var outEl: js.UndefOr[String | HTMLElement | `false`] = js.undefined
}
object InEl {
  
  inline def apply(): InEl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InEl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InEl] (val x: Self) extends AnyVal {
    
    inline def setDisableOnBounds(value: Boolean): Self = StObject.set(x, "disableOnBounds", value.asInstanceOf[js.Any])
    
    inline def setDisableOnBoundsUndefined: Self = StObject.set(x, "disableOnBounds", js.undefined)
    
    inline def setInEl(value: String | HTMLElement | `false`): Self = StObject.set(x, "inEl", value.asInstanceOf[js.Any])
    
    inline def setInElUndefined: Self = StObject.set(x, "inEl", js.undefined)
    
    inline def setOutEl(value: String | HTMLElement | `false`): Self = StObject.set(x, "outEl", value.asInstanceOf[js.Any])
    
    inline def setOutElUndefined: Self = StObject.set(x, "outEl", js.undefined)
  }
}
