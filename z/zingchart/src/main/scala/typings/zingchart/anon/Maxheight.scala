package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maxheight extends js.Object {
  /**
    * Sets the maximum chart height in pixels. 600 | 400 | 300
    */
  var `max-height`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum chart width in pixels. 1000 | 800 | 600
    */
  var `max-width`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the minimum chart height in pixels. 600 | 400 | 300
    */
  var `min-height`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the minimum chart width in pixels. 1000 | 800 | 600
    */
  var `min-width`: js.UndefOr[Double] = js.undefined
  /**
    * Removes the object (legend, title) from the chart at that specified breakpoint. Use the attribute to save screen space at smaller
    * breakpoints. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Maxheight {
  @scala.inline
  def apply(
    `max-height`: js.UndefOr[Double] = js.undefined,
    `max-width`: js.UndefOr[Double] = js.undefined,
    `min-height`: js.UndefOr[Double] = js.undefined,
    `min-width`: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Maxheight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`max-height`)) __obj.updateDynamic("max-height")(`max-height`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`max-width`)) __obj.updateDynamic("max-width")(`max-width`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`min-height`)) __obj.updateDynamic("min-height")(`min-height`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`min-width`)) __obj.updateDynamic("min-width")(`min-width`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maxheight]
  }
}

