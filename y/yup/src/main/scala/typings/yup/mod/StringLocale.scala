package typings.yup.mod

import typings.yup.anon.Length
import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.anon.Regex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringLocale extends StObject {
  
  var email: js.UndefOr[Message[Regex]] = js.undefined
  
  var length: js.UndefOr[Message[Length]] = js.undefined
  
  var lowercase: js.UndefOr[Message[Any]] = js.undefined
  
  var matches: js.UndefOr[Message[Regex]] = js.undefined
  
  var max: js.UndefOr[Message[Max]] = js.undefined
  
  var min: js.UndefOr[Message[Min]] = js.undefined
  
  var trim: js.UndefOr[Message[Any]] = js.undefined
  
  var uppercase: js.UndefOr[Message[Any]] = js.undefined
  
  var url: js.UndefOr[Message[Regex]] = js.undefined
  
  var uuid: js.UndefOr[Message[Regex]] = js.undefined
}
object StringLocale {
  
  inline def apply(): StringLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringLocale] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: Message[Regex]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailFunction1(value: /* params */ Regex & MessageParams => Any): Self = StObject.set(x, "email", js.Any.fromFunction1(value))
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setLength(value: Message[Length]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthFunction1(value: /* params */ Length & MessageParams => Any): Self = StObject.set(x, "length", js.Any.fromFunction1(value))
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLowercase(value: Message[Any]): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
    
    inline def setLowercaseFunction1(value: /* params */ Any & MessageParams => Any): Self = StObject.set(x, "lowercase", js.Any.fromFunction1(value))
    
    inline def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
    
    inline def setMatches(value: Message[Regex]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesFunction1(value: /* params */ Regex & MessageParams => Any): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMax(value: Message[Max]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxFunction1(value: /* params */ Max & MessageParams => Any): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Message[Min]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinFunction1(value: /* params */ Min & MessageParams => Any): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setTrim(value: Message[Any]): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimFunction1(value: /* params */ Any & MessageParams => Any): Self = StObject.set(x, "trim", js.Any.fromFunction1(value))
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    inline def setUppercase(value: Message[Any]): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
    
    inline def setUppercaseFunction1(value: /* params */ Any & MessageParams => Any): Self = StObject.set(x, "uppercase", js.Any.fromFunction1(value))
    
    inline def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    
    inline def setUrl(value: Message[Regex]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlFunction1(value: /* params */ Regex & MessageParams => Any): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUuid(value: Message[Regex]): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidFunction1(value: /* params */ Regex & MessageParams => Any): Self = StObject.set(x, "uuid", js.Any.fromFunction1(value))
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
