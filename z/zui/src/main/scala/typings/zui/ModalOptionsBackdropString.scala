package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalOptionsBackdropString extends StObject {
  
  var backdrop: js.UndefOr[String] = js.native
  
  // for "static"
  var keyboard: js.UndefOr[Boolean] = js.native
  
  var remote: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
object ModalOptionsBackdropString {
  
  @scala.inline
  def apply(): ModalOptionsBackdropString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalOptionsBackdropString]
  }
  
  @scala.inline
  implicit class ModalOptionsBackdropStringMutableBuilder[Self <: ModalOptionsBackdropString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackdrop(value: String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
