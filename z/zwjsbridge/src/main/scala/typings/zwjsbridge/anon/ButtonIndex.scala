package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonIndex extends StObject {
  
  /** 确认框中可单击按钮的索引值，Number类型，从0开始 */
  var buttonIndex: Double
}
object ButtonIndex {
  
  inline def apply(buttonIndex: Double): ButtonIndex = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonIndex]
  }
  
  extension [Self <: ButtonIndex](x: Self) {
    
    inline def setButtonIndex(value: Double): Self = StObject.set(x, "buttonIndex", value.asInstanceOf[js.Any])
  }
}
