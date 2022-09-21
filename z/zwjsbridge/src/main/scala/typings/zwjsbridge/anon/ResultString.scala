package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultString extends StObject {
  
  /**
    * 网络类型，取值: wifi、2g、3g、4g、unknown、none表示离线
    */
  var result: String
}
object ResultString {
  
  inline def apply(result: String): ResultString = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultString]
  }
  
  extension [Self <: ResultString](x: Self) {
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
