package typings.yup.anon

import typings.yup.mod.TestOptionsMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeEmptyString extends StObject {
  
  var excludeEmptyString: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[TestOptionsMessage[Regex, js.Any]] = js.undefined
}
object ExcludeEmptyString {
  
  inline def apply(): ExcludeEmptyString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeEmptyString]
  }
  
  extension [Self <: ExcludeEmptyString](x: Self) {
    
    inline def setExcludeEmptyString(value: Boolean): Self = StObject.set(x, "excludeEmptyString", value.asInstanceOf[js.Any])
    
    inline def setExcludeEmptyStringUndefined: Self = StObject.set(x, "excludeEmptyString", js.undefined)
    
    inline def setMessage(value: TestOptionsMessage[Regex, js.Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction1(value: /* params */ Regex & PartialTestMessageParams => js.Any): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
