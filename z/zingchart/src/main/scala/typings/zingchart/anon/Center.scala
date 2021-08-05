package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var center: js.UndefOr[Size] = js.undefined
  
  var guide: js.UndefOr[Visible] = js.undefined
  
  var item: js.UndefOr[OffsetR] = js.undefined
  
  /**
    * Gauge Charts Only: To set custom labels that correspond to each tick mark on the scale. If there are more tick marks than labels,
    * the default scale values will be used for the remaining labels. ['A', 'B', 'C', 'D', 'E'] | ...
    */
  var labels: js.UndefOr[js.Any] = js.undefined
  
  var markers: js.UndefOr[js.Array[Label]] = js.undefined
  
  var `minor-guide`: js.UndefOr[LinecolorLinestyle] = js.undefined
  
  var `minor-tick`: js.UndefOr[Placement] = js.undefined
  
  /**
    * Gauge Charts Only: To set the number of minor tick marks displayed between the major tick marks. 9 | 5 | 2 | ...
    */
  var `minor-ticks`: js.UndefOr[Double] = js.undefined
  
  var ring: js.UndefOr[BorderwidthItems] = js.undefined
  
  var tick: js.UndefOr[Placement] = js.undefined
  
  /**
    * Gauge Charts Only: To set the minimum, maximum, and step scale values. '0:10' | '0:25:5' | ...
    */
  var values: js.UndefOr[js.Any] = js.undefined
}
object Center {
  
  inline def apply(): Center = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Center]
  }
  
  extension [Self <: Center](x: Self) {
    
    inline def setCenter(value: Size): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setGuide(value: Visible): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
    
    inline def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
    
    inline def setItem(value: OffsetR): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLabels(value: js.Any): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMarkers(value: js.Array[Label]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setMarkersVarargs(value: Label*): Self = StObject.set(x, "markers", js.Array(value :_*))
    
    inline def `setMinor-guide`(value: LinecolorLinestyle): Self = StObject.set(x, "minor-guide", value.asInstanceOf[js.Any])
    
    inline def `setMinor-guideUndefined`: Self = StObject.set(x, "minor-guide", js.undefined)
    
    inline def `setMinor-tick`(value: Placement): Self = StObject.set(x, "minor-tick", value.asInstanceOf[js.Any])
    
    inline def `setMinor-tickUndefined`: Self = StObject.set(x, "minor-tick", js.undefined)
    
    inline def `setMinor-ticks`(value: Double): Self = StObject.set(x, "minor-ticks", value.asInstanceOf[js.Any])
    
    inline def `setMinor-ticksUndefined`: Self = StObject.set(x, "minor-ticks", js.undefined)
    
    inline def setRing(value: BorderwidthItems): Self = StObject.set(x, "ring", value.asInstanceOf[js.Any])
    
    inline def setRingUndefined: Self = StObject.set(x, "ring", js.undefined)
    
    inline def setTick(value: Placement): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
