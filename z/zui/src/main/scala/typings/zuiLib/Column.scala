package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var colClass: js.UndefOr[java.lang.String] = js.undefined
  var flex: js.UndefOr[scala.Boolean] = js.undefined
  var ignore: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    colClass: java.lang.String = null,
    flex: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: js.UndefOr[scala.Boolean] = js.undefined,
    sort: java.lang.String = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (colClass != null) __obj.updateDynamic("colClass")(colClass)
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex)
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

