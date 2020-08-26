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
import typings.zingchart.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait graphset extends js.Object {
  var `3d-aspect`: js.UndefOr[Angle] = js.native
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  var arrows: js.UndefOr[js.Array[Alpha]] = js.native
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#666
    * 699", #33ccff"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). "none" | "transparent" | "purple" | "#33ccff" | "rgb(100,
    *  15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border color of the object. "none" | "transparent" | "purple" | "#33ccff" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border radius (rounded corners) of the object. "3px" | "10px"
    */
  var `border-radius`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the border width of the object. 1 | 3 | | "6px" | ...
    */
  var `border-width`: js.UndefOr[Double] = js.native
  var crosshair: js.UndefOr[Exact] = js.native
  var csv: js.UndefOr[Columns] = js.native
  var heatmap: js.UndefOr[Async] = js.native
  /**
    * Sets the height of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[Double] = js.native
  var images: js.UndefOr[js.Array[Backgroundimage]] = js.native
  var labels: js.UndefOr[js.Array[Anchor]] = js.native
  var legend: js.UndefOr[Adjustlayout] = js.native
  /**
    * Sets the line style of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.native
  var `media-rules`: js.UndefOr[js.Array[Maxheight]] = js.native
  var `no-data`: js.UndefOr[Align] = js.native
  var options: js.UndefOr[Aspect] = js.native
  var plot: js.UndefOr[Animation] = js.native
  var plotarea: js.UndefOr[Borderradiusbottomright] = js.native
  var preview: js.UndefOr[Active] = js.native
  var scale: js.UndefOr[Sizefactor] = js.native
  var `scale-k`: js.UndefOr[Format] = js.native
  var `scale-r`: js.UndefOr[Center] = js.native
  var `scale-v`: js.UndefOr[Guide] = js.native
  var `scale-x`: js.UndefOr[Autofit] = js.native
  var `scale-y`: js.UndefOr[Decimalsseparator] = js.native
  var `scroll-x-scroll-y`: js.UndefOr[Handle] = js.native
  var series: js.UndefOr[js.Array[typings.zingchart.mod.series]] = js.native
  var shapes: js.UndefOr[js.Array[Angleend]] = js.native
  var source: js.UndefOr[Calloutextension] = js.native
  var subtitle: js.UndefOr[Calloutextension] = js.native
  var title: js.UndefOr[Calloutheight] = js.native
  var tooltip: js.UndefOr[Callouthook] = js.native
  /**
    * The type of the chart "line" | "bar"...
    */
  var `type`: js.UndefOr[String] = js.native
  var widget: js.UndefOr[`2`] = js.native
  /**
    * Sets the width of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[Double] = js.native
  var zoom: js.UndefOr[Preservezoom] = js.native
}

object graphset {
  @scala.inline
  def apply(): graphset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[graphset]
  }
  @scala.inline
  implicit class graphsetOps[Self <: graphset] (val x: Self) extends AnyVal {
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
    def `set3d-aspect`(value: Angle): Self = this.set("3d-aspect", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete3d-aspect`: Self = this.set("3d-aspect", js.undefined)
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setArrowsVarargs(value: Alpha*): Self = this.set("arrows", js.Array(value :_*))
    @scala.inline
    def setArrows(value: js.Array[Alpha]): Self = this.set("arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    @scala.inline
    def `setBackground-color`(value: String): Self = this.set("background-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-color`: Self = this.set("background-color", js.undefined)
    @scala.inline
    def `setBorder-color`(value: String): Self = this.set("border-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-color`: Self = this.set("border-color", js.undefined)
    @scala.inline
    def `setBorder-radius`(value: js.Any): Self = this.set("border-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-radius`: Self = this.set("border-radius", js.undefined)
    @scala.inline
    def `setBorder-width`(value: Double): Self = this.set("border-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-width`: Self = this.set("border-width", js.undefined)
    @scala.inline
    def setCrosshair(value: Exact): Self = this.set("crosshair", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrosshair: Self = this.set("crosshair", js.undefined)
    @scala.inline
    def setCsv(value: Columns): Self = this.set("csv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsv: Self = this.set("csv", js.undefined)
    @scala.inline
    def setHeatmap(value: Async): Self = this.set("heatmap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeatmap: Self = this.set("heatmap", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setImagesVarargs(value: Backgroundimage*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[Backgroundimage]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: Anchor*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[Anchor]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLegend(value: Adjustlayout): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def `setLine-style`(value: String): Self = this.set("line-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-style`: Self = this.set("line-style", js.undefined)
    @scala.inline
    def `setMedia-rulesVarargs`(value: Maxheight*): Self = this.set("media-rules", js.Array(value :_*))
    @scala.inline
    def `setMedia-rules`(value: js.Array[Maxheight]): Self = this.set("media-rules", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-rules`: Self = this.set("media-rules", js.undefined)
    @scala.inline
    def `setNo-data`(value: Align): Self = this.set("no-data", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-data`: Self = this.set("no-data", js.undefined)
    @scala.inline
    def setOptions(value: Aspect): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPlot(value: Animation): Self = this.set("plot", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlot: Self = this.set("plot", js.undefined)
    @scala.inline
    def setPlotarea(value: Borderradiusbottomright): Self = this.set("plotarea", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotarea: Self = this.set("plotarea", js.undefined)
    @scala.inline
    def setPreview(value: Active): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    @scala.inline
    def setScale(value: Sizefactor): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def `setScale-k`(value: Format): Self = this.set("scale-k", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScale-k`: Self = this.set("scale-k", js.undefined)
    @scala.inline
    def `setScale-r`(value: Center): Self = this.set("scale-r", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScale-r`: Self = this.set("scale-r", js.undefined)
    @scala.inline
    def `setScale-v`(value: Guide): Self = this.set("scale-v", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScale-v`: Self = this.set("scale-v", js.undefined)
    @scala.inline
    def `setScale-x`(value: Autofit): Self = this.set("scale-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScale-x`: Self = this.set("scale-x", js.undefined)
    @scala.inline
    def `setScale-y`(value: Decimalsseparator): Self = this.set("scale-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScale-y`: Self = this.set("scale-y", js.undefined)
    @scala.inline
    def `setScroll-x-scroll-y`(value: Handle): Self = this.set("scroll-x-scroll-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-x-scroll-y`: Self = this.set("scroll-x-scroll-y", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: series*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[series]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setShapesVarargs(value: Angleend*): Self = this.set("shapes", js.Array(value :_*))
    @scala.inline
    def setShapes(value: js.Array[Angleend]): Self = this.set("shapes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
    @scala.inline
    def setSource(value: Calloutextension): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSubtitle(value: Calloutextension): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTitle(value: Calloutheight): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTooltip(value: Callouthook): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidget(value: `2`): Self = this.set("widget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidget: Self = this.set("widget", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZoom(value: Preservezoom): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

