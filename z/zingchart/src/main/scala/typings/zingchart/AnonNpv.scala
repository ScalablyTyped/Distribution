package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNpv extends js.Object {
  var npv: js.UndefOr[AnonDecimals] = js.undefined
  var title: js.UndefOr[AnonFontfamily] = js.undefined
  var value: js.UndefOr[AnonFontfamily] = js.undefined
  /**
    * To set the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonNpv {
  @scala.inline
  def apply(
    npv: AnonDecimals = null,
    title: AnonFontfamily = null,
    value: AnonFontfamily = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonNpv = {
    val __obj = js.Dynamic.literal()
    if (npv != null) __obj.updateDynamic("npv")(npv.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNpv]
  }
}

