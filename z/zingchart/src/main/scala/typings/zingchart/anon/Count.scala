package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  /**
    * Offset from start to zoom. This attribute is coupled with the type attribute to determine where to set the zoom level. 1 | 2 | 3
    */
  var count: js.UndefOr[Any] = js.undefined
  
  /**
    * To set the text of the button 3m | 2015 | all
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * To set multiplier for count ytd | all | year | month | week | day | hour | minute
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object Count {
  
  inline def apply(): Count = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
