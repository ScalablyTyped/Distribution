package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shadowalpha extends js.Object {
  /**
    * Sets the transparency of the tick. In the example, the scale-x ticks are vertical lines | in red in between the months. 0.3 | 0.9
    * | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the line color of the object, applicable on non-closed shapes. See also border-color for closed shapes. "none" | "transparent
    * " | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  /**
    * Can be used to create custom dashed or dotted lines when used with line-segment-size. This will control the size of the gaps betwe
    * en each line segment. 4 | "6px" | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.native
  /**
    * Can be used to create custom dashed or dotted lines when used with line-gap-size. This will control the size of the visible segmen
    * t of line. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.native
  /**
    * Sets the line width of the object, applicable on non-closed shapes. See also border-width for closed shapes. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.native
  /**
    * Determines the placement of tick marks along an axis line. inner | cross | outer
    */
  var placement: js.UndefOr[String] = js.native
  /**
    * Sets whether the object's shadow is visible or not. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.native
  /**
    * Sets the transparency of the shadow of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and
    * 1.0 being completely opaque. Please note that values also require the leading 0 before the decimal. Has limited effect on HTML5 im
    * plementation. 0.3 | 0.9 | ...
    */
  var `shadow-alpha`: js.UndefOr[Double] = js.native
  /**
    * Sets the angle of the shadow underneath the object. Has limited effect on HTML5 implementation. -45 | 115 | ...
    */
  var `shadow-angle`: js.UndefOr[Double] = js.native
  /**
    * Sets the blur effect size for the shadow of the object. Has limited effect on HTML5 implementation. 4 | "6px" | ...
    */
  var `shadow-blur`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the color of the shadow of the object. Has limited effect on HTML5 implementation. "none" | "transparent" | "#f00" | "#f00 #0
    * 0f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `shadow-color`: js.UndefOr[String] = js.native
  /**
    * Sets the distance between the shadow and the object. Has limited effect on HTML5 implementation. 4 | "6px" | ...
    */
  var `shadow-distance`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the size of the object/shape. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.native
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Shadowalpha {
  @scala.inline
  def apply(): Shadowalpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shadowalpha]
  }
  @scala.inline
  implicit class ShadowalphaOps[Self <: Shadowalpha] (val x: Self) extends AnyVal {
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
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
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
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

