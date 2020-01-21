package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlphaExact extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * X-Axis Crosshairs Only: When true, plot nodes will be highlighted only when the guide is directly next to the node. When false (th
    * e default setting), the plot nodes closest to the guide will be highlighted. true | false | 1 | 0
    */
  var exact: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the line color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
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
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line width of the object. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.undefined
  var marker: js.UndefOr[AnonAlphaBackgroundcolor] = js.undefined
  var `plot-label`: js.UndefOr[AnonAlphaBackgroundcolorBackgroundcolor1] = js.undefined
  /**
    * Reverses the order of items in plotLabel. Generally used with positive stacked charts.
    */
  var `reverse-series`: js.UndefOr[Boolean] = js.undefined
  var `scale-label`: js.UndefOr[AnonAlphaBackgroundcolorBackgroundcolor1Backgroundcolor2] = js.undefined
  /**
    * X-Axis Crosshairs Only: For graphsets with multiple chart objects, setting the attribute to true in "crosshair-x" will allow you t
    * o use crosshairs across all charts simultaneously. true | false | 1 | 0
    */
  var shared: js.UndefOr[Boolean] = js.undefined
  /**
    * X-Axis Crosshairs Only: Sets the mode used to display crosshair plot-labels. When set to "move" (the default setting), plot-labels
    *  for all nodes will be displayed. The "hover" setting will allow only one plot-label to be displayed at a time, with the visibilit
    * y of each label being triggered when the user hovers over a node. "move" | "hover"
    */
  var trigger: js.UndefOr[String] = js.undefined
  /**
    * Y-Axis Crosshairs Only: Sets the type of the "crosshair-y", either in single mode (one line for all scales) or multiple (a line fo
    * r every plot). "single" | "multiple"
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonAlphaExact {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    `line-color`: String = null,
    `line-gap-size`: js.Any = null,
    `line-segment-size`: js.Any = null,
    `line-style`: String = null,
    `line-width`: js.Any = null,
    marker: AnonAlphaBackgroundcolor = null,
    `plot-label`: AnonAlphaBackgroundcolorBackgroundcolor1 = null,
    `reverse-series`: js.UndefOr[Boolean] = js.undefined,
    `scale-label`: AnonAlphaBackgroundcolorBackgroundcolor1Backgroundcolor2 = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    trigger: String = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonAlphaExact = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-gap-size` != null) __obj.updateDynamic("line-gap-size")(`line-gap-size`.asInstanceOf[js.Any])
    if (`line-segment-size` != null) __obj.updateDynamic("line-segment-size")(`line-segment-size`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`line-width` != null) __obj.updateDynamic("line-width")(`line-width`.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (`plot-label` != null) __obj.updateDynamic("plot-label")(`plot-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(`reverse-series`)) __obj.updateDynamic("reverse-series")(`reverse-series`.asInstanceOf[js.Any])
    if (`scale-label` != null) __obj.updateDynamic("scale-label")(`scale-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlphaExact]
  }
}

