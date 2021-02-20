package typings.yup.mod

import typings.yup.anon.PartialTestMessageParams
import typings.yup.anon.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MixedLocale extends StObject {
  
  var default: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  
  var notOneOf: js.UndefOr[TestOptionsMessage[Values, _]] = js.native
  
  var notType: js.UndefOr[LocaleValue] = js.native
  
  var oneOf: js.UndefOr[TestOptionsMessage[Values, _]] = js.native
  
  var required: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
}
object MixedLocale {
  
  @scala.inline
  def apply(): MixedLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixedLocale]
  }
  
  @scala.inline
  implicit class MixedLocaleMutableBuilder[Self <: MixedLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: TestOptionsMessage[js.Object, _]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setNotOneOf(value: TestOptionsMessage[Values, _]): Self = StObject.set(x, "notOneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotOneOfFunction1(value: /* params */ Values with PartialTestMessageParams => _): Self = StObject.set(x, "notOneOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotOneOfUndefined: Self = StObject.set(x, "notOneOf", js.undefined)
    
    @scala.inline
    def setNotType(value: LocaleValue): Self = StObject.set(x, "notType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotTypeFunction1(value: /* params */ FormatErrorParams => String): Self = StObject.set(x, "notType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotTypeUndefined: Self = StObject.set(x, "notType", js.undefined)
    
    @scala.inline
    def setOneOf(value: TestOptionsMessage[Values, _]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOfFunction1(value: /* params */ Values with PartialTestMessageParams => _): Self = StObject.set(x, "oneOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
    
    @scala.inline
    def setRequired(value: TestOptionsMessage[js.Object, _]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = StObject.set(x, "required", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
