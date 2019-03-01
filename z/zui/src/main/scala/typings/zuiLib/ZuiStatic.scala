package typings
package zuiLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Color")(Color)
    __obj.updateDynamic("Messager")(Messager)
    __obj.updateDynamic("ModalTrigger")(ModalTrigger)
    __obj.updateDynamic("colorset")(colorset)
    __obj.updateDynamic("messager")(messager)
    __obj.updateDynamic("modalTrigger")(modalTrigger)
    __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[ZuiStatic]
  }
}

