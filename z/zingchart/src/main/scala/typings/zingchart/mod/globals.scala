package typings.zingchart.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait globals extends js.Object {
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require a leading zero before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the border color of the object, applicable to closed shapes. "none" | "transparent" | "#1A237E" | "purple" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border radius of the object, applicable to closed shapes. "3px" | "7px" | ...
    */
  var `border-radius`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the border width of the object, applicable to closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the font color of the object. "none" | "transparent" | "#1A237E" | "purple" | ...
    */
  var `font-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font family of the object. "Arial" | "Tahoma,Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font size of the object. 12 | "20px" | ...
    */
  var `font-size`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the font weight of the object. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line color of the object, applicable to non-closed shapes. "none" | "transparent" | "#1A237E" | "purple" | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line style of the object, applicable to non-closed shapes. "solid" | "dashed" | "dotted" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line width of the object, applicable to non-closed shapes. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[Double] = js.undefined
}

object globals {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    `border-color`: String = null,
    `border-radius`: js.UndefOr[Double] = js.undefined,
    `border-width`: js.UndefOr[Double] = js.undefined,
    `font-color`: String = null,
    `font-family`: String = null,
    `font-size`: js.UndefOr[Double] = js.undefined,
    `font-weight`: String = null,
    `line-color`: String = null,
    `line-style`: String = null,
    `line-width`: js.UndefOr[Double] = js.undefined
  ): globals = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (!js.isUndefined(`border-radius`)) __obj.updateDynamic("border-radius")(`border-radius`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`border-width`)) __obj.updateDynamic("border-width")(`border-width`.get.asInstanceOf[js.Any])
    if (`font-color` != null) __obj.updateDynamic("font-color")(`font-color`.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (!js.isUndefined(`font-size`)) __obj.updateDynamic("font-size")(`font-size`.get.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (!js.isUndefined(`line-width`)) __obj.updateDynamic("line-width")(`line-width`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[globals]
  }
}

