package typings.zingchart.es6Mod.zingchart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait behavior extends StObject {
  
  /**
    * Executes specified custom function for the custom menu item.
    */
  var `custom-function`: js.UndefOr[String] = js.undefined
  
  var customFunction: js.UndefOr[String] = js.undefined
  
  /**
    * To enable or disable individual context menu item behaviors. "all" | "none"
    */
  var enabled: js.UndefOr[String] = js.undefined
  
  /**
    * To specify the behavior ID of the context menu item that is being accessed. "3D" | "LogScale" | "LinScale" | ...
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the label of the custom menu item.
    */
  var text: js.UndefOr[String] = js.undefined
}
object behavior {
  
  inline def apply(): behavior = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[behavior]
  }
  
  extension [Self <: behavior](x: Self) {
    
    inline def `setCustom-function`(value: String): Self = StObject.set(x, "custom-function", value.asInstanceOf[js.Any])
    
    inline def `setCustom-functionUndefined`: Self = StObject.set(x, "custom-function", js.undefined)
    
    inline def setCustomFunction(value: String): Self = StObject.set(x, "customFunction", value.asInstanceOf[js.Any])
    
    inline def setCustomFunctionUndefined: Self = StObject.set(x, "customFunction", js.undefined)
    
    inline def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
