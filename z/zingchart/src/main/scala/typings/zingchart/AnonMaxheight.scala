package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxheight extends js.Object {
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

object AnonMaxheight {
  @scala.inline
  def apply(
    `max-height`: Int | Double = null,
    `max-width`: Int | Double = null,
    `min-height`: Int | Double = null,
    `min-width`: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonMaxheight = {
    val __obj = js.Dynamic.literal()
    if (`max-height` != null) __obj.updateDynamic("max-height")(`max-height`.asInstanceOf[js.Any])
    if (`max-width` != null) __obj.updateDynamic("max-width")(`max-width`.asInstanceOf[js.Any])
    if (`min-height` != null) __obj.updateDynamic("min-height")(`min-height`.asInstanceOf[js.Any])
    if (`min-width` != null) __obj.updateDynamic("min-width")(`min-width`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxheight]
  }
}

