package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autofit extends StObject {
  
  /**
    * true | false | 1 | 0
    */
  var `auto-fit`: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets whether the scale values will be displayed in scientific notation. Particularly useful when dealing with large numbers. true
    * | false | 1 | 0
    */
  var exponent: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the number of decimals that will be displayed when using scientific notation. Use with the 'exponent' attribute. 5 | 10 | ...
    */
  var `exponent-decimals`: js.UndefOr[Double] = js.native
  
  var guide: js.UndefOr[Linesegmentsize] = js.native
  
  var item: js.UndefOr[Borderradiustopleft] = js.native
  
  var label: js.UndefOr[Borderradiustopleft] = js.native
  
  /**
    * ''horizontal' | 'h' | 'vertical' | 'v' | 'row x col' | 'x col' | 'row x' | 'float''
    */
  var layout: js.UndefOr[String] = js.native
  
  /**
    * Sets the color of the axis line. 'none' | 'transparent' | '#f00' | '#f00 #00f' | 'red yellow' | 'rgb(100, 15, 15)' | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the gap size in case of a non-contiguous line style. 4 | '6px' | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the segment size in case of a non-contiguous line style. 4 | '6px' | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.native
  
  /**
    * Logarithmic Scales only: To set the base value, which defaults to Math.E (Euler's number, the base of natural logarithms). Math.E
    * | 10 | 2 | ...
    */
  var `log-base`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's margin/s. 10 | '5px' | '10 20' | '5px 10px 15px 20px' | ...
    */
  var margin: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's bottom margin. 4 | '6px' | ...
    */
  var `margin-bottom`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's left margin. 4 | '6px' | ...
    */
  var `margin-left`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's right margin. 4 | '6px' | ...
    */
  var `margin-right`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's top margin. 4 | '6px' | ...
    */
  var `margin-top`: js.UndefOr[js.Any] = js.native
  
  var markers: js.UndefOr[js.Array[Labelalignment]] = js.native
  
  /**
    * Sets the maximum number of labels that will display along the axis. 5 | 10 | ...
    */
  var `max-labels`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the maximum number of ticks to display on the x axis. 5 | 10 | ...
    */
  var `max-ticks`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the maximum value for the x axis. 'max-value': is one of the multiple ways you can set x axis values. Commonly used with time
    *  series data. Also see 'mix-value': and 'step': 4 | '6px' | ...
    */
  var `max-value`: js.UndefOr[Double] = js.native
  
  var `minor-guide`: js.UndefOr[LinecolorLinegapsize] = js.native
  
  var `minor-tick`: js.UndefOr[LinegapsizeLinesegmentsize] = js.native
  
  /**
    * Sets the number of minor tick marks displayed between the major tick marks. Note that this attribute is required to style the mino
    * r tick marks and/or guides. 5 | 10 | ...
    */
  var `minor-ticks`: js.UndefOr[Double] = js.native
  
  /**
    * Setting 'mirrored': true will reverse/mirror the x axis values. 'scale-x': {} values will read right to left. true | false | 1 | 0
    */
  var mirrored: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the negative symbol just outside of the formatted value. 'standard' | 'currency'
    */
  var negation: js.UndefOr[String] = js.native
  
  /**
    * Sets an offset from the end of the plotted data. This will cause the data to appear as if it were 'squeezed' from the right side.
    * 4 | '6px' | '5%' | 35%' | ...
    */
  var `offset-end`: js.UndefOr[Double] = js.native
  
  /**
    * Sets an offset at the start of the plotted data. This will cause the data to appear as if it were 'squeezed' from the left side. 4
    *  | '6px' | '5%' | '35%' | ...
    */
  var `offset-start`: js.UndefOr[Double] = js.native
  
  /**
    * Sets an x offset that will be applied to the scale-x object. 4 | '6px' | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the placement of the scale object. 'default' | 'opposite'
    */
  var placement: js.UndefOr[String] = js.native
  
  /**
    * To change the scale type from linear (default) to logarithmic. 'lin' | 'log'
    */
  var progression: js.UndefOr[String] = js.native
  
  /**
    * Used on radial charts (pie, radar, gauge) to specify the starting angle of the nodes. -45 | 115 | ...
    */
  var `ref-angle`: js.UndefOr[Double] = js.native
  
  var `ref-line`: js.UndefOr[LinecolorLinegapsize] = js.native
  
  /**
    * To set the value the reference line is drawn at. 1 | 5 | 10 | ...
    */
  var `ref-value`: js.UndefOr[Double] = js.native
  
  var rules: js.UndefOr[js.Array[Rule]] = js.native
  
  /**
    * 5 | 10 | ...
    */
  var `scale-factor`: js.UndefOr[Double] = js.native
  
  /**
    * Setting to true will cause the values on the x axis to use an abbreviated notation with a short unit such as K,M,B, etc. true | fa
    * lse | 1 | 0
    */
  var short: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies which unit of measure to use when short is set to true. K | M | B | KB | MB | GB | TB | PB
    */
  var `short-unit`: js.UndefOr[String] = js.native
  
  /**
    * ['A', 'B'] | ...
    */
  var `show-labels`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the size of the object/shape. 4 | '6px' | ...
    */
  var size: js.UndefOr[js.Any] = js.native
  
  var tick: js.UndefOr[Shadowalpha] = js.native
  
  var tooltip: js.UndefOr[Fontweight] = js.native
  
  var transform: js.UndefOr[A] = js.native
  
  /**
    * An alternative way to create category scale labels. Similar to a 'labels' array, the 'values' array also acts as a maximum scale v
    * alue. [1, 7, 9] | ['Jan', 'Feb', 'Mar', 'Apr'] | ['Q1', 'Q2', 'Q3', 'Q4']
    */
  var values: js.UndefOr[js.Any] = js.native
  
  /**
    * You can set the 'scale-x': { } to 'visible': false to hide the x axis. The x-axis will still calculate plots correctly, however yo
    * u will not be able to see the x axis line or any of the attributes such as scale values. If you simply want to hide the x axis lin
    * e you can utilize 'line-color':'none'. This will remove the visibility of the x axis line and still allow you to style ticks, item
    * s, etc separately, true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * When zooming is enabled, setting zoom-snap to true snaps the zoom area to the nearest data node as a zoom area is selected. By def
    * ault, zoom-snap is set to false. true | false | 1 | 0
    */
  var `zoom-snap`: js.UndefOr[Boolean] = js.native
}
object Autofit {
  
