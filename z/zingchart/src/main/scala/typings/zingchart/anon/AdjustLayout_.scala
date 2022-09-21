package typings.zingchart.anon

import typings.zingchart.es6Mod.zingchart.itemOff
import typings.zingchart.es6Mod.zingchart.pageOff
import typings.zingchart.es6Mod.zingchart.pageOn
import typings.zingchart.es6Mod.zingchart.pageStatus
import typings.zingchart.es6Mod.zingchart.tooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustLayout_ extends StObject {
  
  /**
    * Forces the plotarea to consider the legend positioning and prevent overlapping with it. true | false | 1 | 0
    */
  var `adjust-layout`: js.UndefOr[Boolean] = js.undefined
  
  var adjustLayout: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Automatically aligns the legend and adjusts "plotarea" margins accordingly. "left" | "center" | "right"
    */
  var align: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the transparency of the object. The higher the value, the less transparent the object appears. Requires the formatting 0.x. 0
    * .3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g. "red", "blue", "yellow"), in hexadecimal notation (e.
    * g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0,0,255)", "rgb(255,255,0)"). One color will se
    * t a solid background color, two colors will, by default, create a horizontal gradient. For more complex gradients, use gradient-co
    * lors and gradient-stops. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the first color of a 2 color background gradient of the object. To be used with background-color-2. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the second color of a 2 color background gradient of the object. To be used with background-color-1. "none" | "transparent" |
    *  "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-2`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the direction/s on which the background image is being "stretched". "x" | "y" | "xy"
    */
  var `background-fit`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a background image for the object. Value can be a local file or a web image's location. "image.png" | ...
    */
  var `background-image`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the position of the background when the background-repeat value is no-repeat. "0 0" | "50 100" | "80% 60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the repeating mode for the background image. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var backgroundColor1: js.UndefOr[String] = js.undefined
  
  var backgroundColor2: js.UndefOr[String] = js.undefined
  
  var backgroundFit: js.UndefOr[String] = js.undefined
  
  var backgroundImage: js.UndefOr[String] = js.undefined
  
  var backgroundPosition: js.UndefOr[String] = js.undefined
  
  var backgroundRepeat: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the object's bottom border style. Accepts solid, dotted, and dashed. Also accepts named colors. If color is not set properly,
    *  will default to black. "2px solid #f00" | ...
    */
  var `border-bottom`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border color of the object, applicable on closed shapes. See also line-color for closed shapes. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the object's left border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-left`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the object's border radius, for rounded corners. The higher the value, the more rounded the corners appear. 4 | "6px" | "6px
    * 10px 3px 5px" | "-10px" | ...
    */
  var `border-radius`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's bottom-left border radius, for rounded corners. Larger values create rounder corners, while smaller values creat
    * e sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-left`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's bottom-right border radius, for rounded corners. Larger values create rounder corners, while smaller values crea
    * te sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-right`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's top-left border radius, for rounded corners. Larger values create rounder corners, while smaller values create s
    * harper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-left`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's top-right border radius, for rounded corners. Larger values create rounder corners, while smaller values create
    * sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-right`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's right border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-right`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the object's top border style. Values must include the border width, style, and color. Accepts solid, dashed, and dotted styl
    * es. "2px solid #f00" | ...
    */
  var `border-top`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border width of the object, applicable on closed shapes. See also line-width for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[Any] = js.undefined
  
  var borderBottom: js.UndefOr[String] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderLeft: js.UndefOr[String] = js.undefined
  
  var borderRadius: js.UndefOr[Any] = js.undefined
  
  var borderRadiusBottomLeft: js.UndefOr[Any] = js.undefined
  
  var borderRadiusBottomRight: js.UndefOr[Any] = js.undefined
  
  var borderRadiusTopLeft: js.UndefOr[Any] = js.undefined
  
  var borderRadiusTopRight: js.UndefOr[Any] = js.undefined
  
  var borderRight: js.UndefOr[String] = js.undefined
  
  var borderTop: js.UndefOr[String] = js.undefined
  
  var borderWidth: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets whether an object will have a callout arrow or not. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the length for an extension line off the tip of the callout arrow. 4 | "6px" | ...
    */
  var `callout-extension`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the height of the object's callout arrow. A larger value will create a taller callout arrow. 4 | "6px" | ...
    */
  var `callout-height`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets a location for the point of the tip of the callout arrow. Uses XY coordinates. [200, 50] | ...
    */
  var `callout-hook`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the offset for the origin of the callout arrow. Uses positive or negative values to move the arrow right/left/up/down. 4 | "6
    * px" | ...
    */
  var `callout-offset`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the position for the object's callout arrow. The position is "bottom" by default. "top" | "right" | "bottom" | "left"
    */
  var `callout-position`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets which edge will be the location for the object's callout arrow. 4 | "6px" | ...
    */
  var `callout-width`: js.UndefOr[Any] = js.undefined
  
  var calloutExtension: js.UndefOr[Any] = js.undefined
  
  var calloutHeight: js.UndefOr[Any] = js.undefined
  
  var calloutHook: js.UndefOr[Any] = js.undefined
  
  var calloutOffset: js.UndefOr[Any] = js.undefined
  
  var calloutPosition: js.UndefOr[String] = js.undefined
  
  var calloutWidth: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets legend to be collapsed by default true | false | 1 | 0
    */
  var collapse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the handler used to drag the legend: icon will create a dragging icon on the legend header, which will be the only area on wh
    * ich you can click and drag, header will make the whole header object active for dragging the legend. "header" | "icon"
    */
  var `drag-handler`: js.UndefOr[String] = js.undefined
  
  var dragHandler: js.UndefOr[String] = js.undefined
  
  /**
    * Sets whether the legend can be dragged or not. true | false | 1 | 0
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets an X offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-x`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets an Y offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the background gradient fill type to either linear or radial. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  
  var fillAngle: js.UndefOr[Double] = js.undefined
  
  var fillOffsetX: js.UndefOr[Any] = js.undefined
  
  var fillOffsetY: js.UndefOr[Any] = js.undefined
  
  var fillType: js.UndefOr[String] = js.undefined
  
  var footer: js.UndefOr[Backgroundcolor2] = js.undefined
  
  /**
    * Sets a set of colors for a complex background gradient (more than 2 colors). To be used with gradient-stops. "#f00 #0f0 #00f" | ..
    * .
    */
  var `gradient-colors`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the position for the introduction of each color for a complex background gradient (more than 2 colors). To be used with gradi
    * ent-colors. "0.1 0.5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.undefined
  
  var gradientColors: js.UndefOr[String] = js.undefined
  
  var gradientStops: js.UndefOr[String] = js.undefined
  
  var header: js.UndefOr[Backgroundfit] = js.undefined
  
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[Any] = js.undefined
  
  /**
    * An alias for the "highlight" attribute in the "plot" object. Highlights the corresponding plot when the legend item is moused over
    * . true | false | 1 | 0
    */
  var `highlight-plot`: js.UndefOr[Boolean] = js.undefined
  
  var highlightPlot: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[OffsetX] = js.undefined
  
  var item: js.UndefOr[Backgroundimage] = js.undefined
  
  var `item-off`: js.UndefOr[itemOff] = js.undefined
  
  var itemOff: js.UndefOr[typings.zingchart.es6Mod.zingchart.itemOff] = js.undefined
  
  /**
    * Sets the layout for the legend items. "horizontal" | "h" | "vertical" | "v" | "row x col" | "x col" | "row x" | "float"
    */
  var layout: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the object's margin/s from the top-left of the chart. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var margin: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's bottom margin. 4 | "6px" | ...
    */
  var `margin-bottom`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's left margin. 4 | "6px" | ...
    */
  var `margin-left`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's right margin. 4 | "6px" | ...
    */
  var `margin-right`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's top margin. 4 | "6px" | ...
    */
  var `margin-top`: js.UndefOr[Any] = js.undefined
  
  var marginBottom: js.UndefOr[Any] = js.undefined
  
  var marginLeft: js.UndefOr[Any] = js.undefined
  
  var marginRight: js.UndefOr[Any] = js.undefined
  
  var marginTop: js.UndefOr[Any] = js.undefined
  
  var marker: js.UndefOr[Backgroundposition] = js.undefined
  
  /**
    * Sets the maximum number of items displayed on the legend. To be used with overflow. 5 | 10 | ...
    */
  var `max-items`: js.UndefOr[Double] = js.undefined
  
  var maxItems: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets whether the legend can be minimized or not.
    */
  var minimize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets an X offset to apply when positioning the legend. A positive value moves the legend to the right. A negative value moves the
    * legend to the left. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets a Y offset to apply when positioning the legend. A positive value moves the legend down. A negative value moves the legend up
    * . 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[Any] = js.undefined
  
  var offsetX: js.UndefOr[Any] = js.undefined
  
  var offsetY: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the display mode for legend items beyond max-items setting: none will display all items, hidden will display just top max-ite
    * ms items, page will enable the pagination module, scrollwill enable legend scrolling, with top max-items items per page. To be use
    * d with max-item. "none" | "hidden" | "page" | "scroll"
    */
  var overflow: js.UndefOr[String] = js.undefined
  
  var `page-off`: js.UndefOr[pageOff] = js.undefined
  
  var `page-on`: js.UndefOr[pageOn] = js.undefined
  
  var `page-status`: js.UndefOr[pageStatus] = js.undefined
  
  var pageOff: js.UndefOr[typings.zingchart.es6Mod.zingchart.pageOff] = js.undefined
  
  var pageOn: js.UndefOr[typings.zingchart.es6Mod.zingchart.pageOn] = js.undefined
  
  var pageStatus: js.UndefOr[typings.zingchart.es6Mod.zingchart.pageStatus] = js.undefined
  
  /**
    * Sets the object's position relative to its container. Similar results can be obtained by setting [margin] and [margin-...] attribu
    * tes. Uses x,y coordinates originating from the top left of the chart.
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * Reverses the items in the legend
    */
  var `reverse-series`: js.UndefOr[Boolean] = js.undefined
  
  var reverseSeries: js.UndefOr[Boolean] = js.undefined
  
  var scroll: js.UndefOr[Bar] = js.undefined
  
  /**
    * Sets whether the object's shadow is visible or not. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the transparency of the shadow of the object. The higher the value, the less transparent the shadow will be. 0.3 | 0.9 | ...
    */
  var `shadow-alpha`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the angle of the shadow underneath the object. -45 | 115 | ...
    */
  var `shadow-angle`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the blur effect size for the shadow of the object. Has limited effect on HTML5 implementation. 4 | "6px" | ...
    */
  var `shadow-blur`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the color of the shadow of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ..
    * .
    */
  var `shadow-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the distance between the shadow and the object. 4 | "6px" | ...
    */
  var `shadow-distance`: js.UndefOr[Any] = js.undefined
  
  var shadowAlpha: js.UndefOr[Double] = js.undefined
  
  var shadowAngle: js.UndefOr[Double] = js.undefined
  
  var shadowBlur: js.UndefOr[Any] = js.undefined
  
  var shadowColor: js.UndefOr[String] = js.undefined
  
  var shadowDistance: js.UndefOr[Any] = js.undefined
  
  /**
    * For graphsets with multiple chart objects, setting this attribute to true within the legend object of each chart will allow you to
    *  use one legend to toggle data on or off for each chart simultaneously. It should be noted that while each chart must have a legen
    * d object, the visible attribute can be set to false to hide a legend. true | false | 1 | 0
    */
  var shared: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the action performed on legend item toggle: hide will simply hide the respective plot, remove will repaint the chart without
    * considering the respective plot, disabled will not generate any action for the legend items/markers. "hide" | "remove" | "disabled
    * "
    */
  var `toggle-action`: js.UndefOr[String] = js.undefined
  
  var toggleAction: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[typings.zingchart.es6Mod.zingchart.tooltip] = js.undefined
  
  /**
    * Automatically aligns the legend and adjusts "plotarea" margins accordingly. "top" | "middle" | "bottom"
    */
  var `vertical-align`: js.UndefOr[String] = js.undefined
  
  var verticalAlign: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the X position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the Y position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[Any] = js.undefined
}
object AdjustLayout_ {
  
  inline def apply(): AdjustLayout_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustLayout_]
  }
  
  extension [Self <: AdjustLayout_](x: Self) {
    
    inline def `setAdjust-layout`(value: Boolean): Self = StObject.set(x, "adjust-layout", value.asInstanceOf[js.Any])
    
    inline def `setAdjust-layoutUndefined`: Self = StObject.set(x, "adjust-layout", js.undefined)
    
    inline def setAdjustLayout(value: Boolean): Self = StObject.set(x, "adjustLayout", value.asInstanceOf[js.Any])
    
    inline def setAdjustLayoutUndefined: Self = StObject.set(x, "adjustLayout", js.undefined)
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    inline def `setBackground-color-1`(value: String): Self = StObject.set(x, "background-color-1", value.asInstanceOf[js.Any])
    
    inline def `setBackground-color-1Undefined`: Self = StObject.set(x, "background-color-1", js.undefined)
    
    inline def `setBackground-color-2`(value: String): Self = StObject.set(x, "background-color-2", value.asInstanceOf[js.Any])
    
    inline def `setBackground-color-2Undefined`: Self = StObject.set(x, "background-color-2", js.undefined)
    
    inline def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    inline def `setBackground-fit`(value: String): Self = StObject.set(x, "background-fit", value.asInstanceOf[js.Any])
    
    inline def `setBackground-fitUndefined`: Self = StObject.set(x, "background-fit", js.undefined)
    
    inline def `setBackground-image`(value: String): Self = StObject.set(x, "background-image", value.asInstanceOf[js.Any])
    
    inline def `setBackground-imageUndefined`: Self = StObject.set(x, "background-image", js.undefined)
    
    inline def `setBackground-position`(value: String): Self = StObject.set(x, "background-position", value.asInstanceOf[js.Any])
    
    inline def `setBackground-positionUndefined`: Self = StObject.set(x, "background-position", js.undefined)
    
    inline def `setBackground-repeat`(value: String): Self = StObject.set(x, "background-repeat", value.asInstanceOf[js.Any])
    
    inline def `setBackground-repeatUndefined`: Self = StObject.set(x, "background-repeat", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor1(value: String): Self = StObject.set(x, "backgroundColor1", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor1Undefined: Self = StObject.set(x, "backgroundColor1", js.undefined)
    
    inline def setBackgroundColor2(value: String): Self = StObject.set(x, "backgroundColor2", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor2Undefined: Self = StObject.set(x, "backgroundColor2", js.undefined)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundFit(value: String): Self = StObject.set(x, "backgroundFit", value.asInstanceOf[js.Any])
    
    inline def setBackgroundFitUndefined: Self = StObject.set(x, "backgroundFit", js.undefined)
    
    inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setBackgroundPosition(value: String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    inline def setBackgroundRepeat(value: String): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
    
    inline def `setBorder-bottom`(value: String): Self = StObject.set(x, "border-bottom", value.asInstanceOf[js.Any])
    
    inline def `setBorder-bottomUndefined`: Self = StObject.set(x, "border-bottom", js.undefined)
    
    inline def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    inline def `setBorder-left`(value: String): Self = StObject.set(x, "border-left", value.asInstanceOf[js.Any])
    
    inline def `setBorder-leftUndefined`: Self = StObject.set(x, "border-left", js.undefined)
    
    inline def `setBorder-radius`(value: Any): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-bottom-left`(value: Any): Self = StObject.set(x, "border-radius-bottom-left", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-bottom-leftUndefined`: Self = StObject.set(x, "border-radius-bottom-left", js.undefined)
    
    inline def `setBorder-radius-bottom-right`(value: Any): Self = StObject.set(x, "border-radius-bottom-right", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-bottom-rightUndefined`: Self = StObject.set(x, "border-radius-bottom-right", js.undefined)
    
    inline def `setBorder-radius-top-left`(value: Any): Self = StObject.set(x, "border-radius-top-left", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-top-leftUndefined`: Self = StObject.set(x, "border-radius-top-left", js.undefined)
    
    inline def `setBorder-radius-top-right`(value: Any): Self = StObject.set(x, "border-radius-top-right", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-top-rightUndefined`: Self = StObject.set(x, "border-radius-top-right", js.undefined)
    
    inline def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
    
    inline def `setBorder-right`(value: String): Self = StObject.set(x, "border-right", value.asInstanceOf[js.Any])
    
    inline def `setBorder-rightUndefined`: Self = StObject.set(x, "border-right", js.undefined)
    
    inline def `setBorder-top`(value: String): Self = StObject.set(x, "border-top", value.asInstanceOf[js.Any])
    
    inline def `setBorder-topUndefined`: Self = StObject.set(x, "border-top", js.undefined)
    
    inline def `setBorder-width`(value: Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def setBorderBottom(value: String): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderLeft(value: String): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
    inline def setBorderRadius(value: Any): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusBottomLeft(value: Any): Self = StObject.set(x, "borderRadiusBottomLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusBottomLeftUndefined: Self = StObject.set(x, "borderRadiusBottomLeft", js.undefined)
    
    inline def setBorderRadiusBottomRight(value: Any): Self = StObject.set(x, "borderRadiusBottomRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusBottomRightUndefined: Self = StObject.set(x, "borderRadiusBottomRight", js.undefined)
    
    inline def setBorderRadiusTopLeft(value: Any): Self = StObject.set(x, "borderRadiusTopLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusTopLeftUndefined: Self = StObject.set(x, "borderRadiusTopLeft", js.undefined)
    
    inline def setBorderRadiusTopRight(value: Any): Self = StObject.set(x, "borderRadiusTopRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusTopRightUndefined: Self = StObject.set(x, "borderRadiusTopRight", js.undefined)
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderRight(value: String): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    inline def setBorderTop(value: String): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    inline def setBorderWidth(value: Any): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setCallout(value: Boolean): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def `setCallout-extension`(value: Any): Self = StObject.set(x, "callout-extension", value.asInstanceOf[js.Any])
    
    inline def `setCallout-extensionUndefined`: Self = StObject.set(x, "callout-extension", js.undefined)
    
    inline def `setCallout-height`(value: Any): Self = StObject.set(x, "callout-height", value.asInstanceOf[js.Any])
    
    inline def `setCallout-heightUndefined`: Self = StObject.set(x, "callout-height", js.undefined)
    
    inline def `setCallout-hook`(value: Any): Self = StObject.set(x, "callout-hook", value.asInstanceOf[js.Any])
    
    inline def `setCallout-hookUndefined`: Self = StObject.set(x, "callout-hook", js.undefined)
    
    inline def `setCallout-offset`(value: Any): Self = StObject.set(x, "callout-offset", value.asInstanceOf[js.Any])
    
    inline def `setCallout-offsetUndefined`: Self = StObject.set(x, "callout-offset", js.undefined)
    
    inline def `setCallout-position`(value: String): Self = StObject.set(x, "callout-position", value.asInstanceOf[js.Any])
    
    inline def `setCallout-positionUndefined`: Self = StObject.set(x, "callout-position", js.undefined)
    
    inline def `setCallout-width`(value: Any): Self = StObject.set(x, "callout-width", value.asInstanceOf[js.Any])
    
    inline def `setCallout-widthUndefined`: Self = StObject.set(x, "callout-width", js.undefined)
    
    inline def setCalloutExtension(value: Any): Self = StObject.set(x, "calloutExtension", value.asInstanceOf[js.Any])
    
    inline def setCalloutExtensionUndefined: Self = StObject.set(x, "calloutExtension", js.undefined)
    
    inline def setCalloutHeight(value: Any): Self = StObject.set(x, "calloutHeight", value.asInstanceOf[js.Any])
    
    inline def setCalloutHeightUndefined: Self = StObject.set(x, "calloutHeight", js.undefined)
    
    inline def setCalloutHook(value: Any): Self = StObject.set(x, "calloutHook", value.asInstanceOf[js.Any])
    
    inline def setCalloutHookUndefined: Self = StObject.set(x, "calloutHook", js.undefined)
    
    inline def setCalloutOffset(value: Any): Self = StObject.set(x, "calloutOffset", value.asInstanceOf[js.Any])
    
    inline def setCalloutOffsetUndefined: Self = StObject.set(x, "calloutOffset", js.undefined)
    
    inline def setCalloutPosition(value: String): Self = StObject.set(x, "calloutPosition", value.asInstanceOf[js.Any])
    
    inline def setCalloutPositionUndefined: Self = StObject.set(x, "calloutPosition", js.undefined)
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setCalloutWidth(value: Any): Self = StObject.set(x, "calloutWidth", value.asInstanceOf[js.Any])
    
    inline def setCalloutWidthUndefined: Self = StObject.set(x, "calloutWidth", js.undefined)
    
    inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def `setDrag-handler`(value: String): Self = StObject.set(x, "drag-handler", value.asInstanceOf[js.Any])
    
    inline def `setDrag-handlerUndefined`: Self = StObject.set(x, "drag-handler", js.undefined)
    
    inline def setDragHandler(value: String): Self = StObject.set(x, "dragHandler", value.asInstanceOf[js.Any])
    
    inline def setDragHandlerUndefined: Self = StObject.set(x, "dragHandler", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def `setFill-angle`(value: Double): Self = StObject.set(x, "fill-angle", value.asInstanceOf[js.Any])
    
    inline def `setFill-angleUndefined`: Self = StObject.set(x, "fill-angle", js.undefined)
    
    inline def `setFill-offset-x`(value: Any): Self = StObject.set(x, "fill-offset-x", value.asInstanceOf[js.Any])
    
    inline def `setFill-offset-xUndefined`: Self = StObject.set(x, "fill-offset-x", js.undefined)
    
    inline def `setFill-offset-y`(value: Any): Self = StObject.set(x, "fill-offset-y", value.asInstanceOf[js.Any])
    
    inline def `setFill-offset-yUndefined`: Self = StObject.set(x, "fill-offset-y", js.undefined)
    
    inline def `setFill-type`(value: String): Self = StObject.set(x, "fill-type", value.asInstanceOf[js.Any])
    
    inline def `setFill-typeUndefined`: Self = StObject.set(x, "fill-type", js.undefined)
    
    inline def setFillAngle(value: Double): Self = StObject.set(x, "fillAngle", value.asInstanceOf[js.Any])
    
    inline def setFillAngleUndefined: Self = StObject.set(x, "fillAngle", js.undefined)
    
    inline def setFillOffsetX(value: Any): Self = StObject.set(x, "fillOffsetX", value.asInstanceOf[js.Any])
    
    inline def setFillOffsetXUndefined: Self = StObject.set(x, "fillOffsetX", js.undefined)
    
    inline def setFillOffsetY(value: Any): Self = StObject.set(x, "fillOffsetY", value.asInstanceOf[js.Any])
    
    inline def setFillOffsetYUndefined: Self = StObject.set(x, "fillOffsetY", js.undefined)
    
    inline def setFillType(value: String): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
    
    inline def setFillTypeUndefined: Self = StObject.set(x, "fillType", js.undefined)
    
    inline def setFooter(value: Backgroundcolor2): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def `setGradient-colors`(value: String): Self = StObject.set(x, "gradient-colors", value.asInstanceOf[js.Any])
    
    inline def `setGradient-colorsUndefined`: Self = StObject.set(x, "gradient-colors", js.undefined)
    
    inline def `setGradient-stops`(value: String): Self = StObject.set(x, "gradient-stops", value.asInstanceOf[js.Any])
    
    inline def `setGradient-stopsUndefined`: Self = StObject.set(x, "gradient-stops", js.undefined)
    
    inline def setGradientColors(value: String): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
    
    inline def setGradientColorsUndefined: Self = StObject.set(x, "gradientColors", js.undefined)
    
    inline def setGradientStops(value: String): Self = StObject.set(x, "gradientStops", value.asInstanceOf[js.Any])
    
    inline def setGradientStopsUndefined: Self = StObject.set(x, "gradientStops", js.undefined)
    
    inline def setHeader(value: Backgroundfit): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def `setHighlight-plot`(value: Boolean): Self = StObject.set(x, "highlight-plot", value.asInstanceOf[js.Any])
    
    inline def `setHighlight-plotUndefined`: Self = StObject.set(x, "highlight-plot", js.undefined)
    
    inline def setHighlightPlot(value: Boolean): Self = StObject.set(x, "highlightPlot", value.asInstanceOf[js.Any])
    
    inline def setHighlightPlotUndefined: Self = StObject.set(x, "highlightPlot", js.undefined)
    
    inline def setIcon(value: OffsetX): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setItem(value: Backgroundimage): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def `setItem-off`(value: itemOff): Self = StObject.set(x, "item-off", value.asInstanceOf[js.Any])
    
    inline def `setItem-offUndefined`: Self = StObject.set(x, "item-off", js.undefined)
    
    inline def setItemOff(value: itemOff): Self = StObject.set(x, "itemOff", value.asInstanceOf[js.Any])
    
    inline def setItemOffUndefined: Self = StObject.set(x, "itemOff", js.undefined)
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMargin(value: Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def `setMargin-bottom`(value: Any): Self = StObject.set(x, "margin-bottom", value.asInstanceOf[js.Any])
    
    inline def `setMargin-bottomUndefined`: Self = StObject.set(x, "margin-bottom", js.undefined)
    
    inline def `setMargin-left`(value: Any): Self = StObject.set(x, "margin-left", value.asInstanceOf[js.Any])
    
    inline def `setMargin-leftUndefined`: Self = StObject.set(x, "margin-left", js.undefined)
    
    inline def `setMargin-right`(value: Any): Self = StObject.set(x, "margin-right", value.asInstanceOf[js.Any])
    
    inline def `setMargin-rightUndefined`: Self = StObject.set(x, "margin-right", js.undefined)
    
    inline def `setMargin-top`(value: Any): Self = StObject.set(x, "margin-top", value.asInstanceOf[js.Any])
    
    inline def `setMargin-topUndefined`: Self = StObject.set(x, "margin-top", js.undefined)
    
    inline def setMarginBottom(value: Any): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginLeft(value: Any): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginRight(value: Any): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginTop(value: Any): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarker(value: Backgroundposition): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def `setMax-items`(value: Double): Self = StObject.set(x, "max-items", value.asInstanceOf[js.Any])
    
    inline def `setMax-itemsUndefined`: Self = StObject.set(x, "max-items", js.undefined)
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
    
    inline def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
    
    inline def `setOffset-x`(value: Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    inline def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    inline def `setOffset-y`(value: Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    inline def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    inline def setOffsetX(value: Any): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Any): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def `setPage-off`(value: pageOff): Self = StObject.set(x, "page-off", value.asInstanceOf[js.Any])
    
    inline def `setPage-offUndefined`: Self = StObject.set(x, "page-off", js.undefined)
    
    inline def `setPage-on`(value: pageOn): Self = StObject.set(x, "page-on", value.asInstanceOf[js.Any])
    
    inline def `setPage-onUndefined`: Self = StObject.set(x, "page-on", js.undefined)
    
    inline def `setPage-status`(value: pageStatus): Self = StObject.set(x, "page-status", value.asInstanceOf[js.Any])
    
    inline def `setPage-statusUndefined`: Self = StObject.set(x, "page-status", js.undefined)
    
    inline def setPageOff(value: pageOff): Self = StObject.set(x, "pageOff", value.asInstanceOf[js.Any])
    
    inline def setPageOffUndefined: Self = StObject.set(x, "pageOff", js.undefined)
    
    inline def setPageOn(value: pageOn): Self = StObject.set(x, "pageOn", value.asInstanceOf[js.Any])
    
    inline def setPageOnUndefined: Self = StObject.set(x, "pageOn", js.undefined)
    
    inline def setPageStatus(value: pageStatus): Self = StObject.set(x, "pageStatus", value.asInstanceOf[js.Any])
    
    inline def setPageStatusUndefined: Self = StObject.set(x, "pageStatus", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def `setReverse-series`(value: Boolean): Self = StObject.set(x, "reverse-series", value.asInstanceOf[js.Any])
    
    inline def `setReverse-seriesUndefined`: Self = StObject.set(x, "reverse-series", js.undefined)
    
    inline def setReverseSeries(value: Boolean): Self = StObject.set(x, "reverseSeries", value.asInstanceOf[js.Any])
    
    inline def setReverseSeriesUndefined: Self = StObject.set(x, "reverseSeries", js.undefined)
    
    inline def setScroll(value: Bar): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def `setShadow-alpha`(value: Double): Self = StObject.set(x, "shadow-alpha", value.asInstanceOf[js.Any])
    
    inline def `setShadow-alphaUndefined`: Self = StObject.set(x, "shadow-alpha", js.undefined)
    
    inline def `setShadow-angle`(value: Double): Self = StObject.set(x, "shadow-angle", value.asInstanceOf[js.Any])
    
    inline def `setShadow-angleUndefined`: Self = StObject.set(x, "shadow-angle", js.undefined)
    
    inline def `setShadow-blur`(value: Any): Self = StObject.set(x, "shadow-blur", value.asInstanceOf[js.Any])
    
    inline def `setShadow-blurUndefined`: Self = StObject.set(x, "shadow-blur", js.undefined)
    
    inline def `setShadow-color`(value: String): Self = StObject.set(x, "shadow-color", value.asInstanceOf[js.Any])
    
    inline def `setShadow-colorUndefined`: Self = StObject.set(x, "shadow-color", js.undefined)
    
    inline def `setShadow-distance`(value: Any): Self = StObject.set(x, "shadow-distance", value.asInstanceOf[js.Any])
    
    inline def `setShadow-distanceUndefined`: Self = StObject.set(x, "shadow-distance", js.undefined)
    
    inline def setShadowAlpha(value: Double): Self = StObject.set(x, "shadowAlpha", value.asInstanceOf[js.Any])
    
    inline def setShadowAlphaUndefined: Self = StObject.set(x, "shadowAlpha", js.undefined)
    
    inline def setShadowAngle(value: Double): Self = StObject.set(x, "shadowAngle", value.asInstanceOf[js.Any])
    
    inline def setShadowAngleUndefined: Self = StObject.set(x, "shadowAngle", js.undefined)
    
    inline def setShadowBlur(value: Any): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowDistance(value: Any): Self = StObject.set(x, "shadowDistance", value.asInstanceOf[js.Any])
    
    inline def setShadowDistanceUndefined: Self = StObject.set(x, "shadowDistance", js.undefined)
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setShared(value: Any): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def `setToggle-action`(value: String): Self = StObject.set(x, "toggle-action", value.asInstanceOf[js.Any])
    
    inline def `setToggle-actionUndefined`: Self = StObject.set(x, "toggle-action", js.undefined)
    
    inline def setToggleAction(value: String): Self = StObject.set(x, "toggleAction", value.asInstanceOf[js.Any])
    
    inline def setToggleActionUndefined: Self = StObject.set(x, "toggleAction", js.undefined)
    
    inline def setTooltip(value: tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def `setVertical-align`(value: String): Self = StObject.set(x, "vertical-align", value.asInstanceOf[js.Any])
    
    inline def `setVertical-alignUndefined`: Self = StObject.set(x, "vertical-align", js.undefined)
    
    inline def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
