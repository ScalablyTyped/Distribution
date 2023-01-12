package typings.zustand.anon

import typings.zustand.zustandBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var date: js.UndefOr[`true`] = js.undefined
  
  var error: js.UndefOr[`true`] = js.undefined
  
  var function: js.UndefOr[`true` | (js.Function1[/* fn */ js.Function1[/* repeated */ Any, Any], String])] = js.undefined
  
  var map: js.UndefOr[`true`] = js.undefined
  
  var regex: js.UndefOr[`true`] = js.undefined
  
  var set: js.UndefOr[`true`] = js.undefined
  
  var symbol: js.UndefOr[`true`] = js.undefined
  
  var undefined: js.UndefOr[`true`] = js.undefined
}
object Date {
  
  inline def apply(): Date = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    inline def setDate(value: `true`): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFunction(value: `true` | (js.Function1[/* fn */ js.Function1[/* repeated */ Any, Any], String])): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionFunction1(value: /* fn */ js.Function1[/* repeated */ Any, Any] => String): Self = StObject.set(x, "function", js.Any.fromFunction1(value))
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setMap(value: `true`): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setRegex(value: `true`): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    inline def setSet(value: `true`): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setSymbol(value: `true`): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setUndefined(value: `true`): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    
    inline def setUndefinedUndefined: Self = StObject.set(x, "undefined", js.undefined)
  }
}
