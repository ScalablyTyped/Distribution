package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hook extends StObject {
  
  /**
    * Sets the arrow's end point to that of a charted value. The plot value refers to the set of values in a series, and the index refer
    * s to the specific value within that series. For example, node:plot=0,index=10 sets the end point of the arrow at the 11th value wi
    * thin the 1st set of values in the series. Note that 0 refers to the first value or set of values, with 1 being the second value or
    *  set of values, and so on. "node:index=4" | "node:plot=0,index=1" | ...
    */
  var hook: js.UndefOr[String] = js.undefined
  
  /**
    * Sets an x-offset for the arrow's end point. Can be used to make adjustments to an arrow's end x ordinate or hook point. 10 | 56 |
    * ...
    */
  var `offset-x`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets a y-offset for the arrow's end point. Can be used to make adjustments to an arrow's end y ordinate or hook point. 10 | 56 | .
    * ..
    */
  var `offset-y`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the x ordinate for an arrow's end point. Ordinates are counted in pixels, starting from the top-left corner of the chart. 100
    *  | 450 | ...
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the y ordinate for an arrow's end point. Ordinates are counted in pixels, starting from the top-left corner of the chart. 100
    *  | 450 | ...
    */
  var y: js.UndefOr[Double] = js.undefined
}
object Hook {
  
  inline def apply(): Hook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hook]
  }
  
  extension [Self <: Hook](x: Self) {
    
    inline def setHook(value: String): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    inline def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
    
    inline def `setOffset-x`(value: Double): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    inline def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    inline def `setOffset-y`(value: Double): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    inline def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
