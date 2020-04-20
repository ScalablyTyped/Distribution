package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRtlrighttoleft extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Note that values require the leading 0 before the decimal point. Use with "background-color" attribute. 0.3 | 0.4 |
    *  0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the rotation angle of the object. A positive value will turn it in a clockwise direction. A negative value will turn it in a
    * counterclockwise direction. -90 | 270 | 180 | ...
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#FF0
    * 000", "#0000FF"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). One color will set a solid background color. Two colors
    * will, by default, create a horizontal gradient. For more complex gradients, use "gradient-colors" and "gradient-stops". "none" | "
    * transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the first color of a two-color background gradient. To be used with "background-color-2". "none" | "transparent" | "#f00" | "
    * #f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.undefined
  /**
    * Sets the second color of a two-color background gradient. To be used with "background-color-1". "none" | "transparent" | "#f00" |
    * "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-2`: js.UndefOr[String] = js.undefined
  /**
    * Sets the direction(s) in which the background image is being stretched. Works with "background-image". "x" | "y" | "xy"
    */
  var `background-fit`: js.UndefOr[String] = js.undefined
  /**
    * Sets a background image for the object. Value can be a local file or a web image's location. "image.png" | ...
    */
  var `background-image`: js.UndefOr[String] = js.undefined
  /**
    * Sets the position of the background when the "background-repeat" attribute is set to "no-repeat". "0 0" | "50 100" | "80% 60%" | .
    * ..
    */
  var `background-position`: js.UndefOr[String] = js.undefined
  /**
    * Sets the repeating mode for the background image. Works with "background-image". "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.undefined
  /**
    * Sets the transparency of the border. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `border-alpha`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the border color of the object, applicable on closed shapes. See the "line-color" attribute for closed shapes. "none" | "tran
    * sparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border width of the object, applicable on closed shapes. See the "line-width" attribute for closed shapes. 4 | "6px" | ..
    * .
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets whether or not the object will have a callout arrow. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows you to set the number of decimal places displayed for each value. 2 | 3 | 10 | ...
    */
  var decimals: js.UndefOr[Double] = js.undefined
  /**
    * Allows you to set the decimal mark displayed for each value. "." | "," | " " | ...
    */
  var `decimals-separator`: js.UndefOr[String] = js.undefined
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets an X offset to apply to the object. 5 | "10px" | ...
    */
  var `fill-offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets a Y offset to apply to the object. 5 | "10px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the background gradient fill type to linear or radial. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font color of the object. Similar to the "color" attribute. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow"
    * | "rgb(100, 15, 15)" | ...
    */
  var `font-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font family of the object. "Arial" | "Tahoma,Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font size of the object. 4 | "6px" | ...
    */
  var `font-size`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font style of the object. Similar to the "italic" attribute. "none" | "italic"
    */
  var `font-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the font weight of the object. Similar to the "bold" attribute. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.undefined
  /**
    * Sets the colors for a complex background gradient consisting of two or more colors. Use with the "gradient-stops" attribute. Works
    *  with output svg. "#f00 #0f0 #00f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.undefined
  /**
    * Sets the gradient stops for a complex background gradient consisting of two or more colors. Use with the "gradient-colors" attribu
    * te. Works with output svg. "0.1 0.5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.undefined
  /**
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets an X offset to apply when positioning the object. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets a Y offset to apply when positioning the object. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the padding of the object. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var padding: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies where the value boxes are placed in relation to the data points. Options by chart type: "in" | "out" | "auto" | "left" |
    *  "right" | "over" | ...
    */
  var placement: js.UndefOr[js.Any] = js.undefined
  /**
    * Renders text right-to-left. Default value is false. true | false | 1 | 0
    */
  @JSName("rtl (right-to-left)")
  var `rtl Leftparenthesisright-to-leftRightparenthesis`: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets whether or not the object's shadow is visible. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the transparency of the text. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comple
    * tely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `text-alpha`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the character used to separate thousands. "," | "." | " " | ...
    */
  var `thousands-separator`: js.UndefOr[String] = js.undefined
  /**
    * Specifies which value boxes are displayed. By default, all values in a series are displayed. You can also display the minimum, max
    * imum, first, last, and/or no values. "all" | "min" | "max" | "first" | "last" | none" | "min,max" | "first,last,min,max" | ...
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonRtlrighttoleft {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    angle: Int | Double = null,
    `background-color`: String = null,
    `background-color-1`: String = null,
    `background-color-2`: String = null,
    `background-fit`: String = null,
    `background-image`: String = null,
    `background-position`: String = null,
    `background-repeat`: String = null,
    `border-alpha`: Int | Double = null,
    `border-color`: String = null,
    `border-width`: js.Any = null,
    callout: js.UndefOr[Boolean] = js.undefined,
    decimals: Int | Double = null,
    `decimals-separator`: String = null,
    `fill-angle`: Int | Double = null,
    `fill-offset-x`: js.Any = null,
    `fill-offset-y`: js.Any = null,
    `fill-type`: String = null,
    `font-color`: String = null,
    `font-family`: String = null,
    `font-size`: String = null,
    `font-style`: String = null,
    `font-weight`: String = null,
    `gradient-colors`: String = null,
    `gradient-stops`: String = null,
    `line-style`: String = null,
    `offset-x`: js.Any = null,
    `offset-y`: js.Any = null,
    padding: js.Any = null,
    placement: js.Any = null,
    `rtl Leftparenthesisright-to-leftRightparenthesis`: js.UndefOr[Boolean] = js.undefined,
    shadow: js.UndefOr[Boolean] = js.undefined,
    `text-alpha`: Int | Double = null,
    `thousands-separator`: String = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonRtlrighttoleft = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`background-color-1` != null) __obj.updateDynamic("background-color-1")(`background-color-1`.asInstanceOf[js.Any])
    if (`background-color-2` != null) __obj.updateDynamic("background-color-2")(`background-color-2`.asInstanceOf[js.Any])
    if (`background-fit` != null) __obj.updateDynamic("background-fit")(`background-fit`.asInstanceOf[js.Any])
    if (`background-image` != null) __obj.updateDynamic("background-image")(`background-image`.asInstanceOf[js.Any])
    if (`background-position` != null) __obj.updateDynamic("background-position")(`background-position`.asInstanceOf[js.Any])
    if (`background-repeat` != null) __obj.updateDynamic("background-repeat")(`background-repeat`.asInstanceOf[js.Any])
    if (`border-alpha` != null) __obj.updateDynamic("border-alpha")(`border-alpha`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (!js.isUndefined(callout)) __obj.updateDynamic("callout")(callout.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (`decimals-separator` != null) __obj.updateDynamic("decimals-separator")(`decimals-separator`.asInstanceOf[js.Any])
    if (`fill-angle` != null) __obj.updateDynamic("fill-angle")(`fill-angle`.asInstanceOf[js.Any])
    if (`fill-offset-x` != null) __obj.updateDynamic("fill-offset-x")(`fill-offset-x`.asInstanceOf[js.Any])
    if (`fill-offset-y` != null) __obj.updateDynamic("fill-offset-y")(`fill-offset-y`.asInstanceOf[js.Any])
    if (`fill-type` != null) __obj.updateDynamic("fill-type")(`fill-type`.asInstanceOf[js.Any])
    if (`font-color` != null) __obj.updateDynamic("font-color")(`font-color`.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (`font-size` != null) __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    if (`font-style` != null) __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (`gradient-colors` != null) __obj.updateDynamic("gradient-colors")(`gradient-colors`.asInstanceOf[js.Any])
    if (`gradient-stops` != null) __obj.updateDynamic("gradient-stops")(`gradient-stops`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`offset-x` != null) __obj.updateDynamic("offset-x")(`offset-x`.asInstanceOf[js.Any])
    if (`offset-y` != null) __obj.updateDynamic("offset-y")(`offset-y`.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(`rtl Leftparenthesisright-to-leftRightparenthesis`)) __obj.updateDynamic("rtl (right-to-left)")((`rtl Leftparenthesisright-to-leftRightparenthesis`).asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (`text-alpha` != null) __obj.updateDynamic("text-alpha")(`text-alpha`.asInstanceOf[js.Any])
    if (`thousands-separator` != null) __obj.updateDynamic("thousands-separator")(`thousands-separator`.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRtlrighttoleft]
  }
}

