package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Placement extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 being co
    * mpletely opaque. Note that values require the leading zero before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the line color of the object. 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100, 15, 15)' | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  /**
    * Sets the line style of the object. 'solid' | 'dotted' | 'dashed' | 'dashdot'
    */
  var `line-style`: js.UndefOr[String] = js.native
  /**
    * Sets the line width of the object. 4 | '6px' | ...
    */
  var `line-width`: js.UndefOr[Double] = js.native
  /**
    * Sets the placement of the object. 'outer' | 'inner' | 'cross'
    */
  var placement: js.UndefOr[String] = js.native
  /**
    * Sets the size of the object. 4 | '6px' | ...
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * Sets the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Placement {
  @scala.inline
  def apply(): Placement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Placement]
  }
  @scala.inline
  implicit class PlacementOps[Self <: Placement] (val x: Self) extends AnyVal {
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
    def `setLine-style`(value: String): Self = this.set("line-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-style`: Self = this.set("line-style", js.undefined)
    @scala.inline
    def `setLine-width`(value: Double): Self = this.set("line-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-width`: Self = this.set("line-width", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