  @scala.inline
  def apply(): Autofit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autofit]
  }
  
  @scala.inline
  implicit class AutofitMutableBuilder[Self <: Autofit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAuto-fit`(value: Boolean): Self = StObject.set(x, "auto-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAuto-fitUndefined`: Self = StObject.set(x, "auto-fit", js.undefined)
    
    @scala.inline
    def setExponent(value: Boolean): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExponent-decimals`(value: Double): Self = StObject.set(x, "exponent-decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExponent-decimalsUndefined`: Self = StObject.set(x, "exponent-decimals", js.undefined)
    
    @scala.inline
    def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
    
    @scala.inline
    def setGuide(value: Linesegmentsize): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
    
    @scala.inline
    def setItem(value: Borderradiustopleft): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setLabel(value: Borderradiustopleft): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def `setLine-color`(value: String): Self = StObject.set(x, "line-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-colorUndefined`: Self = StObject.set(x, "line-color", js.undefined)
    
    @scala.inline
    def `setLine-gap-size`(value: js.Any): Self = StObject.set(x, "line-gap-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-gap-sizeUndefined`: Self = StObject.set(x, "line-gap-size", js.undefined)
    
    @scala.inline
    def `setLine-segment-size`(value: js.Any): Self = StObject.set(x, "line-segment-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-segment-sizeUndefined`: Self = StObject.set(x, "line-segment-size", js.undefined)
    
    @scala.inline
    def `setLog-base`(value: js.Any): Self = StObject.set(x, "log-base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLog-baseUndefined`: Self = StObject.set(x, "log-base", js.undefined)
    
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
    def setMarkers(value: js.Array[Labelalignment]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    @scala.inline
    def setMarkersVarargs(value: Labelalignment*): Self = StObject.set(x, "markers", js.Array(value :_*))
    
    @scala.inline
    def `setMax-labels`(value: Double): Self = StObject.set(x, "max-labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-labelsUndefined`: Self = StObject.set(x, "max-labels", js.undefined)
    
    @scala.inline
    def `setMax-ticks`(value: Double): Self = StObject.set(x, "max-ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-ticksUndefined`: Self = StObject.set(x, "max-ticks", js.undefined)
    
    @scala.inline
    def `setMax-value`(value: Double): Self = StObject.set(x, "max-value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-valueUndefined`: Self = StObject.set(x, "max-value", js.undefined)
    
    @scala.inline
    def `setMinor-guide`(value: LinecolorLinegapsize): Self = StObject.set(x, "minor-guide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMinor-guideUndefined`: Self = StObject.set(x, "minor-guide", js.undefined)
    
    @scala.inline
    def `setMinor-tick`(value: LinegapsizeLinesegmentsize): Self = StObject.set(x, "minor-tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMinor-tickUndefined`: Self = StObject.set(x, "minor-tick", js.undefined)
    
    @scala.inline
    def `setMinor-ticks`(value: Double): Self = StObject.set(x, "minor-ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMinor-ticksUndefined`: Self = StObject.set(x, "minor-ticks", js.undefined)
    
    @scala.inline
    def setMirrored(value: Boolean): Self = StObject.set(x, "mirrored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirroredUndefined: Self = StObject.set(x, "mirrored", js.undefined)
    
    @scala.inline
    def setNegation(value: String): Self = StObject.set(x, "negation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegationUndefined: Self = StObject.set(x, "negation", js.undefined)
    
    @scala.inline
    def `setOffset-end`(value: Double): Self = StObject.set(x, "offset-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-endUndefined`: Self = StObject.set(x, "offset-end", js.undefined)
    
    @scala.inline
    def `setOffset-start`(value: Double): Self = StObject.set(x, "offset-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-startUndefined`: Self = StObject.set(x, "offset-start", js.undefined)
    
    @scala.inline
    def `setOffset-x`(value: js.Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    @scala.inline
    def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setProgression(value: String): Self = StObject.set(x, "progression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressionUndefined: Self = StObject.set(x, "progression", js.undefined)
    
    @scala.inline
    def `setRef-angle`(value: Double): Self = StObject.set(x, "ref-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRef-angleUndefined`: Self = StObject.set(x, "ref-angle", js.undefined)
    
    @scala.inline
    def `setRef-line`(value: LinecolorLinegapsize): Self = StObject.set(x, "ref-line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRef-lineUndefined`: Self = StObject.set(x, "ref-line", js.undefined)
    
    @scala.inline
    def `setRef-value`(value: Double): Self = StObject.set(x, "ref-value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRef-valueUndefined`: Self = StObject.set(x, "ref-value", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    @scala.inline
    def `setScale-factor`(value: Double): Self = StObject.set(x, "scale-factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScale-factorUndefined`: Self = StObject.set(x, "scale-factor", js.undefined)
    
    @scala.inline
    def setShort(value: Boolean): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShort-unit`(value: String): Self = StObject.set(x, "short-unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShort-unitUndefined`: Self = StObject.set(x, "short-unit", js.undefined)
    
    @scala.inline
    def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    @scala.inline
    def `setShow-labels`(value: js.Any): Self = StObject.set(x, "show-labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShow-labelsUndefined`: Self = StObject.set(x, "show-labels", js.undefined)
    
    @scala.inline
    def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTick(value: Shadowalpha): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    @scala.inline
    def setTooltip(value: Fontweight): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTransform(value: A): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def `setZoom-snap`(value: Boolean): Self = StObject.set(x, "zoom-snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZoom-snapUndefined`: Self = StObject.set(x, "zoom-snap", js.undefined)
  }
}
