package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCursor extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. Requires Legend. Used only inside individual
    *  series rather than Plot. See the shape to the left of the text in the upper right box. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the rotation angle of the object/shape. Requires Legend. Used only inside individual series rather than Plot. See the shape t
    * o the left of the text in the upper right box. -45 | 115 | ...
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color of the object. For the shape to the left of the Legend text. Colors can be entered by name (e.g. "red",
    * "blue", "yellow"), in hexadecimal notation (e.g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0
    * ,0,255)", "rgb(255,255,0)"). Requires Legend. Used only inside individual series rather than Plot. See the orange shape to the lef
    * t of the text in the upper right box. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the first color of a 2 color background gradient of the object. To be used with background-color-2. Requires Legend. Used onl
    * y inside individual series rather than Plot. See the shape to the left of the text in the upper right box. "none" | "transparent"
    * | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.undefined
  /**
    * Sets the second color of a 2 color background gradient of the object. To be used with background-color-1. Requires Legend. Used on
    * ly inside individual series rather than Plot. See the shape to the left of the text in the upper right box. "none" | "transparent"
    *  | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-2`: js.UndefOr[String] = js.undefined
  /**
    * Sets the direction/s on which the background image is being "stretched". Requires Legend. Used only inside individual series rathe
    * r than Plot. See the shape to the left of the text in the upper right box. "x" | "y" | "xy"
    */
  var `background-fit`: js.UndefOr[String] = js.undefined
  /**
    * Sets a background image for the object. Value can be a local file or a web image's location. Requires Legend. Used only inside ind
    * ividual series rather than Plot. See the shape to the left of the text in the upper right box. "image.png" | ...
    */
  var `background-image`: js.UndefOr[String] = js.undefined
  /**
    * Sets the position of the background when the background-repeat value is no-repeat. Requires Legend. Used only inside individual se
    * ries rather than Plot. See the shape to the left of the text in the upper right box. "0 0" | "50 100" | "80% 60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.undefined
  /**
    * Sets the repeating mode for the background image. Requires Legend. Used only inside individual series rather than Plot. See the sh
    * ape to the left of the text in the upper right box. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border color of the object, applicable on closed shapes. See also line-color for closed shapes. Requires Legend. Used onl
    * y inside individual series rather than Plot. See the shape to the left of the text in the upper right box. "none" | "transparent"
    * | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border width of the object, applicable on closed shapes. See also line-width for closed shapes. See also line-color for c
    * losed shapes. Requires Legend. Used only inside individual series rather than Plot. See the shape to the left of the text in the u
    * pper right box. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the style of the cursor when hovering over a node. "hand" | "normal"
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. Requires Legend. Used only inside individual series rather th
    * an Plot. See the shape to the left of the text in the upper right box. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets an X offset to apply to the fill. Requires Legend. Used only inside individual series rather than Plot. See the shape to the
    * left of the text in the upper right box. 4 | "6px" | ...
    */
  var `fill-offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets an Y offset to apply to the fill. Requires Legend. Used only inside individual series rather than Plot. See the shape to the
    * left of the text in the upper right box. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the background gradient fill type to either linear or radial. Requires Legend. Used only inside individual series rather than
    *  Plot. See the shape to the left of the text in the upper right box. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  /**
    * Sets a set of colors for a complex background gradient consisting of 2 or more colors. To be used with gradient-stops. Requires Le
    * gend. Used only inside individual series rather than Plot. See the shape to the left of the text in the upper right box. "#f00 #0f
    * 0 #00f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.undefined
  /**
    * Sets the gradient stops for a complex background gradient consisting of 2 or more colors. To be used with gradient-colors. Require
    * s Legend. Used only inside individual series rather than Plot. See the shape to the left of the text in the upper right box. "0.1
    * 0.5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.undefined
  /**
    * Sets an X offset to apply when positioning the object/shape. Requires Legend. Used only inside individual series rather than Plot.
    *  See the shape to the left of the text in the upper right box. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets an Y offset to apply when positioning the object/shape. Requires Legend. Used only inside individual series rather than Plot.
    *  See the shape to the left of the text in the upper right box. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the size of the object/shape. Requires Legend. Used only inside individual series rather than Plot. See the shape to the left
    *  of the text in the upper right box. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the type of the object/shape. Requires Legend. Used only inside individual series rather than Plot. See the shape to the left
    *  of the text in the upper right box. "pie" | "circle" | "star5" | ...
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. Requires Legend. Used only in
    * side individual series rather than Plot. See the shapes to the left of the text in the upper right box. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the X position of the object. Requires Legend. Used only inside individual series rather than Plot. See the shapes to the lef
    * t of the text in the upper right box. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the Y position of the object. Requires Legend. Used only inside individual series rather than Plot. See the shapes to the lef
    * t of the text in the upper right box. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.undefined
}

object AnonCursor {
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
    `border-color`: String = null,
    `border-width`: js.Any = null,
    cursor: String = null,
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
    visible: js.UndefOr[Boolean] = js.undefined,
    x: js.Any = null,
    y: js.Any = null
  ): AnonCursor = {
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
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
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
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCursor]
  }
}

