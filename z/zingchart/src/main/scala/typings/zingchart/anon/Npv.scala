package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Npv extends js.Object {
  var npv: js.UndefOr[Decimals] = js.undefined
  var title: js.UndefOr[Fontfamily] = js.undefined
  var value: js.UndefOr[Fontfamily] = js.undefined
  /**
    * To set the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Npv {
  @scala.inline
  def apply(
    npv: Decimals = null,
    title: Fontfamily = null,
    value: Fontfamily = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Npv = {
    val __obj = js.Dynamic.literal()
    if (npv != null) __obj.updateDynamic("npv")(npv.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Npv]
  }
}

