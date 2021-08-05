package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalOptionsBackdropString extends StObject {
  
  var backdrop: js.UndefOr[String] = js.undefined
  
  // for "static"
  var keyboard: js.UndefOr[Boolean] = js.undefined
  
  var remote: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
}
object ModalOptionsBackdropString {
  
  inline def apply(): ModalOptionsBackdropString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalOptionsBackdropString]
  }
  
  extension [Self <: ModalOptionsBackdropString](x: Self) {
    
    inline def setBackdrop(value: String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
