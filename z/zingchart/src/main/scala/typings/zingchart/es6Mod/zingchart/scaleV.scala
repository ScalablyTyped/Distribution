package typings.zingchart.es6Mod.zingchart

import typings.zingchart.anon.BorderRadius_
import typings.zingchart.anon.LineStyle_
import typings.zingchart.anon.Linecolor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait scaleV extends StObject {
  
  /**
    * Allows you to set the format for your scale-v values. You can use a combination of text and tokens (%v represents the scale values
    * ), e.g., “%v°” or “Variable %v”. 'Value: %v'
    */
  var format: js.UndefOr[String] = js.undefined
  
  var guide: js.UndefOr[Linecolor] = js.undefined
  
  var item: js.UndefOr[BorderRadius_] = js.undefined
  
  /**
    * Allows you to set custom labels for each step along scale-v. Note that if there are more steps than provided labels, the default v
    * alues will be used for the remaining labels. [...]
    */
  var labels: js.UndefOr[Any] = js.undefined
  
  var `ref-line`: js.UndefOr[refLine] = js.undefined
  
  var refLine: js.UndefOr[typings.zingchart.es6Mod.zingchart.refLine] = js.undefined
  
  var tick: js.UndefOr[LineStyle_] = js.undefined
  
  var tooltip: js.UndefOr[typings.zingchart.es6Mod.zingchart.tooltip] = js.undefined
  
  /**
    * Used to set the minimum, maximum, and step scale values on scale-v. E.g., for “values”: “0:100:25”, 0 is the minimum, 100 is the m
    * aximum, and 25 is the step. "0:100:10" | [1,3,5,7] | ...
    */
  var values: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to hide the v-axis. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object scaleV {
  
  inline def apply(): scaleV = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[scaleV]
  }
  
  extension [Self <: scaleV](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGuide(value: Linecolor): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
    
    inline def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
    
    inline def setItem(value: BorderRadius_): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLabels(value: Any): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def `setRef-line`(value: refLine): Self = StObject.set(x, "ref-line", value.asInstanceOf[js.Any])
    
    inline def `setRef-lineUndefined`: Self = StObject.set(x, "ref-line", js.undefined)
    
    inline def setRefLine(value: refLine): Self = StObject.set(x, "refLine", value.asInstanceOf[js.Any])
    
    inline def setRefLineUndefined: Self = StObject.set(x, "refLine", js.undefined)
    
    inline def setTick(value: LineStyle_): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setTooltip(value: tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
