package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Borderbottom extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the rotation angle of the object/shape. -45 | 115 | ...
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g. "red", "blue", "yellow"), in hexadecimal notation (e.
    * g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0,0,255)", "rgb(255,255,0)"). One color will se
    * t a solid background color, two colors will, by default, create a horizontal gradient. For more complex gradients, use gradient-co
    * lors and gradient-stops. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the first color of a 2 color background gradient of the object. To be used with background-color-2. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.native
  /**
    * Sets the second color of a 2 color background gradient of the object. To be used with background-color-1. "none" | "transparent" |
    *  "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-2`: js.UndefOr[String] = js.native
  /**
    * Sets the direction/s on which the background image is being "stretched". "x" | "y" | "xy"
    */
  var `background-fit`: js.UndefOr[String] = js.native
  /**
    * Sets a background image for the object. Value can be a local file or a web image's location. "image.png" | ...
    */
  var `background-image`: js.UndefOr[String] = js.native
  /**
    * Sets the position of the background when the background-repeat value is no-repeat. "0 0" | "50 100" | "80% 60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.native
  /**
    * Sets the repeating mode for the background image. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.native
  /**
    * Sets the object's bottom border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-bottom`: js.UndefOr[String] = js.native
  /**
    * Sets the border color of the object, applicable on closed shapes. See also line-color for closed shapes. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the object's left border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-left`: js.UndefOr[String] = js.native
  /**
    * Sets the object's border radius, for rounded corners. Larger values create rounder corners, while smaller values create sharper co
    * rners. A single value will affect all 4 corners, while multiple values will have separate effects on each corner, with the first v
    * alue affecting the top-left corner, the second value affecting the top-right corner, and so on, in a clockwise direction. A negati
    * ve value will cut a corner off without rounding. 4 | "6px" | "6px 10px 3px 5px" | "-10px" | ...
    */
  var `border-radius`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's bottom-left border radius, for rounded corners. Larger values create rounder corners, while smaller values creat
    * e sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-left`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's bottom-right border radius, for rounded corners. Larger values create rounder corners, while smaller values crea
    * te sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-right`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's top-left border radius, for rounded corners. Larger values create rounder corners, while smaller values create s
    * harper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-left`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's top-right border radius, for rounded corners. Larger values create rounder corners, while smaller values create
    * sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-right`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's right border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-right`: js.UndefOr[String] = js.native
  /**
    * Sets the object's top border style. Values must include the border width, style, and color. Accepts solid, dashed, and dotted styl
    * es. "2px solid #f00" | ...
    */
  var `border-top`: js.UndefOr[String] = js.native
  /**
    * Sets the border width of the object, applicable on closed shapes. See also line-width for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets whether an object will have a callout arrow or not. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.native
  /**
    * Sets the length of the extension that extends beyond the tip of the callout arrow. 4 | "6px" | ...
    */
  var `callout-extension`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the height of the object's callout arrow. A larger value will create a taller callout arrow. 4 | "6px" | ...
    */
  var `callout-height`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the point of the tip of the callout arrow to a specified coordinate on the chart, with the starting point of [0,0] being the
    * top left corner of the chart. [200, 50] | ...
    */
  var `callout-hook`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the offset along the callout direction of the arrow's base. Positive and negative values can be used to offset the callout ar
    * row up, down, left, or right depending on the callout-position. 4 | "6px" | ...
    */
  var `callout-offset`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the position for the object's callout arrow. The position is "bottom" by default. "top" | "right" | "bottom" | "left"
    */
  var `callout-position`: js.UndefOr[String] = js.native
  /**
    * Sets the width of the object's callout arrow. A larger value will create a wider callout arrow. 4 | "6px" | ...
    */
  var `callout-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.native
  /**
    * Sets an X offset to apply to the fill. 4 | "6px" | .../p>
    */
  var `fill-offset-x`: js.UndefOr[js.Any] = js.native
  /**
    * Sets an Y offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the background gradient fill type to either linear or radial. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.native
  /**
    * Sets the object's font angle. A positive value will rotate the object by that number of degrees clockwise, while a negative value
    * will rotate the object by that number of degrees counter-clockwise. Similar to angle. -45 | 115 | ...
    */
  var `font-angle`: js.UndefOr[Double] = js.native
  /**
    * Sets the object's font color. Similar to color. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)"
    * | ...
    */
  var `font-color`: js.UndefOr[String] = js.native
  /**
    * Sets the text's font family. "Arial" | "Tahoma,Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.native
  /**
    * Sets the text's font size. 4 | "6px" | ...
    */
  var `font-size`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the text's font style. Similar to italic. "none" | "italic" | "oblique"
    */
  var `font-style`: js.UndefOr[String] = js.native
  /**
    * Sets the text's font weight. Similar to bold. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.native
  /**
    * Sets a set of colors for a complex background gradient consisting of 2 or more colors. To be used with gradient-stops. "#f00 #0f0
    * #00f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.native
  /**
    * Sets the gradient stops for a complex background gradient consisting of 2 or more colors. To be used with gradient-colors. "0.1 0.
    * 5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.native
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[js.Any] = js.native
  /**
    * Sets the maximum numbers of characters displayed in the object. The value determines how many characters will be displayed before
    * the text is cut and appended with "..." 5 | 10 | ...
    */
  var `max-chars`: js.UndefOr[Double] = js.native
  /**
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.native
}

object Borderbottom {
  @scala.inline
  def apply(): Borderbottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Borderbottom]
  }
  @scala.inline
  implicit class BorderbottomOps[Self <: Borderbottom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def `setBackground-color`(value: String): Self = this.set("background-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-color`: Self = this.set("background-color", js.undefined)
    @scala.inline
    def `setBackground-color-1`(value: String): Self = this.set("background-color-1", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-color-1`: Self = this.set("background-color-1", js.undefined)
    @scala.inline
    def `setBackground-color-2`(value: String): Self = this.set("background-color-2", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-color-2`: Self = this.set("background-color-2", js.undefined)
    @scala.inline
    def `setBackground-fit`(value: String): Self = this.set("background-fit", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-fit`: Self = this.set("background-fit", js.undefined)
    @scala.inline
    def `setBackground-image`(value: String): Self = this.set("background-image", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-image`: Self = this.set("background-image", js.undefined)
    @scala.inline
    def `setBackground-position`(value: String): Self = this.set("background-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-position`: Self = this.set("background-position", js.undefined)
    @scala.inline
    def `setBackground-repeat`(value: String): Self = this.set("background-repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-repeat`: Self = this.set("background-repeat", js.undefined)
    @scala.inline
    def `setBorder-bottom`(value: String): Self = this.set("border-bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-bottom`: Self = this.set("border-bottom", js.undefined)
    @scala.inline
    def `setBorder-color`(value: String): Self = this.set("border-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-color`: Self = this.set("border-color", js.undefined)
    @scala.inline
    def `setBorder-left`(value: String): Self = this.set("border-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-left`: Self = this.set("border-left", js.undefined)
    @scala.inline
    def `setBorder-radius`(value: js.Any): Self = this.set("border-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-radius`: Self = this.set("border-radius", js.undefined)
    @scala.inline
    def `setBorder-radius-bottom-left`(value: js.Any): Self = this.set("border-radius-bottom-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-radius-bottom-left`: Self = this.set("border-radius-bottom-left", js.undefined)
    @scala.inline
    def `setBorder-radius-bottom-right`(value: js.Any): Self = this.set("border-radius-bottom-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-radius-bottom-right`: Self = this.set("border-radius-bottom-right", js.undefined)
    @scala.inline
    def `setBorder-radius-top-left`(value: js.Any): Self = this.set("border-radius-top-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-radius-top-left`: Self = this.set("border-radius-top-left", js.undefined)
    @scala.inline
    def `setBorder-radius-top-right`(value: js.Any): Self = this.set("border-radius-top-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-radius-top-right`: Self = this.set("border-radius-top-right", js.undefined)
    @scala.inline
    def `setBorder-right`(value: String): Self = this.set("border-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-right`: Self = this.set("border-right", js.undefined)
    @scala.inline
    def `setBorder-top`(value: String): Self = this.set("border-top", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-top`: Self = this.set("border-top", js.undefined)
    @scala.inline
    def `setBorder-width`(value: js.Any): Self = this.set("border-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-width`: Self = this.set("border-width", js.undefined)
    @scala.inline
    def setCallout(value: Boolean): Self = this.set("callout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallout: Self = this.set("callout", js.undefined)
    @scala.inline
    def `setCallout-extension`(value: js.Any): Self = this.set("callout-extension", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCallout-extension`: Self = this.set("callout-extension", js.undefined)
    @scala.inline
    def `setCallout-height`(value: js.Any): Self = this.set("callout-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCallout-height`: Self = this.set("callout-height", js.undefined)
    @scala.inline
    def `setCallout-hook`(value: js.Any): Self = this.set("callout-hook", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCallout-hook`: Self = this.set("callout-hook", js.undefined)
    @scala.inline
    def `setCallout-offset`(value: js.Any): Self = this.set("callout-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCallout-offset`: Self = this.set("callout-offset", js.undefined)
    @scala.inline
    def `setCallout-position`(value: String): Self = this.set("callout-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCallout-position`: Self = this.set("callout-position", js.undefined)
    @scala.inline
    def `setCallout-width`(value: js.Any): Self = this.set("callout-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCallout-width`: Self = this.set("callout-width", js.undefined)
    @scala.inline
    def `setFill-angle`(value: Double): Self = this.set("fill-angle", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-angle`: Self = this.set("fill-angle", js.undefined)
    @scala.inline
    def `setFill-offset-x`(value: js.Any): Self = this.set("fill-offset-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-offset-x`: Self = this.set("fill-offset-x", js.undefined)
    @scala.inline
    def `setFill-offset-y`(value: js.Any): Self = this.set("fill-offset-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-offset-y`: Self = this.set("fill-offset-y", js.undefined)
    @scala.inline
    def `setFill-type`(value: String): Self = this.set("fill-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-type`: Self = this.set("fill-type", js.undefined)
    @scala.inline
    def `setFont-angle`(value: Double): Self = this.set("font-angle", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-angle`: Self = this.set("font-angle", js.undefined)
    @scala.inline
    def `setFont-color`(value: String): Self = this.set("font-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-color`: Self = this.set("font-color", js.undefined)
    @scala.inline
    def `setFont-family`(value: String): Self = this.set("font-family", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-family`: Self = this.set("font-family", js.undefined)
    @scala.inline
    def `setFont-size`(value: js.Any): Self = this.set("font-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-size`: Self = this.set("font-size", js.undefined)
    @scala.inline
    def `setFont-style`(value: String): Self = this.set("font-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-style`: Self = this.set("font-style", js.undefined)
    @scala.inline
    def `setFont-weight`(value: String): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    @scala.inline
    def `setGradient-colors`(value: String): Self = this.set("gradient-colors", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGradient-colors`: Self = this.set("gradient-colors", js.undefined)
    @scala.inline
    def `setGradient-stops`(value: String): Self = this.set("gradient-stops", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGradient-stops`: Self = this.set("gradient-stops", js.undefined)
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def `setMax-chars`(value: Double): Self = this.set("max-chars", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-chars`: Self = this.set("max-chars", js.undefined)
    @scala.inline
    def `setOffset-x`(value: js.Any): Self = this.set("offset-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-x`: Self = this.set("offset-x", js.undefined)
    @scala.inline
    def `setOffset-y`(value: js.Any): Self = this.set("offset-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-y`: Self = this.set("offset-y", js.undefined)
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

