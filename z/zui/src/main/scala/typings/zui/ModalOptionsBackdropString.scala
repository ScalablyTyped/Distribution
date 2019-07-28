package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalOptionsBackdropString extends js.Object {
  var backdrop: js.UndefOr[String] = js.undefined
   // for "static"
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var remote: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object ModalOptionsBackdropString {
  @scala.inline
  def apply(
    backdrop: String = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    remote: String = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): ModalOptionsBackdropString = {
    val __obj = js.Dynamic.literal()
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (remote != null) __obj.updateDynamic("remote")(remote)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[ModalOptionsBackdropString]
  }
}

