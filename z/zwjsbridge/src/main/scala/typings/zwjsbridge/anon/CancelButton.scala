package typings.zwjsbridge.anon

import typings.zwjsbridge.zwjsbridgeStrings.number
import typings.zwjsbridge.zwjsbridgeStrings.password
import typings.zwjsbridge.zwjsbridgeStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelButton extends StObject {
  
  /** 按钮名称，默认为取消 */
  var cancelButton: js.UndefOr[String] = js.undefined
  
  /** 按钮名称，默认为确定 */
  var confirmButton: js.UndefOr[String] = js.undefined
  
  /**
    * 取值:
    * text ，缺省值
    * number
    * password
    */
  var inputType: js.UndefOr[text | number | password] = js.undefined
  
  /** 文本框中的实际消息内容 */
  var message: js.UndefOr[String] = js.undefined
  
  /** 占位符，缺省为空 */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /** 文本框的标题 */
  var title: js.UndefOr[String] = js.undefined
}
object CancelButton {
  
  inline def apply(): CancelButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelButton] (val x: Self) extends AnyVal {
    
    inline def setCancelButton(value: String): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
    
    inline def setConfirmButton(value: String): Self = StObject.set(x, "confirmButton", value.asInstanceOf[js.Any])
    
    inline def setConfirmButtonUndefined: Self = StObject.set(x, "confirmButton", js.undefined)
    
    inline def setInputType(value: text | number | password): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
