package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * bootstrap
  */
trait ModalOptions extends js.Object {
  var backdrop: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var remote: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

object ModalOptions {
  @scala.inline
  def apply(
    backdrop: scala.Boolean | java.lang.String = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    remote: java.lang.String = null,
    show: js.UndefOr[scala.Boolean] = js.undefined
  ): ModalOptions = {
    val __obj = js.Dynamic.literal()
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (remote != null) __obj.updateDynamic("remote")(remote)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[ModalOptions]
  }
}

