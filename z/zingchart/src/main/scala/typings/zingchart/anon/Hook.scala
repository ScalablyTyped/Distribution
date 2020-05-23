package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hook extends js.Object {
  /**
    * Sets the arrow's end point to that of a charted value. The plot value refers to the set of values in a series, and the index refer
    * s to the specific value within that series. For example, node:plot=0,index=10 sets the end point of the arrow at the 11th value wi
    * thin the 1st set of values in the series. Note that 0 refers to the first value or set of values, with 1 being the second value or
    *  set of values, and so on. "node:index=4" | "node:plot=0,index=1" | ...
    */
  var hook: js.UndefOr[String] = js.undefined
  /**
    * Sets an x-offset for the arrow's end point. Can be used to make adjustments to an arrow's end x ordinate or hook point. 10 | 56 |
    * ...
    */
  var `offset-x`: js.UndefOr[Double] = js.undefined
  /**
    * Sets a y-offset for the arrow's end point. Can be used to make adjustments to an arrow's end y ordinate or hook point. 10 | 56 | .
    * ..
    */
  var `offset-y`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the x ordinate for an arrow's end point. Ordinates are counted in pixels, starting from the top-left corner of the chart. 100
    *  | 450 | ...
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * Sets the y ordinate for an arrow's end point. Ordinates are counted in pixels, starting from the top-left corner of the chart. 100
    *  | 450 | ...
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Hook {
  @scala.inline
  def apply(
    hook: String = null,
    `offset-x`: js.UndefOr[Double] = js.undefined,
    `offset-y`: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): Hook = {
    val __obj = js.Dynamic.literal()
    if (hook != null) __obj.updateDynamic("hook")(hook.asInstanceOf[js.Any])
    if (!js.isUndefined(`offset-x`)) __obj.updateDynamic("offset-x")(`offset-x`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`offset-y`)) __obj.updateDynamic("offset-y")(`offset-y`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hook]
  }
}

