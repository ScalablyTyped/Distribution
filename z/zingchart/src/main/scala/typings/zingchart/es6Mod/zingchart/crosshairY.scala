package typings.zingchart.es6Mod.zingchart

import typings.zingchart.anon.Backgroundcolor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait crosshairY extends StObject {
  
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
  var `line-gap-size`: js.UndefOr[Any] = js.undefined
  
  /**
    * Can be used to create custom dashed or dotted lines when used with line-gap-size. This will control the size of the visible segmen
    * t of line. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the line width of the object. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[Any] = js.undefined
  
  var lineColor: js.UndefOr[String] = js.undefined
  
  var lineGapSize: js.UndefOr[Any] = js.undefined
  
  var lineSegmentSize: js.UndefOr[Any] = js.undefined
  
  var lineStyle: js.UndefOr[String] = js.undefined
  
  var lineWidth: js.UndefOr[Any] = js.undefined
  
  var marker: js.UndefOr[Backgroundcolor] = js.undefined
  
  var `plot-label`: js.UndefOr[plotLabel] = js.undefined
  
  var plotLabel: js.UndefOr[typings.zingchart.es6Mod.zingchart.plotLabel] = js.undefined
  
  /**
    * Reverses the order of items in plotLabel. Generally used with positive stacked charts.
    */
  var `reverse-series`: js.UndefOr[Boolean] = js.undefined
  
  var reverseSeries: js.UndefOr[Boolean] = js.undefined
  
  var `scale-label`: js.UndefOr[scaleLabel] = js.undefined
  
  var scaleLabel: js.UndefOr[typings.zingchart.es6Mod.zingchart.scaleLabel] = js.undefined
  
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
object crosshairY {
  
  inline def apply(): crosshairY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[crosshairY]
  }
  
  extension [Self <: crosshairY](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def `setLine-color`(value: String): Self = StObject.set(x, "line-color", value.asInstanceOf[js.Any])
    
    inline def `setLine-colorUndefined`: Self = StObject.set(x, "line-color", js.undefined)
    
    inline def `setLine-gap-size`(value: Any): Self = StObject.set(x, "line-gap-size", value.asInstanceOf[js.Any])
    
    inline def `setLine-gap-sizeUndefined`: Self = StObject.set(x, "line-gap-size", js.undefined)
    
    inline def `setLine-segment-size`(value: Any): Self = StObject.set(x, "line-segment-size", value.asInstanceOf[js.Any])
    
    inline def `setLine-segment-sizeUndefined`: Self = StObject.set(x, "line-segment-size", js.undefined)
    
    inline def `setLine-style`(value: String): Self = StObject.set(x, "line-style", value.asInstanceOf[js.Any])
    
    inline def `setLine-styleUndefined`: Self = StObject.set(x, "line-style", js.undefined)
    
    inline def `setLine-width`(value: Any): Self = StObject.set(x, "line-width", value.asInstanceOf[js.Any])
    
    inline def `setLine-widthUndefined`: Self = StObject.set(x, "line-width", js.undefined)
    
    inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineGapSize(value: Any): Self = StObject.set(x, "lineGapSize", value.asInstanceOf[js.Any])
    
    inline def setLineGapSizeUndefined: Self = StObject.set(x, "lineGapSize", js.undefined)
    
    inline def setLineSegmentSize(value: Any): Self = StObject.set(x, "lineSegmentSize", value.asInstanceOf[js.Any])
    
    inline def setLineSegmentSizeUndefined: Self = StObject.set(x, "lineSegmentSize", js.undefined)
    
    inline def setLineStyle(value: String): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setLineWidth(value: Any): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setMarker(value: Backgroundcolor): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def `setPlot-label`(value: plotLabel): Self = StObject.set(x, "plot-label", value.asInstanceOf[js.Any])
    
    inline def `setPlot-labelUndefined`: Self = StObject.set(x, "plot-label", js.undefined)
    
    inline def setPlotLabel(value: plotLabel): Self = StObject.set(x, "plotLabel", value.asInstanceOf[js.Any])
    
    inline def setPlotLabelUndefined: Self = StObject.set(x, "plotLabel", js.undefined)
    
    inline def `setReverse-series`(value: Boolean): Self = StObject.set(x, "reverse-series", value.asInstanceOf[js.Any])
    
    inline def `setReverse-seriesUndefined`: Self = StObject.set(x, "reverse-series", js.undefined)
    
    inline def setReverseSeries(value: Boolean): Self = StObject.set(x, "reverseSeries", value.asInstanceOf[js.Any])
    
    inline def setReverseSeriesUndefined: Self = StObject.set(x, "reverseSeries", js.undefined)
    
    inline def `setScale-label`(value: scaleLabel): Self = StObject.set(x, "scale-label", value.asInstanceOf[js.Any])
    
    inline def `setScale-labelUndefined`: Self = StObject.set(x, "scale-label", js.undefined)
    
    inline def setScaleLabel(value: scaleLabel): Self = StObject.set(x, "scaleLabel", value.asInstanceOf[js.Any])
    
    inline def setScaleLabelUndefined: Self = StObject.set(x, "scaleLabel", js.undefined)
    
    inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
