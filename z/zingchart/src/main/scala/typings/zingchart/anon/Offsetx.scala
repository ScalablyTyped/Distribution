package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Offsetx extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. See the boxes at each point when clicked. Wo
    * rks with output flash. 0.3 | 0.9 | ...
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
    * Sets the border color of the object, applicable on closed shapes. See also line-color for closed shapes. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border width of the object, applicable on closed shapes. See also line-width for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. -45 | 115 | ...
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
    * Sets the background gradient fill type to either linear or radial. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.native
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
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.native
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
    * Sets the size of the object/shape. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.native
  /**
    * Sets the type of the object/shape. "pie" | "circle" | "star5" | ...
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Sets the X position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[js.Any] = js.native
  /**
    * Sets the Y position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.native
}

object Offsetx {
  @scala.inline
  def apply(): Offsetx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Offsetx]
  }
  @scala.inline
  implicit class OffsetxOps[Self <: Offsetx] (val x: Self) extends AnyVal {
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
    def `setBorder-color`(value: String): Self = this.set("border-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-color`: Self = this.set("border-color", js.undefined)
    @scala.inline
    def `setBorder-width`(value: js.Any): Self = this.set("border-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-width`: Self = this.set("border-width", js.undefined)
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
    def `setGradient-colors`(value: String): Self = this.set("gradient-colors", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGradient-colors`: Self = this.set("gradient-colors", js.undefined)
    @scala.inline
    def `setGradient-stops`(value: String): Self = this.set("gradient-stops", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGradient-stops`: Self = this.set("gradient-stops", js.undefined)
    @scala.inline
    def `setOffset-x`(value: js.Any): Self = this.set("offset-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-x`: Self = this.set("offset-x", js.undefined)
    @scala.inline
    def `setOffset-y`(value: js.Any): Self = this.set("offset-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-y`: Self = this.set("offset-y", js.undefined)
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
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setX(value: js.Any): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: js.Any): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

