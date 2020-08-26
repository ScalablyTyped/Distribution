package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  /**
    * Sets the transparency level of backgrounds, borders, and lines. Values must range between 0.0 and 1.0, with 0.0 being completely t
    * ransparent and 1.0 being completely opaque. Note that values require the leading zero before the decimal point. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  var animation: js.UndefOr[`1`] = js.native
  /**
    * Modifies how data points appear on a chart. Refer to the applicable chart types page for more information. Options by Chart Type:
    * "segmented" | "spline" | "stepped" | "jumped" | "cone" | "histogram" | ...
    */
  var aspect: js.UndefOr[String] = js.native
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g. "red", "blue", "yellow"), in hexadecimal notation (e.
    * g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0,0,255)", "rgb(255,255,0)"). One color will se
    * t a solid background color, two colors will, by default, create a horizontal gradient. For more complex gradients, use "gradient-c
    * olors" and "gradient-stops". "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the first color of a 2 color background gradient of the object. To be used with "background-color-2". "none" | "transparent"
    * | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.native
  /**
    * Sets the second color of a 2 color background gradient of the object. To be used with "background-color-1". "none" | "transparent"
    *  | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
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
  var `background-marker`: js.UndefOr[Filloffsety] = js.native
  /**
    * Sets the position of the background when the "background-repeat" value is "no-repeat". "0 0" | "50 100" | "80% 60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.native
  /**
    * Sets the repeating mode for the background image. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.native
  var `background-state`: js.UndefOr[Filltype] = js.native
  /**
    * Nested Pie Charts Only: This attribute is used to set the space between band in nested pie charts ("type":"nestedpie"). 5 | 10 | .
    * ..
    */
  var `band-space`: js.UndefOr[Double] = js.native
  /**
    * Bar Charts and Bullet Charts Only: Sets the max width of bars. "10" | "10%" | "10px"
    */
  var `bar-max-width`: js.UndefOr[Double] = js.native
  /**
    * Bar Charts and Bullet Charts Only: Sets the amount of space between each bar in a single plot index. "10" | "10%" | "10px"
    */
  var `bar-space`: js.UndefOr[Double] = js.native
  /**
    * Bar Charts and Bullet Charts Only: Sets the width of each bar. "10" | "10%" | "10px"
    */
  var `bar-width`: js.UndefOr[Double] = js.native
  /**
    * Bar Charts and Bullet Charts Only: Defines how much the bars in each plot index should overlap. "10" | "10%" | "10px"
    */
  var `bars-overlap`: js.UndefOr[Double] = js.native
  /**
    * Bar Charts and Bullet Charts Only: Defines the spacing to the left of the bars at each index position. "10" | "10%" | "10px"
    */
  var `bars-space-left`: js.UndefOr[Double] = js.native
  /**
    * Bar Charts and Bullet Charts Only: Defines the spacing to the right of the bars at each index position. "10" | "10%" | "10px"
    */
  var `bars-space-right`: js.UndefOr[Double] = js.native
  /**
    * Sets the border color of the object, applicable on closed shapes. See also "line-color" for closed shapes. "none" | "transparent"
    * | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the object's border radius, for rounded corners. Larger values create rounder corners, while smaller values create sharper co
    * rners. A single value will affect all 4 corners, while multiple values will have separate effects on each corner, with the first v
    * alue affecting the top-left corner, the second value affecting the top-right corner, and so on, in a clockwise direction. A negati
    * ve value will cut a corner off without rounding. 4 | "6px" | "6px 10px 3px 5px" | "-10px" | ...
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
    * Sets the border width of the object, applicable on closed shapes. See also "line-width" for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets whether an object will have a callout arrow or not. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.native
  /**
    * Sets the height of the object's callout arrow. A larger value will create a taller callout arrow. 4 | "6px" | ...
    */
  var `callout-height`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the point of the tip of the callout arrow to a specified coordinate on the chart, with the starting point of [0,0] being the
    * top left corner of the chart. [200, 50] | ...
    */
  var `callout-hook`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the offset along the callout direction of the arrow's base. Positive and negative values can be used to offset the callout ar
    * row up, down, left, or right depending on the "callout-position". 4 | "6px" | ...
    */
  var `callout-offset`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the position for the object's callout arrow. The position is "bottom" by default. "top" | "right" | "bottom" | "left"
    */
  var `callout-position`: js.UndefOr[String] = js.native
  /**
    * Sets the width of the object's callout arrow. A larger value will create a wider callout arrow. 4 | "6px" | ...
    */
  var `callout-width`: js.UndefOr[js.Any] = js.native
  /**
    * By defalut null values within series arrays will create a blank space within a plot. Setting connected-nulls to true will connect
    * values through a null data point. true | false | 1 | 0
    */
  var `connect-nulls`: js.UndefOr[Boolean] = js.native
  /**
    * Area Charts Only: Sets whether the contour lines on area plots will be on top of all areas or will be hidden by the next area plot
    *  on top of it. You will notice when the attribute is set to true the lines are all set above the shaded regions. true | false | 1
    * | 0
    */
  var `contour-on-top`: js.UndefOr[Boolean] = js.native
  /**
    * Sets the style of the cursor when hovering over a node. "hand" | "normal"
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * This attribute allows you to create custom tokens and associate static or dynamic data to them. This attribute can be used almost
    * anywhere in a chart. "Some Text" | ...
    */
  @JSName("data-...")
  var `data-DotDotDot`: js.UndefOr[String] = js.native
  /**
    * Using the decimals attribute will allow you to set the number of decimal places associated to each value. 5 | 10 | ...
    */
  var decimals: js.UndefOr[Double] = js.native
  /**
    * The "decimals-separator": attribute allows you to set what type of punctuation the will be used in the decimal place. "." | "," |
    * ...
    */
  var `decimals-separator`: js.UndefOr[String] = js.native
  /**
    * This attribute sets description text for the plot which can be addressed in various areas with the %plot-description token. "Some
    * Text" | ...
    */
  var description: js.UndefOr[String] = js.native
  var error: js.UndefOr[Linegapsize] = js.native
  var errors: js.UndefOr[js.Array[js.Object]] = js.native
  /**
    * By default ZingChart uses sampling when rendering charts. This helps improve rendering speeds and typically does not effect the ap
    * pearance of the chart. However, using the attribute "exact": true within the "plot": { } object forces ZingChart to render all nod
    * es. true | false | 1 | 0
    */
  var exact: js.UndefOr[Boolean] = js.native
  /**
    * This attribute sets the values to scientific notation true | false | 1 | 0
    */
  var exponent: js.UndefOr[Boolean] = js.native
  /**
    * This attribute set the number of decimals to be used when using exponents for scientific notation 5 | 10 | ...
    */
  var exponentDecimals: js.UndefOr[Double] = js.native
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
  var goal: js.UndefOr[Height] = js.native
  /**
    * Bullet Charts Only: Accepts numerical values. Determines where goals are set for all plots. The "goals": [ ] values can also be se
    * t individually within each value set. [45, 70, 60]
    */
  var goals: js.UndefOr[js.Any] = js.native
  /**
    * Sets a set of colors for a complex background gradient consisting of 2 or more colors. To be used with "gradient-stops". "#f00 #0f
    * 0 #00f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.native
  /**
    * Sets the gradient stops for a complex background gradient consisting of 2 or more colors. To be used with "gradient-colors". "0.1
    * 0.5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.native
  /**
    * When true, automatically selects all nodes with the same scale index as the selected node. The selection-mode attribute must also
    * be set. true | false | 1 | 0
    */
  var `group-selections`: js.UndefOr[Boolean] = js.native
  var `guide-label`: js.UndefOr[Fontsize] = js.native
  var `highlight-marker`: js.UndefOr[Linewidth] = js.native
  var `highlight-state`: js.UndefOr[Linewidth] = js.native
  var `hover-marker`: js.UndefOr[Gradientcolors] = js.native
  var `hover-state`: js.UndefOr[Alphaarea] = js.native
  /**
    * Venn Diagrams Only: This attribute allow you to set the values for the area to be shared between each node. [30]
    */
  var join: js.UndefOr[js.Any] = js.native
  var `legend-item`: js.UndefOr[Borderradiusbottomleft] = js.native
  var `legend-marker`: js.UndefOr[Cursor] = js.native
  /**
    * The "legend-text": attribute is typically used within "series": [ ] value sets. Using this attribute allows you to associate both
    * a "text":" " and "legend-text":" " to each value set "Some Text" | ...
    */
  var `legend-text`: js.UndefOr[String] = js.native
  /**
    * Sets the line color of the object, applicable on non-closed shapes. See also "border-color"for closed shapes. "none" | "transparen
    * t" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  /**
    * Can be used to create custom dashed or dotted lines when used with "line-segment-size". This will control the size of the gaps bet
    * ween each line segment. 4 | "6px" | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.native
  /**
    * Can be used to create custom dashed or dotted lines when used with "line-gap-size". This will control the size of the visible segm
    * ent of line. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed"
    */
  var `line-style`: js.UndefOr[String] = js.native
  /**
    * Sets the line width of the object, applicable on non-closed shapes. See also "border-width" for closed shapes. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.native
  var marker: js.UndefOr[Gradientstops] = js.native
  /**
    * Applies to charts such as line and area which have markers. When there are too many markers for the chart ZingChart does not displ
    * ay all markers. Example 1000 nodes on a 300px wide chart. Setting max-nodes will override the default setting and force nodes to b
    * e displayed. 5 | 10 | ...
    */
  var `max-nodes`: js.UndefOr[Double] = js.native
  /**
    * Heat Maps Only: Sets a maximum ratio applied to the value of the node when calculating its aspect. 0 | 0.4 | ...
    */
  var `max-ratio`: js.UndefOr[Double] = js.native
  /**
    * Bubble Charts and Bubble Pie Charts Only: Defines the maximum size of the bubble if the value representing size is not sharing the
    *  same ratio with the value scale. 5 | 10 | ...
    */
  var `max-size`: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum numbers of nodes for which a tracking area will be created. This is best used to optimize charts with large sets
    * of data. 5 | 10 | ...
    */
  var `max-trackers`: js.UndefOr[Double] = js.native
  /**
    * Sets whether or not a node is wrapped equally before and after its position. true | false | 1 | 0
    */
  var `mid-point`: js.UndefOr[Boolean] = js.native
  /**
    * Heat Maps Only: Sets a minimum ratio applied to the value of the node when calculating its aspect. 0 | 0.4 | ...
    */
  var `min-ratio`: js.UndefOr[Double] = js.native
  /**
    * Bubble Charts and Bubble Pie Charts Only: Defines the minimum size of the bubble if the value representing size is not sharing the
    *  same ratio with the value scale. 5 | 10 | ...
    */
  var `min-size`: js.UndefOr[Double] = js.native
  /**
    * Sets whether monotone interpolation is used for charts using the "spline" aspect. true | false | 1 | 0
    */
  var monotone: js.UndefOr[Boolean] = js.native
  /**
    * Setting "multiplier": true will take large numbers such as thousands, millions, etc and replace the full number with an abbreviate
    * d notation with a short unit such as K, M, B, etc true | false | 1 | 0
    */
  var multiplier: js.UndefOr[Boolean] = js.native
  /**
    * This attribute will determine how negative values are handled. When using "format":"$%v" setting "negation":"currency" will move t
    * he - symbol to the outside of the $ sign. When using "negation" within the "plot": { } object you will see changes in things such
    * as tooltips or anywhere else series data is used to populate values. You need to set "negation" in things such as "scale-y": { } s
    * eparately. "standard" | "currency"
    */
  var negation: js.UndefOr[String] = js.native
  /**
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.native
  /**
    * Pie Charts Only: Use this to transform the shape of the pie slices.
    */
  var `pie-transformpieTransform`: js.UndefOr[String] = js.native
  var preview: js.UndefOr[Type] = js.native
  /**
    * Pie Charts Only: Provides the ability to rotate the chart. 5 | 10 | ...
    */
  var `ref-angle`: js.UndefOr[Double] = js.native
  /**
    * Heat Maps Only: Sets the value (default 'plot-max') which is used as a reference for calculating node aspect. "plot-max" | "plot-t
    * otal" | "chart-max" | "chart-total"
    */
  var reference: js.UndefOr[String] = js.native
  var rules: js.UndefOr[js.Array[Rule]] = js.native
  /**
    * By default ZingChart uses sampling when rendering large datasets. If you are trying to render 10000 data points on a chart which i
    * s only 500px wide there is not enough space for each data point. ZingChart will automatically determine which data points to show.
    *  The "sampling-step": attribute allows you to set the step for sampling. For example if you have 10000 data points and set "sampli
    * ng-step":10 it will show point 1,10,20,... Also note the "exact": true attribute if you want to force all data points. 5 | 10 | ..
    * .
    */
  var `sampling-step`: js.UndefOr[Double] = js.native
  /**
    * Specifies the scales used by the series item. scale-x,scale-y | scale-x,scale-y-2 | ...
    */
  var scales: js.UndefOr[String] = js.native
  /**
    * Bubble Charts and Bubble Pie Charts Only: Sets the method used to relate the bubble numerical value to it's aspect. "radius" | "sq
    * rt" | "area"
    */
  var scaling: js.UndefOr[String] = js.native
  /**
    * When scrolling is enabled for a chart, ZingChart automatically samples the data in order to maintain performance during the re-ren
    * dering of the chart that occurs during scrolling. By default, ZingChart will automatically sample every other item (scroll-step-mu
    * ltiplier:2). Setting scroll-step-multiplier to 1 will force the library to sample every data point, essentially disabling sampling
    * . 5 | 10 | ...
    */
  var `scroll-step-multiplier`: js.UndefOr[Double] = js.native
  /**
    * Line Charts and Area Charts Only: Allows you to specify whether tooltips are activated by the markers and lines (default) or the m
    * arkers only. true (default) | false
    */
  var `segment-trackers`: js.UndefOr[Boolean] = js.native
  var `selected-marker`: js.UndefOr[Offsetx] = js.native
  var `selected-state`: js.UndefOr[Shadow] = js.native
  /**
    * Sets whether the object's shadow is visible or not. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.native
  /**
    * Sets the transparency of the shadow of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and
    * 1.0 being completely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
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
    * Setting "short": true will abbreviate long numbers such as 100000 to 1K or 1000000 to 1M. When set within the "plot": {} object th
    * is change will be noticed anywhere values are pulled from series data. This can also be used in places such as "scale-y, scale-x,
    * etc" true | false | 1 | 0
    */
  var short: js.UndefOr[Boolean] = js.native
  /**
    * By default when setting "short": true ZingChart will round to the nearest short unit (ie 100000 to 100K and 1000000 to 1M). You ca
    * n set the short-unit and ZingChart will round all numbers to that unit. Note when setting this within the "plot": { } object the c
    * hanges will only effect values which are pulled from the series values. Things such as scale are set separately. "k" | "K" | "m" |
    *  "M" | "b" | "B"
    */
  var `short-unit`: js.UndefOr[String] = js.native
  /**
    * On bar charts, when the value of a bar is 0, setting `show-zero`: true will add 1 pixel to the height of the bar so that it is onl
    * y just visible. true | false | 1 | 0
    */
  var `show-zero`: js.UndefOr[Boolean] = js.native
  /**
    * Bubble Charts and Bubble Pie Charts Only: Sets a multiplier (default 1) used to increase/decrease the bubble size 5 | 10 | ...
    */
  var `size-factor`: js.UndefOr[Double] = js.native
  /**
    * Nested Pie Charts Only: Sets the initial offset of the pie layers when making a nestedpie 5 | 10 | ...
    */
  var `slice-start`: js.UndefOr[Double] = js.native
  /**
    * A boolean to smart sample and render data at a sampled size. Used in conjuction with exact:false true | false
    */
  var `smart-sampling`: js.UndefOr[Boolean] = js.native
  /**
    * Using the "stack": attribute allows you to assign which plot index you want to each value set associated with when using a stacked
    *  chart. 5 | 10 | ...
    */
  var stack: js.UndefOr[Double] = js.native
  /**
    * Setting "stacked": true will take each of the "series": [ ] value sets and stack them on top of one another true | false | 1 | 0
    */
  var stacked: js.UndefOr[Boolean] = js.native
  /**
    * Applicable on aspect=stepped, sets the location of the stepping relative to two consecutive nodes. "before" | "middle" | "after"
    */
  var `step-start`: js.UndefOr[String] = js.native
  /**
    * Sets the url's target for the link associated with the object. Use with "url". "_blank" | ...
    */
  var target: js.UndefOr[String] = js.native
  /**
    * Sets the thickness of pie3d charts. 5 | 10 | ...
    */
  var thickness: js.UndefOr[Double] = js.native
  /**
    * When you set the "thousands-separator": attribute the punctuation which is used will be placed to separate digits which go into 1,
    * 000's 10,000's etc. When placed in the "plot": { } object this will only effect values which are pulled directly from the series d
    * ata. Objects such as "scale-y": { }, "scale-x": { }, etc..., will need to be set separately. "." | "," | ...
    */
  var `thousands-separator`: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[Backgroundfit] = js.native
  /**
    * Using the "tooltip-text":" " attribute allows you to set text for tooltips. This can also be done using a variety of other tokens
    * "Some Text" | ...
    */
  var `tooltip-text`: js.UndefOr[String] = js.native
  var trend: js.UndefOr[AlphaBackgroundcolor] = js.native
  /**
    * Sets the URL for the link associated with the object. "http://www.domain.com/link.php" | "link.asp" | ...
    */
  var url: js.UndefOr[String] = js.native
  var `value-box`: js.UndefOr[Callout] = js.native
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Sets the z-axis end point on 3d charts. 10 | "10px" | ...
    */
  var `z-end`: js.UndefOr[Double] = js.native
  /**
    * Sets the z-axis start point on 3d charts. 10 | "10px" | ...
    */
  var `z-start`: js.UndefOr[Double] = js.native
}

