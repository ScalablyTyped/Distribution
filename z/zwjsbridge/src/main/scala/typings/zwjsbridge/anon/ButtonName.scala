package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonName extends StObject {
  
  /** 按钮名称 */
  var buttonName: js.UndefOr[String] = js.undefined
  
  /** 消息内容 */
  var message: js.UndefOr[String] = js.undefined
  
  /** 标题 */
  var title: js.UndefOr[String] = js.undefined
}
object ButtonName {
  
  inline def apply(): ButtonName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonName]
  }
  
  extension [Self <: ButtonName](x: Self) {
    
    inline def setButtonName(value: String): Self = StObject.set(x, "buttonName", value.asInstanceOf[js.Any])
    
    inline def setButtonNameUndefined: Self = StObject.set(x, "buttonName", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
