package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffsety extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the rotation angle of the object/shape. -45 | 115 | ...
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g. "red", "blue", "yellow"), in hexadecimal notation (e.
    * g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0,0,255)", "rgb(255,255,0)"). One color will se
    * t a solid background color, two colors will, by default, create a horizontal gradient. For more complex gradients, use gradient-co
    * lors and gradient-stops. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the direction/s on which the background image is being "stretched". "x" | "y" | "xy"
    */
  var `background-fit`: js.UndefOr[String] = js.undefined
  /**
    * Sets a background image for the object. Value can be a local file or a web image's location. "image.png" | ...
    */
  var `background-image`: js.UndefOr[String] = js.undefined
  /**
    * Sets the position of the background when the background-repeat value is no-repeat. "0 0" | "50 100" | "80% 60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.undefined
  /**
    * Sets the repeating mode for the background image. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border color of the object, applicable on closed shapes. See also line-color for closed shapes. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border width of the object, applicable on closed shapes. See also line-width for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets an X offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets an Y offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the background gradient fill type to either linear or radial. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  /**
    * Sets a set of colors for a complex background gradient consisting of 2 or more colors. To be used with gradient-stops. "#f00 #0f0
    * #00f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.undefined
  /**
    * Sets the gradient stops for a complex background gradient consisting of 2 or more colors. To be used with gradient-colors. "0.1 0.
    * 5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.undefined
  /**
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the size of the object/shape. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the type of icon displayed on mobile devices to tap to bring up the drop-down menu. gear4 can be specified, this means that t
    * he gear icon shown will have four sprockets protruding from it. Gears can range from 3-9. star4 has 4 points, while star9 has 9 po
    * ints. Stars can range from 3-9 also. "gear4" | "gear9" | "star4" | "star9" | ...
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Sets the X position of the object. The context-menu button object must be positioned separately. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the Y position of the object. The context-menu button object must be positioned separately. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.undefined
}

object AnonOffsety {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    angle: Int | Double = null,
    `background-color`: String = null,
    `background-fit`: String = null,
    `background-image`: String = null,
    `background-position`: String = null,
    `background-repeat`: String = null,
    `border-color`: String = null,
    `border-width`: js.Any = null,
    `fill-angle`: Int | Double = null,
    `fill-offset-x`: js.Any = null,
    `fill-offset-y`: js.Any = null,
    `fill-type`: String = null,
    `gradient-colors`: String = null,
    `gradient-stops`: String = null,
    `offset-x`: js.Any = null,
    `offset-y`: js.Any = null,
    size: js.Any = null,
    `type`: String = null,
    x: js.Any = null,
    y: js.Any = null
  ): AnonOffsety = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`background-fit` != null) __obj.updateDynamic("background-fit")(`background-fit`.asInstanceOf[js.Any])
    if (`background-image` != null) __obj.updateDynamic("background-image")(`background-image`.asInstanceOf[js.Any])
    if (`background-position` != null) __obj.updateDynamic("background-position")(`background-position`.asInstanceOf[js.Any])
    if (`background-repeat` != null) __obj.updateDynamic("background-repeat")(`background-repeat`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (`fill-angle` != null) __obj.updateDynamic("fill-angle")(`fill-angle`.asInstanceOf[js.Any])
    if (`fill-offset-x` != null) __obj.updateDynamic("fill-offset-x")(`fill-offset-x`.asInstanceOf[js.Any])
    if (`fill-offset-y` != null) __obj.updateDynamic("fill-offset-y")(`fill-offset-y`.asInstanceOf[js.Any])
    if (`fill-type` != null) __obj.updateDynamic("fill-type")(`fill-type`.asInstanceOf[js.Any])
    if (`gradient-colors` != null) __obj.updateDynamic("gradient-colors")(`gradient-colors`.asInstanceOf[js.Any])
    if (`gradient-stops` != null) __obj.updateDynamic("gradient-stops")(`gradient-stops`.asInstanceOf[js.Any])
    if (`offset-x` != null) __obj.updateDynamic("offset-x")(`offset-x`.asInstanceOf[js.Any])
    if (`offset-y` != null) __obj.updateDynamic("offset-y")(`offset-y`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffsety]
  }
}

