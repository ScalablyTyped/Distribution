package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreservezoom extends js.Object {
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#666
    * 699", #33ccff"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). "none" | "transparent" | "purple" | "#33ccff" | "rgb(100,
    *  15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border color of the object. "none" | "transparent" | "purple" | "#33ccff" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border width of the object. 1 | 3 | | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[AnonBorderwidthFontcolor] = js.undefined
  /**
    * API charts only: Sets whether the zoom level is preserved on chart data alteration or reloads. true | false | 1 | 0
    */
  var `preserve-zoom`: js.UndefOr[Boolean] = js.undefined
}

object AnonPreservezoom {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    `background-color`: String = null,
    `border-color`: String = null,
    `border-width`: js.Any = null,
    label: AnonBorderwidthFontcolor = null,
    `preserve-zoom`: js.UndefOr[Boolean] = js.undefined
  ): AnonPreservezoom = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(`preserve-zoom`)) __obj.updateDynamic("preserve-zoom")(`preserve-zoom`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreservezoom]
  }
}

