package typings.zoomist.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableOnBounds extends StObject {
  
  var disableOnBounds: Boolean
  
  var inEl: String
  
  var isCustomInEl: Boolean
  
  var isCustomOutEl: Boolean
  
  var mounted: Boolean
  
  var outEl: String
  
  var zoomerEl: HTMLElement
  
  var zoomerInEl: HTMLElement
  
  var zoomerOutEl: HTMLElement
}
object DisableOnBounds {
  
  inline def apply(
    disableOnBounds: Boolean,
    inEl: String,
    isCustomInEl: Boolean,
    isCustomOutEl: Boolean,
    mounted: Boolean,
    outEl: String,
    zoomerEl: HTMLElement,
    zoomerInEl: HTMLElement,
    zoomerOutEl: HTMLElement
  ): DisableOnBounds = {
    val __obj = js.Dynamic.literal(disableOnBounds = disableOnBounds.asInstanceOf[js.Any], inEl = inEl.asInstanceOf[js.Any], isCustomInEl = isCustomInEl.asInstanceOf[js.Any], isCustomOutEl = isCustomOutEl.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any], outEl = outEl.asInstanceOf[js.Any], zoomerEl = zoomerEl.asInstanceOf[js.Any], zoomerInEl = zoomerInEl.asInstanceOf[js.Any], zoomerOutEl = zoomerOutEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableOnBounds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableOnBounds] (val x: Self) extends AnyVal {
    
    inline def setDisableOnBounds(value: Boolean): Self = StObject.set(x, "disableOnBounds", value.asInstanceOf[js.Any])
    
    inline def setInEl(value: String): Self = StObject.set(x, "inEl", value.asInstanceOf[js.Any])
    
    inline def setIsCustomInEl(value: Boolean): Self = StObject.set(x, "isCustomInEl", value.asInstanceOf[js.Any])
    
    inline def setIsCustomOutEl(value: Boolean): Self = StObject.set(x, "isCustomOutEl", value.asInstanceOf[js.Any])
    
    inline def setMounted(value: Boolean): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
    
    inline def setOutEl(value: String): Self = StObject.set(x, "outEl", value.asInstanceOf[js.Any])
    
    inline def setZoomerEl(value: HTMLElement): Self = StObject.set(x, "zoomerEl", value.asInstanceOf[js.Any])
    
    inline def setZoomerInEl(value: HTMLElement): Self = StObject.set(x, "zoomerInEl", value.asInstanceOf[js.Any])
    
    inline def setZoomerOutEl(value: HTMLElement): Self = StObject.set(x, "zoomerOutEl", value.asInstanceOf[js.Any])
  }
}
