package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallouthook extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. For graph plot tooltip. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the rotation angle of the object/shape. For graph plot tooltip. -45 | 115 | ...
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g. "red", "blue", "yellow"), in hexadecimal notation (e.
    * g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0,0,255)", "rgb(255,255,0)"). For graph plot to
    * oltip. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the first color of a 2 color background gradient of the object. To be used with background-color-2. For graph plot tooltip. "
    * none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.undefined
  /**
    * Sets the second color of a 2 color background gradient of the object. To be used with background-color-1. For graph plot tooltip.
    * "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-2`: js.UndefOr[String] = js.undefined
  /**
    * Sets the direction/s on which the background image is being "stretched". For graph plot tooltip. "x" | "y" | "xy"
    */
  var `background-fit`: js.UndefOr[String] = js.undefined
  /**
    * Sets a background image for the object. Value can be a local file or a web image's location. For graph plot tooltip. "image.png" |
    *  ...
    */
  var `background-image`: js.UndefOr[String] = js.undefined
  /**
    * Sets the position of the background when the background-repeat value is no-repeat. For graph plot tooltip. "0 0" | "50 100" | "80%
    *  60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.undefined
  /**
    * Sets the repeating mode for the background image. For graph plot tooltip. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.undefined
  /**
    * Sets the transparency of the border. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `border-alpha`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the object's bottom border style. Accepts solid, dashed, and dotted styles. For graph plot tooltip. "2px solid #f00" | ...
    */
  var `border-bottom`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border color of the object. For graph plot tooltip. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(1
    * 00, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's left border style. Accepts solid, dashed, and dotted styles. For graph plot tooltip. "2px solid #f00" | ...
    */
  var `border-left`: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's border radius, for rounded corners. Larger values create rounder corners, while smaller values create sharper co
    * rners. A single value will affect all 4 corners, while multiple values will have separate effects on each corner, with the first v
    * alue affecting the top-left corner, the second value affecting the top-right corner, and so on, in a clockwise direction. For grap
    * h plot tooltip. 4 | "6px" | "6px 10px 3px 5px" | "-10px" | ...
    */
  var `border-radius`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's bottom-left border radius, for rounded corners. Larger values create rounder corners, while smaller values creat
    * e sharper corners. A negative value will cut a corner off without rounding. For graph plot tooltip. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's bottom-right border radius, for rounded corners. Larger values create rounder corners, while smaller values crea
    * te sharper corners. A negative value will cut a corner off without rounding. For graph plot tooltip. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-right`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's top-left border radius, for rounded corners. Larger values create rounder corners, while smaller values create s
    * harper corners. A negative value will cut a corner off without rounding. For graph plot tooltip. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's top-right border radius, for rounded corners. Larger values create rounder corners, while smaller values create
    * sharper corners. A negative value will cut a corner off without rounding. For graph plot tooltip. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-right`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's right border style. Accepts solid, dashed, and dotted styles. For graph plot tooltip. "2px solid #f00" | ...
    */
  var `border-right`: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's top border style. Values must include the border width, style, and color. Accepts solid, dashed, and dotted styl
    * es. For graph plot tooltip. "2px solid #f00" | ...
    */
  var `border-top`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border width of the object. For graph plot tooltip. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets whether an object will have a callout arrow or not. For graph plot tooltip. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the length of the extension that extends beyond the tip of the callout arrow. 4 | "6px" | ...
    */
  var `callout-extension`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the height of the object's callout arrow. A larger value will create a taller callout arrow. For graph plot tooltip. 4 | "6px
    * " | ...
    */
  var `callout-height`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the point of the tip of the callout arrow to a specified coordinate on the chart, with the starting point of [0,0] being the
    * top left corner of the chart. For graph plot tooltip. [200, 50] | ...
    */
  var `callout-hook`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the offset along the callout direction of the arrow's base. Positive and negative values can be used to offset the callout ar
    * row up, down, left, or right depending on the callout-position. For graph plot tooltip. 4 | "6px" | ...
    */
  var `callout-offset`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the position for the object's callout arrow. The position is "bottom" by default. For graph plot tooltip. "top" | "right" | "
    * bottom" | "left"
    */
  var `callout-position`: js.UndefOr[String] = js.undefined
  /**
    * Sets the width of the object's callout arrow. A larger value will create a wider callout arrow. For graph plot tooltip. 4 | "6px"
    * | ...
    */
  var `callout-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Cuts off extra text. Use with width. For graph plot tooltip. true | false | 1 | 0
    */
  var `clip-text`: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the text's color of the tooltip. Similar with font-color. For graph plot tooltip. "none" | "transparent" | "#f00" | "#f00 #00
    * f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Allows you to set the number of decimal places displayed for each value. 2 | 3 | 10 | ...
    */
  var decimals: js.UndefOr[Double] = js.undefined
  /**
    * Allows you to set the decimal mark displayed for each value. "." | "," | " " | ...
    */
  var `decimals-separator`: js.UndefOr[String] = js.undefined
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. For graph plot tooltip. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets an X offset to apply to the fill. For graph plot tooltip. 4 | "6px" | ...
    */
  var `fill-offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets an Y offset to apply to the fill. For graph plot tooltip. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the background gradient fill type to either linear or radial. For graph plot tooltip. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  /**
    * Sets the rotation angle of the text of the tooltip. Similar with angle. -45 | 115 | ...
    */
  var `font-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the text's color of the tooltip. Similar with color. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100,
    *  15, 15)" | ...
    */
  var `font-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the text's font family of the tooltip. "Arial" | "Tahoma,Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.undefined
  /**
    * Sets the text's font size of the tooltip. 4 | "6px" | ...
    */
  var `font-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the text's font style of the tooltip. Similar with italic. "none" | "italic" | "oblique"
    */
  var `font-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the text's font weight of the tooltip. Similar with bold. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.undefined
  /**
    * Sets a set of colors for a complex background gradient consisting of 2 or more colors. To be used with gradient-stops. For graph p
    * lot tooltip. "#f00 #0f0 #00f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.undefined
  /**
    * Sets the gradient stops for a complex background gradient consisting of 2 or more colors. To be used with gradient-colors. For gra
    * ph plot tooltip. "0.1 0.5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's height. For graph plot tooltip. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the item id of the map on which the object/shape is being added. "itemid" | ...
    */
  var item: js.UndefOr[String] = js.undefined
  /**
    * Sets the map id of the map on which the object/shape is being added. "mapid" | ...
    */
  var map: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's margins. For graph plot tooltip. Works with output flash. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's bottom margin. For graph plot tooltip. Works with output flash. 4 | "6px" | ...
    */
  var `margin-bottom`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's left margin. For graph plot tooltip. Works with output flash. 4 | "6px" | ...
    */
  var `margin-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's right margin. For graph plot tooltip. Works with output flash. 4 | "6px" | ...
    */
  var `margin-right`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's top margin. For graph plot tooltip. Works with output flash. 4 | "6px" | ...
    */
  var `margin-top`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the maximum numbers of characters displayed in the object. The value determines how many characters will be displayed before
    * the text is cut and appended with "..." For graph plot tooltip. Works with output canvas and svg. 5 | 10 | ...
    */
  var `max-chars`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum width of the text box. If text is longer than the max-width value, it will overlap the box or will wrap if wrap-t
    * ext is set to true. For graph plot tooltip. Works with output canvas and svg. 10 | "20px" | 0.3 | "30%" | ...
    */
  var `max-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets an X offset to apply when positioning the object/shape. For graph plot tooltip. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets an Y offset to apply when positioning the object/shape. For graph plot tooltip. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's padding around the text of the tooltip. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var padding: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's bottom padding around the text of the tooltip. 4 | "6px" | ...
    */
  var `padding-bottom`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's left padding around the text of the tooltip. 4 | "6px" | ...
    */
  var `padding-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's right padding around the text of the tooltip. 4 | "6px" | ...
    */
  var `padding-right`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's top padding around the text of the tooltip. 4 | "6px" | ...
    */
  var `padding-top`: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies where tooltips are fixed relative to their node values. Refer to the applicable chart types page for more information. O
    * ptions by Chart Type: "node:top" | "node:center" | "node:out" | ...
    */
  var placement: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's position relative to it's container. Similar results can be obtained by setting marginand margin-... attributes.
    *  For graph plot tooltip.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * Renders text right-to-left. Default value is false. true | false | 1 | 0
    */
  @JSName("rtl (right-to-left)")
  var `rtl Leftparenthesisright-to-leftRightparenthesis`: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets whether the object's shadow is visible or not. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the transparency of the shadow of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and
    * 1.0 being completely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `shadow-alpha`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the angle of the shadow underneath the object. -45 | 115 | ...
    */
  var `shadow-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the blur effect size for the shadow of the object. Has limited effect on HTML5 implementation. 4 | "6px" | ...
    */
  var `shadow-blur`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the color of the shadow of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ..
    * .
    */
  var `shadow-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the distance between the shadow and the object. 4 | "6px" | ...
    */
  var `shadow-distance`: js.UndefOr[js.Any] = js.undefined
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
    * Allows the underlying data to be 'transformed' to a new format if it was in that format originally. For example, if data is coded
    * as a date and time, and 'type':'date' is specified as an attribute of this object, '1311261385209' will display 'Wed, 19 of May 05
    * :00 PM' if '%D, %d %M %h:%i %A' is specified under the transform attribute of scale-x. {...}
    */
  var transform: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets whether the text will wrap, depending on the width of the object. For graph plot tooltip. true | false | 1 | 0
    */
  var `wrap-text`: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the z position of the object. Objects with higher z indexes will appear "above" those with lower z index values. 5 | 10 | ...
    */
  var `z-index`: js.UndefOr[Double] = js.undefined
}

object AnonCallouthook {
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
    `border-bottom`: String = null,
    `border-color`: String = null,
    `border-left`: String = null,
    `border-radius`: js.Any = null,
    `border-radius-bottom-left`: js.Any = null,
    `border-radius-bottom-right`: js.Any = null,
    `border-radius-top-left`: js.Any = null,
    `border-radius-top-right`: js.Any = null,
    `border-right`: String = null,
    `border-top`: String = null,
    `border-width`: js.Any = null,
    callout: js.UndefOr[Boolean] = js.undefined,
    `callout-extension`: js.Any = null,
    `callout-height`: js.Any = null,
    `callout-hook`: js.Any = null,
    `callout-offset`: js.Any = null,
    `callout-position`: String = null,
    `callout-width`: js.Any = null,
    `clip-text`: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    decimals: Int | Double = null,
    `decimals-separator`: String = null,
    `fill-angle`: Int | Double = null,
    `fill-offset-x`: js.Any = null,
    `fill-offset-y`: js.Any = null,
    `fill-type`: String = null,
    `font-angle`: Int | Double = null,
    `font-color`: String = null,
    `font-family`: String = null,
    `font-size`: js.Any = null,
    `font-style`: String = null,
    `font-weight`: String = null,
    `gradient-colors`: String = null,
    `gradient-stops`: String = null,
    height: js.Any = null,
    item: String = null,
    map: String = null,
    margin: js.Any = null,
    `margin-bottom`: js.Any = null,
    `margin-left`: js.Any = null,
    `margin-right`: js.Any = null,
    `margin-top`: js.Any = null,
    `max-chars`: Int | Double = null,
    `max-width`: js.Any = null,
    `offset-x`: js.Any = null,
    `offset-y`: js.Any = null,
    padding: js.Any = null,
    `padding-bottom`: js.Any = null,
    `padding-left`: js.Any = null,
    `padding-right`: js.Any = null,
    `padding-top`: js.Any = null,
    placement: String = null,
    position: String = null,
    `rtl Leftparenthesisright-to-leftRightparenthesis`: js.UndefOr[Boolean] = js.undefined,
    shadow: js.UndefOr[Boolean] = js.undefined,
    `shadow-alpha`: Int | Double = null,
    `shadow-angle`: Int | Double = null,
    `shadow-blur`: js.Any = null,
    `shadow-color`: String = null,
    `shadow-distance`: js.Any = null,
    `text-alpha`: Int | Double = null,
    `thousands-separator`: String = null,
    transform: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.Any = null,
    `wrap-text`: js.UndefOr[Boolean] = js.undefined,
    `z-index`: Int | Double = null
  ): AnonCallouthook = {
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
    if (`border-bottom` != null) __obj.updateDynamic("border-bottom")(`border-bottom`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-left` != null) __obj.updateDynamic("border-left")(`border-left`.asInstanceOf[js.Any])
    if (`border-radius` != null) __obj.updateDynamic("border-radius")(`border-radius`.asInstanceOf[js.Any])
    if (`border-radius-bottom-left` != null) __obj.updateDynamic("border-radius-bottom-left")(`border-radius-bottom-left`.asInstanceOf[js.Any])
    if (`border-radius-bottom-right` != null) __obj.updateDynamic("border-radius-bottom-right")(`border-radius-bottom-right`.asInstanceOf[js.Any])
    if (`border-radius-top-left` != null) __obj.updateDynamic("border-radius-top-left")(`border-radius-top-left`.asInstanceOf[js.Any])
    if (`border-radius-top-right` != null) __obj.updateDynamic("border-radius-top-right")(`border-radius-top-right`.asInstanceOf[js.Any])
    if (`border-right` != null) __obj.updateDynamic("border-right")(`border-right`.asInstanceOf[js.Any])
    if (`border-top` != null) __obj.updateDynamic("border-top")(`border-top`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (!js.isUndefined(callout)) __obj.updateDynamic("callout")(callout.asInstanceOf[js.Any])
    if (`callout-extension` != null) __obj.updateDynamic("callout-extension")(`callout-extension`.asInstanceOf[js.Any])
    if (`callout-height` != null) __obj.updateDynamic("callout-height")(`callout-height`.asInstanceOf[js.Any])
    if (`callout-hook` != null) __obj.updateDynamic("callout-hook")(`callout-hook`.asInstanceOf[js.Any])
    if (`callout-offset` != null) __obj.updateDynamic("callout-offset")(`callout-offset`.asInstanceOf[js.Any])
    if (`callout-position` != null) __obj.updateDynamic("callout-position")(`callout-position`.asInstanceOf[js.Any])
    if (`callout-width` != null) __obj.updateDynamic("callout-width")(`callout-width`.asInstanceOf[js.Any])
    if (!js.isUndefined(`clip-text`)) __obj.updateDynamic("clip-text")(`clip-text`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (`decimals-separator` != null) __obj.updateDynamic("decimals-separator")(`decimals-separator`.asInstanceOf[js.Any])
    if (`fill-angle` != null) __obj.updateDynamic("fill-angle")(`fill-angle`.asInstanceOf[js.Any])
    if (`fill-offset-x` != null) __obj.updateDynamic("fill-offset-x")(`fill-offset-x`.asInstanceOf[js.Any])
    if (`fill-offset-y` != null) __obj.updateDynamic("fill-offset-y")(`fill-offset-y`.asInstanceOf[js.Any])
    if (`fill-type` != null) __obj.updateDynamic("fill-type")(`fill-type`.asInstanceOf[js.Any])
    if (`font-angle` != null) __obj.updateDynamic("font-angle")(`font-angle`.asInstanceOf[js.Any])
    if (`font-color` != null) __obj.updateDynamic("font-color")(`font-color`.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (`font-size` != null) __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    if (`font-style` != null) __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (`gradient-colors` != null) __obj.updateDynamic("gradient-colors")(`gradient-colors`.asInstanceOf[js.Any])
    if (`gradient-stops` != null) __obj.updateDynamic("gradient-stops")(`gradient-stops`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (`margin-bottom` != null) __obj.updateDynamic("margin-bottom")(`margin-bottom`.asInstanceOf[js.Any])
    if (`margin-left` != null) __obj.updateDynamic("margin-left")(`margin-left`.asInstanceOf[js.Any])
    if (`margin-right` != null) __obj.updateDynamic("margin-right")(`margin-right`.asInstanceOf[js.Any])
    if (`margin-top` != null) __obj.updateDynamic("margin-top")(`margin-top`.asInstanceOf[js.Any])
    if (`max-chars` != null) __obj.updateDynamic("max-chars")(`max-chars`.asInstanceOf[js.Any])
    if (`max-width` != null) __obj.updateDynamic("max-width")(`max-width`.asInstanceOf[js.Any])
    if (`offset-x` != null) __obj.updateDynamic("offset-x")(`offset-x`.asInstanceOf[js.Any])
    if (`offset-y` != null) __obj.updateDynamic("offset-y")(`offset-y`.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (`padding-bottom` != null) __obj.updateDynamic("padding-bottom")(`padding-bottom`.asInstanceOf[js.Any])
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    if (`padding-top` != null) __obj.updateDynamic("padding-top")(`padding-top`.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(`rtl Leftparenthesisright-to-leftRightparenthesis`)) __obj.updateDynamic("rtl (right-to-left)")(`rtl Leftparenthesisright-to-leftRightparenthesis`.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (`shadow-alpha` != null) __obj.updateDynamic("shadow-alpha")(`shadow-alpha`.asInstanceOf[js.Any])
    if (`shadow-angle` != null) __obj.updateDynamic("shadow-angle")(`shadow-angle`.asInstanceOf[js.Any])
    if (`shadow-blur` != null) __obj.updateDynamic("shadow-blur")(`shadow-blur`.asInstanceOf[js.Any])
    if (`shadow-color` != null) __obj.updateDynamic("shadow-color")(`shadow-color`.asInstanceOf[js.Any])
    if (`shadow-distance` != null) __obj.updateDynamic("shadow-distance")(`shadow-distance`.asInstanceOf[js.Any])
    if (`text-alpha` != null) __obj.updateDynamic("text-alpha")(`text-alpha`.asInstanceOf[js.Any])
    if (`thousands-separator` != null) __obj.updateDynamic("thousands-separator")(`thousands-separator`.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(`wrap-text`)) __obj.updateDynamic("wrap-text")(`wrap-text`.asInstanceOf[js.Any])
    if (`z-index` != null) __obj.updateDynamic("z-index")(`z-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallouthook]
  }
}

