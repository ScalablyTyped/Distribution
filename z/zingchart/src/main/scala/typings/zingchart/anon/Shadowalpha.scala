package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shadowalpha extends js.Object {
  /**
    * Sets the transparency of the tick. In the example, the scale-x ticks are vertical lines | in red in between the months. 0.3 | 0.9
    * | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the line color of the object, applicable on non-closed shapes. See also border-color for closed shapes. "none" | "transparent
    * " | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  /**
    * Can be used to create custom dashed or dotted lines when used with line-segment-size. This will control the size of the gaps betwe
    * en each line segment. 4 | "6px" | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * Can be used to create custom dashed or dotted lines when used with line-gap-size. This will control the size of the visible segmen
    * t of line. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line width of the object, applicable on non-closed shapes. See also border-width for closed shapes. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Determines the placement of tick marks along an axis line. inner | cross | outer
    */
  var placement: js.UndefOr[String] = js.undefined
  /**
    * Sets whether the object's shadow is visible or not. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the transparency of the shadow of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and
    * 1.0 being completely opaque. Please note that values also require the leading 0 before the decimal. Has limited effect on HTML5 im
    * plementation. 0.3 | 0.9 | ...
    */
  var `shadow-alpha`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the angle of the shadow underneath the object. Has limited effect on HTML5 implementation. -45 | 115 | ...
    */
  var `shadow-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the blur effect size for the shadow of the object. Has limited effect on HTML5 implementation. 4 | "6px" | ...
    */
  var `shadow-blur`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the color of the shadow of the object. Has limited effect on HTML5 implementation. "none" | "transparent" | "#f00" | "#f00 #0
    * 0f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `shadow-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the distance between the shadow and the object. Has limited effect on HTML5 implementation. 4 | "6px" | ...
    */
  var `shadow-distance`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the size of the object/shape. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Shadowalpha {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    `line-color`: String = null,
    `line-gap-size`: js.Any = null,
    `line-segment-size`: js.Any = null,
    `line-style`: String = null,
    `line-width`: js.Any = null,
    placement: String = null,
    shadow: js.UndefOr[Boolean] = js.undefined,
    `shadow-alpha`: js.UndefOr[Double] = js.undefined,
    `shadow-angle`: js.UndefOr[Double] = js.undefined,
    `shadow-blur`: js.Any = null,
    `shadow-color`: String = null,
    `shadow-distance`: js.Any = null,
    size: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Shadowalpha = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-gap-size` != null) __obj.updateDynamic("line-gap-size")(`line-gap-size`.asInstanceOf[js.Any])
    if (`line-segment-size` != null) __obj.updateDynamic("line-segment-size")(`line-segment-size`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`line-width` != null) __obj.updateDynamic("line-width")(`line-width`.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`shadow-alpha`)) __obj.updateDynamic("shadow-alpha")(`shadow-alpha`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`shadow-angle`)) __obj.updateDynamic("shadow-angle")(`shadow-angle`.get.asInstanceOf[js.Any])
    if (`shadow-blur` != null) __obj.updateDynamic("shadow-blur")(`shadow-blur`.asInstanceOf[js.Any])
    if (`shadow-color` != null) __obj.updateDynamic("shadow-color")(`shadow-color`.asInstanceOf[js.Any])
    if (`shadow-distance` != null) __obj.updateDynamic("shadow-distance")(`shadow-distance`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shadowalpha]
  }
}

