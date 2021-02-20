package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adjustlayout extends StObject {
  
  /**
    * Forces the plotarea to consider the legend positioning and prevent overlapping with it. true | false | 1 | 0
    */
  var `adjust-layout`: js.UndefOr[Boolean] = js.native
  
  /**
    * Automatically aligns the legend and adjusts "plotarea" margins accordingly. "left" | "center" | "right"
    */
  var align: js.UndefOr[String] = js.native
  
  /**
    * Sets the transparency of the object. The higher the value, the less transparent the object appears. Requires the formatting 0.x. 0
    * .3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g. "red", "blue", "yellow"), in hexadecimal notation (e.
    * g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0,0,255)", "rgb(255,255,0)"). One color will se
    * t a solid background color, two colors will, by default, create a horizontal gradient. For more complex gradients, use gradient-co
    * lors and gradient-stops. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the first color of a 2 color background gradient of the object. To be used with background-color-2. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.native
  
  /**
    * Sets the second color of a 2 color background gradient of the object. To be used with background-color-1. "none" | "transparent" |
    *  "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-2`: js.UndefOr[String] = js.native
  
  /**
    * Sets the direction/s on which the background image is being "stretched". "x" | "y" | "xy"
    */
  var `background-fit`: js.UndefOr[String] = js.native
  
  /**
    * Sets a background image for the object. Value can be a local file or a web image's location. "image.png" | ...
    */
  var `background-image`: js.UndefOr[String] = js.native
  
  /**
    * Sets the position of the background when the background-repeat value is no-repeat. "0 0" | "50 100" | "80% 60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.native
  
  /**
    * Sets the repeating mode for the background image. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.native
  
  /**
    * Sets the object's bottom border style. Accepts solid, dotted, and dashed. Also accepts named colors. If color is not set properly,
    *  will default to black. "2px solid #f00" | ...
    */
  var `border-bottom`: js.UndefOr[String] = js.native
  
  /**
    * Sets the border color of the object, applicable on closed shapes. See also line-color for closed shapes. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the object's left border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-left`: js.UndefOr[String] = js.native
  
  /**
    * Sets the object's border radius, for rounded corners. The higher the value, the more rounded the corners appear. 4 | "6px" | "6px
    * 10px 3px 5px" | "-10px" | ...
    */
  var `border-radius`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's bottom-left border radius, for rounded corners. Larger values create rounder corners, while smaller values creat
    * e sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-left`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's bottom-right border radius, for rounded corners. Larger values create rounder corners, while smaller values crea
    * te sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-right`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's top-left border radius, for rounded corners. Larger values create rounder corners, while smaller values create s
    * harper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-left`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's top-right border radius, for rounded corners. Larger values create rounder corners, while smaller values create
    * sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-right`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's right border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-right`: js.UndefOr[String] = js.native
  
  /**
    * Sets the object's top border style. Values must include the border width, style, and color. Accepts solid, dashed, and dotted styl
    * es. "2px solid #f00" | ...
    */
  var `border-top`: js.UndefOr[String] = js.native
  
  /**
    * Sets the border width of the object, applicable on closed shapes. See also line-width for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets whether an object will have a callout arrow or not. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the length for an extension line off the tip of the callout arrow. 4 | "6px" | ...
    */
  var `callout-extension`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the height of the object's callout arrow. A larger value will create a taller callout arrow. 4 | "6px" | ...
    */
  var `callout-height`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets a location for the point of the tip of the callout arrow. Uses XY coordinates. [200, 50] | ...
    */
  var `callout-hook`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the offset for the origin of the callout arrow. Uses positive or negative values to move the arrow right/left/up/down. 4 | "6
    * px" | ...
    */
  var `callout-offset`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the position for the object's callout arrow. The position is "bottom" by default. "top" | "right" | "bottom" | "left"
    */
  var `callout-position`: js.UndefOr[String] = js.native
  
  /**
    * Sets which edge will be the location for the object's callout arrow. 4 | "6px" | ...
    */
  var `callout-width`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets legend to be collapsed by default true | false | 1 | 0
    */
  var collapse: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the handler used to drag the legend: icon will create a dragging icon on the legend header, which will be the only area on wh
    * ich you can click and drag, header will make the whole header object active for dragging the legend. "header" | "icon"
    */
  var `drag-handler`: js.UndefOr[String] = js.native
  
  /**
    * Sets whether the legend can be dragged or not. true | false | 1 | 0
    */
  var draggable: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.native
  
  /**
    * Sets an X offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-x`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets an Y offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the background gradient fill type to either linear or radial. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.native
  
  var footer: js.UndefOr[Backgroundposition] = js.native
  
  /**
    * Sets a set of colors for a complex background gradient (more than 2 colors). To be used with gradient-stops. "#f00 #0f0 #00f" | ..
    * .
    */
  var `gradient-colors`: js.UndefOr[String] = js.native
  
  /**
    * Sets the position for the introduction of each color for a complex background gradient (more than 2 colors). To be used with gradi
    * ent-colors. "0.1 0.5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.native
  
  var header: js.UndefOr[Backgroundrepeat] = js.native
  
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[js.Any] = js.native
  
  /**
    * An alias for the "highlight" attribute in the "plot" object. Highlights the corresponding plot when the legend item is moused over
    * . true | false | 1 | 0
    */
  var `highlight-plot`: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[Linecolor] = js.native
  
  var item: js.UndefOr[Borderleft] = js.native
  
  var `item-off`: js.UndefOr[Borderbottom] = js.native
  
  /**
    * Sets the layout for the legend items. "horizontal" | "h" | "vertical" | "v" | "row x col" | "x col" | "row x" | "float"
    */
  var layout: js.UndefOr[String] = js.native
  
  /**
    * Sets the object's margin/s from the top-left of the chart. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var margin: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's bottom margin. 4 | "6px" | ...
    */
  var `margin-bottom`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's left margin. 4 | "6px" | ...
    */
  var `margin-left`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's right margin. 4 | "6px" | ...
    */
  var `margin-right`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's top margin. 4 | "6px" | ...
    */
  var `margin-top`: js.UndefOr[js.Any] = js.native
  
  var marker: js.UndefOr[Fillangle] = js.native
  
  /**
    * Sets the maximum number of items displayed on the legend. To be used with overflow. 5 | 10 | ...
    */
  var `max-items`: js.UndefOr[Double] = js.native
  
  /**
    * Sets whether the legend can be minimized or not.
    */
  var minimize: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets an X offset to apply when positioning the legend. A positive value moves the legend to the right. A negative value moves the
    * legend to the left. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets a Y offset to apply when positioning the legend. A positive value moves the legend down. A negative value moves the legend up
    * . 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the display mode for legend items beyond max-items setting: none will display all items, hidden will display just top max-ite
    * ms items, page will enable the pagination module, scrollwill enable legend scrolling, with top max-items items per page. To be use
    * d with max-item. "none" | "hidden" | "page" | "scroll"
    */
  var overflow: js.UndefOr[String] = js.native
  
  var `page-off`: js.UndefOr[Filloffsetx] = js.native
  
  var `page-on`: js.UndefOr[Filloffsetx] = js.native
  
  var `page-status`: js.UndefOr[Bold] = js.native
  
  /**
    * Sets the object's position relative to its container. Similar results can be obtained by setting [margin] and [margin-...] attribu
    * tes. Uses x,y coordinates originating from the top left of the chart.
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * Reverses the items in the legend
    */
  var `reverse-series`: js.UndefOr[Boolean] = js.native
  
  var scroll: js.UndefOr[Bar] = js.native
  
  /**
    * Sets whether the object's shadow is visible or not. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the transparency of the shadow of the object. The higher the value, the less transparent the shadow will be. 0.3 | 0.9 | ...
    */
  var `shadow-alpha`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the angle of the shadow underneath the object. -45 | 115 | ...
    */
  var `shadow-angle`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the blur effect size for the shadow of the object. Has limited effect on HTML5 implementation. 4 | "6px" | ...
    */
  var `shadow-blur`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the color of the shadow of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ..
    * .
    */
  var `shadow-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the distance between the shadow and the object. 4 | "6px" | ...
    */
  var `shadow-distance`: js.UndefOr[js.Any] = js.native
  
  /**
    * For graphsets with multiple chart objects, setting this attribute to true within the legend object of each chart will allow you to
    *  use one legend to toggle data on or off for each chart simultaneously. It should be noted that while each chart must have a legen
    * d object, the visible attribute can be set to false to hide a legend. true | false | 1 | 0
    */
  var shared: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the action performed on legend item toggle: hide will simply hide the respective plot, remove will repaint the chart without
    * considering the respective plot, disabled will not generate any action for the legend items/markers. "hide" | "remove" | "disabled
    * "
    */
  var `toggle-action`: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[Borderalpha] = js.native
  
  /**
    * Automatically aligns the legend and adjusts "plotarea" margins accordingly. "top" | "middle" | "bottom"
    */
  var `vertical-align`: js.UndefOr[String] = js.native
  
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the X position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the Y position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.native
}
object Adjustlayout {
  
  @scala.inline
  def apply(): Adjustlayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Adjustlayout]
  }
  
  @scala.inline
  implicit class AdjustlayoutMutableBuilder[Self <: Adjustlayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAdjust-layout`(value: Boolean): Self = StObject.set(x, "adjust-layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAdjust-layoutUndefined`: Self = StObject.set(x, "adjust-layout", js.undefined)
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-color-1`(value: String): Self = StObject.set(x, "background-color-1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-color-1Undefined`: Self = StObject.set(x, "background-color-1", js.undefined)
    
    @scala.inline
    def `setBackground-color-2`(value: String): Self = StObject.set(x, "background-color-2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-color-2Undefined`: Self = StObject.set(x, "background-color-2", js.undefined)
    
    @scala.inline
    def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    @scala.inline
    def `setBackground-fit`(value: String): Self = StObject.set(x, "background-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-fitUndefined`: Self = StObject.set(x, "background-fit", js.undefined)
    
    @scala.inline
    def `setBackground-image`(value: String): Self = StObject.set(x, "background-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-imageUndefined`: Self = StObject.set(x, "background-image", js.undefined)
    
    @scala.inline
    def `setBackground-position`(value: String): Self = StObject.set(x, "background-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-positionUndefined`: Self = StObject.set(x, "background-position", js.undefined)
    
    @scala.inline
    def `setBackground-repeat`(value: String): Self = StObject.set(x, "background-repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-repeatUndefined`: Self = StObject.set(x, "background-repeat", js.undefined)
    
    @scala.inline
    def `setBorder-bottom`(value: String): Self = StObject.set(x, "border-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-bottomUndefined`: Self = StObject.set(x, "border-bottom", js.undefined)
    
    @scala.inline
    def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    @scala.inline
    def `setBorder-left`(value: String): Self = StObject.set(x, "border-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-leftUndefined`: Self = StObject.set(x, "border-left", js.undefined)
    
    @scala.inline
    def `setBorder-radius`(value: js.Any): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radius-bottom-left`(value: js.Any): Self = StObject.set(x, "border-radius-bottom-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radius-bottom-leftUndefined`: Self = StObject.set(x, "border-radius-bottom-left", js.undefined)
    
    @scala.inline
    def `setBorder-radius-bottom-right`(value: js.Any): Self = StObject.set(x, "border-radius-bottom-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radius-bottom-rightUndefined`: Self = StObject.set(x, "border-radius-bottom-right", js.undefined)
    
    @scala.inline
    def `setBorder-radius-top-left`(value: js.Any): Self = StObject.set(x, "border-radius-top-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radius-top-leftUndefined`: Self = StObject.set(x, "border-radius-top-left", js.undefined)
    
    @scala.inline
    def `setBorder-radius-top-right`(value: js.Any): Self = StObject.set(x, "border-radius-top-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radius-top-rightUndefined`: Self = StObject.set(x, "border-radius-top-right", js.undefined)
    
    @scala.inline
    def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
    
    @scala.inline
    def `setBorder-right`(value: String): Self = StObject.set(x, "border-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-rightUndefined`: Self = StObject.set(x, "border-right", js.undefined)
    
    @scala.inline
    def `setBorder-top`(value: String): Self = StObject.set(x, "border-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-topUndefined`: Self = StObject.set(x, "border-top", js.undefined)
    
    @scala.inline
    def `setBorder-width`(value: js.Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    @scala.inline
    def setCallout(value: Boolean): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-extension`(value: js.Any): Self = StObject.set(x, "callout-extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-extensionUndefined`: Self = StObject.set(x, "callout-extension", js.undefined)
    
    @scala.inline
    def `setCallout-height`(value: js.Any): Self = StObject.set(x, "callout-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-heightUndefined`: Self = StObject.set(x, "callout-height", js.undefined)
    
    @scala.inline
    def `setCallout-hook`(value: js.Any): Self = StObject.set(x, "callout-hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-hookUndefined`: Self = StObject.set(x, "callout-hook", js.undefined)
    
    @scala.inline
    def `setCallout-offset`(value: js.Any): Self = StObject.set(x, "callout-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-offsetUndefined`: Self = StObject.set(x, "callout-offset", js.undefined)
    
    @scala.inline
    def `setCallout-position`(value: String): Self = StObject.set(x, "callout-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-positionUndefined`: Self = StObject.set(x, "callout-position", js.undefined)
    
    @scala.inline
    def `setCallout-width`(value: js.Any): Self = StObject.set(x, "callout-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCallout-widthUndefined`: Self = StObject.set(x, "callout-width", js.undefined)
    
    @scala.inline
    def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    @scala.inline
    def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def `setDrag-handler`(value: String): Self = StObject.set(x, "drag-handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDrag-handlerUndefined`: Self = StObject.set(x, "drag-handler", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def `setFill-angle`(value: Double): Self = StObject.set(x, "fill-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-angleUndefined`: Self = StObject.set(x, "fill-angle", js.undefined)
    
    @scala.inline
    def `setFill-offset-x`(value: js.Any): Self = StObject.set(x, "fill-offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-offset-xUndefined`: Self = StObject.set(x, "fill-offset-x", js.undefined)
    
    @scala.inline
    def `setFill-offset-y`(value: js.Any): Self = StObject.set(x, "fill-offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-offset-yUndefined`: Self = StObject.set(x, "fill-offset-y", js.undefined)
    
    @scala.inline
    def `setFill-type`(value: String): Self = StObject.set(x, "fill-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-typeUndefined`: Self = StObject.set(x, "fill-type", js.undefined)
    
    @scala.inline
    def setFooter(value: Backgroundposition): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def `setGradient-colors`(value: String): Self = StObject.set(x, "gradient-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGradient-colorsUndefined`: Self = StObject.set(x, "gradient-colors", js.undefined)
    
    @scala.inline
    def `setGradient-stops`(value: String): Self = StObject.set(x, "gradient-stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGradient-stopsUndefined`: Self = StObject.set(x, "gradient-stops", js.undefined)
    
    @scala.inline
    def setHeader(value: Backgroundrepeat): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def `setHighlight-plot`(value: Boolean): Self = StObject.set(x, "highlight-plot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHighlight-plotUndefined`: Self = StObject.set(x, "highlight-plot", js.undefined)
    
    @scala.inline
    def setIcon(value: Linecolor): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setItem(value: Borderleft): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setItem-off`(value: Borderbottom): Self = StObject.set(x, "item-off", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setItem-offUndefined`: Self = StObject.set(x, "item-off", js.undefined)
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-bottom`(value: js.Any): Self = StObject.set(x, "margin-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-bottomUndefined`: Self = StObject.set(x, "margin-bottom", js.undefined)
    
    @scala.inline
    def `setMargin-left`(value: js.Any): Self = StObject.set(x, "margin-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-leftUndefined`: Self = StObject.set(x, "margin-left", js.undefined)
    
    @scala.inline
    def `setMargin-right`(value: js.Any): Self = StObject.set(x, "margin-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-rightUndefined`: Self = StObject.set(x, "margin-right", js.undefined)
    
    @scala.inline
    def `setMargin-top`(value: js.Any): Self = StObject.set(x, "margin-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-topUndefined`: Self = StObject.set(x, "margin-top", js.undefined)
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarker(value: Fillangle): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def `setMax-items`(value: Double): Self = StObject.set(x, "max-items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-itemsUndefined`: Self = StObject.set(x, "max-items", js.undefined)
    
    @scala.inline
    def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
    
    @scala.inline
    def `setOffset-x`(value: js.Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    @scala.inline
    def `setOffset-y`(value: js.Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    @scala.inline
    def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def `setPage-off`(value: Filloffsetx): Self = StObject.set(x, "page-off", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage-offUndefined`: Self = StObject.set(x, "page-off", js.undefined)
    
    @scala.inline
    def `setPage-on`(value: Filloffsetx): Self = StObject.set(x, "page-on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage-onUndefined`: Self = StObject.set(x, "page-on", js.undefined)
    
    @scala.inline
    def `setPage-status`(value: Bold): Self = StObject.set(x, "page-status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage-statusUndefined`: Self = StObject.set(x, "page-status", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def `setReverse-series`(value: Boolean): Self = StObject.set(x, "reverse-series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setReverse-seriesUndefined`: Self = StObject.set(x, "reverse-series", js.undefined)
    
    @scala.inline
    def setScroll(value: Bar): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-alpha`(value: Double): Self = StObject.set(x, "shadow-alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-alphaUndefined`: Self = StObject.set(x, "shadow-alpha", js.undefined)
    
    @scala.inline
    def `setShadow-angle`(value: Double): Self = StObject.set(x, "shadow-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-angleUndefined`: Self = StObject.set(x, "shadow-angle", js.undefined)
    
    @scala.inline
    def `setShadow-blur`(value: js.Any): Self = StObject.set(x, "shadow-blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-blurUndefined`: Self = StObject.set(x, "shadow-blur", js.undefined)
    
    @scala.inline
    def `setShadow-color`(value: String): Self = StObject.set(x, "shadow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-colorUndefined`: Self = StObject.set(x, "shadow-color", js.undefined)
    
    @scala.inline
    def `setShadow-distance`(value: js.Any): Self = StObject.set(x, "shadow-distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-distanceUndefined`: Self = StObject.set(x, "shadow-distance", js.undefined)
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setShared(value: js.Any): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def `setToggle-action`(value: String): Self = StObject.set(x, "toggle-action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setToggle-actionUndefined`: Self = StObject.set(x, "toggle-action", js.undefined)
    
    @scala.inline
    def setTooltip(value: Borderalpha): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def `setVertical-align`(value: String): Self = StObject.set(x, "vertical-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setVertical-alignUndefined`: Self = StObject.set(x, "vertical-align", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: js.Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
