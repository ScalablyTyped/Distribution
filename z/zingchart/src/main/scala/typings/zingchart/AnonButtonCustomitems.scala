package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonCustomitems extends js.Object {
  var button: js.UndefOr[AnonAlphaBackgroundcolorBorderwidth] = js.undefined
  var `custom-items`: js.UndefOr[js.Array[AnonFunction]] = js.undefined
  /**
    * To fix the position of the context menu to one side of the chart. true | false
    */
  var docked: js.UndefOr[Boolean] = js.undefined
  /**
    * Empties all default context-menu items, leaving just the "About ZingChart" button. true | false | 1 | 0
    */
  var empty: js.UndefOr[Boolean] = js.undefined
  var gear: js.UndefOr[AnonAlphaAngleBackgroundcolorBackgroundfit] = js.undefined
  var item: js.UndefOr[AnonBackgroundcolorBordercolor] = js.undefined
  /**
    * To position the context menu button on the left or right side of the chart. left | right
    */
  var position: js.UndefOr[String] = js.undefined
}

object AnonButtonCustomitems {
  @scala.inline
  def apply(
    button: AnonAlphaBackgroundcolorBorderwidth = null,
    `custom-items`: js.Array[AnonFunction] = null,
    docked: js.UndefOr[Boolean] = js.undefined,
    empty: js.UndefOr[Boolean] = js.undefined,
    gear: AnonAlphaAngleBackgroundcolorBackgroundfit = null,
    item: AnonBackgroundcolorBordercolor = null,
    position: String = null
  ): AnonButtonCustomitems = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (`custom-items` != null) __obj.updateDynamic("custom-items")(`custom-items`.asInstanceOf[js.Any])
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (gear != null) __obj.updateDynamic("gear")(gear.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonCustomitems]
  }
}

