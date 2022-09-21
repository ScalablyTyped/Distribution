package typings.zingchart.es6Mod.zingchart

import typings.zingchart.anon.Borderradius
import typings.zingchart.anon.Borderwidth
import typings.zingchart.anon.Label
import typings.zingchart.anon.LineStyle_
import typings.zingchart.anon.LineWidth_
import typings.zingchart.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait scaleR extends StObject {
  
  var center: js.UndefOr[Borderwidth] = js.undefined
  
  var guide: js.UndefOr[LineWidth_] = js.undefined
  
  var item: js.UndefOr[Borderradius] = js.undefined
  
  /**
    * Gauge Charts Only: To set custom labels that correspond to each tick mark on the scale. If there are more tick marks than labels,
    * the default scale values will be used for the remaining labels. ['A', 'B', 'C', 'D', 'E'] | ...
    */
  var labels: js.UndefOr[Any] = js.undefined
  
  var markers: js.UndefOr[js.Array[Label]] = js.undefined
  
  var `minor-guide`: js.UndefOr[minorGuide] = js.undefined
  
  var `minor-tick`: js.UndefOr[minorTick] = js.undefined
  
  /**
    * Gauge Charts Only: To set the number of minor tick marks displayed between the major tick marks. 9 | 5 | 2 | ...
    */
  var `minor-ticks`: js.UndefOr[Double] = js.undefined
  
  var minorGuide: js.UndefOr[typings.zingchart.es6Mod.zingchart.minorGuide] = js.undefined
  
  var minorTick: js.UndefOr[typings.zingchart.es6Mod.zingchart.minorTick] = js.undefined
  
  var minorTicks: js.UndefOr[Double] = js.undefined
  
  var ring: js.UndefOr[Size] = js.undefined
  
  var tick: js.UndefOr[LineStyle_] = js.undefined
  
  /**
    * Gauge Charts Only: To set the minimum, maximum, and step scale values. '0:10' | '0:25:5' | ...
    */
  var values: js.UndefOr[Any] = js.undefined
}
object scaleR {
  
  inline def apply(): scaleR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[scaleR]
  }
  
  extension [Self <: scaleR](x: Self) {
    
    inline def setCenter(value: Borderwidth): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setGuide(value: LineWidth_): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
    
    inline def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
    
    inline def setItem(value: Borderradius): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLabels(value: Any): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMarkers(value: js.Array[Label]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setMarkersVarargs(value: Label*): Self = StObject.set(x, "markers", js.Array(value*))
    
    inline def `setMinor-guide`(value: minorGuide): Self = StObject.set(x, "minor-guide", value.asInstanceOf[js.Any])
    
    inline def `setMinor-guideUndefined`: Self = StObject.set(x, "minor-guide", js.undefined)
    
    inline def `setMinor-tick`(value: minorTick): Self = StObject.set(x, "minor-tick", value.asInstanceOf[js.Any])
    
    inline def `setMinor-tickUndefined`: Self = StObject.set(x, "minor-tick", js.undefined)
    
    inline def `setMinor-ticks`(value: Double): Self = StObject.set(x, "minor-ticks", value.asInstanceOf[js.Any])
    
    inline def `setMinor-ticksUndefined`: Self = StObject.set(x, "minor-ticks", js.undefined)
    
    inline def setMinorGuide(value: minorGuide): Self = StObject.set(x, "minorGuide", value.asInstanceOf[js.Any])
    
    inline def setMinorGuideUndefined: Self = StObject.set(x, "minorGuide", js.undefined)
    
    inline def setMinorTick(value: minorTick): Self = StObject.set(x, "minorTick", value.asInstanceOf[js.Any])
    
    inline def setMinorTickUndefined: Self = StObject.set(x, "minorTick", js.undefined)
    
    inline def setMinorTicks(value: Double): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    inline def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    inline def setRing(value: Size): Self = StObject.set(x, "ring", value.asInstanceOf[js.Any])
    
    inline def setRingUndefined: Self = StObject.set(x, "ring", js.undefined)
    
    inline def setTick(value: LineStyle_): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
