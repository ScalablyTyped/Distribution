package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZuiStatic extends js.Object {
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
    val __obj = js.Dynamic.literal(Color = Color, Messager = Messager, ModalTrigger = ModalTrigger, colorset = colorset, messager = messager, modalTrigger = modalTrigger, store = store)
  
    __obj.asInstanceOf[ZuiStatic]
  }
}

