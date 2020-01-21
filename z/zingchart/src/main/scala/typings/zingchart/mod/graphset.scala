package typings.zingchart.mod

import typings.zingchart.AnonActive
import typings.zingchart.AnonAdjustlayout
import typings.zingchart.AnonAdjustlayoutAlpha
import typings.zingchart.AnonAdjustlayoutAlphaBackgroundcolor
import typings.zingchart.AnonAlign
import typings.zingchart.AnonAlpha
import typings.zingchart.AnonAlphaAnchor
import typings.zingchart.AnonAlphaAngleAngleend
import typings.zingchart.AnonAlphaAngleAutofit
import typings.zingchart.AnonAlphaAngleBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBorderalphaBorderbottom
import typings.zingchart.AnonAlphaAnimation
import typings.zingchart.AnonAlphaAsync
import typings.zingchart.AnonAlphaBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBold
import typings.zingchart.AnonAlphaBackgroundcolorBordercolorBorderwidthLabel
import typings.zingchart.AnonAlphaExact
import typings.zingchart.AnonAngle
import typings.zingchart.AnonAspect
import typings.zingchart.AnonAspectFormat
import typings.zingchart.AnonAutofit
import typings.zingchart.AnonBackgroundcolor
import typings.zingchart.AnonBarHandle
import typings.zingchart.AnonCenter
import typings.zingchart.AnonColumns
import typings.zingchart.AnonFormat
import typings.zingchart.AnonMaxheight
import typings.zingchart.AnonSizefactor
import typings.zingchart.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait graphset extends js.Object {
  var `3d-aspect`: js.UndefOr[AnonAngle] = js.undefined
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  var arrows: js.UndefOr[js.Array[AnonAlpha]] = js.undefined
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#666
    * 699", #33ccff"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). "none" | "transparent" | "purple" | "#33ccff" | "rgb(100,
    *  15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border color of the object. "none" | "transparent" | "purple" | "#33ccff" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border radius (rounded corners) of the object. "3px" | "10px"
    */
  var `border-radius`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the border width of the object. 1 | 3 | | "6px" | ...
    */
  var `border-width`: js.UndefOr[Double] = js.undefined
  var crosshair: js.UndefOr[AnonAlphaExact] = js.undefined
  var csv: js.UndefOr[AnonColumns] = js.undefined
  var heatmap: js.UndefOr[AnonAlphaAsync] = js.undefined
  /**
    * Sets the height of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[Double] = js.undefined
  var images: js.UndefOr[js.Array[AnonBackgroundcolor]] = js.undefined
  var labels: js.UndefOr[js.Array[AnonAlphaAnchor]] = js.undefined
  var legend: js.UndefOr[AnonAdjustlayout] = js.undefined
  /**
    * Sets the line style of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  var `media-rules`: js.UndefOr[js.Array[AnonMaxheight]] = js.undefined
  var `no-data`: js.UndefOr[AnonAlign] = js.undefined
  var options: js.UndefOr[AnonAspect] = js.undefined
  var plot: js.UndefOr[AnonAlphaAnimation] = js.undefined
  var plotarea: js.UndefOr[AnonAdjustlayoutAlpha] = js.undefined
  var preview: js.UndefOr[AnonActive] = js.undefined
  var scale: js.UndefOr[AnonSizefactor] = js.undefined
  var `scale-k`: js.UndefOr[AnonAspectFormat] = js.undefined
  var `scale-r`: js.UndefOr[AnonCenter] = js.undefined
  var `scale-v`: js.UndefOr[AnonFormat] = js.undefined
  var `scale-x`: js.UndefOr[AnonAutofit] = js.undefined
  var `scale-y`: js.UndefOr[AnonAlphaAngleAutofit] = js.undefined
  var `scroll-x-scroll-y`: js.UndefOr[AnonBarHandle] = js.undefined
  var series: js.UndefOr[js.Array[typings.zingchart.mod.series]] = js.undefined
  var shapes: js.UndefOr[js.Array[AnonAlphaAngleAngleend]] = js.undefined
  var source: js.UndefOr[
    AnonAlphaBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBold
  ] = js.undefined
  var subtitle: js.UndefOr[
    AnonAlphaBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBold
  ] = js.undefined
  var title: js.UndefOr[AnonAdjustlayoutAlphaBackgroundcolor] = js.undefined
  var tooltip: js.UndefOr[
    AnonAlphaAngleBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBorderalphaBorderbottom
  ] = js.undefined
  /**
    * The type of the chart "line" | "bar"...
    */
  var `type`: js.UndefOr[String] = js.undefined
  var widget: js.UndefOr[AnonType] = js.undefined
  /**
    * Sets the width of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[AnonAlphaBackgroundcolorBordercolorBorderwidthLabel] = js.undefined
}

object graphset {
  @scala.inline
  def apply(
    `3d-aspect`: AnonAngle = null,
    alpha: Int | Double = null,
    arrows: js.Array[AnonAlpha] = null,
    `background-color`: String = null,
    `border-color`: String = null,
    `border-radius`: js.Any = null,
    `border-width`: Int | Double = null,
    crosshair: AnonAlphaExact = null,
    csv: AnonColumns = null,
    heatmap: AnonAlphaAsync = null,
    height: Int | Double = null,
    images: js.Array[AnonBackgroundcolor] = null,
    labels: js.Array[AnonAlphaAnchor] = null,
    legend: AnonAdjustlayout = null,
    `line-style`: String = null,
    `media-rules`: js.Array[AnonMaxheight] = null,
    `no-data`: AnonAlign = null,
    options: AnonAspect = null,
    plot: AnonAlphaAnimation = null,
    plotarea: AnonAdjustlayoutAlpha = null,
    preview: AnonActive = null,
    scale: AnonSizefactor = null,
    `scale-k`: AnonAspectFormat = null,
    `scale-r`: AnonCenter = null,
    `scale-v`: AnonFormat = null,
    `scale-x`: AnonAutofit = null,
    `scale-y`: AnonAlphaAngleAutofit = null,
    `scroll-x-scroll-y`: AnonBarHandle = null,
    series: js.Array[series] = null,
    shapes: js.Array[AnonAlphaAngleAngleend] = null,
    source: AnonAlphaBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBold = null,
    subtitle: AnonAlphaBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBold = null,
    title: AnonAdjustlayoutAlphaBackgroundcolor = null,
    tooltip: AnonAlphaAngleBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBorderalphaBorderbottom = null,
    `type`: String = null,
    widget: AnonType = null,
    width: Int | Double = null,
    zoom: AnonAlphaBackgroundcolorBordercolorBorderwidthLabel = null
  ): graphset = {
    val __obj = js.Dynamic.literal()
    if (`3d-aspect` != null) __obj.updateDynamic("3d-aspect")(`3d-aspect`.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (arrows != null) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-radius` != null) __obj.updateDynamic("border-radius")(`border-radius`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    if (heatmap != null) __obj.updateDynamic("heatmap")(heatmap.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`media-rules` != null) __obj.updateDynamic("media-rules")(`media-rules`.asInstanceOf[js.Any])
    if (`no-data` != null) __obj.updateDynamic("no-data")(`no-data`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (plot != null) __obj.updateDynamic("plot")(plot.asInstanceOf[js.Any])
    if (plotarea != null) __obj.updateDynamic("plotarea")(plotarea.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (`scale-k` != null) __obj.updateDynamic("scale-k")(`scale-k`.asInstanceOf[js.Any])
    if (`scale-r` != null) __obj.updateDynamic("scale-r")(`scale-r`.asInstanceOf[js.Any])
    if (`scale-v` != null) __obj.updateDynamic("scale-v")(`scale-v`.asInstanceOf[js.Any])
    if (`scale-x` != null) __obj.updateDynamic("scale-x")(`scale-x`.asInstanceOf[js.Any])
    if (`scale-y` != null) __obj.updateDynamic("scale-y")(`scale-y`.asInstanceOf[js.Any])
    if (`scroll-x-scroll-y` != null) __obj.updateDynamic("scroll-x-scroll-y")(`scroll-x-scroll-y`.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (shapes != null) __obj.updateDynamic("shapes")(shapes.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (widget != null) __obj.updateDynamic("widget")(widget.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[graphset]
  }
}

