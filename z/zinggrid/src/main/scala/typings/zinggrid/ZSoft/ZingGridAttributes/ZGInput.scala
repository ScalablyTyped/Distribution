package typings.zinggrid.ZSoft.ZingGridAttributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZGInput extends StObject {
  
  /**
    * @description The built-in behavior and display of the input.  Gets and sets the associated grid property.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * @description The type of the input if not using a built-in action
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * @description The value of the input
    */
  var value: js.UndefOr[String] = js.undefined
}
object ZGInput {
  
  inline def apply(): ZGInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZGInput]
  }
  
  extension [Self <: ZGInput](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
