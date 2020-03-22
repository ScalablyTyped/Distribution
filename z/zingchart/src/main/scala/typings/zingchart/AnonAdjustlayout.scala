package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdjustlayout extends js.Object {
  /**
    * Forces the plotarea to consider the legend positioning and prevent overlapping with it. true | false | 1 | 0
    */
  var `adjust-layout`: js.UndefOr[Boolean] = js.undefined
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
  var `border-radius`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's bottom-left border radius, for rounded corners. Larger values create rounder corners, while smaller values creat
    * e sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's bottom-right border radius, for rounded corners. Larger values create rounder corners, while smaller values crea
    * te sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-right`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's top-left border radius, for rounded corners. Larger values create rounder corners, while smaller values create s
    * harper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's top-right border radius, for rounded corners. Larger values create rounder corners, while smaller values create
    * sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-right`: js.UndefOr[js.Any] = js.undefined
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
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets whether an object will have a callout arrow or not. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the length for an extension line off the tip of the callout arrow. 4 | "6px" | ...
    */
  var `callout-extension`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the height of the object's callout arrow. A larger value will create a taller callout arrow. 4 | "6px" | ...
    */
  var `callout-height`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets a location for the point of the tip of the callout arrow. Uses XY coordinates. [200, 50] | ...
    */
  var `callout-hook`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the offset for the origin of the callout arrow. Uses positive or negative values to move the arrow right/left/up/down. 4 | "6
    * px" | ...
    */
  var `callout-offset`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the position for the object's callout arrow. The position is "bottom" by default. "top" | "right" | "bottom" | "left"
    */
  var `callout-position`: js.UndefOr[String] = js.undefined
  /**
    * Sets which edge will be the location for the object's callout arrow. 4 | "6px" | ...
    */
  var `callout-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets legend to be collapsed by default true | false | 1 | 0
    */
  var collapse: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the handler used to drag the legend: icon will create a dragging icon on the legend header, which will be the only area on wh
    * ich you can click and drag, header will make the whole header object active for dragging the legend. "header" | "icon"
    */
  var `drag-handler`: js.UndefOr[String] = js.undefined
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
  var `fill-offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets an Y offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the background gradient fill type to either linear or radial. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[AnonBackgroundposition] = js.undefined
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
  var header: js.UndefOr[AnonBackgroundrepeat] = js.undefined
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[js.Any] = js.undefined
  /**
    * An alias for the "highlight" attribute in the "plot" object. Highlights the corresponding plot when the legend item is moused over
    * . true | false | 1 | 0
    */
  var `highlight-plot`: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[AnonLinecolor] = js.undefined
  var item: js.UndefOr[AnonBorderleft] = js.undefined
  var `item-off`: js.UndefOr[AnonBorderbottom] = js.undefined
  /**
    * Sets the layout for the legend items. "horizontal" | "h" | "vertical" | "v" | "row x col" | "x col" | "row x" | "float"
    */
  var layout: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's margin/s from the top-left of the chart. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's bottom margin. 4 | "6px" | ...
    */
  var `margin-bottom`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's left margin. 4 | "6px" | ...
    */
  var `margin-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's right margin. 4 | "6px" | ...
    */
  var `margin-right`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's top margin. 4 | "6px" | ...
    */
  var `margin-top`: js.UndefOr[js.Any] = js.undefined
  var marker: js.UndefOr[AnonFillangle] = js.undefined
  /**
    * Sets the maximum number of items displayed on the legend. To be used with overflow. 5 | 10 | ...
    */
  var `max-items`: js.UndefOr[Double] = js.undefined
  /**
    * Sets whether the legend can be minimized or not.
    */
  var minimize: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets an X offset to apply when positioning the legend. A positive value moves the legend to the right. A negative value moves the
    * legend to the left. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets a Y offset to apply when positioning the legend. A positive value moves the legend down. A negative value moves the legend up
    * . 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the display mode for legend items beyond max-items setting: none will display all items, hidden will display just top max-ite
    * ms items, page will enable the pagination module, scrollwill enable legend scrolling, with top max-items items per page. To be use
    * d with max-item. "none" | "hidden" | "page" | "scroll"
    */
  var overflow: js.UndefOr[String] = js.undefined
  var `page-off`: js.UndefOr[AnonFilloffsetx] = js.undefined
  var `page-on`: js.UndefOr[AnonFilloffsetx] = js.undefined
  var `page-status`: js.UndefOr[AnonBold] = js.undefined
  /**
    * Sets the object's position relative to its container. Similar results can be obtained by setting [margin] and [margin-...] attribu
    * tes. Uses x,y coordinates originating from the top left of the chart.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * Reverses the items in the legend
    */
  var `reverse-series`: js.UndefOr[Boolean] = js.undefined
  var scroll: js.UndefOr[AnonBar] = js.undefined
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
  var `shadow-blur`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the color of the shadow of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ..
    * .
    */
  var `shadow-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the distance between the shadow and the object. 4 | "6px" | ...
    */
  var `shadow-distance`: js.UndefOr[js.Any] = js.undefined
  /**
    * For graphsets with multiple chart objects, setting this attribute to true within the legend object of each chart will allow you to
    *  use one legend to toggle data on or off for each chart simultaneously. It should be noted that while each chart must have a legen
    * d object, the visible attribute can be set to false to hide a legend. true | false | 1 | 0
    */
  var shared: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the action performed on legend item toggle: hide will simply hide the respective plot, remove will repaint the chart without
    * considering the respective plot, disabled will not generate any action for the legend items/markers. "hide" | "remove" | "disabled
    * "
    */
  var `toggle-action`: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[AnonBorderalpha] = js.undefined
  /**
    * Automatically aligns the legend and adjusts "plotarea" margins accordingly. "top" | "middle" | "bottom"
    */
  var `vertical-align`: js.UndefOr[String] = js.undefined
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the X position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the Y position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.undefined
}

