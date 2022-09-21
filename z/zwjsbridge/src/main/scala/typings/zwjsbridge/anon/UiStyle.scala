package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UiStyle extends StObject {
  
  /**
    * normal: 常规版
    * elder: 长辈版
    */
  var uiStyle: String
}
object UiStyle {
  
  inline def apply(uiStyle: String): UiStyle = {
    val __obj = js.Dynamic.literal(uiStyle = uiStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiStyle]
  }
  
  extension [Self <: UiStyle](x: Self) {
    
    inline def setUiStyle(value: String): Self = StObject.set(x, "uiStyle", value.asInstanceOf[js.Any])
  }
}
