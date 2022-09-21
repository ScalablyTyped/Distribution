package typings.zingchart.es6Mod.zingchart

import org.scalablytyped.runtime.StringDictionary
import typings.zingchart.anon.Active
import typings.zingchart.anon.AdjustLayout_
import typings.zingchart.anon.Adjustlayout
import typings.zingchart.anon.AngleEnd
import typings.zingchart.anon.Aspect
import typings.zingchart.anon.Async
import typings.zingchart.anon.BackgroundRepeat_
import typings.zingchart.anon.Backgroundrepeat
import typings.zingchart.anon.Bold
import typings.zingchart.anon.Columns
import typings.zingchart.anon.Depth
import typings.zingchart.anon.Dictkey
import typings.zingchart.anon.Exact
import typings.zingchart.anon.Mask
import typings.zingchart.anon.MaxHeight
import typings.zingchart.anon.PreserveZoom
import typings.zingchart.anon.SizeFactor
import typings.zingchart.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait graphset
  extends StObject
     with /* key */ StringDictionary[scaleX | scaleY] {
  
  var `3d-aspect`: js.UndefOr[Depth] = js.undefined
  
  var `3dAspect`: js.UndefOr[Depth] = js.undefined
  
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  var arrows: js.UndefOr[js.Array[Aspect]] = js.undefined
  
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#666
    * 699", #33ccff"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). "none" | "transparent" | "purple" | "#33ccff" | "rgb(100,
    *  15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border color of the object. "none" | "transparent" | "purple" | "#33ccff" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border radius (rounded corners) of the object. "3px" | "10px"
    */
  var `border-radius`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the border width of the object. 1 | 3 | | "6px" | ...
    */
  var `border-width`: js.UndefOr[Any] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderRadius: js.UndefOr[Any] = js.undefined
  
  var borderWidth: js.UndefOr[Any] = js.undefined
  
  var crosshair: js.UndefOr[Exact] = js.undefined
  
  var `crosshair-x`: js.UndefOr[crosshairX] = js.undefined
  
  var `crosshair-y`: js.UndefOr[crosshairY] = js.undefined
  
  var crosshairX: js.UndefOr[typings.zingchart.es6Mod.zingchart.crosshairX] = js.undefined
  
  var crosshairY: js.UndefOr[typings.zingchart.es6Mod.zingchart.crosshairY] = js.undefined
  
  var csv: js.UndefOr[Columns] = js.undefined
  
  var heatmap: js.UndefOr[Async] = js.undefined
  
  /**
    * Sets the height of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[Double] = js.undefined
  
  var images: js.UndefOr[js.Array[BackgroundRepeat_]] = js.undefined
  
  var labels: js.UndefOr[js.Array[label]] = js.undefined
  
  var legend: js.UndefOr[AdjustLayout_] = js.undefined
  
  /**
    * Sets the line style of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  
  var lineStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the maximum numbers of nodes for which a tracking area will be created. This is best used to optimize charts with large sets
    * of data. 5 | 10 | ...
    */
  var `max-trackers`: js.UndefOr[Double] = js.undefined
  
  var maxTrackers: js.UndefOr[Double] = js.undefined
  
  var `media-rules`: js.UndefOr[js.Array[MaxHeight]] = js.undefined
  
  var `no-data`: js.UndefOr[noData] = js.undefined
  
  var noData: js.UndefOr[typings.zingchart.es6Mod.zingchart.noData] = js.undefined
  
  var options: js.UndefOr[Dictkey] = js.undefined
  
  var plot: js.UndefOr[typings.zingchart.es6Mod.zingchart.plot] = js.undefined
  
  var plotarea: js.UndefOr[Adjustlayout] = js.undefined
  
  var preview: js.UndefOr[Active] = js.undefined
  
  var scale: js.UndefOr[SizeFactor] = js.undefined
  
  var `scale-k`: js.UndefOr[scaleK] = js.undefined
  
  var `scale-r`: js.UndefOr[scaleR] = js.undefined
  
  var `scale-v`: js.UndefOr[scaleV] = js.undefined
  
  var `scale-x`: js.UndefOr[scaleX] = js.undefined
  
  var `scale-y`: js.UndefOr[scaleY] = js.undefined
  
  var scaleK: js.UndefOr[typings.zingchart.es6Mod.zingchart.scaleK] = js.undefined
  
  var scaleR: js.UndefOr[typings.zingchart.es6Mod.zingchart.scaleR] = js.undefined
  
  var scaleV: js.UndefOr[typings.zingchart.es6Mod.zingchart.scaleV] = js.undefined
  
  var scaleX: js.UndefOr[typings.zingchart.es6Mod.zingchart.scaleX] = js.undefined
  
  var scaleY: js.UndefOr[typings.zingchart.es6Mod.zingchart.scaleY] = js.undefined
  
  var `scroll-x-scroll-y`: js.UndefOr[scrollXSCrollY] = js.undefined
  
  var scrollXScrollY: js.UndefOr[scrollXSCrollY] = js.undefined
  
  var selectionTool: js.UndefOr[Mask] = js.undefined
  
  var series: js.UndefOr[js.Array[typings.zingchart.es6Mod.zingchart.series]] = js.undefined
  
  var shapes: js.UndefOr[js.Array[AngleEnd]] = js.undefined
  
  var source: js.UndefOr[Backgroundrepeat] = js.undefined
  
  var subtitle: js.UndefOr[Backgroundrepeat] = js.undefined
  
  /**
    * Time-Series Charts only: To set the UTC timezone. Use with the 'utc' attribute and 'transform' object in the applicable scale object.
    * Default Value: 0
    */
  var `time-zone`: js.UndefOr[Double] = js.undefined
  
  var timeZone: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[Bold] = js.undefined
  
  var tooltip: js.UndefOr[typings.zingchart.es6Mod.zingchart.tooltip] = js.undefined
  
  /**
    * The type of the chart "line" | "bar"...
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Time-Series Charts only: To set the chart to UTC time. Use with the 'timezone' attribute and 'transform' object in the applicable scale object.
    */
  var utc: js.UndefOr[Boolean] = js.undefined
  
  var values: js.UndefOr[Any] = js.undefined
  
  var widget: js.UndefOr[Type] = js.undefined
  
  /**
    * Sets the width of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[Double] = js.undefined
  
  var zoom: js.UndefOr[PreserveZoom] = js.undefined
  
  /**
    * @description When zooming is enabled, setting zoom-snap to true snaps the zoom area to the nearest data node as a zoom area is selected. By default, zoom-snap is set to false.
    */
  var zoomSnap: js.UndefOr[Boolean] = js.undefined
}
object graphset {
  
