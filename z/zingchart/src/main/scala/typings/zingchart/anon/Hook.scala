package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hook extends js.Object {
  /**
    * Sets the arrow's end point to that of a charted value. The plot value refers to the set of values in a series, and the index refer
    * s to the specific value within that series. For example, node:plot=0,index=10 sets the end point of the arrow at the 11th value wi
    * thin the 1st set of values in the series. Note that 0 refers to the first value or set of values, with 1 being the second value or
    *  set of values, and so on. "node:index=4" | "node:plot=0,index=1" | ...
    */
  var hook: js.UndefOr[String] = js.native
  /**
    * Sets an x-offset for the arrow's end point. Can be used to make adjustments to an arrow's end x ordinate or hook point. 10 | 56 |
    * ...
    */
  var `offset-x`: js.UndefOr[Double] = js.native
  /**
    * Sets a y-offset for the arrow's end point. Can be used to make adjustments to an arrow's end y ordinate or hook point. 10 | 56 | .
    * ..
    */
  var `offset-y`: js.UndefOr[Double] = js.native
  /**
    * Sets the x ordinate for an arrow's end point. Ordinates are counted in pixels, starting from the top-left corner of the chart. 100
    *  | 450 | ...
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Sets the y ordinate for an arrow's end point. Ordinates are counted in pixels, starting from the top-left corner of the chart. 100
    *  | 450 | ...
    */
  var y: js.UndefOr[Double] = js.native
}

object Hook {
  @scala.inline
  def apply(): Hook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hook]
  }
  @scala.inline
  implicit class HookOps[Self <: Hook] (val x: Self) extends AnyVal {
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
    def setHook(value: String): Self = this.set("hook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHook: Self = this.set("hook", js.undefined)
    @scala.inline
    def `setOffset-x`(value: Double): Self = this.set("offset-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-x`: Self = this.set("offset-x", js.undefined)
    @scala.inline
    def `setOffset-y`(value: Double): Self = this.set("offset-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-y`: Self = this.set("offset-y", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

