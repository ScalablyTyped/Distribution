package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  /**
    * Sets the transparency level of backgrounds, borders, and lines. Values must range between 0.0 and 1.0, with 0.0 being completely t
    * ransparent and 1.0 being completely opaque. Note that values require the leading zero before the decimal point. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  var animation: js.UndefOr[`1`] = js.undefined
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
  var `background-marker`: js.UndefOr[Filloffsety] = js.undefined
  /**
    * Sets the position of the background when the "background-repeat" value is "no-repeat". "0 0" | "50 100" | "80% 60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.undefined
  /**
    * Sets the repeating mode for the background image. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.undefined
  var `background-state`: js.UndefOr[Filltype] = js.undefined
  /**
    * Nested Pie Charts Only: This attribute is used to set the space between band in nested pie charts ("type":"nestedpie"). 5 | 10 | .
    * ..
    */
  var `band-space`: js.UndefOr[Double] = js.undefined
  /**
    * Bar Charts and Bullet Charts Only: Sets the max width of bars. "10" | "10%" | "10px"
    */
  var `bar-max-width`: js.UndefOr[Double] = js.undefined
  /**
    * Bar Charts and Bullet Charts Only: Sets the amount of space between each bar in a single plot index. "10" | "10%" | "10px"
    */
  var `bar-space`: js.UndefOr[Double] = js.undefined
  /**
    * Bar Charts and Bullet Charts Only: Sets the width of each bar. "10" | "10%" | "10px"
    */
  var `bar-width`: js.UndefOr[Double] = js.undefined
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
    * Sets the border width of the object, applicable on closed shapes. See also "line-width" for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets whether an object will have a callout arrow or not. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the height of the object's callout arrow. A larger value will create a taller callout arrow. 4 | "6px" | ...
    */
  var `callout-height`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the point of the tip of the callout arrow to a specified coordinate on the chart, with the starting point of [0,0] being the
    * top left corner of the chart. [200, 50] | ...
    */
  var `callout-hook`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the offset along the callout direction of the arrow's base. Positive and negative values can be used to offset the callout ar
    * row up, down, left, or right depending on the "callout-position". 4 | "6px" | ...
    */
  var `callout-offset`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the position for the object's callout arrow. The position is "bottom" by default. "top" | "right" | "bottom" | "left"
    */
  var `callout-position`: js.UndefOr[String] = js.undefined
  /**
    * Sets the width of the object's callout arrow. A larger value will create a wider callout arrow. 4 | "6px" | ...
    */
  var `callout-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * By defalut null values within series arrays will create a blank space within a plot. Setting connected-nulls to true will connect
    * values through a null data point. true | false | 1 | 0
    */
  var `connect-nulls`: js.UndefOr[Boolean] = js.undefined
  /**
    * Area Charts Only: Sets whether the contour lines on area plots will be on top of all areas or will be hidden by the next area plot
    *  on top of it. You will notice when the attribute is set to true the lines are all set above the shaded regions. true | false | 1
    * | 0
    */
  var `contour-on-top`: js.UndefOr[Boolean] = js.undefined
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
    * Using the decimals attribute will allow you to set the number of decimal places associated to each value. 5 | 10 | ...
    */
  var decimals: js.UndefOr[Double] = js.undefined
  /**
    * The "decimals-separator": attribute allows you to set what type of punctuation the will be used in the decimal place. "." | "," |
    * ...
    */
  var `decimals-separator`: js.UndefOr[String] = js.undefined
  /**
    * This attribute sets description text for the plot which can be addressed in various areas with the %plot-description token. "Some
    * Text" | ...
    */
  var description: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[Linegapsize] = js.undefined
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
  var exponentDecimals: js.UndefOr[Double] = js.undefined
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
  var goal: js.UndefOr[Height] = js.undefined
  /**
    * Bullet Charts Only: Accepts numerical values. Determines where goals are set for all plots. The "goals": [ ] values can also be se
    * t individually within each value set. [45, 70, 60]
    */
  var goals: js.UndefOr[js.Any] = js.undefined
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
  /**
    * When true, automatically selects all nodes with the same scale index as the selected node. The selection-mode attribute must also
    * be set. true | false | 1 | 0
    */
  var `group-selections`: js.UndefOr[Boolean] = js.undefined
  var `guide-label`: js.UndefOr[Fontsize] = js.undefined
  var `highlight-marker`: js.UndefOr[Linewidth] = js.undefined
  var `highlight-state`: js.UndefOr[Linewidth] = js.undefined
  var `hover-marker`: js.UndefOr[Gradientcolors] = js.undefined
  var `hover-state`: js.UndefOr[Alphaarea] = js.undefined
  /**
    * Venn Diagrams Only: This attribute allow you to set the values for the area to be shared between each node. [30]
    */
  var join: js.UndefOr[js.Any] = js.undefined
  var `legend-item`: js.UndefOr[Borderradiusbottomleft] = js.undefined
  var `legend-marker`: js.UndefOr[Cursor] = js.undefined
  /**
    * The "legend-text": attribute is typically used within "series": [ ] value sets. Using this attribute allows you to associate both
    * a "text":" " and "legend-text":" " to each value set "Some Text" | ...
    */
  var `legend-text`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line color of the object, applicable on non-closed shapes. See also "border-color"for closed shapes. "none" | "transparen
    * t" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  /**
    * Can be used to create custom dashed or dotted lines when used with "line-segment-size". This will control the size of the gaps bet
    * ween each line segment. 4 | "6px" | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * Can be used to create custom dashed or dotted lines when used with "line-gap-size". This will control the size of the visible segm
    * ent of line. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line width of the object, applicable on non-closed shapes. See also "border-width" for closed shapes. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.undefined
  var marker: js.UndefOr[Gradientstops] = js.undefined
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
  /**
    * Sets whether or not a node is wrapped equally before and after its position. true | false | 1 | 0
    */
  var `mid-point`: js.UndefOr[Boolean] = js.undefined
  /**
    * Heat Maps Only: Sets a minimum ratio applied to the value of the node when calculating its aspect. 0 | 0.4 | ...
    */
  var `min-ratio`: js.UndefOr[Double] = js.undefined
  /**
    * Bubble Charts and Bubble Pie Charts Only: Defines the minimum size of the bubble if the value representing size is not sharing the
    *  same ratio with the value scale. 5 | 10 | ...
    */
  var `min-size`: js.UndefOr[Double] = js.undefined
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
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Pie Charts Only: Use this to transform the shape of the pie slices.
    */
  var `pie-transformpieTransform`: js.UndefOr[String] = js.undefined
  var preview: js.UndefOr[Type] = js.undefined
  /**
    * Pie Charts Only: Provides the ability to rotate the chart. 5 | 10 | ...
    */
  var `ref-angle`: js.UndefOr[Double] = js.undefined
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
  /**
    * Line Charts and Area Charts Only: Allows you to specify whether tooltips are activated by the markers and lines (default) or the m
    * arkers only. true (default) | false
    */
  var `segment-trackers`: js.UndefOr[Boolean] = js.undefined
  var `selected-marker`: js.UndefOr[Offsetx] = js.undefined
  var `selected-state`: js.UndefOr[Shadow] = js.undefined
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
  /**
    * On bar charts, when the value of a bar is 0, setting `show-zero`: true will add 1 pixel to the height of the bar so that it is onl
    * y just visible. true | false | 1 | 0
    */
  var `show-zero`: js.UndefOr[Boolean] = js.undefined
  /**
    * Bubble Charts and Bubble Pie Charts Only: Sets a multiplier (default 1) used to increase/decrease the bubble size 5 | 10 | ...
    */
  var `size-factor`: js.UndefOr[Double] = js.undefined
  /**
    * Nested Pie Charts Only: Sets the initial offset of the pie layers when making a nestedpie 5 | 10 | ...
    */
  var `slice-start`: js.UndefOr[Double] = js.undefined
  /**
    * A boolean to smart sample and render data at a sampled size. Used in conjuction with exact:false true | false
    */
  var `smart-sampling`: js.UndefOr[Boolean] = js.undefined
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
  /**
    * Sets the url's target for the link associated with the object. Use with "url". "_blank" | ...
    */
  var target: js.UndefOr[String] = js.undefined
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
  var tooltip: js.UndefOr[Backgroundfit] = js.undefined
  /**
    * Using the "tooltip-text":" " attribute allows you to set text for tooltips. This can also be done using a variety of other tokens
    * "Some Text" | ...
    */
  var `tooltip-text`: js.UndefOr[String] = js.undefined
  var trend: js.UndefOr[AlphaBackgroundcolor] = js.undefined
  /**
    * Sets the URL for the link associated with the object. "http://www.domain.com/link.php" | "link.asp" | ...
    */
  var url: js.UndefOr[String] = js.undefined
  var `value-box`: js.UndefOr[Callout] = js.undefined
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the z-axis end point on 3d charts. 10 | "10px" | ...
    */
  var `z-end`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the z-axis start point on 3d charts. 10 | "10px" | ...
    */
  var `z-start`: js.UndefOr[Double] = js.undefined
}

object Animation {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    animation: `1` = null,
    aspect: String = null,
    `background-color`: String = null,
    `background-color-1`: String = null,
    `background-color-2`: String = null,
    `background-fit`: String = null,
    `background-image`: String = null,
    `background-marker`: Filloffsety = null,
    `background-position`: String = null,
    `background-repeat`: String = null,
    `background-state`: Filltype = null,
    `band-space`: js.UndefOr[Double] = js.undefined,
    `bar-max-width`: js.UndefOr[Double] = js.undefined,
    `bar-space`: js.UndefOr[Double] = js.undefined,
    `bar-width`: js.UndefOr[Double] = js.undefined,
    `bars-overlap`: js.UndefOr[Double] = js.undefined,
    `bars-space-left`: js.UndefOr[Double] = js.undefined,
    `bars-space-right`: js.UndefOr[Double] = js.undefined,
    `border-color`: String = null,
    `border-radius`: js.Any = null,
    `border-radius-bottom-left`: js.Any = null,
    `border-radius-bottom-right`: js.Any = null,
    `border-radius-top-left`: js.Any = null,
    `border-radius-top-right`: js.Any = null,
    `border-width`: js.Any = null,
    callout: js.UndefOr[Boolean] = js.undefined,
    `callout-height`: js.Any = null,
    `callout-hook`: js.Any = null,
    `callout-offset`: js.Any = null,
    `callout-position`: String = null,
    `callout-width`: js.Any = null,
    `connect-nulls`: js.UndefOr[Boolean] = js.undefined,
    `contour-on-top`: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    `data-DotDotDot`: String = null,
    decimals: js.UndefOr[Double] = js.undefined,
    `decimals-separator`: String = null,
    description: String = null,
    error: Linegapsize = null,
    errors: js.Array[js.Object] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    exponent: js.UndefOr[Boolean] = js.undefined,
    exponentDecimals: js.UndefOr[Double] = js.undefined,
    `fill-angle`: js.UndefOr[Double] = js.undefined,
    `fill-offset-x`: js.Any = null,
    `fill-offset-y`: js.Any = null,
    `fill-type`: String = null,
    goal: Height = null,
    goals: js.Any = null,
    `gradient-colors`: String = null,
    `gradient-stops`: String = null,
    `group-selections`: js.UndefOr[Boolean] = js.undefined,
    `guide-label`: Fontsize = null,
    `highlight-marker`: Linewidth = null,
    `highlight-state`: Linewidth = null,
    `hover-marker`: Gradientcolors = null,
    `hover-state`: Alphaarea = null,
    join: js.Any = null,
    `legend-item`: Borderradiusbottomleft = null,
    `legend-marker`: Cursor = null,
    `legend-text`: String = null,
    `line-color`: String = null,
    `line-gap-size`: js.Any = null,
    `line-segment-size`: js.Any = null,
    `line-style`: String = null,
    `line-width`: js.Any = null,
    marker: Gradientstops = null,
    `max-nodes`: js.UndefOr[Double] = js.undefined,
    `max-ratio`: js.UndefOr[Double] = js.undefined,
    `max-size`: js.UndefOr[Double] = js.undefined,
    `max-trackers`: js.UndefOr[Double] = js.undefined,
    `mid-point`: js.UndefOr[Boolean] = js.undefined,
    `min-ratio`: js.UndefOr[Double] = js.undefined,
    `min-size`: js.UndefOr[Double] = js.undefined,
    monotone: js.UndefOr[Boolean] = js.undefined,
    multiplier: js.UndefOr[Boolean] = js.undefined,
    negation: String = null,
    `offset-x`: js.Any = null,
    `offset-y`: js.Any = null,
    `pie-transformpieTransform`: String = null,
    preview: Type = null,
    `ref-angle`: js.UndefOr[Double] = js.undefined,
    reference: String = null,
    rules: js.Array[Rule] = null,
    `sampling-step`: js.UndefOr[Double] = js.undefined,
    scales: String = null,
    scaling: String = null,
    `scroll-step-multiplier`: js.UndefOr[Double] = js.undefined,
    `segment-trackers`: js.UndefOr[Boolean] = js.undefined,
    `selected-marker`: Offsetx = null,
    `selected-state`: Shadow = null,
    shadow: js.UndefOr[Boolean] = js.undefined,
    `shadow-alpha`: js.UndefOr[Double] = js.undefined,
    `shadow-angle`: js.UndefOr[Double] = js.undefined,
    `shadow-blur`: js.Any = null,
    `shadow-color`: String = null,
    `shadow-distance`: js.Any = null,
    short: js.UndefOr[Boolean] = js.undefined,
    `short-unit`: String = null,
    `show-zero`: js.UndefOr[Boolean] = js.undefined,
    `size-factor`: js.UndefOr[Double] = js.undefined,
    `slice-start`: js.UndefOr[Double] = js.undefined,
    `smart-sampling`: js.UndefOr[Boolean] = js.undefined,
    stack: js.UndefOr[Double] = js.undefined,
    stacked: js.UndefOr[Boolean] = js.undefined,
    `step-start`: String = null,
    target: String = null,
    thickness: js.UndefOr[Double] = js.undefined,
    `thousands-separator`: String = null,
    tooltip: Backgroundfit = null,
    `tooltip-text`: String = null,
    trend: AlphaBackgroundcolor = null,
    url: String = null,
    `value-box`: Callout = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    `z-end`: js.UndefOr[Double] = js.undefined,
    `z-start`: js.UndefOr[Double] = js.undefined
  ): Animation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`background-color-1` != null) __obj.updateDynamic("background-color-1")(`background-color-1`.asInstanceOf[js.Any])
    if (`background-color-2` != null) __obj.updateDynamic("background-color-2")(`background-color-2`.asInstanceOf[js.Any])
    if (`background-fit` != null) __obj.updateDynamic("background-fit")(`background-fit`.asInstanceOf[js.Any])
    if (`background-image` != null) __obj.updateDynamic("background-image")(`background-image`.asInstanceOf[js.Any])
    if (`background-marker` != null) __obj.updateDynamic("background-marker")(`background-marker`.asInstanceOf[js.Any])
    if (`background-position` != null) __obj.updateDynamic("background-position")(`background-position`.asInstanceOf[js.Any])
    if (`background-repeat` != null) __obj.updateDynamic("background-repeat")(`background-repeat`.asInstanceOf[js.Any])
    if (`background-state` != null) __obj.updateDynamic("background-state")(`background-state`.asInstanceOf[js.Any])
    if (!js.isUndefined(`band-space`)) __obj.updateDynamic("band-space")(`band-space`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`bar-max-width`)) __obj.updateDynamic("bar-max-width")(`bar-max-width`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`bar-space`)) __obj.updateDynamic("bar-space")(`bar-space`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`bar-width`)) __obj.updateDynamic("bar-width")(`bar-width`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`bars-overlap`)) __obj.updateDynamic("bars-overlap")(`bars-overlap`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`bars-space-left`)) __obj.updateDynamic("bars-space-left")(`bars-space-left`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`bars-space-right`)) __obj.updateDynamic("bars-space-right")(`bars-space-right`.get.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-radius` != null) __obj.updateDynamic("border-radius")(`border-radius`.asInstanceOf[js.Any])
    if (`border-radius-bottom-left` != null) __obj.updateDynamic("border-radius-bottom-left")(`border-radius-bottom-left`.asInstanceOf[js.Any])
    if (`border-radius-bottom-right` != null) __obj.updateDynamic("border-radius-bottom-right")(`border-radius-bottom-right`.asInstanceOf[js.Any])
    if (`border-radius-top-left` != null) __obj.updateDynamic("border-radius-top-left")(`border-radius-top-left`.asInstanceOf[js.Any])
    if (`border-radius-top-right` != null) __obj.updateDynamic("border-radius-top-right")(`border-radius-top-right`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (!js.isUndefined(callout)) __obj.updateDynamic("callout")(callout.get.asInstanceOf[js.Any])
    if (`callout-height` != null) __obj.updateDynamic("callout-height")(`callout-height`.asInstanceOf[js.Any])
    if (`callout-hook` != null) __obj.updateDynamic("callout-hook")(`callout-hook`.asInstanceOf[js.Any])
    if (`callout-offset` != null) __obj.updateDynamic("callout-offset")(`callout-offset`.asInstanceOf[js.Any])
    if (`callout-position` != null) __obj.updateDynamic("callout-position")(`callout-position`.asInstanceOf[js.Any])
    if (`callout-width` != null) __obj.updateDynamic("callout-width")(`callout-width`.asInstanceOf[js.Any])
    if (!js.isUndefined(`connect-nulls`)) __obj.updateDynamic("connect-nulls")(`connect-nulls`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`contour-on-top`)) __obj.updateDynamic("contour-on-top")(`contour-on-top`.get.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (`data-DotDotDot` != null) __obj.updateDynamic("data-...")(`data-DotDotDot`.asInstanceOf[js.Any])
    if (!js.isUndefined(decimals)) __obj.updateDynamic("decimals")(decimals.get.asInstanceOf[js.Any])
    if (`decimals-separator` != null) __obj.updateDynamic("decimals-separator")(`decimals-separator`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exponent)) __obj.updateDynamic("exponent")(exponent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exponentDecimals)) __obj.updateDynamic("exponentDecimals")(exponentDecimals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`fill-angle`)) __obj.updateDynamic("fill-angle")(`fill-angle`.get.asInstanceOf[js.Any])
    if (`fill-offset-x` != null) __obj.updateDynamic("fill-offset-x")(`fill-offset-x`.asInstanceOf[js.Any])
    if (`fill-offset-y` != null) __obj.updateDynamic("fill-offset-y")(`fill-offset-y`.asInstanceOf[js.Any])
    if (`fill-type` != null) __obj.updateDynamic("fill-type")(`fill-type`.asInstanceOf[js.Any])
    if (goal != null) __obj.updateDynamic("goal")(goal.asInstanceOf[js.Any])
    if (goals != null) __obj.updateDynamic("goals")(goals.asInstanceOf[js.Any])
    if (`gradient-colors` != null) __obj.updateDynamic("gradient-colors")(`gradient-colors`.asInstanceOf[js.Any])
    if (`gradient-stops` != null) __obj.updateDynamic("gradient-stops")(`gradient-stops`.asInstanceOf[js.Any])
    if (!js.isUndefined(`group-selections`)) __obj.updateDynamic("group-selections")(`group-selections`.get.asInstanceOf[js.Any])
    if (`guide-label` != null) __obj.updateDynamic("guide-label")(`guide-label`.asInstanceOf[js.Any])
    if (`highlight-marker` != null) __obj.updateDynamic("highlight-marker")(`highlight-marker`.asInstanceOf[js.Any])
    if (`highlight-state` != null) __obj.updateDynamic("highlight-state")(`highlight-state`.asInstanceOf[js.Any])
    if (`hover-marker` != null) __obj.updateDynamic("hover-marker")(`hover-marker`.asInstanceOf[js.Any])
    if (`hover-state` != null) __obj.updateDynamic("hover-state")(`hover-state`.asInstanceOf[js.Any])
    if (join != null) __obj.updateDynamic("join")(join.asInstanceOf[js.Any])
    if (`legend-item` != null) __obj.updateDynamic("legend-item")(`legend-item`.asInstanceOf[js.Any])
    if (`legend-marker` != null) __obj.updateDynamic("legend-marker")(`legend-marker`.asInstanceOf[js.Any])
    if (`legend-text` != null) __obj.updateDynamic("legend-text")(`legend-text`.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-gap-size` != null) __obj.updateDynamic("line-gap-size")(`line-gap-size`.asInstanceOf[js.Any])
    if (`line-segment-size` != null) __obj.updateDynamic("line-segment-size")(`line-segment-size`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`line-width` != null) __obj.updateDynamic("line-width")(`line-width`.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(`max-nodes`)) __obj.updateDynamic("max-nodes")(`max-nodes`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`max-ratio`)) __obj.updateDynamic("max-ratio")(`max-ratio`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`max-size`)) __obj.updateDynamic("max-size")(`max-size`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`max-trackers`)) __obj.updateDynamic("max-trackers")(`max-trackers`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`mid-point`)) __obj.updateDynamic("mid-point")(`mid-point`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`min-ratio`)) __obj.updateDynamic("min-ratio")(`min-ratio`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`min-size`)) __obj.updateDynamic("min-size")(`min-size`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monotone)) __obj.updateDynamic("monotone")(monotone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiplier)) __obj.updateDynamic("multiplier")(multiplier.get.asInstanceOf[js.Any])
    if (negation != null) __obj.updateDynamic("negation")(negation.asInstanceOf[js.Any])
    if (`offset-x` != null) __obj.updateDynamic("offset-x")(`offset-x`.asInstanceOf[js.Any])
    if (`offset-y` != null) __obj.updateDynamic("offset-y")(`offset-y`.asInstanceOf[js.Any])
    if (`pie-transformpieTransform` != null) __obj.updateDynamic("pie-transformpieTransform")(`pie-transformpieTransform`.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (!js.isUndefined(`ref-angle`)) __obj.updateDynamic("ref-angle")(`ref-angle`.get.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (!js.isUndefined(`sampling-step`)) __obj.updateDynamic("sampling-step")(`sampling-step`.get.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    if (!js.isUndefined(`scroll-step-multiplier`)) __obj.updateDynamic("scroll-step-multiplier")(`scroll-step-multiplier`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`segment-trackers`)) __obj.updateDynamic("segment-trackers")(`segment-trackers`.get.asInstanceOf[js.Any])
    if (`selected-marker` != null) __obj.updateDynamic("selected-marker")(`selected-marker`.asInstanceOf[js.Any])
    if (`selected-state` != null) __obj.updateDynamic("selected-state")(`selected-state`.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`shadow-alpha`)) __obj.updateDynamic("shadow-alpha")(`shadow-alpha`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`shadow-angle`)) __obj.updateDynamic("shadow-angle")(`shadow-angle`.get.asInstanceOf[js.Any])
    if (`shadow-blur` != null) __obj.updateDynamic("shadow-blur")(`shadow-blur`.asInstanceOf[js.Any])
    if (`shadow-color` != null) __obj.updateDynamic("shadow-color")(`shadow-color`.asInstanceOf[js.Any])
    if (`shadow-distance` != null) __obj.updateDynamic("shadow-distance")(`shadow-distance`.asInstanceOf[js.Any])
    if (!js.isUndefined(short)) __obj.updateDynamic("short")(short.get.asInstanceOf[js.Any])
    if (`short-unit` != null) __obj.updateDynamic("short-unit")(`short-unit`.asInstanceOf[js.Any])
    if (!js.isUndefined(`show-zero`)) __obj.updateDynamic("show-zero")(`show-zero`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`size-factor`)) __obj.updateDynamic("size-factor")(`size-factor`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`slice-start`)) __obj.updateDynamic("slice-start")(`slice-start`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`smart-sampling`)) __obj.updateDynamic("smart-sampling")(`smart-sampling`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked.get.asInstanceOf[js.Any])
    if (`step-start` != null) __obj.updateDynamic("step-start")(`step-start`.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(thickness)) __obj.updateDynamic("thickness")(thickness.get.asInstanceOf[js.Any])
    if (`thousands-separator` != null) __obj.updateDynamic("thousands-separator")(`thousands-separator`.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`tooltip-text` != null) __obj.updateDynamic("tooltip-text")(`tooltip-text`.asInstanceOf[js.Any])
    if (trend != null) __obj.updateDynamic("trend")(trend.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (`value-box` != null) __obj.updateDynamic("value-box")(`value-box`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`z-end`)) __obj.updateDynamic("z-end")(`z-end`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`z-start`)) __obj.updateDynamic("z-start")(`z-start`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