  inline def apply(): graphset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[graphset]
  }
  
  extension [Self <: graphset](x: Self) {
    
    inline def `set3d-aspect`(value: Depth): Self = StObject.set(x, "3d-aspect", value.asInstanceOf[js.Any])
    
    inline def `set3d-aspectUndefined`: Self = StObject.set(x, "3d-aspect", js.undefined)
    
    inline def set3dAspect(value: Depth): Self = StObject.set(x, "3dAspect", value.asInstanceOf[js.Any])
    
    inline def set3dAspectUndefined: Self = StObject.set(x, "3dAspect", js.undefined)
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setArrows(value: js.Array[Aspect]): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
    
    inline def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
    
    inline def setArrowsVarargs(value: Aspect*): Self = StObject.set(x, "arrows", js.Array(value*))
    
    inline def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    inline def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    inline def `setBorder-radius`(value: Any): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
    
    inline def `setBorder-width`(value: Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Any): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Any): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setCrosshair(value: Exact): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    inline def `setCrosshair-x`(value: crosshairX): Self = StObject.set(x, "crosshair-x", value.asInstanceOf[js.Any])
    
    inline def `setCrosshair-xUndefined`: Self = StObject.set(x, "crosshair-x", js.undefined)
    
    inline def `setCrosshair-y`(value: crosshairY): Self = StObject.set(x, "crosshair-y", value.asInstanceOf[js.Any])
    
    inline def `setCrosshair-yUndefined`: Self = StObject.set(x, "crosshair-y", js.undefined)
    
    inline def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
    
    inline def setCrosshairX(value: crosshairX): Self = StObject.set(x, "crosshairX", value.asInstanceOf[js.Any])
    
    inline def setCrosshairXUndefined: Self = StObject.set(x, "crosshairX", js.undefined)
    
    inline def setCrosshairY(value: crosshairY): Self = StObject.set(x, "crosshairY", value.asInstanceOf[js.Any])
    
    inline def setCrosshairYUndefined: Self = StObject.set(x, "crosshairY", js.undefined)
    
    inline def setCsv(value: Columns): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    inline def setHeatmap(value: Async): Self = StObject.set(x, "heatmap", value.asInstanceOf[js.Any])
    
    inline def setHeatmapUndefined: Self = StObject.set(x, "heatmap", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImages(value: js.Array[BackgroundRepeat_]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: BackgroundRepeat_ *): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setLabels(value: js.Array[label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: label*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLegend(value: AdjustLayout_): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def `setLine-style`(value: String): Self = StObject.set(x, "line-style", value.asInstanceOf[js.Any])
    
    inline def `setLine-styleUndefined`: Self = StObject.set(x, "line-style", js.undefined)
    
    inline def setLineStyle(value: String): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def `setMax-trackers`(value: Double): Self = StObject.set(x, "max-trackers", value.asInstanceOf[js.Any])
    
    inline def `setMax-trackersUndefined`: Self = StObject.set(x, "max-trackers", js.undefined)
    
    inline def setMaxTrackers(value: Double): Self = StObject.set(x, "maxTrackers", value.asInstanceOf[js.Any])
    
    inline def setMaxTrackersUndefined: Self = StObject.set(x, "maxTrackers", js.undefined)
    
    inline def `setMedia-rules`(value: js.Array[MaxHeight]): Self = StObject.set(x, "media-rules", value.asInstanceOf[js.Any])
    
    inline def `setMedia-rulesUndefined`: Self = StObject.set(x, "media-rules", js.undefined)
    
    inline def `setMedia-rulesVarargs`(value: MaxHeight*): Self = StObject.set(x, "media-rules", js.Array(value*))
    
    inline def `setNo-data`(value: noData): Self = StObject.set(x, "no-data", value.asInstanceOf[js.Any])
    
    inline def `setNo-dataUndefined`: Self = StObject.set(x, "no-data", js.undefined)
    
    inline def setNoData(value: noData): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
    
    inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
    
    inline def setOptions(value: Dictkey): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPlot(value: plot): Self = StObject.set(x, "plot", value.asInstanceOf[js.Any])
    
    inline def setPlotUndefined: Self = StObject.set(x, "plot", js.undefined)
    
    inline def setPlotarea(value: Adjustlayout): Self = StObject.set(x, "plotarea", value.asInstanceOf[js.Any])
    
    inline def setPlotareaUndefined: Self = StObject.set(x, "plotarea", js.undefined)
    
    inline def setPreview(value: Active): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setScale(value: SizeFactor): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def `setScale-k`(value: scaleK): Self = StObject.set(x, "scale-k", value.asInstanceOf[js.Any])
    
    inline def `setScale-kUndefined`: Self = StObject.set(x, "scale-k", js.undefined)
    
    inline def `setScale-r`(value: scaleR): Self = StObject.set(x, "scale-r", value.asInstanceOf[js.Any])
    
    inline def `setScale-rUndefined`: Self = StObject.set(x, "scale-r", js.undefined)
    
    inline def `setScale-v`(value: scaleV): Self = StObject.set(x, "scale-v", value.asInstanceOf[js.Any])
    
    inline def `setScale-vUndefined`: Self = StObject.set(x, "scale-v", js.undefined)
    
    inline def `setScale-x`(value: scaleX): Self = StObject.set(x, "scale-x", value.asInstanceOf[js.Any])
    
    inline def `setScale-xUndefined`: Self = StObject.set(x, "scale-x", js.undefined)
    
    inline def `setScale-y`(value: scaleY): Self = StObject.set(x, "scale-y", value.asInstanceOf[js.Any])
    
    inline def `setScale-yUndefined`: Self = StObject.set(x, "scale-y", js.undefined)
    
    inline def setScaleK(value: scaleK): Self = StObject.set(x, "scaleK", value.asInstanceOf[js.Any])
    
    inline def setScaleKUndefined: Self = StObject.set(x, "scaleK", js.undefined)
    
    inline def setScaleR(value: scaleR): Self = StObject.set(x, "scaleR", value.asInstanceOf[js.Any])
    
    inline def setScaleRUndefined: Self = StObject.set(x, "scaleR", js.undefined)
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScaleV(value: scaleV): Self = StObject.set(x, "scaleV", value.asInstanceOf[js.Any])
    
    inline def setScaleVUndefined: Self = StObject.set(x, "scaleV", js.undefined)
    
    inline def setScaleX(value: scaleX): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: scaleY): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def `setScroll-x-scroll-y`(value: scrollXSCrollY): Self = StObject.set(x, "scroll-x-scroll-y", value.asInstanceOf[js.Any])
    
    inline def `setScroll-x-scroll-yUndefined`: Self = StObject.set(x, "scroll-x-scroll-y", js.undefined)
    
    inline def setScrollXScrollY(value: scrollXSCrollY): Self = StObject.set(x, "scrollXScrollY", value.asInstanceOf[js.Any])
    
    inline def setScrollXScrollYUndefined: Self = StObject.set(x, "scrollXScrollY", js.undefined)
    
    inline def setSelectionTool(value: Mask): Self = StObject.set(x, "selectionTool", value.asInstanceOf[js.Any])
    
    inline def setSelectionToolUndefined: Self = StObject.set(x, "selectionTool", js.undefined)
    
    inline def setSeries(value: js.Array[series]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: series*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setShapes(value: js.Array[AngleEnd]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    inline def setShapesVarargs(value: AngleEnd*): Self = StObject.set(x, "shapes", js.Array(value*))
    
    inline def setSource(value: Backgroundrepeat): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSubtitle(value: Backgroundrepeat): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def `setTime-zone`(value: Double): Self = StObject.set(x, "time-zone", value.asInstanceOf[js.Any])
    
    inline def `setTime-zoneUndefined`: Self = StObject.set(x, "time-zone", js.undefined)
    
    inline def setTimeZone(value: Double): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setTitle(value: Bold): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltip(value: tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
    
    inline def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setWidget(value: Type): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
    
    inline def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZoom(value: PreserveZoom): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomSnap(value: Boolean): Self = StObject.set(x, "zoomSnap", value.asInstanceOf[js.Any])
    
    inline def setZoomSnapUndefined: Self = StObject.set(x, "zoomSnap", js.undefined)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
