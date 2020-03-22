package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Area Chart only: Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely trans
    * parent and 1.0 being completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var `alpha-area`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#666
    * 699", #33ccff"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). "none" | "transparent" | "purple" | "#33ccff" | "rgb(100,
    *  15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line color of the object. "none" | "transparent" | "purple" | "#33ccff" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line style of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line width of the object. 2 | 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * To set the stock preview chart type: area chart or line chart. "area" (default) | "line"
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonType {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    `alpha-area`: Int | Double = null,
    `background-color`: String = null,
    `line-color`: String = null,
    `line-style`: String = null,
    `line-width`: js.Any = null,
    `type`: String = null
  ): AnonType = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (`alpha-area` != null) __obj.updateDynamic("alpha-area")(`alpha-area`.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`line-width` != null) __obj.updateDynamic("line-width")(`line-width`.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

