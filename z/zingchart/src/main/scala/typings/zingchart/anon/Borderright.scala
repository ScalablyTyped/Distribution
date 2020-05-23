package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Borderright extends js.Object {
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
    * Sets the styling for the bottom border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a s
    * tring. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-bottom`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the border color of the object. "none" | "transparent" | "purple" | "#33ccff" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the styling for the left border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a str
    * ing. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the border radius (rounded corners) of the object. The higher the value, the more rounded the corners appear. 4 | "6px" | "6p
    * x 10px 3px 5px" | "-10px" | ...
    */
  var `border-radius`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the styling for the right border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a st
    * ring. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-right`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the styling for the top border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a stri
    * ng. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-top`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the border width of the object. 1 | 3 | | "6px" | ...
    */
  var `border-width`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.undefined
}

object Borderright {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    `background-color`: String = null,
    `border-bottom`: js.Any = null,
    `border-color`: String = null,
    `border-left`: js.Any = null,
    `border-radius`: js.Any = null,
    `border-right`: js.Any = null,
    `border-top`: js.Any = null,
    `border-width`: js.UndefOr[Double] = js.undefined,
    height: js.Any = null,
    width: js.Any = null
  ): Borderright = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`border-bottom` != null) __obj.updateDynamic("border-bottom")(`border-bottom`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-left` != null) __obj.updateDynamic("border-left")(`border-left`.asInstanceOf[js.Any])
    if (`border-radius` != null) __obj.updateDynamic("border-radius")(`border-radius`.asInstanceOf[js.Any])
    if (`border-right` != null) __obj.updateDynamic("border-right")(`border-right`.asInstanceOf[js.Any])
    if (`border-top` != null) __obj.updateDynamic("border-top")(`border-top`.asInstanceOf[js.Any])
    if (!js.isUndefined(`border-width`)) __obj.updateDynamic("border-width")(`border-width`.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borderright]
  }
}

