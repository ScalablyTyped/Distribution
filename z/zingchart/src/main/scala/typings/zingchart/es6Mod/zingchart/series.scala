package typings.zingchart.es6Mod.zingchart

import typings.zingchart.anon.AlphaArea
import typings.zingchart.anon.BackgroundcolorBorderColor
import typings.zingchart.anon.Delay
import typings.zingchart.anon.FillOffsetX
import typings.zingchart.anon.LineColor_
import typings.zingchart.anon.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait series extends StObject {
  
  /**
    * Sets the transparency level of backgrounds, borders, and lines. Values must range between 0.0 and 1.0, with 0.0 being completely t
    * ransparent and 1.0 being completely opaque. Note that values require the leading zero before the decimal point. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  var animation: js.UndefOr[Delay] = js.undefined
  
  /**
    * Modifies how data points appear on a chart. Refer to the applicable chart types page for more information. Options by Chart Type:
    * "segmented" | "spline" | "stepped" | "jumped" | "cone" | "histogram" | ...
    */
  var aspect: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g. "red", "blue", "yellow"), in hexadecimal notation (e.
    * g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0,0,255)", "rgb(255,255,0)"). One color will se
    * t a solid background color, two colors will, by default, create a horizontal gradient. For more complex gradients, use "gradient-c
    * olors" and "gradient-stops". "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the first color of a 2 color background gradient of the object. To be used with "background-color-2". "none" | "transparent"
    * | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the second color of a 2 color background gradient of the object. To be used with "background-color-1". "none" | "transparent"
    *  | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
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
  
  var `background-marker`: js.UndefOr[backgroundMarker] = js.undefined
  
  /**
    * Sets the position of the background when the "background-repeat" value is "no-repeat". "0 0" | "50 100" | "80% 60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the repeating mode for the background image. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.undefined
  
  var `background-state`: js.UndefOr[backgroundState] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var backgroundColor1: js.UndefOr[String] = js.undefined
  
  var backgroundColor2: js.UndefOr[String] = js.undefined
  
  var backgroundFit: js.UndefOr[String] = js.undefined
  
  var backgroundImage: js.UndefOr[String] = js.undefined
  
  var backgroundMarker: js.UndefOr[typings.zingchart.es6Mod.zingchart.backgroundMarker] = js.undefined
  
  var backgroundPosition: js.UndefOr[String] = js.undefined
  
  var backgroundRepeat: js.UndefOr[String] = js.undefined
  
  var backgroundState: js.UndefOr[typings.zingchart.es6Mod.zingchart.backgroundState] = js.undefined
  
  /**
    * Nested Pie Charts Only: This attribute is used to set the space between band in nested pie charts ("type":"nestedpie"). 5 | 10 | .
    * ..
    */
  var `band-space`: js.UndefOr[Double] = js.undefined
  
  var bandSpace: js.UndefOr[Double] = js.undefined
  
  /**
    * Bar Charts and Bullet Charts Only: Sets the amount of space between each bar in a single plot index. "10" | "10%" | "10px"
    */
  var `bar-space`: js.UndefOr[Double] = js.undefined
  
  /**
    * Bar Charts and Bullet Charts Only: Sets the width of each bar. "10" | "10%" | "10px"
    */
  var `bar-width`: js.UndefOr[Any] = js.undefined
  
  var barSpace: js.UndefOr[Double] = js.undefined
  
  var barWidth: js.UndefOr[Any] = js.undefined
  
  /**
    * Bar Charts and Bullet Charts Only: Defines how much the bars in each plot index should overlap. "10" | "10%" | "10px"
    */
  var `bars-overlap`: js.UndefOr[Double] = js.undefined
  
  /**
    * Bar Charts and Bullet Charts Only: Defines the spacing to the left of the bars at each index position. "10" | "10%" | "10px"
    */
  var `bars-space-left`: js.UndefOr[Double] = js.undefined
  
  /**
    * Bar Charts and Bullet Charts Only: Defines the spacing to the right of the bars at each index position. "10" | "10%" | "10px"
    */
  var `bars-space-right`: js.UndefOr[Double] = js.undefined
  
  var barsOverlap: js.UndefOr[Double] = js.undefined
  
  var barsSpaceLeft: js.UndefOr[Double] = js.undefined
  
  var barsSpaceRight: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the border color of the object, applicable on closed shapes. See also "line-color" for closed shapes. "none" | "transparent"
    * | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the object's border radius, for rounded corners. Larger values create rounder corners, while smaller values create sharper co
    * rners. A single value will affect all 4 corners, while multiple values will have separate effects on each corner, with the first v
    * alue affecting the top-left corner, the second value affecting the top-right corner, and so on, in a clockwise direction. A negati
    * ve value will cut a corner off without rounding. 4 | "6px" | "6px 10px 3px 5px" | "-10px" | ...
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
    * Sets the border width of the object, applicable on closed shapes. See also "line-width" for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[Any] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderRadius: js.UndefOr[Any] = js.undefined
  
  var borderRadiusBottomLeft: js.UndefOr[Any] = js.undefined
  
  var borderRadiusBottomRight: js.UndefOr[Any] = js.undefined
  
  var borderRadiusTopLeft: js.UndefOr[Any] = js.undefined
  
  var borderRadiusTopRight: js.UndefOr[Any] = js.undefined
  
  var borderWidth: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets whether an object will have a callout arrow or not. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the height of the object's callout arrow. A larger value will create a taller callout arrow. 4 | "6px" | ...
    */
  var `callout-height`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the point of the tip of the callout arrow to a specified coordinate on the chart, with the starting point of [0,0] being the
    * top left corner of the chart. [200, 50] | ...
    */
  var `callout-hook`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the offset along the callout direction of the arrow's base. Positive and negative values can be used to offset the callout ar
    * row up, down, left, or right depending on the "callout-position". 4 | "6px" | ...
    */
  var `callout-offset`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the position for the object's callout arrow. The position is "bottom" by default. "top" | "right" | "bottom" | "left"
    */
  var `callout-position`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the width of the object's callout arrow. A larger value will create a wider callout arrow. 4 | "6px" | ...
    */
  var `callout-width`: js.UndefOr[Any] = js.undefined
  
  var calloutHeight: js.UndefOr[Any] = js.undefined
  
  var calloutHook: js.UndefOr[Any] = js.undefined
  
  var calloutOffset: js.UndefOr[Any] = js.undefined
  
  var calloutPosition: js.UndefOr[String] = js.undefined
  
  var calloutWidth: js.UndefOr[Any] = js.undefined
  
  /**
    * By defalut null values within series arrays will create a blank space within a plot. Setting connect-nulls to true will connect va
    * lues through a null data point. true | false | 1 | 0
    */
  var `connect-nulls`: js.UndefOr[Boolean] = js.undefined
  
  var connectNulls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Area Charts Only: Sets whether the contour lines on area plots will be on top of all areas or will be hidden by the next area plot
    *  on top of it. You will notice when the attribute is set to true the lines are all set above the shaded regions. true | false | 1
    * | 0
    */
  var `contour-on-top`: js.UndefOr[Boolean] = js.undefined
  
  var contourOnTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the style of the cursor when hovering over a node. "hand" | "normal"
    */
  var cursor: js.UndefOr[String] = js.undefined
  
  /**
    * This attribute allows you to create custom tokens and associate static or dynamic data to them. This attribute can be used almost
    * anywhere in a chart. "Some Text" | ...
    */
  @JSName("data-...")
  var `data-DotDotDot`: js.UndefOr[String] = js.undefined
  
  /**
    * This attribute allows you to click and drag a bar's height in a bar chart. true | false | 1 | 0
    */
  var `data-dragging`: js.UndefOr[Boolean] = js.undefined
  
  var dataDragging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Using the decimals attribute will allow you to set the number of decimal places associated to each value. 5 | 10 | ...
    */
  var decimals: js.UndefOr[Double] = js.undefined
  
  /**
    * The "decimals-separator": attribute allows you to set what type of punctuation the will be used in the decimal place. "." | "," |
    * ...
    */
  var `decimals-separator`: js.UndefOr[String] = js.undefined
  
  var decimalsSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * This attribute sets description text for the plot which can be addressed in various areas with the %plot-description token. "Some
    * Text" | ...
    */
  var description: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[LineColor_] = js.undefined
  
  var errors: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
    * By default ZingChart uses sampling when rendering charts. This helps improve rendering speeds and typically does not effect the ap
    * pearance of the chart. However, using the attribute "exact": true within the "plot": { } object forces ZingChart to render all nod
    * es. true | false | 1 | 0
    */
  var exact: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This attribute sets the values to scientific notation true | false | 1 | 0
    */
  var exponent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This attribute set the number of decimals to be used when using exponents for scientific notation 5 | 10 | ...
    */
  var `exponent-decimals`: js.UndefOr[Double] = js.undefined
  
  var exponentDecimals: js.UndefOr[Double] = js.undefined
  
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
  
  var goal: js.UndefOr[BackgroundcolorBorderColor] = js.undefined
  
  /**
    * Bullet Charts Only: Accepts numerical values. Determines where goals are set for all plots. The "goals": [ ] values can also be se
    * t individually within each value set. [45, 70, 60]
    */
  var goals: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets a set of colors for a complex background gradient consisting of 2 or more colors. To be used with "gradient-stops". "#f00 #0f
    * 0 #00f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the gradient stops for a complex background gradient consisting of 2 or more colors. To be used with "gradient-colors". "0.1
    * 0.5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.undefined
  
  var gradientColors: js.UndefOr[String] = js.undefined
  
  var gradientStops: js.UndefOr[String] = js.undefined
  
  /**
    * When true, automatically selects all nodes with the same scale index as the selected node. The selection-mode attribute must also
    * be set. true | false | 1 | 0
    */
  var `group-selections`: js.UndefOr[Boolean] = js.undefined
  
  var groupSelections: js.UndefOr[Boolean] = js.undefined
  
  var `guide-label`: js.UndefOr[guideLabel] = js.undefined
  
  var guideLabel: js.UndefOr[typings.zingchart.es6Mod.zingchart.guideLabel] = js.undefined
  
  var `highlight-marker`: js.UndefOr[highlightMarker] = js.undefined
  
  var `highlight-state`: js.UndefOr[highlightState] = js.undefined
  
  var highlightMarker: js.UndefOr[typings.zingchart.es6Mod.zingchart.highlightMarker] = js.undefined
  
  var highlightState: js.UndefOr[typings.zingchart.es6Mod.zingchart.highlightState] = js.undefined
  
  var `hover-marker`: js.UndefOr[hoverMarker] = js.undefined
  
  var `hover-state`: js.UndefOr[hoverState] = js.undefined
  
  var hoverMarker: js.UndefOr[typings.zingchart.es6Mod.zingchart.hoverMarker] = js.undefined
  
  var hoverState: js.UndefOr[typings.zingchart.es6Mod.zingchart.hoverState] = js.undefined
  
  /**
    * Sets the ID of the object. "myid" | "f1" | ...
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Venn Diagrams Only: This attribute allow you to set the values for the area to be shared between each node. [30]
    */
  var join: js.UndefOr[Any] = js.undefined
  
  var `legend-item`: js.UndefOr[legendItem] = js.undefined
  
  var `legend-marker`: js.UndefOr[legendMarker] = js.undefined
  
  /**
    * The "legend-text": attribute is typically used within "series": [ ] value sets. Using this attribute allows you to associate both
    * a "text":" " and "legend-text":" " to each value set "Some Text" | ...
    */
  var `legend-text`: js.UndefOr[String] = js.undefined
  
  var legendItem: js.UndefOr[typings.zingchart.es6Mod.zingchart.legendItem] = js.undefined
  
  var legendMarker: js.UndefOr[typings.zingchart.es6Mod.zingchart.legendMarker] = js.undefined
  
  var legendText: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the line color of the object, applicable on non-closed shapes. See also "border-color" for closed shapes. "none" | "transpare
    * nt" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Can be used to create custom dashed or dotted lines when used with "line-segment-size". This will control the size of the gaps bet
    * ween each line segment. 4 | "6px" | ...
    */
  var `line-gap-size`: js.UndefOr[Any] = js.undefined
  
  /**
    * Can be used to create custom dashed or dotted lines when used with "line-gap-size". This will control the size of the visible segm
    * ent of line. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the line width of the object, applicable on non-closed shapes. See also "border-width" for closed shapes. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[Any] = js.undefined
  
  var lineColor: js.UndefOr[String] = js.undefined
  
  var lineGapSize: js.UndefOr[Any] = js.undefined
  
  var lineSegmentSize: js.UndefOr[Any] = js.undefined
  
  var lineStyle: js.UndefOr[String] = js.undefined
  
  var lineWidth: js.UndefOr[Any] = js.undefined
  
  var marker: js.UndefOr[FillOffsetX] = js.undefined
  
  /**
    * Applies to charts such as line and area which have markers. When there are too many markers for the chart ZingChart does not displ
    * ay all markers. Example 1000 nodes on a 300px wide chart. Setting max-nodes will override the default setting and force nodes to b
    * e displayed. 5 | 10 | ...
    */
  var `max-nodes`: js.UndefOr[Double] = js.undefined
  
  /**
    * Heat Maps Only: Sets a maximum ratio applied to the value of the node when calculating its aspect. 0 | 0.4 | ...
    */
  var `max-ratio`: js.UndefOr[Double] = js.undefined
  
  /**
    * Bubble Charts and Bubble Pie Charts Only: Defines the maximum size of the bubble if the value representing size is not sharing the
    *  same ratio with the value scale. 5 | 10 | ...
    */
  var `max-size`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the maximum numbers of nodes for which a tracking area will be created. This is best used to optimize charts with large sets
    * of data. 5 | 10 | ...
    */
  var `max-trackers`: js.UndefOr[Double] = js.undefined
  
  var maxNodes: js.UndefOr[Double] = js.undefined
  
  var maxRatio: js.UndefOr[Double] = js.undefined
  
  var maxSize: js.UndefOr[Double] = js.undefined
  
  var maxTrackers: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets whether or not a node is wrapped equally before and after its position. true | false | 1 | 0
    */
  var `mid-point`: js.UndefOr[Boolean] = js.undefined
  
  var midPoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Heat Maps Only: Sets a minimum ratio applied to the value of the node when calculating its aspect. 0 | 0.4 | ...
    */
  var `min-ratio`: js.UndefOr[Double] = js.undefined
  
  /**
    * Bubble Charts and Bubble Pie Charts Only: Defines the minimum size of the bubble if the value representing size is not sharing the
    *  same ratio with the value scale. 5 | 10 | ...
    */
  var `min-size`: js.UndefOr[Double] = js.undefined
  
  var minRatio: js.UndefOr[Double] = js.undefined
  
  var minSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets whether monotone interpolation is used for charts using the "spline" aspect. true | false | 1 | 0
    */
  var monotone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Setting "multiplier": true will take large numbers such as thousands, millions, etc and replace the full number with an abbreviate
    * d notation with a short unit such as K, M, B, etc true | false | 1 | 0
    */
  var multiplier: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This attribute will determine how negative values are handled. When using "format":"$%v" setting "negation":"currency" will move t
    * he - symbol to the outside of the $ sign. When using "negation" within the "plot": { } object you will see changes in things such
    * as tooltips or anywhere else series data is used to populate values. You need to set "negation" in things such as "scale-y": { } s
    * eparately. "standard" | "currency"
    */
  var negation: js.UndefOr[String] = js.undefined
  
  /**
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[Any] = js.undefined
  
  var offsetX: js.UndefOr[Any] = js.undefined
  
  var offsetY: js.UndefOr[Any] = js.undefined
  
  var preview: js.UndefOr[AlphaArea] = js.undefined
  
  /**
    * Bar, Line and Area Charts only Include object in any series to override style displayed in the preview window. {...}
    */
  var `preview-state`: js.UndefOr[Any] = js.undefined
  
  var previewState: js.UndefOr[Any] = js.undefined
  
  /**
    * Pie Charts Only: Provides the ability to rotate the chart. 5 | 10 | ...
    */
  var `ref-angle`: js.UndefOr[Double] = js.undefined
  
  var refAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Heat Maps Only: Sets the value (default 'plot-max') which is used as a reference for calculating node aspect. "plot-max" | "plot-t
    * otal" | "chart-max" | "chart-total"
    */
  var reference: js.UndefOr[String] = js.undefined
  
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
  
  /**
    * By default ZingChart uses sampling when rendering large datasets. If you are trying to render 10000 data points on a chart which i
    * s only 500px wide there is not enough space for each data point. ZingChart will automatically determine which data points to show.
    *  The "sampling-step": attribute allows you to set the step for sampling. For example if you have 10000 data points and set "sampli
    * ng-step":10 it will show point 1,10,20,... Also note the "exact": true attribute if you want to force all data points. 5 | 10 | ..
    * .
    */
  var `sampling-step`: js.UndefOr[Double] = js.undefined
  
  var samplingStep: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the scales used by the series item. scale-x,scale-y | scale-x,scale-y-2 | ...
    */
  var scales: js.UndefOr[String] = js.undefined
  
  /**
    * Bubble Charts and Bubble Pie Charts Only: Sets the method used to relate the bubble numerical value to it's aspect. "radius" | "sq
    * rt" | "area"
    */
  var scaling: js.UndefOr[String] = js.undefined
  
  /**
    * When scrolling is enabled for a chart, ZingChart automatically samples the data in order to maintain performance during the re-ren
    * dering of the chart that occurs during scrolling. By default, ZingChart will automatically sample every other item (scroll-step-mu
    * ltiplier:2). Setting scroll-step-multiplier to 1 will force the library to sample every data point, essentially disabling sampling
    * . 5 | 10 | ...
    */
  var `scroll-step-multiplier`: js.UndefOr[Double] = js.undefined
  
  var scrollStepMultiplier: js.UndefOr[Double] = js.undefined
  
  /**
    * Line Charts and Area Charts Only: Allows you to specify whether tooltips are activated by the markers and lines (default) or the m
    * arkers only. true (default) | false
    */
  var `segment-trackers`: js.UndefOr[Boolean] = js.undefined
  
  var segmentTrackers: js.UndefOr[Boolean] = js.undefined
  
  var `selected-marker`: js.UndefOr[selectedMarker] = js.undefined
  
  var `selected-state`: js.UndefOr[selectedState] = js.undefined
  
  var selectedMarker: js.UndefOr[typings.zingchart.es6Mod.zingchart.selectedMarker] = js.undefined
  
  var selectedState: js.UndefOr[typings.zingchart.es6Mod.zingchart.selectedState] = js.undefined
  
  /**
    * Sets whether the object's shadow is visible or not. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the transparency of the shadow of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and
    * 1.0 being completely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
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
    * Setting "short": true will abbreviate long numbers such as 100000 to 1K or 1000000 to 1M. When set within the "plot": {} object th
    * is change will be noticed anywhere values are pulled from series data. This can also be used in places such as "scale-y, scale-x,
    * etc" true | false | 1 | 0
    */
  var short: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default when setting "short": true ZingChart will round to the nearest short unit (ie 100000 to 100K and 1000000 to 1M). You ca
    * n set the short-unit and ZingChart will round all numbers to that unit. Note when setting this within the "plot": { } object the c
    * hanges will only effect values which are pulled from the series values. Things such as scale are set separately. "k" | "K" | "m" |
    *  "M" | "b" | "B"
    */
  var `short-unit`: js.UndefOr[String] = js.undefined
  
  var shortUnit: js.UndefOr[String] = js.undefined
  
  /**
    * On bar charts, when the value of a bar is 0, setting `show-zero`: true will add 1 pixel to the height of the bar so that it is onl
    * y just visible. true | false | 1 | 0
    */
  var `show-zero`: js.UndefOr[Boolean] = js.undefined
  
  var showZero: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Bubble Charts and Bubble Pie Charts Only: Sets a multiplier (default 1) used to increase/decrease the bubble size 5 | 10 | ...
    */
  var `size-factor`: js.UndefOr[Double] = js.undefined
  
  var sizeFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Nested Pie Charts Only: Sets the initial offset of the pie layers when making a nestedpie 5 | 10 | ...
    */
  var `slice-start`: js.UndefOr[Double] = js.undefined
  
  var sliceStart: js.UndefOr[Double] = js.undefined
  
  /**
    * Using the "stack": attribute allows you to assign which plot index you want to each value set associated with when using a stacked
    *  chart. 5 | 10 | ...
    */
  var stack: js.UndefOr[Double] = js.undefined
  
  /**
    * Setting "stacked": true will take each of the "series": [ ] value sets and stack them on top of one another true | false | 1 | 0
    */
  var stacked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Applicable on aspect=stepped, sets the location of the stepping relative to two consecutive nodes. "before" | "middle" | "after"
    */
  var `step-start`: js.UndefOr[String] = js.undefined
  
  var stepStart: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the url's target for the link associated with the object. Use with "url". "_blank" | ...
    */
  var target: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the thickness of pie3d charts. 5 | 10 | ...
    */
  var thickness: js.UndefOr[Double] = js.undefined
  
  /**
    * When you set the "thousands-separator": attribute the punctuation which is used will be placed to separate digits which go into 1,
    * 000's 10,000's etc. When placed in the "plot": { } object this will only effect values which are pulled directly from the series d
    * ata. Objects such as "scale-y": { }, "scale-x": { }, etc..., will need to be set separately. "." | "," | ...
    */
  var `thousands-separator`: js.UndefOr[String] = js.undefined
  
  var thousandsSeparator: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[typings.zingchart.es6Mod.zingchart.tooltip] = js.undefined
  
  /**
    * Using the "tooltip-text":" " attribute allows you to set text for tooltips. This can also be done using a variety of other tokens
    * "Some Text" | ...
    */
  var `tooltip-text`: js.UndefOr[String] = js.undefined
  
  var tooltipText: js.UndefOr[String] = js.undefined
  
  var `trend-down`: js.UndefOr[trendDown] = js.undefined
  
  var `trend-equal`: js.UndefOr[trendEqual] = js.undefined
  
  var `trend-up`: js.UndefOr[trendUp] = js.undefined
  
  var trendDown: js.UndefOr[typings.zingchart.es6Mod.zingchart.trendDown] = js.undefined
  
  var trendEqual: js.UndefOr[typings.zingchart.es6Mod.zingchart.trendEqual] = js.undefined
  
  var trendUp: js.UndefOr[typings.zingchart.es6Mod.zingchart.trendUp] = js.undefined
  
  /**
    * Sets the type of the object/shape.
    * Accepted Values: ['arc', 'arrow', 'circle', 'cross', 'diamond', 'ellipse','gear3', 'gear4', 'gear5', 'gear6', 'gear7', 'gear8', 'gear9', 'hamburger', 'line', 'parallelogram', 'pie','plus',
    * 'poly', 'rect', 'rpoly3', 'rpoly4', 'rpoly5', 'rpoly6', 'rpoly7', 'rpoly8', 'rpoly9', 'square', 'star3', 'star4', 'star5', 'star6', 'star7', 'star8', 'star9', 'trapezoid', 'triangle']
    * Default Value: 'poly'
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the URL for the link associated with the object. "http://www.domain.com/link.php" | "link.asp" | ...
    */
  var url: js.UndefOr[String] = js.undefined
  
  var `value-box`: js.UndefOr[valueBox] = js.undefined
  
  var valueBox: js.UndefOr[typings.zingchart.es6Mod.zingchart.valueBox] = js.undefined
  
  var values: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the z-axis end point on 3d charts. 10 | "10px" | ...
    */
  var `z-end`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the z-index of the series object
    */
  var `z-index`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the z-axis start point on 3d charts. 10 | "10px" | ...
    */
  var `z-start`: js.UndefOr[Double] = js.undefined
  
  var zEnd: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
  
  var zStart: js.UndefOr[Double] = js.undefined
}
object series {
  
