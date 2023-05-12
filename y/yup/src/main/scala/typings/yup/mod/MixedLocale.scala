package typings.yup.mod

import typings.yup.anon.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixedLocale extends StObject {
  
  var default: js.UndefOr[Message[Any]] = js.undefined
  
  var defined: js.UndefOr[Message[Any]] = js.undefined
  
  var notNull: js.UndefOr[Message[Any]] = js.undefined
  
  var notOneOf: js.UndefOr[Message[Values]] = js.undefined
  
  var notType: js.UndefOr[Message[Any]] = js.undefined
  
  var oneOf: js.UndefOr[Message[Values]] = js.undefined
  
  var required: js.UndefOr[Message[Any]] = js.undefined
}
object MixedLocale {
  
  inline def apply(): MixedLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixedLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MixedLocale] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Message[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultFunction1(value: /* params */ Any & MessageParams => Any): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefined(value: Message[Any]): Self = StObject.set(x, "defined", value.asInstanceOf[js.Any])
    
    inline def setDefinedFunction1(value: /* params */ Any & MessageParams => Any): Self = StObject.set(x, "defined", js.Any.fromFunction1(value))
    
    inline def setDefinedUndefined: Self = StObject.set(x, "defined", js.undefined)
    
    inline def setNotNull(value: Message[Any]): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
    
    inline def setNotNullFunction1(value: /* params */ Any & MessageParams => Any): Self = StObject.set(x, "notNull", js.Any.fromFunction1(value))
    
    inline def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
    
    inline def setNotOneOf(value: Message[Values]): Self = StObject.set(x, "notOneOf", value.asInstanceOf[js.Any])
    
    inline def setNotOneOfFunction1(value: /* params */ Values & MessageParams => Any): Self = StObject.set(x, "notOneOf", js.Any.fromFunction1(value))
    
    inline def setNotOneOfUndefined: Self = StObject.set(x, "notOneOf", js.undefined)
    
    inline def setNotType(value: Message[Any]): Self = StObject.set(x, "notType", value.asInstanceOf[js.Any])
    
    inline def setNotTypeFunction1(value: /* params */ Any & MessageParams => Any): Self = StObject.set(x, "notType", js.Any.fromFunction1(value))
    
    inline def setNotTypeUndefined: Self = StObject.set(x, "notType", js.undefined)
    
    inline def setOneOf(value: Message[Values]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfFunction1(value: /* params */ Values & MessageParams => Any): Self = StObject.set(x, "oneOf", js.Any.fromFunction1(value))
    
    inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
    
    inline def setRequired(value: Message[Any]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredFunction1(value: /* params */ Any & MessageParams => Any): Self = StObject.set(x, "required", js.Any.fromFunction1(value))
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
