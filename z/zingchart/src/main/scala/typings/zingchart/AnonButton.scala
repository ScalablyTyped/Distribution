package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButton extends js.Object {
  var button: js.UndefOr[AnonClose] = js.undefined
  var items: js.UndefOr[js.Array[AnonFontcolor]] = js.undefined
  /**
    * To set the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonButton {
  @scala.inline
  def apply(
    button: AnonClose = null,
    items: js.Array[AnonFontcolor] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonButton = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButton]
  }
}

