package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Row extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var css: js.UndefOr[java.lang.String] = js.undefined
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Tuple3[scala.Double, java.lang.String, java.lang.String]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object Row {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    css: java.lang.String = null,
    cssClass: java.lang.String = null,
    data: js.Tuple3[scala.Double, java.lang.String, java.lang.String] = null,
    id: java.lang.String = null
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

