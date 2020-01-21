package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlphaAngleAutofit extends js.Object {
  /**
    * Sets the text's transparency of the scale-y (The vertical scale line on the chart). 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the rotation angle of the object/shape. -45 | 115 | ...
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * true | false | 1 | 0
    */
  var `auto-fit`: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the number of decimals which will be displayed as scale-y values. Note this attribute does round the values to fit within the
    *  define number of decimals. 5 | 10 | ...
    */
  var decimals: js.UndefOr[Double] = js.undefined
  /**
    * Sets the separator to be used in place of the default decimal point. Any string or character can be used to replace the decimal. '
    * .' | ',' | ...
    */
  var `decimals-separator`: js.UndefOr[String] = js.undefined
  /**
    * Sets whether the scale values will be displayed in scientific notation. Particularly useful when dealing with large numbers. true
    * | false | 1 | 0
    */
  var exponent: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the number of decimals that will be displayed when using scientific notation. Use with the 'exponent' attribute. 5 | 10 | ...
    */
  var `exponent-decimals`: js.UndefOr[Double] = js.undefined
  /**
    * To format the appearance of the scale values. Use with the %scale-value (%v) token. '%v%' | '$%v' | '%v' | ...
    */
  var format: js.UndefOr[String] = js.undefined
  var guide: js.UndefOr[AnonAlphaBackgroundcolorBackgroundcolor1Backgroundcolor2Items] = js.undefined
  var item: js.UndefOr[
    AnonAlphaAngleBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBoldBorderbottom
  ] = js.undefined
  /**
    * To force all of the scale items to display. It is generally used with the 'max-items' attribute. true | false | 1 | 0
    */
  var `items-overlap`: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[
    AnonAlphaAngleBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBoldBorderbottom
  ] = js.undefined
  /**
    * Allows you to set custom labels that correspond to each of the ticks on a scale. If there are more ticks than labels, the default
    * values will be used for the remaining labels. ['Jan', 'Feb', 'Mar', ...] | ...
    */
  var labels: js.UndefOr[js.Any] = js.undefined
  /**
    * ''horizontal' | 'h' | 'vertical' | 'v' | 'row x col' | 'x col' | 'row x' | 'float''
    */
  var layout: js.UndefOr[String] = js.undefined
  /**
    * Sets the color of the axis line. 'none' | 'transparent' | '#f00' | '#f00 #00f' | 'red yellow' | 'rgb(100, 15, 15)' | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  /**
    * Can be used to create custom dashed or dotted lines when used with line-segment-size. This will control the size of the gaps betwe
    * en each line segment. 4 | '6px' | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * Can be used to create custom dashed or dotted lines when used with line-gap-size. This will control the size of the visible segmen
    * t of line. 4 | '6px' | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the line style of the axis line. 'solid' | 'dotted' | 'dashed' | 'dashdot'
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the width of the axis line. 4 | '6px' | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Logarithmic Scales only: To set the base value, which defaults to Math.E (Euler's number, the base of natural logarithms). Math.E
    * | 10 | 2 | ...
    */
  var `log-base`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's margin/s. 10 | '5px' | '10 20' | '5px 10px 15px 20px' | ...
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's bottom margin. 4 | '6px' | ...
    */
  var `margin-bottom`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's left margin. 4 | '6px' | ...
    */
  var `margin-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's right margin. 4 | '6px' | ...
    */
  var `margin-right`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's top margin. 4 | '6px' | ...
    */
  var `margin-top`: js.UndefOr[js.Any] = js.undefined
  var markers: js.UndefOr[
    js.Array[
      AnonAlphaAngleBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBordercolorBorderwidthFillangle
    ]
  ] = js.undefined
  /**
    * Sets the max number of values displaying along the bottom horizontal line. 5 | 10 | ...
    */
  var `max-items`: js.UndefOr[Double] = js.undefined
  /**
    * To set the maximum number of scale items displayed. It is generally used with the 'items-overlap'attribute. 5 | 10 | ...
    */
  var `max-labels`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum number of ticks to display on the y axis. 5 | 10 | ...
    */
  var `max-ticks`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum value for the y axis. 'max-value': is one of the multiple ways you can set y axis values. Commonly used with time
    *  series data. Also see 'mix-value': and 'step': 4 | '6px' | ...
    */
  var `max-value`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the minimum value for the y axis. 'min-value': is one of the multiple ways you can set y axis values. Commonly used with time
    *  series data. Also see 'max-value': and 'step': 'auto' | 4 | '6px' | ...
    */
  var `min-value`: js.UndefOr[Double] = js.undefined
  var `minor-guide`: js.UndefOr[AnonAlphaLinecolorLinegapsizeLinesegmentsize] = js.undefined
  var `minor-tick`: js.UndefOr[AnonAlphaLinecolorLinegapsizeLinesegmentsizeLinestyle] = js.undefined
  /**
    * Sets the number of minor tick marks displayed between the major tick marks. Note that this attribute is required to style the mino
    * r tick marks and/or guides. 5 | 10 | ...
    */
  var `minor-ticks`: js.UndefOr[Double] = js.undefined
  /**
    * Setting 'mirrored': true will flip/mirror the y axis values. 'scale-y': {} values will read top to bottom. true | false | 1 | 0
    */
  var mirrored: js.UndefOr[Boolean] = js.undefined
  /**
    * Setting 'multiplier': true will abbreviate long numbers as small digits with a short unit indicator such as K, M, B true | false |
    *  1 | 0
    */
  var multiplier: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the negative symbol just outside of the formatted value. 'standard' | 'currency'
    */
  var negation: js.UndefOr[String] = js.undefined
  /**
    * Sets an offset on both sides of the plotted data. This will cause the data to appear as if it were 'squeezed' together. 4 | '6px'
    * | ...
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * Sets an offset from the end of the plotted data. This will cause the data to appear as if it were 'squeezed' from the top side. 4
    * | '6px' | '5%' | 35%' | ...
    */
  var `offset-end`: js.UndefOr[Double] = js.undefined
  /**
    * Sets an offset at the start of the plotted data. This will cause the data to appear as if it were 'squeezed' from the bottom side.
    *  4 | '6px' | '5%' | 35%' | ...
    */
  var `offset-start`: js.UndefOr[Double] = js.undefined
  /**
    * Sets an x offset that will be applied to the scale-y object. 4 | '6px' | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets a y offset that will be applied to the scale-y object. 4 | '6px' | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the placement of the scale object. 'default' | 'opposite'
    */
  var placement: js.UndefOr[String] = js.undefined
  /**
    * To change the scale type from linear (default) to logarithmic. 'lin' | 'log'
    */
  var progression: js.UndefOr[String] = js.undefined
  /**
    * Used on radial charts (pie, radar, gauge) to specify the starting angle of the nodes. -45 | 115 | ...
    */
  var `ref-angle`: js.UndefOr[Double] = js.undefined
  var `ref-line`: js.UndefOr[AnonAlphaLinecolorLinegapsizeLinesegmentsize] = js.undefined
  /**
    * To set the value the reference line is drawn at. 5 | 10 | ...
    */
  var `ref-value`: js.UndefOr[Double] = js.undefined
  var rules: js.UndefOr[js.Array[AnonRule]] = js.undefined
  /**
    * Sets the scale of the y axis 5 | 10 | ...
    */
  var `scale-factor`: js.UndefOr[Double] = js.undefined
  /**
    * Setting to true will cause the values on the y axis to use an abbreviated notation with a short unit such as K,M,B, etc. true | fa
    * lse | 1 | 0
    */
  var short: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies which unit of measure to use when short is set to true. K | M | B | KB | MB | GB | TB | PB
    */
  var `short-unit`: js.UndefOr[String] = js.undefined
  /**
    * Specifies which labels will be visible on the y axis. ['A', 'B'] | ...
    */
  var `show-labels`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the size of the object/shape. 4 | '6px' | ...
    */
  var size: js.UndefOr[js.Any] = js.undefined
  /**
    * Auto size-factor automatically scales a pie chart to allow all value-box objects to appear without clipping. 'auto'
    */
  var `size-factor`: js.UndefOr[String] = js.undefined
  /**
    * Sets the characters used to separate thousands in larger numbers. '.' | ',' | ...
    */
  var `thousands-separator`: js.UndefOr[String] = js.undefined
  var tick: js.UndefOr[AnonAlphaLinecolorLinegapsizeLinesegmentsizeLinestyleLinewidth] = js.undefined
  var tooltip: js.UndefOr[AnonAlphaBackgroundcolorBorderalphaBordercolorBorderradius] = js.undefined
  var transform: js.UndefOr[AnonText] = js.undefined
  /**
    * An alternative way to create category scale labels. Similar to a 'labels' array, the 'values' array also acts as a maximum scale v
    * alue. [1, 7, 9] | ['Jan', 'Feb', 'Mar', 'Apr'] | ['Q1', 'Q2', 'Q3', 'Q4']
    */
  var values: js.UndefOr[js.Any] = js.undefined
  /**
    * You can set the 'scale-y': { } to 'visible': false to hide the y axis. The y-axis will still calculate plots correctly, however yo
    * u will not be able to see the x axis line or any of the attributes such as scale values. If you simply want to hide the x axis lin
    * e you can utilize 'line-color':'none'. This will remove the visibility of the x axis line and still allow you to style ticks, item
    * s, etc separately, true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * When zooming is enabled, setting zoom-snap to true snaps the zoom area to the nearest data node as a zoom area is selected. By def
    * ault, zoom-snap is set to false. true | false | 1 | 0
    */
  var `zoom-snap`: js.UndefOr[Boolean] = js.undefined
}

object AnonAlphaAngleAutofit {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    angle: Int | Double = null,
    `auto-fit`: js.UndefOr[Boolean] = js.undefined,
    decimals: Int | Double = null,
    `decimals-separator`: String = null,
    exponent: js.UndefOr[Boolean] = js.undefined,
    `exponent-decimals`: Int | Double = null,
    format: String = null,
    guide: AnonAlphaBackgroundcolorBackgroundcolor1Backgroundcolor2Items = null,
    item: AnonAlphaAngleBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBoldBorderbottom = null,
    `items-overlap`: js.UndefOr[Boolean] = js.undefined,
    label: AnonAlphaAngleBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBoldBorderbottom = null,
    labels: js.Any = null,
    layout: String = null,
    `line-color`: String = null,
    `line-gap-size`: js.Any = null,
    `line-segment-size`: js.Any = null,
    `line-style`: String = null,
    `line-width`: js.Any = null,
    `log-base`: js.Any = null,
    margin: js.Any = null,
    `margin-bottom`: js.Any = null,
    `margin-left`: js.Any = null,
    `margin-right`: js.Any = null,
    `margin-top`: js.Any = null,
    markers: js.Array[
      AnonAlphaAngleBackgroundcolorBackgroundcolor1Backgroundcolor2BackgroundfitBackgroundimageBackgroundpositionBackgroundrepeatBordercolorBorderwidthFillangle
    ] = null,
    `max-items`: Int | Double = null,
    `max-labels`: Int | Double = null,
    `max-ticks`: Int | Double = null,
    `max-value`: Int | Double = null,
    `min-value`: Int | Double = null,
    `minor-guide`: AnonAlphaLinecolorLinegapsizeLinesegmentsize = null,
    `minor-tick`: AnonAlphaLinecolorLinegapsizeLinesegmentsizeLinestyle = null,
    `minor-ticks`: Int | Double = null,
    mirrored: js.UndefOr[Boolean] = js.undefined,
    multiplier: js.UndefOr[Boolean] = js.undefined,
    negation: String = null,
    offset: Int | Double = null,
    `offset-end`: Int | Double = null,
    `offset-start`: Int | Double = null,
    `offset-x`: js.Any = null,
    `offset-y`: js.Any = null,
    placement: String = null,
    progression: String = null,
    `ref-angle`: Int | Double = null,
    `ref-line`: AnonAlphaLinecolorLinegapsizeLinesegmentsize = null,
    `ref-value`: Int | Double = null,
    rules: js.Array[AnonRule] = null,
    `scale-factor`: Int | Double = null,
    short: js.UndefOr[Boolean] = js.undefined,
    `short-unit`: String = null,
    `show-labels`: js.Any = null,
    size: js.Any = null,
    `size-factor`: String = null,
    `thousands-separator`: String = null,
    tick: AnonAlphaLinecolorLinegapsizeLinesegmentsizeLinestyleLinewidth = null,
    tooltip: AnonAlphaBackgroundcolorBorderalphaBordercolorBorderradius = null,
    transform: AnonText = null,
    values: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    `zoom-snap`: js.UndefOr[Boolean] = js.undefined
  ): AnonAlphaAngleAutofit = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (!js.isUndefined(`auto-fit`)) __obj.updateDynamic("auto-fit")(`auto-fit`.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (`decimals-separator` != null) __obj.updateDynamic("decimals-separator")(`decimals-separator`.asInstanceOf[js.Any])
    if (!js.isUndefined(exponent)) __obj.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
    if (`exponent-decimals` != null) __obj.updateDynamic("exponent-decimals")(`exponent-decimals`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (guide != null) __obj.updateDynamic("guide")(guide.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (!js.isUndefined(`items-overlap`)) __obj.updateDynamic("items-overlap")(`items-overlap`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-gap-size` != null) __obj.updateDynamic("line-gap-size")(`line-gap-size`.asInstanceOf[js.Any])
    if (`line-segment-size` != null) __obj.updateDynamic("line-segment-size")(`line-segment-size`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`line-width` != null) __obj.updateDynamic("line-width")(`line-width`.asInstanceOf[js.Any])
    if (`log-base` != null) __obj.updateDynamic("log-base")(`log-base`.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (`margin-bottom` != null) __obj.updateDynamic("margin-bottom")(`margin-bottom`.asInstanceOf[js.Any])
    if (`margin-left` != null) __obj.updateDynamic("margin-left")(`margin-left`.asInstanceOf[js.Any])
    if (`margin-right` != null) __obj.updateDynamic("margin-right")(`margin-right`.asInstanceOf[js.Any])
    if (`margin-top` != null) __obj.updateDynamic("margin-top")(`margin-top`.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (`max-items` != null) __obj.updateDynamic("max-items")(`max-items`.asInstanceOf[js.Any])
    if (`max-labels` != null) __obj.updateDynamic("max-labels")(`max-labels`.asInstanceOf[js.Any])
    if (`max-ticks` != null) __obj.updateDynamic("max-ticks")(`max-ticks`.asInstanceOf[js.Any])
    if (`max-value` != null) __obj.updateDynamic("max-value")(`max-value`.asInstanceOf[js.Any])
    if (`min-value` != null) __obj.updateDynamic("min-value")(`min-value`.asInstanceOf[js.Any])
    if (`minor-guide` != null) __obj.updateDynamic("minor-guide")(`minor-guide`.asInstanceOf[js.Any])
    if (`minor-tick` != null) __obj.updateDynamic("minor-tick")(`minor-tick`.asInstanceOf[js.Any])
    if (`minor-ticks` != null) __obj.updateDynamic("minor-ticks")(`minor-ticks`.asInstanceOf[js.Any])
    if (!js.isUndefined(mirrored)) __obj.updateDynamic("mirrored")(mirrored.asInstanceOf[js.Any])
    if (!js.isUndefined(multiplier)) __obj.updateDynamic("multiplier")(multiplier.asInstanceOf[js.Any])
    if (negation != null) __obj.updateDynamic("negation")(negation.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (`offset-end` != null) __obj.updateDynamic("offset-end")(`offset-end`.asInstanceOf[js.Any])
    if (`offset-start` != null) __obj.updateDynamic("offset-start")(`offset-start`.asInstanceOf[js.Any])
    if (`offset-x` != null) __obj.updateDynamic("offset-x")(`offset-x`.asInstanceOf[js.Any])
    if (`offset-y` != null) __obj.updateDynamic("offset-y")(`offset-y`.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (progression != null) __obj.updateDynamic("progression")(progression.asInstanceOf[js.Any])
    if (`ref-angle` != null) __obj.updateDynamic("ref-angle")(`ref-angle`.asInstanceOf[js.Any])
    if (`ref-line` != null) __obj.updateDynamic("ref-line")(`ref-line`.asInstanceOf[js.Any])
    if (`ref-value` != null) __obj.updateDynamic("ref-value")(`ref-value`.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (`scale-factor` != null) __obj.updateDynamic("scale-factor")(`scale-factor`.asInstanceOf[js.Any])
    if (!js.isUndefined(short)) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    if (`short-unit` != null) __obj.updateDynamic("short-unit")(`short-unit`.asInstanceOf[js.Any])
    if (`show-labels` != null) __obj.updateDynamic("show-labels")(`show-labels`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`size-factor` != null) __obj.updateDynamic("size-factor")(`size-factor`.asInstanceOf[js.Any])
    if (`thousands-separator` != null) __obj.updateDynamic("thousands-separator")(`thousands-separator`.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(`zoom-snap`)) __obj.updateDynamic("zoom-snap")(`zoom-snap`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlphaAngleAutofit]
  }
}

