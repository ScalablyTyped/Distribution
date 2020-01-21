package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  var active: js.UndefOr[AnonAlphaBackgroundcolorNumber] = js.undefined
  /**
    * Forces the plotarea to consider the preview object positioning and prevent overlapping with it. true | false | 1 | 0
    */
  var `adjust-layout`: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#666
    * 699", #33ccff"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). "none" | "transparent" | "purple" | "#33ccff" | "rgb(100,
    *  15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border color of the object. "none" | "transparent" | "purple" | "#33ccff" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border width of the object. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  var handle: js.UndefOr[AnonAlphaBackgroundcolorBorderbottomBordercolor] = js.undefined
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[
    AnonAlphaAngleBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBoldBorderbottom
  ] = js.undefined
  /**
    * Sets whether the chart is updated when the preview active area is being moved. Default is false for classic theme and true for lig
    * ht/dark themes. The graph will update only when a the mouse is released. true | false | 1 | 0
    */
  var live: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the object's margins. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  var mask: js.UndefOr[AnonAlphaBackgroundcolorNumber] = js.undefined
  /**
    * Sets the minimum width of preview's active area. 5 | 10 | ...
    */
  var `min-distance`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the object's position relative to its container. Similar results can be obtained by setting marginand margin-... attributes.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * Sets whether the zoom level is preserved when a chart is altered or reloaded. true | false | 1 | 0
    */
  var `preserve-zoom`: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the "x" position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the "y" position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.undefined
}

object AnonActive {
  @scala.inline
  def apply(
    active: AnonAlphaBackgroundcolorNumber = null,
    `adjust-layout`: js.UndefOr[Boolean] = js.undefined,
    alpha: Int | Double = null,
    `background-color`: String = null,
    `border-color`: String = null,
    `border-width`: js.Any = null,
    handle: AnonAlphaBackgroundcolorBorderbottomBordercolor = null,
    height: js.Any = null,
    label: AnonAlphaAngleBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBoldBorderbottom = null,
    live: js.UndefOr[Boolean] = js.undefined,
    margin: js.Any = null,
    mask: AnonAlphaBackgroundcolorNumber = null,
    `min-distance`: Int | Double = null,
    position: String = null,
    `preserve-zoom`: js.UndefOr[Boolean] = js.undefined,
    width: js.Any = null,
    x: js.Any = null,
    y: js.Any = null
  ): AnonActive = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(`adjust-layout`)) __obj.updateDynamic("adjust-layout")(`adjust-layout`.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(live)) __obj.updateDynamic("live")(live.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (`min-distance` != null) __obj.updateDynamic("min-distance")(`min-distance`.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(`preserve-zoom`)) __obj.updateDynamic("preserve-zoom")(`preserve-zoom`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
}

