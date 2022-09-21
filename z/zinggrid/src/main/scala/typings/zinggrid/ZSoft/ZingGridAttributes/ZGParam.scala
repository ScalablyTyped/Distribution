package typings.zinggrid.ZSoft.ZingGridAttributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZGParam extends StObject {
  
  /**
    * @description Name of parameter
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @description The value for given data key.  If the value is an object, format as JSON encoded version of string.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ZGParam {
  
  inline def apply(): ZGParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZGParam]
  }
  
  extension [Self <: ZGParam](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
