package typings.yup.mod

import typings.yup.anon.Length
import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.anon.PartialTestMessageParams
import typings.yup.anon.Regex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringLocale extends StObject {
  
  var email: js.UndefOr[TestOptionsMessage[Regex, _]] = js.native
  
  var length: js.UndefOr[TestOptionsMessage[Length, _]] = js.native
  
  var lowercase: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  
  var matches: js.UndefOr[TestOptionsMessage[Regex, _]] = js.native
  
  var max: js.UndefOr[TestOptionsMessage[Max, _]] = js.native
  
  var min: js.UndefOr[TestOptionsMessage[Min, _]] = js.native
  
  var trim: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  
  var uppercase: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  
  var url: js.UndefOr[TestOptionsMessage[Regex, _]] = js.native
  
  var uuid: js.UndefOr[TestOptionsMessage[Regex, _]] = js.native
}
object StringLocale {
  
  @scala.inline
  def apply(): StringLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringLocale]
  }
  
  @scala.inline
  implicit class StringLocaleMutableBuilder[Self <: StringLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: TestOptionsMessage[Regex, _]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailFunction1(value: /* params */ Regex with PartialTestMessageParams => _): Self = StObject.set(x, "email", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setLength(value: TestOptionsMessage[Length, _]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthFunction1(value: /* params */ Length with PartialTestMessageParams => _): Self = StObject.set(x, "length", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setLowercase(value: TestOptionsMessage[js.Object, _]): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowercaseFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = StObject.set(x, "lowercase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
    
    @scala.inline
    def setMatches(value: TestOptionsMessage[Regex, _]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesFunction1(value: /* params */ Regex with PartialTestMessageParams => _): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    @scala.inline
    def setMax(value: TestOptionsMessage[Max, _]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFunction1(value: /* params */ Max with PartialTestMessageParams => _): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: TestOptionsMessage[Min, _]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFunction1(value: /* params */ Min with PartialTestMessageParams => _): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setTrim(value: TestOptionsMessage[js.Object, _]): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = StObject.set(x, "trim", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    @scala.inline
    def setUppercase(value: TestOptionsMessage[js.Object, _]): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUppercaseFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = StObject.set(x, "uppercase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    
    @scala.inline
    def setUrl(value: TestOptionsMessage[Regex, _]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlFunction1(value: /* params */ Regex with PartialTestMessageParams => _): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUuid(value: TestOptionsMessage[Regex, _]): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidFunction1(value: /* params */ Regex with PartialTestMessageParams => _): Self = StObject.set(x, "uuid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
