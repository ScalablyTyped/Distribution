package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adjustlayout extends js.Object {
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
  implicit class AdjustlayoutOps[Self <: Adjustlayout] (val x: Self) extends AnyVal {
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
    def `setAdjust-layout`(value: Boolean): Self = this.set("adjust-layout", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAdjust-layout`: Self = this.set("adjust-layout", js.undefined)
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def `setBackground-color`(value: String): Self = this.set("background-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-color`: Self = this.set("background-color", js.undefined)
    @scala.inline
    def `setBackground-color-1`(value: String): Self = this.set("background-color-1", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-color-1`: Self = this.set("background-color-1", js.undefined)
    @scala.inline
    def `setBackground-color-2`(value: String): Self = this.set("background-color-2", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-color-2`: Self = this.set("background-color-2", js.undefined)
    @scala.inline
    def `setBackground-fit`(value: String): Self = this.set("background-fit", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-fit`: Self = this.set("background-fit", js.undefined)
    @scala.inline
    def `setBackground-image`(value: String): Self = this.set("background-image", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-image`: Self = this.set("background-image", js.undefined)
    @scala.inline
    def `setBackground-position`(value: String): Self = this.set("background-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-position`: Self = this.set("background-position", js.undefined)
    @scala.inline
    def `setBackground-repeat`(value: String): Self = this.set("background-repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-repeat`: Self = this.set("background-repeat", js.undefined)
    @scala.inline
    def `setBorder-bottom`(value: String): Self = this.set("border-bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-bottom`: Self = this.set("border-bottom", js.undefined)
    @scala.inline
    def `setBorder-color`(value: String): Self = this.set("border-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-color`: Self = this.set("border-color", js.undefined)
    @scala.inline
    def `setBorder-left`(value: String): Self = this.set("border-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-left`: Self = this.set("border-left", js.undefined)
    @scala.inline
    def `setBorder-radius`(value: js.Any): Self = this.set("border-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-radius`: Self = this.set("border-radius", js.undefined)
    @scala.inline
    def `setBorder-radius-bottom-left`(value: js.Any): Self = this.set("border-radius-bottom-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-radius-bottom-left`: Self = this.set("border-radius-bottom-left", js.undefined)
    @scala.inline
    def `setBorder-radius-bottom-right`(value: js.Any): Self = this.set("border-radius-bottom-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-radius-bottom-right`: Self = this.set("border-radius-bottom-right", js.undefined)
    @scala.inline
    def `setBorder-radius-top-left`(value: js.Any): Self = this.set("border-radius-top-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-radius-top-left`: Self = this.set("border-radius-top-left", js.undefined)
    @scala.inline
    def `setBorder-radius-top-right`(value: js.Any): Self = this.set("border-radius-top-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-radius-top-right`: Self = this.set("border-radius-top-right", js.undefined)
    @scala.inline
    def `setBorder-right`(value: String): Self = this.set("border-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-right`: Self = this.set("border-right", js.undefined)
    @scala.inline
    def `setBorder-top`(value: String): Self = this.set("border-top", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-top`: Self = this.set("border-top", js.undefined)
    @scala.inline
    def `setBorder-width`(value: js.Any): Self = this.set("border-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-width`: Self = this.set("border-width", js.undefined)
    @scala.inline
    def setCallout(value: Boolean): Self = this.set("callout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallout: Self = this.set("callout", js.undefined)
    @scala.inline
    def `setCallout-extension`(value: js.Any): Self = this.set("callout-extension", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCallout-extension`: Self = this.set("callout-extension", js.undefined)
    @scala.inline
    def `setCallout-height`(value: js.Any): Self = this.set("callout-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCallout-height`: Self = this.set("callout-height", js.undefined)
    @scala.inline
    def `setCallout-hook`(value: js.Any): Self = this.set("callout-hook", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCallout-hook`: Self = this.set("callout-hook", js.undefined)
    @scala.inline
    def `setCallout-offset`(value: js.Any): Self = this.set("callout-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCallout-offset`: Self = this.set("callout-offset", js.undefined)
    @scala.inline
    def `setCallout-position`(value: String): Self = this.set("callout-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCallout-position`: Self = this.set("callout-position", js.undefined)
    @scala.inline
    def `setCallout-width`(value: js.Any): Self = this.set("callout-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCallout-width`: Self = this.set("callout-width", js.undefined)
    @scala.inline
    def setCollapse(value: Boolean): Self = this.set("collapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def `setDrag-handler`(value: String): Self = this.set("drag-handler", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDrag-handler`: Self = this.set("drag-handler", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def `setFill-angle`(value: Double): Self = this.set("fill-angle", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-angle`: Self = this.set("fill-angle", js.undefined)
    @scala.inline
    def `setFill-offset-x`(value: js.Any): Self = this.set("fill-offset-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-offset-x`: Self = this.set("fill-offset-x", js.undefined)
    @scala.inline
    def `setFill-offset-y`(value: js.Any): Self = this.set("fill-offset-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-offset-y`: Self = this.set("fill-offset-y", js.undefined)
    @scala.inline
    def `setFill-type`(value: String): Self = this.set("fill-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-type`: Self = this.set("fill-type", js.undefined)
    @scala.inline
    def setFooter(value: Backgroundposition): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def `setGradient-colors`(value: String): Self = this.set("gradient-colors", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGradient-colors`: Self = this.set("gradient-colors", js.undefined)
    @scala.inline
    def `setGradient-stops`(value: String): Self = this.set("gradient-stops", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGradient-stops`: Self = this.set("gradient-stops", js.undefined)
    @scala.inline
    def setHeader(value: Backgroundrepeat): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def `setHighlight-plot`(value: Boolean): Self = this.set("highlight-plot", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHighlight-plot`: Self = this.set("highlight-plot", js.undefined)
    @scala.inline
    def setIcon(value: Linecolor): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setItem(value: Borderleft): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def `setItem-off`(value: Borderbottom): Self = this.set("item-off", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteItem-off`: Self = this.set("item-off", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def `setMargin-bottom`(value: js.Any): Self = this.set("margin-bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-bottom`: Self = this.set("margin-bottom", js.undefined)
    @scala.inline
    def `setMargin-left`(value: js.Any): Self = this.set("margin-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-left`: Self = this.set("margin-left", js.undefined)
    @scala.inline
    def `setMargin-right`(value: js.Any): Self = this.set("margin-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-right`: Self = this.set("margin-right", js.undefined)
    @scala.inline
    def `setMargin-top`(value: js.Any): Self = this.set("margin-top", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-top`: Self = this.set("margin-top", js.undefined)
    @scala.inline
    def setMarker(value: Fillangle): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def `setMax-items`(value: Double): Self = this.set("max-items", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-items`: Self = this.set("max-items", js.undefined)
    @scala.inline
    def setMinimize(value: Boolean): Self = this.set("minimize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimize: Self = this.set("minimize", js.undefined)
    @scala.inline
    def `setOffset-x`(value: js.Any): Self = this.set("offset-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-x`: Self = this.set("offset-x", js.undefined)
    @scala.inline
    def `setOffset-y`(value: js.Any): Self = this.set("offset-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-y`: Self = this.set("offset-y", js.undefined)
    @scala.inline
    def setOverflow(value: String): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def `setPage-off`(value: Filloffsetx): Self = this.set("page-off", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-off`: Self = this.set("page-off", js.undefined)
    @scala.inline
    def `setPage-on`(value: Filloffsetx): Self = this.set("page-on", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-on`: Self = this.set("page-on", js.undefined)
    @scala.inline
    def `setPage-status`(value: Bold): Self = this.set("page-status", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-status`: Self = this.set("page-status", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def `setReverse-series`(value: Boolean): Self = this.set("reverse-series", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteReverse-series`: Self = this.set("reverse-series", js.undefined)
    @scala.inline
    def setScroll(value: Bar): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def `setShadow-alpha`(value: Double): Self = this.set("shadow-alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShadow-alpha`: Self = this.set("shadow-alpha", js.undefined)
    @scala.inline
    def `setShadow-angle`(value: Double): Self = this.set("shadow-angle", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShadow-angle`: Self = this.set("shadow-angle", js.undefined)
    @scala.inline
    def `setShadow-blur`(value: js.Any): Self = this.set("shadow-blur", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShadow-blur`: Self = this.set("shadow-blur", js.undefined)
    @scala.inline
    def `setShadow-color`(value: String): Self = this.set("shadow-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShadow-color`: Self = this.set("shadow-color", js.undefined)
    @scala.inline
    def `setShadow-distance`(value: js.Any): Self = this.set("shadow-distance", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShadow-distance`: Self = this.set("shadow-distance", js.undefined)
    @scala.inline
    def setShared(value: js.Any): Self = this.set("shared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    @scala.inline
    def `setToggle-action`(value: String): Self = this.set("toggle-action", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteToggle-action`: Self = this.set("toggle-action", js.undefined)
    @scala.inline
    def setTooltip(value: Borderalpha): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def `setVertical-align`(value: String): Self = this.set("vertical-align", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteVertical-align`: Self = this.set("vertical-align", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: js.Any): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: js.Any): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

