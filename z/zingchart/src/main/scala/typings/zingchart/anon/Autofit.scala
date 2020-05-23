package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autofit extends js.Object {
  /**
    * true | false | 1 | 0
    */
  var `auto-fit`: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets whether the scale values will be displayed in scientific notation. Particularly useful when dealing with large numbers. true
    * | false | 1 | 0
    */
  var exponent: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the number of decimals that will be displayed when using scientific notation. Use with the 'exponent' attribute. 5 | 10 | ...
    */
  var `exponent-decimals`: js.UndefOr[Double] = js.undefined
  var guide: js.UndefOr[Linesegmentsize] = js.undefined
  var item: js.UndefOr[Borderradiustopleft] = js.undefined
  var label: js.UndefOr[Borderradiustopleft] = js.undefined
  /**
    * ''horizontal' | 'h' | 'vertical' | 'v' | 'row x col' | 'x col' | 'row x' | 'float''
    */
  var layout: js.UndefOr[String] = js.undefined
  /**
    * Sets the color of the axis line. 'none' | 'transparent' | '#f00' | '#f00 #00f' | 'red yellow' | 'rgb(100, 15, 15)' | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the gap size in case of a non-contiguous line style. 4 | '6px' | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the segment size in case of a non-contiguous line style. 4 | '6px' | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.undefined
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
  var markers: js.UndefOr[js.Array[Labelalignment]] = js.undefined
  /**
    * Sets the maximum number of labels that will display along the axis. 5 | 10 | ...
    */
  var `max-labels`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum number of ticks to display on the x axis. 5 | 10 | ...
    */
  var `max-ticks`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum value for the x axis. 'max-value': is one of the multiple ways you can set x axis values. Commonly used with time
    *  series data. Also see 'mix-value': and 'step': 4 | '6px' | ...
    */
  var `max-value`: js.UndefOr[Double] = js.undefined
  var `minor-guide`: js.UndefOr[LinecolorLinegapsize] = js.undefined
  var `minor-tick`: js.UndefOr[LinegapsizeLinesegmentsize] = js.undefined
  /**
    * Sets the number of minor tick marks displayed between the major tick marks. Note that this attribute is required to style the mino
    * r tick marks and/or guides. 5 | 10 | ...
    */
  var `minor-ticks`: js.UndefOr[Double] = js.undefined
  /**
    * Setting 'mirrored': true will reverse/mirror the x axis values. 'scale-x': {} values will read right to left. true | false | 1 | 0
    */
  var mirrored: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the negative symbol just outside of the formatted value. 'standard' | 'currency'
    */
  var negation: js.UndefOr[String] = js.undefined
  /**
    * Sets an offset from the end of the plotted data. This will cause the data to appear as if it were 'squeezed' from the right side.
    * 4 | '6px' | '5%' | 35%' | ...
    */
  var `offset-end`: js.UndefOr[Double] = js.undefined
  /**
    * Sets an offset at the start of the plotted data. This will cause the data to appear as if it were 'squeezed' from the left side. 4
    *  | '6px' | '5%' | '35%' | ...
    */
  var `offset-start`: js.UndefOr[Double] = js.undefined
  /**
    * Sets an x offset that will be applied to the scale-x object. 4 | '6px' | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
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
  var `ref-line`: js.UndefOr[LinecolorLinegapsize] = js.undefined
  /**
    * To set the value the reference line is drawn at. 1 | 5 | 10 | ...
    */
  var `ref-value`: js.UndefOr[Double] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
  /**
    * 5 | 10 | ...
    */
  var `scale-factor`: js.UndefOr[Double] = js.undefined
  /**
    * Setting to true will cause the values on the x axis to use an abbreviated notation with a short unit such as K,M,B, etc. true | fa
    * lse | 1 | 0
    */
  var short: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies which unit of measure to use when short is set to true. K | M | B | KB | MB | GB | TB | PB
    */
  var `short-unit`: js.UndefOr[String] = js.undefined
  /**
    * ['A', 'B'] | ...
    */
  var `show-labels`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the size of the object/shape. 4 | '6px' | ...
    */
  var size: js.UndefOr[js.Any] = js.undefined
  var tick: js.UndefOr[Shadowalpha] = js.undefined
  var tooltip: js.UndefOr[Fontweight] = js.undefined
  var transform: js.UndefOr[A] = js.undefined
  /**
    * An alternative way to create category scale labels. Similar to a 'labels' array, the 'values' array also acts as a maximum scale v
    * alue. [1, 7, 9] | ['Jan', 'Feb', 'Mar', 'Apr'] | ['Q1', 'Q2', 'Q3', 'Q4']
    */
  var values: js.UndefOr[js.Any] = js.undefined
  /**
    * You can set the 'scale-x': { } to 'visible': false to hide the x axis. The x-axis will still calculate plots correctly, however yo
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

object Autofit {
  @scala.inline
  def apply(
    `auto-fit`: js.UndefOr[Boolean] = js.undefined,
    exponent: js.UndefOr[Boolean] = js.undefined,
    `exponent-decimals`: js.UndefOr[Double] = js.undefined,
    guide: Linesegmentsize = null,
    item: Borderradiustopleft = null,
    label: Borderradiustopleft = null,
    layout: String = null,
    `line-color`: String = null,
    `line-gap-size`: js.Any = null,
    `line-segment-size`: js.Any = null,
    `log-base`: js.Any = null,
    margin: js.Any = null,
    `margin-bottom`: js.Any = null,
    `margin-left`: js.Any = null,
    `margin-right`: js.Any = null,
    `margin-top`: js.Any = null,
    markers: js.Array[Labelalignment] = null,
    `max-labels`: js.UndefOr[Double] = js.undefined,
    `max-ticks`: js.UndefOr[Double] = js.undefined,
    `max-value`: js.UndefOr[Double] = js.undefined,
    `minor-guide`: LinecolorLinegapsize = null,
    `minor-tick`: LinegapsizeLinesegmentsize = null,
    `minor-ticks`: js.UndefOr[Double] = js.undefined,
    mirrored: js.UndefOr[Boolean] = js.undefined,
    negation: String = null,
    `offset-end`: js.UndefOr[Double] = js.undefined,
    `offset-start`: js.UndefOr[Double] = js.undefined,
    `offset-x`: js.Any = null,
    placement: String = null,
    progression: String = null,
    `ref-angle`: js.UndefOr[Double] = js.undefined,
    `ref-line`: LinecolorLinegapsize = null,
    `ref-value`: js.UndefOr[Double] = js.undefined,
    rules: js.Array[Rule] = null,
    `scale-factor`: js.UndefOr[Double] = js.undefined,
    short: js.UndefOr[Boolean] = js.undefined,
    `short-unit`: String = null,
    `show-labels`: js.Any = null,
    size: js.Any = null,
    tick: Shadowalpha = null,
    tooltip: Fontweight = null,
    transform: A = null,
    values: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    `zoom-snap`: js.UndefOr[Boolean] = js.undefined
  ): Autofit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`auto-fit`)) __obj.updateDynamic("auto-fit")(`auto-fit`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exponent)) __obj.updateDynamic("exponent")(exponent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`exponent-decimals`)) __obj.updateDynamic("exponent-decimals")(`exponent-decimals`.get.asInstanceOf[js.Any])
    if (guide != null) __obj.updateDynamic("guide")(guide.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-gap-size` != null) __obj.updateDynamic("line-gap-size")(`line-gap-size`.asInstanceOf[js.Any])
    if (`line-segment-size` != null) __obj.updateDynamic("line-segment-size")(`line-segment-size`.asInstanceOf[js.Any])
    if (`log-base` != null) __obj.updateDynamic("log-base")(`log-base`.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (`margin-bottom` != null) __obj.updateDynamic("margin-bottom")(`margin-bottom`.asInstanceOf[js.Any])
    if (`margin-left` != null) __obj.updateDynamic("margin-left")(`margin-left`.asInstanceOf[js.Any])
    if (`margin-right` != null) __obj.updateDynamic("margin-right")(`margin-right`.asInstanceOf[js.Any])
    if (`margin-top` != null) __obj.updateDynamic("margin-top")(`margin-top`.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (!js.isUndefined(`max-labels`)) __obj.updateDynamic("max-labels")(`max-labels`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`max-ticks`)) __obj.updateDynamic("max-ticks")(`max-ticks`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`max-value`)) __obj.updateDynamic("max-value")(`max-value`.get.asInstanceOf[js.Any])
    if (`minor-guide` != null) __obj.updateDynamic("minor-guide")(`minor-guide`.asInstanceOf[js.Any])
    if (`minor-tick` != null) __obj.updateDynamic("minor-tick")(`minor-tick`.asInstanceOf[js.Any])
    if (!js.isUndefined(`minor-ticks`)) __obj.updateDynamic("minor-ticks")(`minor-ticks`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mirrored)) __obj.updateDynamic("mirrored")(mirrored.get.asInstanceOf[js.Any])
    if (negation != null) __obj.updateDynamic("negation")(negation.asInstanceOf[js.Any])
    if (!js.isUndefined(`offset-end`)) __obj.updateDynamic("offset-end")(`offset-end`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`offset-start`)) __obj.updateDynamic("offset-start")(`offset-start`.get.asInstanceOf[js.Any])
    if (`offset-x` != null) __obj.updateDynamic("offset-x")(`offset-x`.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (progression != null) __obj.updateDynamic("progression")(progression.asInstanceOf[js.Any])
    if (!js.isUndefined(`ref-angle`)) __obj.updateDynamic("ref-angle")(`ref-angle`.get.asInstanceOf[js.Any])
    if (`ref-line` != null) __obj.updateDynamic("ref-line")(`ref-line`.asInstanceOf[js.Any])
    if (!js.isUndefined(`ref-value`)) __obj.updateDynamic("ref-value")(`ref-value`.get.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (!js.isUndefined(`scale-factor`)) __obj.updateDynamic("scale-factor")(`scale-factor`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(short)) __obj.updateDynamic("short")(short.get.asInstanceOf[js.Any])
    if (`short-unit` != null) __obj.updateDynamic("short-unit")(`short-unit`.asInstanceOf[js.Any])
    if (`show-labels` != null) __obj.updateDynamic("show-labels")(`show-labels`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`zoom-snap`)) __obj.updateDynamic("zoom-snap")(`zoom-snap`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autofit]
  }
}