object AnonAdjustlayout {
  @scala.inline
  def apply(
    `adjust-layout`: js.UndefOr[Boolean] = js.undefined,
    align: String = null,
    alpha: Int | Double = null,
    `background-color`: String = null,
    `background-color-1`: String = null,
    `background-color-2`: String = null,
    `background-fit`: String = null,
    `background-image`: String = null,
    `background-position`: String = null,
    `background-repeat`: String = null,
    `border-bottom`: String = null,
    `border-color`: String = null,
    `border-left`: String = null,
    `border-radius`: js.Any = null,
    `border-radius-bottom-left`: js.Any = null,
    `border-radius-bottom-right`: js.Any = null,
    `border-radius-top-left`: js.Any = null,
    `border-radius-top-right`: js.Any = null,
    `border-right`: String = null,
    `border-top`: String = null,
    `border-width`: js.Any = null,
    callout: js.UndefOr[Boolean] = js.undefined,
    `callout-extension`: js.Any = null,
    `callout-height`: js.Any = null,
    `callout-hook`: js.Any = null,
    `callout-offset`: js.Any = null,
    `callout-position`: String = null,
    `callout-width`: js.Any = null,
    collapse: js.UndefOr[Boolean] = js.undefined,
    `drag-handler`: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    `fill-angle`: Int | Double = null,
    `fill-offset-x`: js.Any = null,
    `fill-offset-y`: js.Any = null,
    `fill-type`: String = null,
    footer: AnonBackgroundposition = null,
    `gradient-colors`: String = null,
    `gradient-stops`: String = null,
    header: AnonBackgroundrepeat = null,
    height: js.Any = null,
    `highlight-plot`: js.UndefOr[Boolean] = js.undefined,
    icon: AnonLinecolor = null,
    item: AnonBorderleft = null,
    `item-off`: AnonBorderbottom = null,
    layout: String = null,
    margin: js.Any = null,
    `margin-bottom`: js.Any = null,
    `margin-left`: js.Any = null,
    `margin-right`: js.Any = null,
    `margin-top`: js.Any = null,
    marker: AnonFillangle = null,
    `max-items`: Int | Double = null,
    minimize: js.UndefOr[Boolean] = js.undefined,
    `offset-x`: js.Any = null,
    `offset-y`: js.Any = null,
    overflow: String = null,
    `page-off`: AnonFilloffsetx = null,
    `page-on`: AnonFilloffsetx = null,
    `page-status`: AnonBold = null,
    position: String = null,
    `reverse-series`: js.UndefOr[Boolean] = js.undefined,
    scroll: AnonBar = null,
    shadow: js.UndefOr[Boolean] = js.undefined,
    `shadow-alpha`: Int | Double = null,
    `shadow-angle`: Int | Double = null,
    `shadow-blur`: js.Any = null,
    `shadow-color`: String = null,
    `shadow-distance`: js.Any = null,
    shared: js.Any = null,
    `toggle-action`: String = null,
    tooltip: AnonBorderalpha = null,
    `vertical-align`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.Any = null,
    x: js.Any = null,
    y: js.Any = null
  ): AnonAdjustlayout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`adjust-layout`)) __obj.updateDynamic("adjust-layout")(`adjust-layout`.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`background-color-1` != null) __obj.updateDynamic("background-color-1")(`background-color-1`.asInstanceOf[js.Any])
    if (`background-color-2` != null) __obj.updateDynamic("background-color-2")(`background-color-2`.asInstanceOf[js.Any])
    if (`background-fit` != null) __obj.updateDynamic("background-fit")(`background-fit`.asInstanceOf[js.Any])
    if (`background-image` != null) __obj.updateDynamic("background-image")(`background-image`.asInstanceOf[js.Any])
    if (`background-position` != null) __obj.updateDynamic("background-position")(`background-position`.asInstanceOf[js.Any])
    if (`background-repeat` != null) __obj.updateDynamic("background-repeat")(`background-repeat`.asInstanceOf[js.Any])
    if (`border-bottom` != null) __obj.updateDynamic("border-bottom")(`border-bottom`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-left` != null) __obj.updateDynamic("border-left")(`border-left`.asInstanceOf[js.Any])
    if (`border-radius` != null) __obj.updateDynamic("border-radius")(`border-radius`.asInstanceOf[js.Any])
    if (`border-radius-bottom-left` != null) __obj.updateDynamic("border-radius-bottom-left")(`border-radius-bottom-left`.asInstanceOf[js.Any])
    if (`border-radius-bottom-right` != null) __obj.updateDynamic("border-radius-bottom-right")(`border-radius-bottom-right`.asInstanceOf[js.Any])
    if (`border-radius-top-left` != null) __obj.updateDynamic("border-radius-top-left")(`border-radius-top-left`.asInstanceOf[js.Any])
    if (`border-radius-top-right` != null) __obj.updateDynamic("border-radius-top-right")(`border-radius-top-right`.asInstanceOf[js.Any])
    if (`border-right` != null) __obj.updateDynamic("border-right")(`border-right`.asInstanceOf[js.Any])
    if (`border-top` != null) __obj.updateDynamic("border-top")(`border-top`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (!js.isUndefined(callout)) __obj.updateDynamic("callout")(callout.asInstanceOf[js.Any])
    if (`callout-extension` != null) __obj.updateDynamic("callout-extension")(`callout-extension`.asInstanceOf[js.Any])
    if (`callout-height` != null) __obj.updateDynamic("callout-height")(`callout-height`.asInstanceOf[js.Any])
    if (`callout-hook` != null) __obj.updateDynamic("callout-hook")(`callout-hook`.asInstanceOf[js.Any])
    if (`callout-offset` != null) __obj.updateDynamic("callout-offset")(`callout-offset`.asInstanceOf[js.Any])
    if (`callout-position` != null) __obj.updateDynamic("callout-position")(`callout-position`.asInstanceOf[js.Any])
    if (`callout-width` != null) __obj.updateDynamic("callout-width")(`callout-width`.asInstanceOf[js.Any])
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (`drag-handler` != null) __obj.updateDynamic("drag-handler")(`drag-handler`.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (`fill-angle` != null) __obj.updateDynamic("fill-angle")(`fill-angle`.asInstanceOf[js.Any])
    if (`fill-offset-x` != null) __obj.updateDynamic("fill-offset-x")(`fill-offset-x`.asInstanceOf[js.Any])
    if (`fill-offset-y` != null) __obj.updateDynamic("fill-offset-y")(`fill-offset-y`.asInstanceOf[js.Any])
    if (`fill-type` != null) __obj.updateDynamic("fill-type")(`fill-type`.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (`gradient-colors` != null) __obj.updateDynamic("gradient-colors")(`gradient-colors`.asInstanceOf[js.Any])
    if (`gradient-stops` != null) __obj.updateDynamic("gradient-stops")(`gradient-stops`.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(`highlight-plot`)) __obj.updateDynamic("highlight-plot")(`highlight-plot`.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (`item-off` != null) __obj.updateDynamic("item-off")(`item-off`.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (`margin-bottom` != null) __obj.updateDynamic("margin-bottom")(`margin-bottom`.asInstanceOf[js.Any])
    if (`margin-left` != null) __obj.updateDynamic("margin-left")(`margin-left`.asInstanceOf[js.Any])
    if (`margin-right` != null) __obj.updateDynamic("margin-right")(`margin-right`.asInstanceOf[js.Any])
    if (`margin-top` != null) __obj.updateDynamic("margin-top")(`margin-top`.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (`max-items` != null) __obj.updateDynamic("max-items")(`max-items`.asInstanceOf[js.Any])
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize.asInstanceOf[js.Any])
    if (`offset-x` != null) __obj.updateDynamic("offset-x")(`offset-x`.asInstanceOf[js.Any])
    if (`offset-y` != null) __obj.updateDynamic("offset-y")(`offset-y`.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (`page-off` != null) __obj.updateDynamic("page-off")(`page-off`.asInstanceOf[js.Any])
    if (`page-on` != null) __obj.updateDynamic("page-on")(`page-on`.asInstanceOf[js.Any])
    if (`page-status` != null) __obj.updateDynamic("page-status")(`page-status`.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(`reverse-series`)) __obj.updateDynamic("reverse-series")(`reverse-series`.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (`shadow-alpha` != null) __obj.updateDynamic("shadow-alpha")(`shadow-alpha`.asInstanceOf[js.Any])
    if (`shadow-angle` != null) __obj.updateDynamic("shadow-angle")(`shadow-angle`.asInstanceOf[js.Any])
    if (`shadow-blur` != null) __obj.updateDynamic("shadow-blur")(`shadow-blur`.asInstanceOf[js.Any])
    if (`shadow-color` != null) __obj.updateDynamic("shadow-color")(`shadow-color`.asInstanceOf[js.Any])
    if (`shadow-distance` != null) __obj.updateDynamic("shadow-distance")(`shadow-distance`.asInstanceOf[js.Any])
    if (shared != null) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (`toggle-action` != null) __obj.updateDynamic("toggle-action")(`toggle-action`.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`vertical-align` != null) __obj.updateDynamic("vertical-align")(`vertical-align`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdjustlayout]
  }
}

