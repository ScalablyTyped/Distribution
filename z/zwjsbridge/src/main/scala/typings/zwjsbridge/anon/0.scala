package typings.zwjsbridge.anon

import typings.zwjsbridge.zwjsbridgeStrings.qrCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  /**
    * type: "qrCode"
    */
  var `type`: qrCode
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("qrCode")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setType(value: qrCode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