  inline def apply(): series = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[series]
  }
  
  extension [Self <: series](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAnimation(value: Delay): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAspect(value: String): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
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
    
    inline def `setBackground-marker`(value: backgroundMarker): Self = StObject.set(x, "background-marker", value.asInstanceOf[js.Any])
    
    inline def `setBackground-markerUndefined`: Self = StObject.set(x, "background-marker", js.undefined)
    
    inline def `setBackground-position`(value: String): Self = StObject.set(x, "background-position", value.asInstanceOf[js.Any])
    
    inline def `setBackground-positionUndefined`: Self = StObject.set(x, "background-position", js.undefined)
    
    inline def `setBackground-repeat`(value: String): Self = StObject.set(x, "background-repeat", value.asInstanceOf[js.Any])
    
    inline def `setBackground-repeatUndefined`: Self = StObject.set(x, "background-repeat", js.undefined)
    
    inline def `setBackground-state`(value: backgroundState): Self = StObject.set(x, "background-state", value.asInstanceOf[js.Any])
    
    inline def `setBackground-stateUndefined`: Self = StObject.set(x, "background-state", js.undefined)
    
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
    
    inline def setBackgroundMarker(value: backgroundMarker): Self = StObject.set(x, "backgroundMarker", value.asInstanceOf[js.Any])
    
    inline def setBackgroundMarkerUndefined: Self = StObject.set(x, "backgroundMarker", js.undefined)
    
    inline def setBackgroundPosition(value: String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    inline def setBackgroundRepeat(value: String): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
    
    inline def setBackgroundState(value: backgroundState): Self = StObject.set(x, "backgroundState", value.asInstanceOf[js.Any])
    
    inline def setBackgroundStateUndefined: Self = StObject.set(x, "backgroundState", js.undefined)
    
    inline def `setBand-space`(value: Double): Self = StObject.set(x, "band-space", value.asInstanceOf[js.Any])
    
    inline def `setBand-spaceUndefined`: Self = StObject.set(x, "band-space", js.undefined)
    
    inline def setBandSpace(value: Double): Self = StObject.set(x, "bandSpace", value.asInstanceOf[js.Any])
    
    inline def setBandSpaceUndefined: Self = StObject.set(x, "bandSpace", js.undefined)
    
    inline def `setBar-space`(value: Double): Self = StObject.set(x, "bar-space", value.asInstanceOf[js.Any])
    
    inline def `setBar-spaceUndefined`: Self = StObject.set(x, "bar-space", js.undefined)
    
    inline def `setBar-width`(value: Any): Self = StObject.set(x, "bar-width", value.asInstanceOf[js.Any])
    
    inline def `setBar-widthUndefined`: Self = StObject.set(x, "bar-width", js.undefined)
    
    inline def setBarSpace(value: Double): Self = StObject.set(x, "barSpace", value.asInstanceOf[js.Any])
    
    inline def setBarSpaceUndefined: Self = StObject.set(x, "barSpace", js.undefined)
    
    inline def setBarWidth(value: Any): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
    
    inline def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
    
    inline def `setBars-overlap`(value: Double): Self = StObject.set(x, "bars-overlap", value.asInstanceOf[js.Any])
    
    inline def `setBars-overlapUndefined`: Self = StObject.set(x, "bars-overlap", js.undefined)
    
    inline def `setBars-space-left`(value: Double): Self = StObject.set(x, "bars-space-left", value.asInstanceOf[js.Any])
    
    inline def `setBars-space-leftUndefined`: Self = StObject.set(x, "bars-space-left", js.undefined)
    
    inline def `setBars-space-right`(value: Double): Self = StObject.set(x, "bars-space-right", value.asInstanceOf[js.Any])
    
    inline def `setBars-space-rightUndefined`: Self = StObject.set(x, "bars-space-right", js.undefined)
    
    inline def setBarsOverlap(value: Double): Self = StObject.set(x, "barsOverlap", value.asInstanceOf[js.Any])
    
    inline def setBarsOverlapUndefined: Self = StObject.set(x, "barsOverlap", js.undefined)
    
    inline def setBarsSpaceLeft(value: Double): Self = StObject.set(x, "barsSpaceLeft", value.asInstanceOf[js.Any])
    
    inline def setBarsSpaceLeftUndefined: Self = StObject.set(x, "barsSpaceLeft", js.undefined)
    
    inline def setBarsSpaceRight(value: Double): Self = StObject.set(x, "barsSpaceRight", value.asInstanceOf[js.Any])
    
    inline def setBarsSpaceRightUndefined: Self = StObject.set(x, "barsSpaceRight", js.undefined)
    
    inline def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
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
    
    inline def `setBorder-width`(value: Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
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
    
    inline def setBorderWidth(value: Any): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setCallout(value: Boolean): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
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
    
    inline def `setConnect-nulls`(value: Boolean): Self = StObject.set(x, "connect-nulls", value.asInstanceOf[js.Any])
    
    inline def `setConnect-nullsUndefined`: Self = StObject.set(x, "connect-nulls", js.undefined)
    
    inline def setConnectNulls(value: Boolean): Self = StObject.set(x, "connectNulls", value.asInstanceOf[js.Any])
    
    inline def setConnectNullsUndefined: Self = StObject.set(x, "connectNulls", js.undefined)
    
    inline def `setContour-on-top`(value: Boolean): Self = StObject.set(x, "contour-on-top", value.asInstanceOf[js.Any])
    
    inline def `setContour-on-topUndefined`: Self = StObject.set(x, "contour-on-top", js.undefined)
    
    inline def setContourOnTop(value: Boolean): Self = StObject.set(x, "contourOnTop", value.asInstanceOf[js.Any])
    
    inline def setContourOnTopUndefined: Self = StObject.set(x, "contourOnTop", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def `setData-DotDotDot`(value: String): Self = StObject.set(x, "data-...", value.asInstanceOf[js.Any])
    
    inline def `setData-DotDotDotUndefined`: Self = StObject.set(x, "data-...", js.undefined)
    
    inline def `setData-dragging`(value: Boolean): Self = StObject.set(x, "data-dragging", value.asInstanceOf[js.Any])
    
    inline def `setData-draggingUndefined`: Self = StObject.set(x, "data-dragging", js.undefined)
    
    inline def setDataDragging(value: Boolean): Self = StObject.set(x, "dataDragging", value.asInstanceOf[js.Any])
    
    inline def setDataDraggingUndefined: Self = StObject.set(x, "dataDragging", js.undefined)
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def `setDecimals-separator`(value: String): Self = StObject.set(x, "decimals-separator", value.asInstanceOf[js.Any])
    
    inline def `setDecimals-separatorUndefined`: Self = StObject.set(x, "decimals-separator", js.undefined)
    
    inline def setDecimalsSeparator(value: String): Self = StObject.set(x, "decimalsSeparator", value.asInstanceOf[js.Any])
    
    inline def setDecimalsSeparatorUndefined: Self = StObject.set(x, "decimalsSeparator", js.undefined)
    
    inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setError(value: LineColor_): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrors(value: js.Array[js.Object]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: js.Object*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setExponent(value: Boolean): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    inline def `setExponent-decimals`(value: Double): Self = StObject.set(x, "exponent-decimals", value.asInstanceOf[js.Any])
    
    inline def `setExponent-decimalsUndefined`: Self = StObject.set(x, "exponent-decimals", js.undefined)
    
    inline def setExponentDecimals(value: Double): Self = StObject.set(x, "exponentDecimals", value.asInstanceOf[js.Any])
    
    inline def setExponentDecimalsUndefined: Self = StObject.set(x, "exponentDecimals", js.undefined)
    
    inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
    
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
    
    inline def setGoal(value: BackgroundcolorBorderColor): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    inline def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    inline def setGoals(value: Any): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
    
    inline def setGoalsUndefined: Self = StObject.set(x, "goals", js.undefined)
    
    inline def `setGradient-colors`(value: String): Self = StObject.set(x, "gradient-colors", value.asInstanceOf[js.Any])
    
    inline def `setGradient-colorsUndefined`: Self = StObject.set(x, "gradient-colors", js.undefined)
    
    inline def `setGradient-stops`(value: String): Self = StObject.set(x, "gradient-stops", value.asInstanceOf[js.Any])
    
    inline def `setGradient-stopsUndefined`: Self = StObject.set(x, "gradient-stops", js.undefined)
    
    inline def setGradientColors(value: String): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
    
    inline def setGradientColorsUndefined: Self = StObject.set(x, "gradientColors", js.undefined)
    
    inline def setGradientStops(value: String): Self = StObject.set(x, "gradientStops", value.asInstanceOf[js.Any])
    
    inline def setGradientStopsUndefined: Self = StObject.set(x, "gradientStops", js.undefined)
    
    inline def `setGroup-selections`(value: Boolean): Self = StObject.set(x, "group-selections", value.asInstanceOf[js.Any])
    
    inline def `setGroup-selectionsUndefined`: Self = StObject.set(x, "group-selections", js.undefined)
    
    inline def setGroupSelections(value: Boolean): Self = StObject.set(x, "groupSelections", value.asInstanceOf[js.Any])
    
    inline def setGroupSelectionsUndefined: Self = StObject.set(x, "groupSelections", js.undefined)
    
    inline def `setGuide-label`(value: guideLabel): Self = StObject.set(x, "guide-label", value.asInstanceOf[js.Any])
    
    inline def `setGuide-labelUndefined`: Self = StObject.set(x, "guide-label", js.undefined)
    
    inline def setGuideLabel(value: guideLabel): Self = StObject.set(x, "guideLabel", value.asInstanceOf[js.Any])
    
    inline def setGuideLabelUndefined: Self = StObject.set(x, "guideLabel", js.undefined)
    
    inline def `setHighlight-marker`(value: highlightMarker): Self = StObject.set(x, "highlight-marker", value.asInstanceOf[js.Any])
    
    inline def `setHighlight-markerUndefined`: Self = StObject.set(x, "highlight-marker", js.undefined)
    
    inline def `setHighlight-state`(value: highlightState): Self = StObject.set(x, "highlight-state", value.asInstanceOf[js.Any])
    
    inline def `setHighlight-stateUndefined`: Self = StObject.set(x, "highlight-state", js.undefined)
    
    inline def setHighlightMarker(value: highlightMarker): Self = StObject.set(x, "highlightMarker", value.asInstanceOf[js.Any])
    
    inline def setHighlightMarkerUndefined: Self = StObject.set(x, "highlightMarker", js.undefined)
    
    inline def setHighlightState(value: highlightState): Self = StObject.set(x, "highlightState", value.asInstanceOf[js.Any])
    
    inline def setHighlightStateUndefined: Self = StObject.set(x, "highlightState", js.undefined)
    
    inline def `setHover-marker`(value: hoverMarker): Self = StObject.set(x, "hover-marker", value.asInstanceOf[js.Any])
    
    inline def `setHover-markerUndefined`: Self = StObject.set(x, "hover-marker", js.undefined)
    
    inline def `setHover-state`(value: hoverState): Self = StObject.set(x, "hover-state", value.asInstanceOf[js.Any])
    
    inline def `setHover-stateUndefined`: Self = StObject.set(x, "hover-state", js.undefined)
    
    inline def setHoverMarker(value: hoverMarker): Self = StObject.set(x, "hoverMarker", value.asInstanceOf[js.Any])
    
    inline def setHoverMarkerUndefined: Self = StObject.set(x, "hoverMarker", js.undefined)
    
    inline def setHoverState(value: hoverState): Self = StObject.set(x, "hoverState", value.asInstanceOf[js.Any])
    
    inline def setHoverStateUndefined: Self = StObject.set(x, "hoverState", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setJoin(value: Any): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def `setLegend-item`(value: legendItem): Self = StObject.set(x, "legend-item", value.asInstanceOf[js.Any])
    
    inline def `setLegend-itemUndefined`: Self = StObject.set(x, "legend-item", js.undefined)
    
    inline def `setLegend-marker`(value: legendMarker): Self = StObject.set(x, "legend-marker", value.asInstanceOf[js.Any])
    
    inline def `setLegend-markerUndefined`: Self = StObject.set(x, "legend-marker", js.undefined)
    
    inline def `setLegend-text`(value: String): Self = StObject.set(x, "legend-text", value.asInstanceOf[js.Any])
    
    inline def `setLegend-textUndefined`: Self = StObject.set(x, "legend-text", js.undefined)
    
    inline def setLegendItem(value: legendItem): Self = StObject.set(x, "legendItem", value.asInstanceOf[js.Any])
    
    inline def setLegendItemUndefined: Self = StObject.set(x, "legendItem", js.undefined)
    
    inline def setLegendMarker(value: legendMarker): Self = StObject.set(x, "legendMarker", value.asInstanceOf[js.Any])
    
    inline def setLegendMarkerUndefined: Self = StObject.set(x, "legendMarker", js.undefined)
    
    inline def setLegendText(value: String): Self = StObject.set(x, "legendText", value.asInstanceOf[js.Any])
    
    inline def setLegendTextUndefined: Self = StObject.set(x, "legendText", js.undefined)
    
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
    
    inline def setMarker(value: FillOffsetX): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def `setMax-nodes`(value: Double): Self = StObject.set(x, "max-nodes", value.asInstanceOf[js.Any])
    
    inline def `setMax-nodesUndefined`: Self = StObject.set(x, "max-nodes", js.undefined)
    
    inline def `setMax-ratio`(value: Double): Self = StObject.set(x, "max-ratio", value.asInstanceOf[js.Any])
    
    inline def `setMax-ratioUndefined`: Self = StObject.set(x, "max-ratio", js.undefined)
    
    inline def `setMax-size`(value: Double): Self = StObject.set(x, "max-size", value.asInstanceOf[js.Any])
    
    inline def `setMax-sizeUndefined`: Self = StObject.set(x, "max-size", js.undefined)
    
    inline def `setMax-trackers`(value: Double): Self = StObject.set(x, "max-trackers", value.asInstanceOf[js.Any])
    
    inline def `setMax-trackersUndefined`: Self = StObject.set(x, "max-trackers", js.undefined)
    
    inline def setMaxNodes(value: Double): Self = StObject.set(x, "maxNodes", value.asInstanceOf[js.Any])
    
    inline def setMaxNodesUndefined: Self = StObject.set(x, "maxNodes", js.undefined)
    
    inline def setMaxRatio(value: Double): Self = StObject.set(x, "maxRatio", value.asInstanceOf[js.Any])
    
    inline def setMaxRatioUndefined: Self = StObject.set(x, "maxRatio", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMaxTrackers(value: Double): Self = StObject.set(x, "maxTrackers", value.asInstanceOf[js.Any])
    
    inline def setMaxTrackersUndefined: Self = StObject.set(x, "maxTrackers", js.undefined)
    
    inline def `setMid-point`(value: Boolean): Self = StObject.set(x, "mid-point", value.asInstanceOf[js.Any])
    
    inline def `setMid-pointUndefined`: Self = StObject.set(x, "mid-point", js.undefined)
    
    inline def setMidPoint(value: Boolean): Self = StObject.set(x, "midPoint", value.asInstanceOf[js.Any])
    
    inline def setMidPointUndefined: Self = StObject.set(x, "midPoint", js.undefined)
    
    inline def `setMin-ratio`(value: Double): Self = StObject.set(x, "min-ratio", value.asInstanceOf[js.Any])
    
    inline def `setMin-ratioUndefined`: Self = StObject.set(x, "min-ratio", js.undefined)
    
    inline def `setMin-size`(value: Double): Self = StObject.set(x, "min-size", value.asInstanceOf[js.Any])
    
    inline def `setMin-sizeUndefined`: Self = StObject.set(x, "min-size", js.undefined)
    
    inline def setMinRatio(value: Double): Self = StObject.set(x, "minRatio", value.asInstanceOf[js.Any])
    
    inline def setMinRatioUndefined: Self = StObject.set(x, "minRatio", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    inline def setMonotone(value: Boolean): Self = StObject.set(x, "monotone", value.asInstanceOf[js.Any])
    
    inline def setMonotoneUndefined: Self = StObject.set(x, "monotone", js.undefined)
    
    inline def setMultiplier(value: Boolean): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
    
    inline def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    
    inline def setNegation(value: String): Self = StObject.set(x, "negation", value.asInstanceOf[js.Any])
    
    inline def setNegationUndefined: Self = StObject.set(x, "negation", js.undefined)
    
    inline def `setOffset-x`(value: Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    inline def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    inline def `setOffset-y`(value: Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    inline def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    inline def setOffsetX(value: Any): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Any): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPreview(value: AlphaArea): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def `setPreview-state`(value: Any): Self = StObject.set(x, "preview-state", value.asInstanceOf[js.Any])
    
    inline def `setPreview-stateUndefined`: Self = StObject.set(x, "preview-state", js.undefined)
    
    inline def setPreviewState(value: Any): Self = StObject.set(x, "previewState", value.asInstanceOf[js.Any])
    
    inline def setPreviewStateUndefined: Self = StObject.set(x, "previewState", js.undefined)
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def `setRef-angle`(value: Double): Self = StObject.set(x, "ref-angle", value.asInstanceOf[js.Any])
    
    inline def `setRef-angleUndefined`: Self = StObject.set(x, "ref-angle", js.undefined)
    
    inline def setRefAngle(value: Double): Self = StObject.set(x, "refAngle", value.asInstanceOf[js.Any])
    
    inline def setRefAngleUndefined: Self = StObject.set(x, "refAngle", js.undefined)
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def `setSampling-step`(value: Double): Self = StObject.set(x, "sampling-step", value.asInstanceOf[js.Any])
    
    inline def `setSampling-stepUndefined`: Self = StObject.set(x, "sampling-step", js.undefined)
    
    inline def setSamplingStep(value: Double): Self = StObject.set(x, "samplingStep", value.asInstanceOf[js.Any])
    
    inline def setSamplingStepUndefined: Self = StObject.set(x, "samplingStep", js.undefined)
    
    inline def setScales(value: String): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    
    inline def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
    
    inline def setScaling(value: String): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    
    inline def `setScroll-step-multiplier`(value: Double): Self = StObject.set(x, "scroll-step-multiplier", value.asInstanceOf[js.Any])
    
    inline def `setScroll-step-multiplierUndefined`: Self = StObject.set(x, "scroll-step-multiplier", js.undefined)
    
    inline def setScrollStepMultiplier(value: Double): Self = StObject.set(x, "scrollStepMultiplier", value.asInstanceOf[js.Any])
    
    inline def setScrollStepMultiplierUndefined: Self = StObject.set(x, "scrollStepMultiplier", js.undefined)
    
    inline def `setSegment-trackers`(value: Boolean): Self = StObject.set(x, "segment-trackers", value.asInstanceOf[js.Any])
    
    inline def `setSegment-trackersUndefined`: Self = StObject.set(x, "segment-trackers", js.undefined)
    
    inline def setSegmentTrackers(value: Boolean): Self = StObject.set(x, "segmentTrackers", value.asInstanceOf[js.Any])
    
    inline def setSegmentTrackersUndefined: Self = StObject.set(x, "segmentTrackers", js.undefined)
    
    inline def `setSelected-marker`(value: selectedMarker): Self = StObject.set(x, "selected-marker", value.asInstanceOf[js.Any])
    
    inline def `setSelected-markerUndefined`: Self = StObject.set(x, "selected-marker", js.undefined)
    
    inline def `setSelected-state`(value: selectedState): Self = StObject.set(x, "selected-state", value.asInstanceOf[js.Any])
    
    inline def `setSelected-stateUndefined`: Self = StObject.set(x, "selected-state", js.undefined)
    
    inline def setSelectedMarker(value: selectedMarker): Self = StObject.set(x, "selectedMarker", value.asInstanceOf[js.Any])
    
    inline def setSelectedMarkerUndefined: Self = StObject.set(x, "selectedMarker", js.undefined)
    
    inline def setSelectedState(value: selectedState): Self = StObject.set(x, "selectedState", value.asInstanceOf[js.Any])
    
    inline def setSelectedStateUndefined: Self = StObject.set(x, "selectedState", js.undefined)
    
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
    
    inline def setShort(value: Boolean): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def `setShort-unit`(value: String): Self = StObject.set(x, "short-unit", value.asInstanceOf[js.Any])
    
    inline def `setShort-unitUndefined`: Self = StObject.set(x, "short-unit", js.undefined)
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    inline def setShortUnit(value: String): Self = StObject.set(x, "shortUnit", value.asInstanceOf[js.Any])
    
    inline def setShortUnitUndefined: Self = StObject.set(x, "shortUnit", js.undefined)
    
    inline def `setShow-zero`(value: Boolean): Self = StObject.set(x, "show-zero", value.asInstanceOf[js.Any])
    
    inline def `setShow-zeroUndefined`: Self = StObject.set(x, "show-zero", js.undefined)
    
    inline def setShowZero(value: Boolean): Self = StObject.set(x, "showZero", value.asInstanceOf[js.Any])
    
    inline def setShowZeroUndefined: Self = StObject.set(x, "showZero", js.undefined)
    
    inline def `setSize-factor`(value: Double): Self = StObject.set(x, "size-factor", value.asInstanceOf[js.Any])
    
    inline def `setSize-factorUndefined`: Self = StObject.set(x, "size-factor", js.undefined)
    
    inline def setSizeFactor(value: Double): Self = StObject.set(x, "sizeFactor", value.asInstanceOf[js.Any])
    
    inline def setSizeFactorUndefined: Self = StObject.set(x, "sizeFactor", js.undefined)
    
    inline def `setSlice-start`(value: Double): Self = StObject.set(x, "slice-start", value.asInstanceOf[js.Any])
    
    inline def `setSlice-startUndefined`: Self = StObject.set(x, "slice-start", js.undefined)
    
    inline def setSliceStart(value: Double): Self = StObject.set(x, "sliceStart", value.asInstanceOf[js.Any])
    
    inline def setSliceStartUndefined: Self = StObject.set(x, "sliceStart", js.undefined)
    
    inline def setStack(value: Double): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
    
    inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    
    inline def `setStep-start`(value: String): Self = StObject.set(x, "step-start", value.asInstanceOf[js.Any])
    
    inline def `setStep-startUndefined`: Self = StObject.set(x, "step-start", js.undefined)
    
    inline def setStepStart(value: String): Self = StObject.set(x, "stepStart", value.asInstanceOf[js.Any])
    
    inline def setStepStartUndefined: Self = StObject.set(x, "stepStart", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def `setThousands-separator`(value: String): Self = StObject.set(x, "thousands-separator", value.asInstanceOf[js.Any])
    
    inline def `setThousands-separatorUndefined`: Self = StObject.set(x, "thousands-separator", js.undefined)
    
    inline def setThousandsSeparator(value: String): Self = StObject.set(x, "thousandsSeparator", value.asInstanceOf[js.Any])
    
    inline def setThousandsSeparatorUndefined: Self = StObject.set(x, "thousandsSeparator", js.undefined)
    
    inline def setTooltip(value: tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def `setTooltip-text`(value: String): Self = StObject.set(x, "tooltip-text", value.asInstanceOf[js.Any])
    
    inline def `setTooltip-textUndefined`: Self = StObject.set(x, "tooltip-text", js.undefined)
    
    inline def setTooltipText(value: String): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
    
    inline def setTooltipTextUndefined: Self = StObject.set(x, "tooltipText", js.undefined)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def `setTrend-down`(value: trendDown): Self = StObject.set(x, "trend-down", value.asInstanceOf[js.Any])
    
    inline def `setTrend-downUndefined`: Self = StObject.set(x, "trend-down", js.undefined)
    
    inline def `setTrend-equal`(value: trendEqual): Self = StObject.set(x, "trend-equal", value.asInstanceOf[js.Any])
    
    inline def `setTrend-equalUndefined`: Self = StObject.set(x, "trend-equal", js.undefined)
    
    inline def `setTrend-up`(value: trendUp): Self = StObject.set(x, "trend-up", value.asInstanceOf[js.Any])
    
    inline def `setTrend-upUndefined`: Self = StObject.set(x, "trend-up", js.undefined)
    
    inline def setTrendDown(value: trendDown): Self = StObject.set(x, "trendDown", value.asInstanceOf[js.Any])
    
    inline def setTrendDownUndefined: Self = StObject.set(x, "trendDown", js.undefined)
    
    inline def setTrendEqual(value: trendEqual): Self = StObject.set(x, "trendEqual", value.asInstanceOf[js.Any])
    
    inline def setTrendEqualUndefined: Self = StObject.set(x, "trendEqual", js.undefined)
    
    inline def setTrendUp(value: trendUp): Self = StObject.set(x, "trendUp", value.asInstanceOf[js.Any])
    
    inline def setTrendUpUndefined: Self = StObject.set(x, "trendUp", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def `setValue-box`(value: valueBox): Self = StObject.set(x, "value-box", value.asInstanceOf[js.Any])
    
    inline def `setValue-boxUndefined`: Self = StObject.set(x, "value-box", js.undefined)
    
    inline def setValueBox(value: valueBox): Self = StObject.set(x, "valueBox", value.asInstanceOf[js.Any])
    
    inline def setValueBoxUndefined: Self = StObject.set(x, "valueBox", js.undefined)
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def `setZ-end`(value: Double): Self = StObject.set(x, "z-end", value.asInstanceOf[js.Any])
    
    inline def `setZ-endUndefined`: Self = StObject.set(x, "z-end", js.undefined)
    
    inline def `setZ-index`(value: Double): Self = StObject.set(x, "z-index", value.asInstanceOf[js.Any])
    
    inline def `setZ-indexUndefined`: Self = StObject.set(x, "z-index", js.undefined)
    
    inline def `setZ-start`(value: Double): Self = StObject.set(x, "z-start", value.asInstanceOf[js.Any])
    
    inline def `setZ-startUndefined`: Self = StObject.set(x, "z-start", js.undefined)
    
    inline def setZEnd(value: Double): Self = StObject.set(x, "zEnd", value.asInstanceOf[js.Any])
    
    inline def setZEndUndefined: Self = StObject.set(x, "zEnd", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    inline def setZStart(value: Double): Self = StObject.set(x, "zStart", value.asInstanceOf[js.Any])
    
    inline def setZStartUndefined: Self = StObject.set(x, "zStart", js.undefined)
  }
}
