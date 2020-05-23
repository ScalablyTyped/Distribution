package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontcolorHoverstate extends js.Object {
  /**
    * Sets the background color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border width of the object. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the font color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `font-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets how the context menu item appears when a user hovers over it. Use the backgroundColor and fontColor attributes. {...}
    */
  var `hover-state`: js.UndefOr[js.Any] = js.undefined
}

object FontcolorHoverstate {
  @scala.inline
  def apply(
    `background-color`: String = null,
    `border-color`: String = null,
    `border-width`: js.Any = null,
    `font-color`: String = null,
    `hover-state`: js.Any = null
  ): FontcolorHoverstate = {
    val __obj = js.Dynamic.literal()
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (`font-color` != null) __obj.updateDynamic("font-color")(`font-color`.asInstanceOf[js.Any])
    if (`hover-state` != null) __obj.updateDynamic("hover-state")(`hover-state`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontcolorHoverstate]
  }
}

