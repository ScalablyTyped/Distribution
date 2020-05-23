package typings.zingchart.mod

import typings.zingchart.anon.Active
import typings.zingchart.anon.Adjustlayout
import typings.zingchart.anon.Align
import typings.zingchart.anon.Alpha
import typings.zingchart.anon.Anchor
import typings.zingchart.anon.Angle
import typings.zingchart.anon.Angleend
import typings.zingchart.anon.Animation
import typings.zingchart.anon.Aspect
import typings.zingchart.anon.Async
import typings.zingchart.anon.Autofit
import typings.zingchart.anon.Backgroundimage
import typings.zingchart.anon.Borderradiusbottomright
import typings.zingchart.anon.Calloutextension
import typings.zingchart.anon.Calloutheight
import typings.zingchart.anon.Callouthook
import typings.zingchart.anon.Center
import typings.zingchart.anon.Columns
import typings.zingchart.anon.Decimalsseparator
import typings.zingchart.anon.Exact
import typings.zingchart.anon.Format
import typings.zingchart.anon.Guide
import typings.zingchart.anon.Handle
import typings.zingchart.anon.Maxheight
import typings.zingchart.anon.Preservezoom
import typings.zingchart.anon.Sizefactor
import typings.zingchart.anon.TypeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait graphset extends js.Object {
  var `3d-aspect`: js.UndefOr[Angle] = js.undefined
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  var arrows: js.UndefOr[js.Array[Alpha]] = js.undefined
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
  var crosshair: js.UndefOr[Exact] = js.undefined
  var csv: js.UndefOr[Columns] = js.undefined
  var heatmap: js.UndefOr[Async] = js.undefined
  /**
    * Sets the height of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[Double] = js.undefined
  var images: js.UndefOr[js.Array[Backgroundimage]] = js.undefined
  var labels: js.UndefOr[js.Array[Anchor]] = js.undefined
  var legend: js.UndefOr[Adjustlayout] = js.undefined
  /**
    * Sets the line style of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  var `media-rules`: js.UndefOr[js.Array[Maxheight]] = js.undefined
  var `no-data`: js.UndefOr[Align] = js.undefined
  var options: js.UndefOr[Aspect] = js.undefined
  var plot: js.UndefOr[Animation] = js.undefined
  var plotarea: js.UndefOr[Borderradiusbottomright] = js.undefined
  var preview: js.UndefOr[Active] = js.undefined
  var scale: js.UndefOr[Sizefactor] = js.undefined
  var `scale-k`: js.UndefOr[Format] = js.undefined
  var `scale-r`: js.UndefOr[Center] = js.undefined
  var `scale-v`: js.UndefOr[Guide] = js.undefined
  var `scale-x`: js.UndefOr[Autofit] = js.undefined
  var `scale-y`: js.UndefOr[Decimalsseparator] = js.undefined
  var `scroll-x-scroll-y`: js.UndefOr[Handle] = js.undefined
  var series: js.UndefOr[js.Array[typings.zingchart.mod.series]] = js.undefined
  var shapes: js.UndefOr[js.Array[Angleend]] = js.undefined
  var source: js.UndefOr[Calloutextension] = js.undefined
  var subtitle: js.UndefOr[Calloutextension] = js.undefined
  var title: js.UndefOr[Calloutheight] = js.undefined
  var tooltip: js.UndefOr[Callouthook] = js.undefined
  /**
    * The type of the chart "line" | "bar"...
    */
  var `type`: js.UndefOr[String] = js.undefined
  var widget: js.UndefOr[TypeString] = js.undefined
  /**
    * Sets the width of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[Preservezoom] = js.undefined
}

object graphset {
  @scala.inline
  def apply(
    `3d-aspect`: Angle = null,
    alpha: js.UndefOr[Double] = js.undefined,
    arrows: js.Array[Alpha] = null,
    `background-color`: String = null,
    `border-color`: String = null,
    `border-radius`: js.Any = null,
    `border-width`: js.UndefOr[Double] = js.undefined,
    crosshair: Exact = null,
    csv: Columns = null,
    heatmap: Async = null,
    height: js.UndefOr[Double] = js.undefined,
    images: js.Array[Backgroundimage] = null,
    labels: js.Array[Anchor] = null,
    legend: Adjustlayout = null,
    `line-style`: String = null,
    `media-rules`: js.Array[Maxheight] = null,
    `no-data`: Align = null,
    options: Aspect = null,
    plot: Animation = null,
    plotarea: Borderradiusbottomright = null,
    preview: Active = null,
    scale: Sizefactor = null,
    `scale-k`: Format = null,
    `scale-r`: Center = null,
    `scale-v`: Guide = null,
    `scale-x`: Autofit = null,
    `scale-y`: Decimalsseparator = null,
    `scroll-x-scroll-y`: Handle = null,
    series: js.Array[series] = null,
    shapes: js.Array[Angleend] = null,
    source: Calloutextension = null,
    subtitle: Calloutextension = null,
    title: Calloutheight = null,
    tooltip: Callouthook = null,
    `type`: String = null,
    widget: TypeString = null,
    width: js.UndefOr[Double] = js.undefined,
    zoom: Preservezoom = null
  ): graphset = {
    val __obj = js.Dynamic.literal()
    if (`3d-aspect` != null) __obj.updateDynamic("3d-aspect")(`3d-aspect`.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (arrows != null) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-radius` != null) __obj.updateDynamic("border-radius")(`border-radius`.asInstanceOf[js.Any])
    if (!js.isUndefined(`border-width`)) __obj.updateDynamic("border-width")(`border-width`.get.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    if (heatmap != null) __obj.updateDynamic("heatmap")(heatmap.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[graphset]
  }
}

