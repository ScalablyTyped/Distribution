package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlphaLinecolorLinegapsizeLinesegmentsizeLinestyle extends js.Object {
  /**
    * Sets the transparency of the scale-x minor-tick. See the red lines across the bottom between the ticks. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the line color of the object. See the red lines across the bottom between the ticks. "none" | "transparent" | "#f00" | "#f00
    * #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  /**
    * Can be used to create custom dashed or dotted lines when used with line-segment-size. This will control the size of the gaps betwe
    * en each line segment. See the red lines across the bottom between the ticks. 4 | "6px" | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * Can be used to create custom dashed or dotted lines when used with line-gap-size. This will control the size of the visible segmen
    * t of line. See the red lines across the bottom between the ticks. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the style applied to lines and borders of the object. See the red lines across the bottom between the ticks. "solid" | "dotte
    * d" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line width of the object. See the red lines across the bottom between the ticks. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Determines the placement of minor tick marks along an axis line. inner | cross | outer
    */
  var placement: js.UndefOr[String] = js.undefined
  /**
    * Sets the visibility of the object. See the red lines across the bottom between the ticks. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonAlphaLinecolorLinegapsizeLinesegmentsizeLinestyle {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    `line-color`: String = null,
    `line-gap-size`: js.Any = null,
    `line-segment-size`: js.Any = null,
    `line-style`: String = null,
    `line-width`: js.Any = null,
    placement: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonAlphaLinecolorLinegapsizeLinesegmentsizeLinestyle = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-gap-size` != null) __obj.updateDynamic("line-gap-size")(`line-gap-size`.asInstanceOf[js.Any])
    if (`line-segment-size` != null) __obj.updateDynamic("line-segment-size")(`line-segment-size`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`line-width` != null) __obj.updateDynamic("line-width")(`line-width`.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlphaLinecolorLinegapsizeLinesegmentsizeLinestyle]
  }
}

