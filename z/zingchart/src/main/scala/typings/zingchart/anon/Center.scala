package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Center extends StObject {
  
  var center: js.UndefOr[Size] = js.native
  
  var guide: js.UndefOr[Visible] = js.native
  
  var item: js.UndefOr[OffsetR] = js.native
  
  /**
    * Gauge Charts Only: To set custom labels that correspond to each tick mark on the scale. If there are more tick marks than labels,
    * the default scale values will be used for the remaining labels. ['A', 'B', 'C', 'D', 'E'] | ...
    */
  var labels: js.UndefOr[js.Any] = js.native
  
  var markers: js.UndefOr[js.Array[Label]] = js.native
  
  var `minor-guide`: js.UndefOr[LinecolorLinestyle] = js.native
  
  var `minor-tick`: js.UndefOr[Placement] = js.native
  
  /**
    * Gauge Charts Only: To set the number of minor tick marks displayed between the major tick marks. 9 | 5 | 2 | ...
    */
  var `minor-ticks`: js.UndefOr[Double] = js.native
  
  var ring: js.UndefOr[BorderwidthItems] = js.native
  
  var tick: js.UndefOr[Placement] = js.native
  
  /**
    * Gauge Charts Only: To set the minimum, maximum, and step scale values. '0:10' | '0:25:5' | ...
    */
  var values: js.UndefOr[js.Any] = js.native
}
object Center {
  
  @scala.inline
  def apply(): Center = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit class CenterMutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Size): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setGuide(value: Visible): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
    
    @scala.inline
    def setItem(value: OffsetR): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Any): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMarkers(value: js.Array[Label]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    @scala.inline
    def setMarkersVarargs(value: Label*): Self = StObject.set(x, "markers", js.Array(value :_*))
    
    @scala.inline
    def `setMinor-guide`(value: LinecolorLinestyle): Self = StObject.set(x, "minor-guide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMinor-guideUndefined`: Self = StObject.set(x, "minor-guide", js.undefined)
    
    @scala.inline
    def `setMinor-tick`(value: Placement): Self = StObject.set(x, "minor-tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMinor-tickUndefined`: Self = StObject.set(x, "minor-tick", js.undefined)
    
    @scala.inline
    def `setMinor-ticks`(value: Double): Self = StObject.set(x, "minor-ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMinor-ticksUndefined`: Self = StObject.set(x, "minor-ticks", js.undefined)
    
    @scala.inline
    def setRing(value: BorderwidthItems): Self = StObject.set(x, "ring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRingUndefined: Self = StObject.set(x, "ring", js.undefined)
    
    @scala.inline
    def setTick(value: Placement): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
