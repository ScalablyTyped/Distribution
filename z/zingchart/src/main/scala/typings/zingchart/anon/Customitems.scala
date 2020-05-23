package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Customitems extends js.Object {
  var button: js.UndefOr[Maxchars] = js.undefined
  var `custom-items`: js.UndefOr[js.Array[Function]] = js.undefined
  /**
    * To fix the position of the context menu to one side of the chart. true | false
    */
  var docked: js.UndefOr[Boolean] = js.undefined
  /**
    * Empties all default context-menu items, leaving just the "About ZingChart" button. true | false | 1 | 0
    */
  var empty: js.UndefOr[Boolean] = js.undefined
  var gear: js.UndefOr[Offsety] = js.undefined
  var item: js.UndefOr[FontcolorHoverstate] = js.undefined
  /**
    * To position the context menu button on the left or right side of the chart. left | right
    */
  var position: js.UndefOr[String] = js.undefined
}

object Customitems {
  @scala.inline
  def apply(
    button: Maxchars = null,
    `custom-items`: js.Array[Function] = null,
    docked: js.UndefOr[Boolean] = js.undefined,
    empty: js.UndefOr[Boolean] = js.undefined,
    gear: Offsety = null,
    item: FontcolorHoverstate = null,
    position: String = null
  ): Customitems = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (`custom-items` != null) __obj.updateDynamic("custom-items")(`custom-items`.asInstanceOf[js.Any])
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.get.asInstanceOf[js.Any])
    if (gear != null) __obj.updateDynamic("gear")(gear.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customitems]
  }
}

