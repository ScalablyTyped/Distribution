package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Row extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var css: js.UndefOr[String] = js.undefined
  var cssClass: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Tuple3[Double, String, String]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object Row {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    css: String = null,
    cssClass: String = null,
    data: js.Tuple3[Double, String, String] = null,
    id: String = null
  ): Row = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (css != null) __obj.updateDynamic("css")(css)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (data != null) __obj.updateDynamic("data")(data)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Row]
  }
}