object Animation {
  @scala.inline
  def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
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
    def setAnimation(value: `1`): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAspect(value: String): Self = this.set("aspect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspect: Self = this.set("aspect", js.undefined)
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
    def `setBackground-marker`(value: Filloffsety): Self = this.set("background-marker", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-marker`: Self = this.set("background-marker", js.undefined)
    @scala.inline
    def `setBackground-position`(value: String): Self = this.set("background-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-position`: Self = this.set("background-position", js.undefined)
    @scala.inline
    def `setBackground-repeat`(value: String): Self = this.set("background-repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-repeat`: Self = this.set("background-repeat", js.undefined)
    @scala.inline
    def `setBackground-state`(value: Filltype): Self = this.set("background-state", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-state`: Self = this.set("background-state", js.undefined)
    @scala.inline
    def `setBand-space`(value: Double): Self = this.set("band-space", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBand-space`: Self = this.set("band-space", js.undefined)
    @scala.inline
    def `setBar-max-width`(value: Double): Self = this.set("bar-max-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBar-max-width`: Self = this.set("bar-max-width", js.undefined)
    @scala.inline
    def `setBar-space`(value: Double): Self = this.set("bar-space", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBar-space`: Self = this.set("bar-space", js.undefined)
    @scala.inline
    def `setBar-width`(value: Double): Self = this.set("bar-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBar-width`: Self = this.set("bar-width", js.undefined)
    @scala.inline
    def `setBars-overlap`(value: Double): Self = this.set("bars-overlap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBars-overlap`: Self = this.set("bars-overlap", js.undefined)
    @scala.inline
    def `setBars-space-left`(value: Double): Self = this.set("bars-space-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBars-space-left`: Self = this.set("bars-space-left", js.undefined)
    @scala.inline
    def `setBars-space-right`(value: Double): Self = this.set("bars-space-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBars-space-right`: Self = this.set("bars-space-right", js.undefined)
    @scala.inline
    def `setBorder-color`(value: String): Self = this.set("border-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-color`: Self = this.set("border-color", js.undefined)
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
    def `setBorder-width`(value: js.Any): Self = this.set("border-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-width`: Self = this.set("border-width", js.undefined)
    @scala.inline
    def setCallout(value: Boolean): Self = this.set("callout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallout: Self = this.set("callout", js.undefined)
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
    def `setConnect-nulls`(value: Boolean): Self = this.set("connect-nulls", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteConnect-nulls`: Self = this.set("connect-nulls", js.undefined)
    @scala.inline
    def `setContour-on-top`(value: Boolean): Self = this.set("contour-on-top", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContour-on-top`: Self = this.set("contour-on-top", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def `setData-DotDotDot`(value: String): Self = this.set("data-...", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteData-DotDotDot`: Self = this.set("data-...", js.undefined)
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimals: Self = this.set("decimals", js.undefined)
    @scala.inline
    def `setDecimals-separator`(value: String): Self = this.set("decimals-separator", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDecimals-separator`: Self = this.set("decimals-separator", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setError(value: Linegapsize): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: js.Object*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[js.Object]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    @scala.inline
    def setExponent(value: Boolean): Self = this.set("exponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExponent: Self = this.set("exponent", js.undefined)
    @scala.inline
    def setExponentDecimals(value: Double): Self = this.set("exponentDecimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExponentDecimals: Self = this.set("exponentDecimals", js.undefined)
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
    def setGoal(value: Height): Self = this.set("goal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoal: Self = this.set("goal", js.undefined)
    @scala.inline
    def setGoals(value: js.Any): Self = this.set("goals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoals: Self = this.set("goals", js.undefined)
    @scala.inline
    def `setGradient-colors`(value: String): Self = this.set("gradient-colors", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGradient-colors`: Self = this.set("gradient-colors", js.undefined)
    @scala.inline
    def `setGradient-stops`(value: String): Self = this.set("gradient-stops", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGradient-stops`: Self = this.set("gradient-stops", js.undefined)
    @scala.inline
    def `setGroup-selections`(value: Boolean): Self = this.set("group-selections", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGroup-selections`: Self = this.set("group-selections", js.undefined)
    @scala.inline
    def `setGuide-label`(value: Fontsize): Self = this.set("guide-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGuide-label`: Self = this.set("guide-label", js.undefined)
    @scala.inline
    def `setHighlight-marker`(value: Linewidth): Self = this.set("highlight-marker", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHighlight-marker`: Self = this.set("highlight-marker", js.undefined)
    @scala.inline
    def `setHighlight-state`(value: Linewidth): Self = this.set("highlight-state", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHighlight-state`: Self = this.set("highlight-state", js.undefined)
    @scala.inline
    def `setHover-marker`(value: Gradientcolors): Self = this.set("hover-marker", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHover-marker`: Self = this.set("hover-marker", js.undefined)
    @scala.inline
    def `setHover-state`(value: Alphaarea): Self = this.set("hover-state", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHover-state`: Self = this.set("hover-state", js.undefined)
    @scala.inline
    def setJoin(value: js.Any): Self = this.set("join", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    @scala.inline
    def `setLegend-item`(value: Borderradiusbottomleft): Self = this.set("legend-item", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLegend-item`: Self = this.set("legend-item", js.undefined)
    @scala.inline
    def `setLegend-marker`(value: Cursor): Self = this.set("legend-marker", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLegend-marker`: Self = this.set("legend-marker", js.undefined)
    @scala.inline
    def `setLegend-text`(value: String): Self = this.set("legend-text", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLegend-text`: Self = this.set("legend-text", js.undefined)
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
    def setMarker(value: Gradientstops): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def `setMax-nodes`(value: Double): Self = this.set("max-nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-nodes`: Self = this.set("max-nodes", js.undefined)
    @scala.inline
    def `setMax-ratio`(value: Double): Self = this.set("max-ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-ratio`: Self = this.set("max-ratio", js.undefined)
    @scala.inline
    def `setMax-size`(value: Double): Self = this.set("max-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-size`: Self = this.set("max-size", js.undefined)
    @scala.inline
    def `setMax-trackers`(value: Double): Self = this.set("max-trackers", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-trackers`: Self = this.set("max-trackers", js.undefined)
    @scala.inline
    def `setMid-point`(value: Boolean): Self = this.set("mid-point", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMid-point`: Self = this.set("mid-point", js.undefined)
    @scala.inline
    def `setMin-ratio`(value: Double): Self = this.set("min-ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMin-ratio`: Self = this.set("min-ratio", js.undefined)
    @scala.inline
    def `setMin-size`(value: Double): Self = this.set("min-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMin-size`: Self = this.set("min-size", js.undefined)
    @scala.inline
    def setMonotone(value: Boolean): Self = this.set("monotone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonotone: Self = this.set("monotone", js.undefined)
    @scala.inline
    def setMultiplier(value: Boolean): Self = this.set("multiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplier: Self = this.set("multiplier", js.undefined)
    @scala.inline
    def setNegation(value: String): Self = this.set("negation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegation: Self = this.set("negation", js.undefined)
    @scala.inline
    def `setOffset-x`(value: js.Any): Self = this.set("offset-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-x`: Self = this.set("offset-x", js.undefined)
    @scala.inline
    def `setOffset-y`(value: js.Any): Self = this.set("offset-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-y`: Self = this.set("offset-y", js.undefined)
    @scala.inline
    def `setPie-transformpieTransform`(value: String): Self = this.set("pie-transformpieTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePie-transformpieTransform`: Self = this.set("pie-transformpieTransform", js.undefined)
    @scala.inline
    def setPreview(value: Type): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    @scala.inline
    def `setRef-angle`(value: Double): Self = this.set("ref-angle", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRef-angle`: Self = this.set("ref-angle", js.undefined)
    @scala.inline
    def setReference(value: String): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[Rule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def `setSampling-step`(value: Double): Self = this.set("sampling-step", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSampling-step`: Self = this.set("sampling-step", js.undefined)
    @scala.inline
    def setScales(value: String): Self = this.set("scales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScales: Self = this.set("scales", js.undefined)
    @scala.inline
    def setScaling(value: String): Self = this.set("scaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaling: Self = this.set("scaling", js.undefined)
    @scala.inline
    def `setScroll-step-multiplier`(value: Double): Self = this.set("scroll-step-multiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-step-multiplier`: Self = this.set("scroll-step-multiplier", js.undefined)
    @scala.inline
    def `setSegment-trackers`(value: Boolean): Self = this.set("segment-trackers", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSegment-trackers`: Self = this.set("segment-trackers", js.undefined)
    @scala.inline
    def `setSelected-marker`(value: Offsetx): Self = this.set("selected-marker", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSelected-marker`: Self = this.set("selected-marker", js.undefined)
    @scala.inline
    def `setSelected-state`(value: Shadow): Self = this.set("selected-state", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSelected-state`: Self = this.set("selected-state", js.undefined)
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
    def setShort(value: Boolean): Self = this.set("short", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShort: Self = this.set("short", js.undefined)
    @scala.inline
    def `setShort-unit`(value: String): Self = this.set("short-unit", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShort-unit`: Self = this.set("short-unit", js.undefined)
    @scala.inline
    def `setShow-zero`(value: Boolean): Self = this.set("show-zero", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShow-zero`: Self = this.set("show-zero", js.undefined)
    @scala.inline
    def `setSize-factor`(value: Double): Self = this.set("size-factor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSize-factor`: Self = this.set("size-factor", js.undefined)
    @scala.inline
    def `setSlice-start`(value: Double): Self = this.set("slice-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSlice-start`: Self = this.set("slice-start", js.undefined)
    @scala.inline
    def `setSmart-sampling`(value: Boolean): Self = this.set("smart-sampling", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSmart-sampling`: Self = this.set("smart-sampling", js.undefined)
    @scala.inline
    def setStack(value: Double): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setStacked(value: Boolean): Self = this.set("stacked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacked: Self = this.set("stacked", js.undefined)
    @scala.inline
    def `setStep-start`(value: String): Self = this.set("step-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStep-start`: Self = this.set("step-start", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    @scala.inline
    def `setThousands-separator`(value: String): Self = this.set("thousands-separator", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteThousands-separator`: Self = this.set("thousands-separator", js.undefined)
    @scala.inline
    def setTooltip(value: Backgroundfit): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def `setTooltip-text`(value: String): Self = this.set("tooltip-text", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTooltip-text`: Self = this.set("tooltip-text", js.undefined)
    @scala.inline
    def setTrend(value: AlphaBackgroundcolor): Self = this.set("trend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrend: Self = this.set("trend", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def `setValue-box`(value: Callout): Self = this.set("value-box", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteValue-box`: Self = this.set("value-box", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def `setZ-end`(value: Double): Self = this.set("z-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteZ-end`: Self = this.set("z-end", js.undefined)
    @scala.inline
    def `setZ-start`(value: Double): Self = this.set("z-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteZ-start`: Self = this.set("z-start", js.undefined)
  }
  
}

