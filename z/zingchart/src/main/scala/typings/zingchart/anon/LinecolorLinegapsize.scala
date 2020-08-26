package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinecolorLinegapsize extends js.Object {
  /**
    * Sets the transparency of the scale-x ref-line. See the orange bar. Works for output canvas and svg. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the line color of the scale-x ref-line. See the yellow bar. Works for output canvas and svg. "none" | "transparent" | "#f00"
    * | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  /**
    * Can be used to create custom dashed or dotted lines when used with line-segment-size. This will control the size of the gaps betwe
    * en each line segment. See the space between orange bar. Works for output canvas and svg. 4 | "6px" | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.native
  /**
    * Can be used to create custom dashed or dotted lines when used with line-gap-size. This will control the size of the visible segmen
    * t of line. See the length of the pieces of the orange bar. Works for output canvas and svg. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the style applied to lines and borders of the object. See the orange dots. Works for output canvas and svg. "solid" | "dotted
    * " | "dashed"
    */
  var `line-style`: js.UndefOr[String] = js.native
  /**
    * Sets the line width of the object. See the orange bars. Works for output canvas and svg. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the visibility of the object. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object LinecolorLinegapsize {
  @scala.inline
  def apply(): LinecolorLinegapsize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinecolorLinegapsize]
  }
  @scala.inline
  implicit class LinecolorLinegapsizeOps[Self <: LinecolorLinegapsize] (val x: Self) extends AnyVal {
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
    def `setLine-color`(value: String): Self = this.set("line-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-color`: Self = this.set("line-color", js.undefined)
    @scala.inline
    def `setLine-gap-size`(value: js.Any): Self = this.set("line-gap-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-gap-size`: Self = this.set("line-gap-size", js.undefined)
    @scala.inline
    def `setLine-segment-size`(value: js.Any): Self = this.set("line-segment-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-segment-size`: Self = this.set("line-segment-size", js.undefined)
    @scala.inline
    def `setLine-style`(value: String): Self = this.set("line-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-style`: Self = this.set("line-style", js.undefined)
    @scala.inline
    def `setLine-width`(value: js.Any): Self = this.set("line-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-width`: Self = this.set("line-width", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

