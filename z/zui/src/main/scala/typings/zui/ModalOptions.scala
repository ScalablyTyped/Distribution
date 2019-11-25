package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * bootstrap
  */
trait ModalOptions extends js.Object {
  var backdrop: js.UndefOr[Boolean | String] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var remote: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object ModalOptions {
  @scala.inline
  def apply(
    backdrop: Boolean | String = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    remote: String = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): ModalOptions = {
    val __obj = js.Dynamic.literal()
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions]
  }
}

