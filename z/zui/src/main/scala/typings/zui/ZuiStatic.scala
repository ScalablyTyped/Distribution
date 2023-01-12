package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZuiStatic extends StObject {
  
  var Color: ColorStatic
  
  var Messager: MessagerStatic
  
  var ModalTrigger: ModalTriggerStatic
  
  var colorset: ColorSet
  
  // $.zui.messager
  var messager: Messager
  
  var modalTrigger: ModalTrigger
  
  var store: StoreStatic
}
object ZuiStatic {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ZuiStatic] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ColorStatic): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorset(value: ColorSet): Self = StObject.set(x, "colorset", value.asInstanceOf[js.Any])
    
    inline def setMessager(value: MessagerStatic): Self = StObject.set(x, "Messager", value.asInstanceOf[js.Any])
    
    inline def setModalTrigger(value: ModalTriggerStatic): Self = StObject.set(x, "ModalTrigger", value.asInstanceOf[js.Any])
    
    inline def setStore(value: StoreStatic): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
