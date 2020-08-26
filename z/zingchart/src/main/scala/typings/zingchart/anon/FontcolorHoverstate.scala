package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontcolorHoverstate extends js.Object {
  /**
    * Sets the background color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border width of the object. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the font color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `font-color`: js.UndefOr[String] = js.native
  /**
    * Sets how the context menu item appears when a user hovers over it. Use the backgroundColor and fontColor attributes. {...}
    */
  var `hover-state`: js.UndefOr[js.Any] = js.native
}

object FontcolorHoverstate {
  @scala.inline
  def apply(): FontcolorHoverstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontcolorHoverstate]
  }
  @scala.inline
  implicit class FontcolorHoverstateOps[Self <: FontcolorHoverstate] (val x: Self) extends AnyVal {
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
    def `setBackground-color`(value: String): Self = this.set("background-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-color`: Self = this.set("background-color", js.undefined)
    @scala.inline
    def `setBorder-color`(value: String): Self = this.set("border-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-color`: Self = this.set("border-color", js.undefined)
    @scala.inline
    def `setBorder-width`(value: js.Any): Self = this.set("border-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-width`: Self = this.set("border-width", js.undefined)
    @scala.inline
    def `setFont-color`(value: String): Self = this.set("font-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-color`: Self = this.set("font-color", js.undefined)
    @scala.inline
    def `setHover-state`(value: js.Any): Self = this.set("hover-state", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHover-state`: Self = this.set("hover-state", js.undefined)
  }
  
}

