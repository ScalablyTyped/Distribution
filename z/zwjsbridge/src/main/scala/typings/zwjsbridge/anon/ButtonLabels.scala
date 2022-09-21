package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonLabels extends StObject {
  
  /** 确认框中的可单击按钮 */
  var buttonLabels: js.UndefOr[js.Array[String]] = js.undefined
  
  /** 确认框中的实际消息内容 */
  var message: js.UndefOr[String] = js.undefined
  
  /** 确认框的标题 */
  var title: js.UndefOr[String] = js.undefined
}
object ButtonLabels {
  
  inline def apply(): ButtonLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonLabels]
  }
  
  extension [Self <: ButtonLabels](x: Self) {
    
    inline def setButtonLabels(value: js.Array[String]): Self = StObject.set(x, "buttonLabels", value.asInstanceOf[js.Any])
    
    inline def setButtonLabelsUndefined: Self = StObject.set(x, "buttonLabels", js.undefined)
    
    inline def setButtonLabelsVarargs(value: String*): Self = StObject.set(x, "buttonLabels", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
