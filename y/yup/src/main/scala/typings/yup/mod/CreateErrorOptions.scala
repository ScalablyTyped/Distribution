package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateErrorOptions extends StObject {
  
  var message: js.UndefOr[Message[Any]] = js.undefined
  
  var params: js.UndefOr[ExtraParams] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object CreateErrorOptions {
  
  inline def apply(): CreateErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateErrorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateErrorOptions] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: Message[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction1(value: /* params */ Any & MessageParams => Any): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setParams(value: ExtraParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
