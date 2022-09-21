package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bar extends StObject {
  
  var bar: js.UndefOr[BorderLeft] = js.undefined
  
  var handle: js.UndefOr[BorderLeft] = js.undefined
}
object Bar {
  
  inline def apply(): Bar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bar]
  }
  
  extension [Self <: Bar](x: Self) {
    
    inline def setBar(value: BorderLeft): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    inline def setHandle(value: BorderLeft): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
  }
}
