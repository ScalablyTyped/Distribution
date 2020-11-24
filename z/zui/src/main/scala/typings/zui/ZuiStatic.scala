package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZuiStatic extends js.Object {
  
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
  implicit class ZuiStaticOps[Self <: ZuiStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: ColorStatic): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessager(value: MessagerStatic): Self = this.set("Messager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalTrigger(value: ModalTriggerStatic): Self = this.set("ModalTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorset(value: ColorSet): Self = this.set("colorset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: StoreStatic): Self = this.set("store", value.asInstanceOf[js.Any])
  }
}
