package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Note that values require the leading zero before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the border color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the border radius of the object, for rounded corners. 4 | "6px" | "6px 10px 3px 5px" | "-10px" | ...
    */
  var `border-radius`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the border width of the object. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the height of the object. 10 | "20px"
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Sets the line style of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  /**
    * Only applies to Horizontal Bar Charts: Sets the width of the object. 10 | "20px"
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Height {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    `background-color`: js.Any = null,
    `border-color`: js.Any = null,
    `border-radius`: js.UndefOr[Double] = js.undefined,
    `border-width`: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    `line-style`: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Height = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (!js.isUndefined(`border-radius`)) __obj.updateDynamic("border-radius")(`border-radius`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`border-width`)) __obj.updateDynamic("border-width")(`border-width`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

