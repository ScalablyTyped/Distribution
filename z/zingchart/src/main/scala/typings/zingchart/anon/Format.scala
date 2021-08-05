package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  /**
    * On a radar chart, the “aspect” attribute allows you to change the chart’s shape from star/spider (default) to circular. 'star' (de
    * fault) | 'circle'
    */
  var aspect: js.UndefOr[String] = js.undefined
  
  /**
    * Allows you to set the format for your scale-k values. You can use a combination of text and tokens (%v represents the scale values
    * ), e.g., “%v°” or “Variable %v”. 'Value: %v'
    */
  var format: js.UndefOr[String] = js.undefined
  
  var guide: js.UndefOr[Items] = js.undefined
  
  var item: js.UndefOr[Fontstyle] = js.undefined
  
  /**
    * Allows you to set custom labels for each step along scale-k. [...]
    */
  var labels: js.UndefOr[js.Any] = js.undefined
  
  var tick: js.UndefOr[Placement] = js.undefined
  
  var tooltip: js.UndefOr[Fontweight] = js.undefined
  
  /**
    * Used to set the minimum, maximum, and step scale values on scale-k. E.g., for “values”: “0:330:30”, 0 is the minimum, 330 is the m
    * aximum, and 30 is the step. "0:100:10" | [1,3,5,7] | ...
    */
  var values: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to hide the k-axis. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Format {
  
  inline def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setAspect(value: String): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGuide(value: Items): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
    
    inline def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
    
    inline def setItem(value: Fontstyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLabels(value: js.Any): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setTick(value: Placement): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setTooltip(value: Fontweight): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
