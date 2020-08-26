package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlphaBackgroundcolor extends js.Object {
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#666
    * 699", #33ccff"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). "none" | "transparent" | "purple" | "#33ccff" | "rgb(100,
    *  15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border color of the object. "none" | "transparent" | "purple" | "#33ccff" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border width of the object. 1 | 3 | | "6px" | ...
    */
  var `border-width`: js.UndefOr[Double] = js.native
  /**
    * Sets the line color of the object. "none" | "transparent" | "purple" | "#33ccff" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  /**
    * Sets the line width of the object. 1 | 3 | | "6px" | ...
    */
  var `line-width`: js.UndefOr[Double] = js.native
}

object AlphaBackgroundcolor {
  @scala.inline
  def apply(): AlphaBackgroundcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlphaBackgroundcolor]
  }
  @scala.inline
  implicit class AlphaBackgroundcolorOps[Self <: AlphaBackgroundcolor] (val x: Self) extends AnyVal {
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
    def `setBorder-color`(value: String): Self = this.set("border-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-color`: Self = this.set("border-color", js.undefined)
    @scala.inline
    def `setBorder-width`(value: Double): Self = this.set("border-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-width`: Self = this.set("border-width", js.undefined)
    @scala.inline
    def `setLine-color`(value: String): Self = this.set("line-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-color`: Self = this.set("line-color", js.undefined)
    @scala.inline
    def `setLine-width`(value: Double): Self = this.set("line-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-width`: Self = this.set("line-width", js.undefined)
  }
  
}

