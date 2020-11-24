package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exact extends js.Object {
  
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  
  /**
    * X-Axis Crosshairs Only: When true, plot nodes will be highlighted only when the guide is directly next to the node. When false (th
    * e default setting), the plot nodes closest to the guide will be highlighted. true | false | 1 | 0
    */
  var exact: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the line color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  
  /**
    * Can be used to create custom dashed or dotted lines when used with line-segment-size. This will control the size of the gaps betwe
    * en each line segment. 4 | "6px" | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.native
  
  /**
    * Can be used to create custom dashed or dotted lines when used with line-gap-size. This will control the size of the visible segmen
    * t of line. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed"
    */
  var `line-style`: js.UndefOr[String] = js.native
  
  /**
    * Sets the line width of the object. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.native
  
  var marker: js.UndefOr[Backgroundcolor] = js.native
  
  var `plot-label`: js.UndefOr[Backgroundcolor1] = js.native
  
  /**
    * Reverses the order of items in plotLabel. Generally used with positive stacked charts.
    */
  var `reverse-series`: js.UndefOr[Boolean] = js.native
  
  var `scale-label`: js.UndefOr[Backgroundcolor2] = js.native
  
  /**
    * X-Axis Crosshairs Only: For graphsets with multiple chart objects, setting the attribute to true in "crosshair-x" will allow you t
    * o use crosshairs across all charts simultaneously. true | false | 1 | 0
    */
  var shared: js.UndefOr[Boolean] = js.native
  
  /**
    * X-Axis Crosshairs Only: Sets the mode used to display crosshair plot-labels. When set to "move" (the default setting), plot-labels
    *  for all nodes will be displayed. The "hover" setting will allow only one plot-label to be displayed at a time, with the visibilit
    * y of each label being triggered when the user hovers over a node. "move" | "hover"
    */
  var trigger: js.UndefOr[String] = js.native
  
  /**
    * Y-Axis Crosshairs Only: Sets the type of the "crosshair-y", either in single mode (one line for all scales) or multiple (a line fo
    * r every plot). "single" | "multiple"
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object Exact {
  
  @scala.inline
  def apply(): Exact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exact]
  }
  
  @scala.inline
  implicit class ExactOps[Self <: Exact] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    
    @scala.inline
    def `setLine-color`(value: String): Self = this.set("line-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-color`: Self = this.set("line-color", js.undefined)
    
    @scala.inline
    def `setLine-gap-size`(value: js.Any): Self = this.set("line-gap-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-gap-size`: Self = this.set("line-gap-size", js.undefined)
    
    @scala.inline
    def `setLine-segment-size`(value: js.Any): Self = this.set("line-segment-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-segment-size`: Self = this.set("line-segment-size", js.undefined)
    
    @scala.inline
    def `setLine-style`(value: String): Self = this.set("line-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-style`: Self = this.set("line-style", js.undefined)
    
    @scala.inline
    def `setLine-width`(value: js.Any): Self = this.set("line-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-width`: Self = this.set("line-width", js.undefined)
    
    @scala.inline
    def setMarker(value: Backgroundcolor): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def `setPlot-label`(value: Backgroundcolor1): Self = this.set("plot-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePlot-label`: Self = this.set("plot-label", js.undefined)
    
    @scala.inline
    def `setReverse-series`(value: Boolean): Self = this.set("reverse-series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteReverse-series`: Self = this.set("reverse-series", js.undefined)
    
    @scala.inline
    def `setScale-label`(value: Backgroundcolor2): Self = this.set("scale-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScale-label`: Self = this.set("scale-label", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
