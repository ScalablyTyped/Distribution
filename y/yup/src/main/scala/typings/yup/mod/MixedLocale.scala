package typings.yup.mod

import typings.yup.anon.PartialTestMessageParams
import typings.yup.anon.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixedLocale extends StObject {
  
  var default: js.UndefOr[TestOptionsMessage[js.Object, js.Any]] = js.undefined
  
  var notOneOf: js.UndefOr[TestOptionsMessage[Values, js.Any]] = js.undefined
  
  var notType: js.UndefOr[LocaleValue] = js.undefined
  
  var oneOf: js.UndefOr[TestOptionsMessage[Values, js.Any]] = js.undefined
  
  var required: js.UndefOr[TestOptionsMessage[js.Object, js.Any]] = js.undefined
}
object MixedLocale {
  
  inline def apply(): MixedLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixedLocale]
  }
  
  extension [Self <: MixedLocale](x: Self) {
    
    inline def setDefault(value: TestOptionsMessage[js.Object, js.Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultFunction1(value: /* params */ js.Object & PartialTestMessageParams => js.Any): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setNotOneOf(value: TestOptionsMessage[Values, js.Any]): Self = StObject.set(x, "notOneOf", value.asInstanceOf[js.Any])
    
    inline def setNotOneOfFunction1(value: /* params */ Values & PartialTestMessageParams => js.Any): Self = StObject.set(x, "notOneOf", js.Any.fromFunction1(value))
    
    inline def setNotOneOfUndefined: Self = StObject.set(x, "notOneOf", js.undefined)
    
    inline def setNotType(value: LocaleValue): Self = StObject.set(x, "notType", value.asInstanceOf[js.Any])
    
    inline def setNotTypeFunction1(value: /* params */ FormatErrorParams => String): Self = StObject.set(x, "notType", js.Any.fromFunction1(value))
    
    inline def setNotTypeUndefined: Self = StObject.set(x, "notType", js.undefined)
    
    inline def setOneOf(value: TestOptionsMessage[Values, js.Any]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfFunction1(value: /* params */ Values & PartialTestMessageParams => js.Any): Self = StObject.set(x, "oneOf", js.Any.fromFunction1(value))
    
    inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
    
    inline def setRequired(value: TestOptionsMessage[js.Object, js.Any]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredFunction1(value: /* params */ js.Object & PartialTestMessageParams => js.Any): Self = StObject.set(x, "required", js.Any.fromFunction1(value))
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
