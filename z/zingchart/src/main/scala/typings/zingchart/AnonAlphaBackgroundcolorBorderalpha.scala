package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlphaBackgroundcolorBorderalpha extends js.Object {
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
    * Sets the transparency of the border. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `border-alpha`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the border color of the object. "none" | "transparent" | "purple" | "#33ccff" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border radius (rounded corners) of the object. "3px" | "10px"
    */
  var `border-radius`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the border width of the object. 1 | 3 | | "6px" | ...
    */
  var `border-width`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the font color of the object text. "none" | "transparent" | "purple" | "#33ccff" | ...
    */
  var `font-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font family of the object text. "Courier" | "Georgia" | "Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font size of the object text. 12 | "20px" | ...
    */
  var `font-size`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font style of the object text. "normal" | "italic"
    */
  var `font-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font weight of the object text. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.undefined
  /**
    * Sets the height of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Sets the padding around the object text. "10%" | "25px" ...
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * To create sticky tooltips. Use this with the "timeout" attribute, which allows you to specify how long you want the tooltips to "s
    * tick" to the chart. true | false | 1 |0
    */
  var sticky: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies what text to display in the tooltips. "Legend Tooltips" | "%t %plot-description" | "..."
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Sets the transparency of the text. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comple
    * tely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `text-alpha`: js.UndefOr[Double] = js.undefined
  /**
    * To create sticky tooltips. Provide a value in milliseconds. Use this with the "sticky" attribute, which specifies whether or not t
    * ooltips will "stick" to the chart. "30000 | 10000 | ...
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * Sets the width of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * Sets whether the text will wrap, depending on the width of the object. true | false | 1 | 0
    */
  var `wrap-text`: js.UndefOr[Boolean] = js.undefined
}

object AnonAlphaBackgroundcolorBorderalpha {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    `background-color`: String = null,
    `border-alpha`: Int | Double = null,
    `border-color`: String = null,
    `border-radius`: js.Any = null,
    `border-width`: Int | Double = null,
    `font-color`: String = null,
    `font-family`: String = null,
    `font-size`: String = null,
    `font-style`: String = null,
    `font-weight`: String = null,
    height: Int | Double = null,
    padding: Int | Double = null,
    sticky: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    `text-alpha`: Int | Double = null,
    timeout: Int | Double = null,
    width: Int | Double = null,
    `wrap-text`: js.UndefOr[Boolean] = js.undefined
  ): AnonAlphaBackgroundcolorBorderalpha = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`border-alpha` != null) __obj.updateDynamic("border-alpha")(`border-alpha`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-radius` != null) __obj.updateDynamic("border-radius")(`border-radius`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (`font-color` != null) __obj.updateDynamic("font-color")(`font-color`.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (`font-size` != null) __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    if (`font-style` != null) __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`text-alpha` != null) __obj.updateDynamic("text-alpha")(`text-alpha`.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(`wrap-text`)) __obj.updateDynamic("wrap-text")(`wrap-text`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlphaBackgroundcolorBorderalpha]
  }
}

