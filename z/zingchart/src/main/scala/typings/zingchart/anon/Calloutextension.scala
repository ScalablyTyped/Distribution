package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calloutextension extends js.Object {
  /**
    * Sets the transparency of the object. Requires that background-color be set. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the background color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the first color of a 2 color background gradient of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow"
    * | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.native
  /**
    * Sets the second color of a 2 color background gradient of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow"
    *  | "rgb(100, 15, 15)" | ...
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
    * Sets whether the text is displayed with bold characters or not in the subtitle. true | false | 1 | 0
    */
  var bold: js.UndefOr[Boolean] = js.native
  /**
    * Sets the object's bottom border style. Defaults to black when color is not set properly. "2px solid #f00" | ...
    */
  var `border-bottom`: js.UndefOr[String] = js.native
  /**
    * Sets the border color of the object, applicable on closed shapes. Requires border width. See also line-color for closed shapes. "n
    * one" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the object's left border style. Operates like border-bottom. "2px solid #f00" | ...
    */
  var `border-left`: js.UndefOr[String] = js.native
  /**
    * Sets the object's border radius, for rounded corners. The higher the value, the more rounded the corners appear. 4 | "6px" | "6px
    * 10px 3px 5px" | "-10px" | ...
    */
  var `border-radius`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's bottom-left border radius, for rounded corners. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-left`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's bottom-right border radius, for rounded corners. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-right`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's top-left border radius, for rounded corners. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-left`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's top-right border radius, for rounded corners. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-right`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's right border style. Operates like border-bottom. "2px solid #f00" | ...
    */
  var `border-right`: js.UndefOr[String] = js.native
  /**
    * Sets the object's top border style. Operates like border-bottom. "2px solid #f00" | ...
    */
  var `border-top`: js.UndefOr[String] = js.native
  /**
    * Sets the border width of the object, applicable on closed shapes. See also line-width for closed shapes. If no border-color is set
    * , will display in black. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets whether or not the object will have a callout arrow. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.native
  /**
    * Sets the length for extension line off the tip of the callout arrow. Requires border-width. 4 | "6px" | ...
    */
  var `callout-extension`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the height of the object's callout arrow. 4 | "6px" | ...
    */
  var `callout-height`: js.UndefOr[js.Any] = js.native
  /**
    * Sets a location for the point of the tip of the callout arrow. Uses XY coordinates. [200, 50] | ...
    */
  var `callout-hook`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the offset for the origin of the callout arrow. Uses positive or negative values to move the arrow right/left/up/down. 4 | "6
    * px" | ...
    */
  var `callout-offset`: js.UndefOr[js.Any] = js.native
  /**
    * Sets which edge will be the location for the object's callout arrow. "top" | "right" | "bottom" | "left"
    */
  var `callout-position`: js.UndefOr[String] = js.native
  /**
    * Sets the width of the object's callout arrow. 4 | "6px" | ...
    */
  var `callout-width`: js.UndefOr[js.Any] = js.native
  /**
    * Cuts off extra text. Use with width. true | false | 1 | 0
    */
  var `clip-text`: js.UndefOr[Boolean] = js.native
  /**
    * Sets the color of the text in the subtitle. Similar with font-color. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow"
    * | "rgb(100, 15, 15)" | ...
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Sets the angle of the axis along which the linear fill is drawn. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.native
  /**
    * Sets an X offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-x`: js.UndefOr[js.Any] = js.native
  /**
    * Sets an Y offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the fill type. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.native
  /**
    * Sets the rotation angle of the subtitle text. Similar with angle. -45 | 115 | ...
    */
  var `font-angle`: js.UndefOr[Double] = js.native
  /**
    * Sets the color of the subtitle text. Similar with color. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100,
    * 15, 15)" | ...
    */
  var `font-color`: js.UndefOr[String] = js.native
  /**
    * Sets the font family of the subtitle text. "Arial" | "Tahoma,Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.native
  /**
    * Sets the font size of the subtitle text. 4 | "6px" | ...
    */
  var `font-size`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the font style of the subtitle text. Similar with italic. "none" | "italic" | "oblique"
    */
  var `font-style`: js.UndefOr[String] = js.native
  /**
    * Sets the font weight of the subtitle text. Similar with bold. "normal" | "bold"
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
    * Sets whether the text of the subtitle is displayed with italic characters or not. Similar with font-weight. true | false | 1 | 0
    */
  var italic: js.UndefOr[Boolean] = js.native
  /**
    * Sets the item id of the map on which the object/shape is being added. "itemid" | ...
    */
  var item: js.UndefOr[String] = js.native
  /**
    * Sets the map id of the map on which the object/shape is being added. "mapid" | ...
    */
  var map: js.UndefOr[String] = js.native
  /**
    * Sets the object's margin/s by positioning it within the specified area. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var margin: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's bottom margin. 4 | "6px" | ...
    */
  var `margin-bottom`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's left margin. 4 | "6px" | ...
    */
  var `margin-left`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's left margin. 4 | "6px" | ...
    */
  var `margin-right`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's margin from the top of the chart. 4 | "6px" | ...
    */
  var `margin-top`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the maximum number of characters displayed in the text label of the subtitle. If value is smaller than the length of the text
    * , the original text will be trimmed and '...' will be appended at the end. 5 | 10 | ...
    */
  var `max-chars`: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum width of the text box. If text is longer than the max-width value, it will overlap the box or will wrap if wrap-t
    * ext is set to true. 10 | "20px" | 0.3 | "30%" | ...
    */
  var `max-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's padding around the text of the subtitle. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var padding: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's bottom padding around the text of the subtitle. 4 | "6px" | ...
    */
  var `padding-bottom`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's left padding around the text of the subtitle. 4 | "6px" | ...
    */
  var `padding-left`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's right padding around the text of the subtitle. 4 | "6px" | ...
    */
  var `padding-right`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's top padding around the text of the subtitle. 4 | "6px" | ...
    */
  var `padding-top`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's position relative to it's container. Similar results can be obtained by setting marginand margin-... attributes.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * Renders text right-to-left. Default value is false. true | false | 1 | 0
    */
  @JSName("rtl (right-to-left)")
  var `rtl Leftparenthesisright-to-leftRightparenthesis`: js.UndefOr[Boolean] = js.native
  /**
    * Sets whether the object's shadow is visible or not. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.native
  /**
    * Sets the transparency of the shadow of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and
    * 1.0 being completely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `shadow-alpha`: js.UndefOr[Double] = js.native
  /**
    * Sets the angle of the shadow underneath the object. -45 | 115 | ...
    */
  var `shadow-angle`: js.UndefOr[Double] = js.native
  /**
    * Sets the blur effect size for the shadow of the object. Has limited effect on HTML5 implementation. 4 | "6px" | ...
    */
  var `shadow-blur`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the color of the shadow of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ..
    * .
    */
  var `shadow-color`: js.UndefOr[String] = js.native
  /**
    * Sets the distance between the shadow and the object. 4 | "6px" | ...
    */
  var `shadow-distance`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the text content of the object of the subtitle. Defaults to gray when font-color is not set. "Some Text" | ...
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Sets the text's horizontal alignment relative to the box of the subtitle. "left" | "center" | "right"
    */
  var `text-align`: js.UndefOr[String] = js.native
  /**
    * Sets the transparency of the subtitle text. 0.3 | 0.9 | ...
    */
  var `text-alpha`: js.UndefOr[Double] = js.native
  /**
    * Sets the text decoration for the subtitle text. Similar with underline. "none" | "underline"
    */
  var `text-decoration`: js.UndefOr[String] = js.native
  /**
    * Sets whether the text of the subtitle is displayed with underlined characters or not. true | false | 1 | 0
    */
  var underline: js.UndefOr[Boolean] = js.native
  /**
    * Sets the text's vertical alignment relative to the subtitle object's box . "top" | "middle" | "bottom"
    */
  var `vertical-align`: js.UndefOr[String] = js.native
  /**
    * Sets the visibility of the object. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Sets the object's width. May truncate text. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.native
  /**
    * Forces wrapping of the text inside a confined box width. Requires a setting for width. Without text wrap, text will be truncated.
    * true | false | 1 | 0
    */
  var `wrap-text`: js.UndefOr[Boolean] = js.native
  /**
    * Sets the X position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[js.Any] = js.native
  /**
    * Sets the Y position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.native
  /**
    * Sets the z position of the object. Objects with higher z indexes will appear "above" those with lower z index values. 5 | 10 | ...
    */
  var `z-index`: js.UndefOr[Double] = js.native
}

object Calloutextension {
  @scala.inline
  def apply(): Calloutextension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calloutextension]
  }
  @scala.inline
  implicit class CalloutextensionOps[Self <: Calloutextension] (val x: Self) extends AnyVal {
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
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
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
    def `setClip-text`(value: Boolean): Self = this.set("clip-text", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteClip-text`: Self = this.set("clip-text", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
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
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setMap(value: String): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def `setMargin-bottom`(value: js.Any): Self = this.set("margin-bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-bottom`: Self = this.set("margin-bottom", js.undefined)
    @scala.inline
    def `setMargin-left`(value: js.Any): Self = this.set("margin-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-left`: Self = this.set("margin-left", js.undefined)
    @scala.inline
    def `setMargin-right`(value: js.Any): Self = this.set("margin-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-right`: Self = this.set("margin-right", js.undefined)
    @scala.inline
    def `setMargin-top`(value: js.Any): Self = this.set("margin-top", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-top`: Self = this.set("margin-top", js.undefined)
    @scala.inline
    def `setMax-chars`(value: Double): Self = this.set("max-chars", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-chars`: Self = this.set("max-chars", js.undefined)
    @scala.inline
    def `setMax-width`(value: js.Any): Self = this.set("max-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-width`: Self = this.set("max-width", js.undefined)
    @scala.inline
    def `setOffset-x`(value: js.Any): Self = this.set("offset-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-x`: Self = this.set("offset-x", js.undefined)
    @scala.inline
    def `setOffset-y`(value: js.Any): Self = this.set("offset-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-y`: Self = this.set("offset-y", js.undefined)
    @scala.inline
    def setPadding(value: js.Any): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def `setPadding-bottom`(value: js.Any): Self = this.set("padding-bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-bottom`: Self = this.set("padding-bottom", js.undefined)
    @scala.inline
    def `setPadding-left`(value: js.Any): Self = this.set("padding-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-left`: Self = this.set("padding-left", js.undefined)
    @scala.inline
    def `setPadding-right`(value: js.Any): Self = this.set("padding-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-right`: Self = this.set("padding-right", js.undefined)
    @scala.inline
    def `setPadding-top`(value: js.Any): Self = this.set("padding-top", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-top`: Self = this.set("padding-top", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def `setRtl Leftparenthesisright-to-leftRightparenthesis`(value: Boolean): Self = this.set("rtl (right-to-left)", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRtl Leftparenthesisright-to-leftRightparenthesis`: Self = this.set("rtl (right-to-left)", js.undefined)
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def `setShadow-alpha`(value: Double): Self = this.set("shadow-alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShadow-alpha`: Self = this.set("shadow-alpha", js.undefined)
    @scala.inline
    def `setShadow-angle`(value: Double): Self = this.set("shadow-angle", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShadow-angle`: Self = this.set("shadow-angle", js.undefined)
    @scala.inline
    def `setShadow-blur`(value: js.Any): Self = this.set("shadow-blur", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShadow-blur`: Self = this.set("shadow-blur", js.undefined)
    @scala.inline
    def `setShadow-color`(value: String): Self = this.set("shadow-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShadow-color`: Self = this.set("shadow-color", js.undefined)
    @scala.inline
    def `setShadow-distance`(value: js.Any): Self = this.set("shadow-distance", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShadow-distance`: Self = this.set("shadow-distance", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def `setText-align`(value: String): Self = this.set("text-align", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-align`: Self = this.set("text-align", js.undefined)
    @scala.inline
    def `setText-alpha`(value: Double): Self = this.set("text-alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-alpha`: Self = this.set("text-alpha", js.undefined)
    @scala.inline
    def `setText-decoration`(value: String): Self = this.set("text-decoration", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-decoration`: Self = this.set("text-decoration", js.undefined)
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    @scala.inline
    def `setVertical-align`(value: String): Self = this.set("vertical-align", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteVertical-align`: Self = this.set("vertical-align", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def `setWrap-text`(value: Boolean): Self = this.set("wrap-text", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWrap-text`: Self = this.set("wrap-text", js.undefined)
    @scala.inline
    def setX(value: js.Any): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: js.Any): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def `setZ-index`(value: Double): Self = this.set("z-index", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteZ-index`: Self = this.set("z-index", js.undefined)
  }
  
}

