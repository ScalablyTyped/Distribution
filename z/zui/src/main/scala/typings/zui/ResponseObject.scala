package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseObject extends StObject {
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var response: js.UndefOr[String] = js.undefined
  
  var responseHeaders: js.UndefOr[js.Object] = js.undefined
  
  var status: js.UndefOr[Double] = js.undefined
  
  var total: js.UndefOr[Double] = js.undefined
}
object ResponseObject {
  
  inline def apply(): ResponseObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseObject]
  }
  
  extension [Self <: ResponseObject](x: Self) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaders(value: js.Object): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
