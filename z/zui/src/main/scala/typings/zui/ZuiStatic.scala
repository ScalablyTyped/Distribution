package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZuiStatic extends StObject {
  
  var Color: ColorStatic = js.native
  
  var Messager: MessagerStatic = js.native
  
  var ModalTrigger: ModalTriggerStatic = js.native
  
  var colorset: ColorSet = js.native
  
  // $.zui.messager
  var messager: Messager = js.native
  
  var modalTrigger: ModalTrigger = js.native
  
  var store: StoreStatic = js.native
}
object ZuiStatic {
  
  @scala.inline
  def apply(
    Color: ColorStatic,
    Messager: MessagerStatic,
    ModalTrigger: ModalTriggerStatic,
    colorset: ColorSet,
    messager: Messager,
    modalTrigger: ModalTrigger,
    store: StoreStatic
  ): ZuiStatic = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Messager = Messager.asInstanceOf[js.Any], ModalTrigger = ModalTrigger.asInstanceOf[js.Any], colorset = colorset.asInstanceOf[js.Any], messager = messager.asInstanceOf[js.Any], modalTrigger = modalTrigger.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZuiStatic]
  }
  
  @scala.inline
  implicit class ZuiStaticMutableBuilder[Self <: ZuiStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorStatic): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorset(value: ColorSet): Self = StObject.set(x, "colorset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessager(value: MessagerStatic): Self = StObject.set(x, "Messager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalTrigger(value: ModalTriggerStatic): Self = StObject.set(x, "ModalTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: StoreStatic): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
