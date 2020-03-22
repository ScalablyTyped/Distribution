package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontangle extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 being co
    * mpletely opaque. Note that the leading zero is required before the decimal. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., 'purple', 'blue'), hexadecimal notation (e.g., '#666
    * 699', '#33ccff'), or RGB notation (e.g., 'rgb(255,0,0)', 'rgb(0,0,255)'). 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100
    * , 15, 15)' | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the transparency of the border. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `border-alpha`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the border color of the object. Colors can be entered by name (e.g., 'purple', 'blue'), hexadecimal notation (e.g., '#666699'
    * , '#33ccff'), or RGB notation (e.g., 'rgb(255,0,0)', 'rgb(0,0,255)'). 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100, 15
    * , 15)' | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border radius of the object. 2 | 3 | '5px' | ...
    */
  var `border-radius`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the border width of the object. 1 | 3 | '6px' | ...
    */
  var `border-width`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the font angle of the object. -45 | 115 | ...
    */
  var `font-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the font color of the object. 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100, 15, 15)' | ...
    */
  var `font-color`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the font family of the object. 'Arial' | 'Tahoma,Verdana' | ...
    */
  var `font-family`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font size of the object. 12 | "20px" | ...
    */
  var `font-size`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the font style of the object. "normal" | "italic"
    */
  var `font-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font weight of the object. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line style of the object. 'solid' | 'dotted' | 'dashed' | 'dashdot'
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the padding of the object. 3 | '5px' | '10px' | ...
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * Sets the text to be displayed in the tooltips. "%text: %hits" | ...
    */
  var text: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the text transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 bei
    * ng completely opaque. Note that the leading zero is required before the decimal. 0.3 | 0.4 | 0.9 | ...
    */
  var `text-alpha`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the visibility of the object. true | false (default)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonFontangle {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    `background-color`: String = null,
    `border-alpha`: Int | Double = null,
    `border-color`: String = null,
    `border-radius`: Int | Double = null,
    `border-width`: Int | Double = null,
    `font-angle`: Int | Double = null,
    `font-color`: js.Any = null,
    `font-family`: String = null,
    `font-size`: Int | Double = null,
    `font-style`: String = null,
    `font-weight`: String = null,
    `line-style`: String = null,
    padding: Int | Double = null,
    text: js.Any = null,
    `text-alpha`: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonFontangle = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`border-alpha` != null) __obj.updateDynamic("border-alpha")(`border-alpha`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-radius` != null) __obj.updateDynamic("border-radius")(`border-radius`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (`font-angle` != null) __obj.updateDynamic("font-angle")(`font-angle`.asInstanceOf[js.Any])
    if (`font-color` != null) __obj.updateDynamic("font-color")(`font-color`.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (`font-size` != null) __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    if (`font-style` != null) __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`text-alpha` != null) __obj.updateDynamic("text-alpha")(`text-alpha`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFontangle]
  }
}

