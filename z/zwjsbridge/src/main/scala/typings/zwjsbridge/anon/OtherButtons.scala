package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherButtons extends StObject {
  
  /** 取消按钮文本 */
  var cancelButton: js.UndefOr[String] = js.undefined
  
  /** 其他按钮列表 */
  var otherButtons: js.Array[String]
  
  /** 单选列表的标题 */
  var title: String
}
object OtherButtons {
  
  inline def apply(otherButtons: js.Array[String], title: String): OtherButtons = {
    val __obj = js.Dynamic.literal(otherButtons = otherButtons.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherButtons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OtherButtons] (val x: Self) extends AnyVal {
    
    inline def setCancelButton(value: String): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
    
    inline def setOtherButtons(value: js.Array[String]): Self = StObject.set(x, "otherButtons", value.asInstanceOf[js.Any])
    
    inline def setOtherButtonsVarargs(value: String*): Self = StObject.set(x, "otherButtons", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
