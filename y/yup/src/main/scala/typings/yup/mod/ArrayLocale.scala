package typings.yup.mod

import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.anon.PartialTestMessageParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayLocale extends StObject {
  
  var max: js.UndefOr[TestOptionsMessage[Max, _]] = js.native
  
  var min: js.UndefOr[TestOptionsMessage[Min, _]] = js.native
}
object ArrayLocale {
  
  @scala.inline
  def apply(): ArrayLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayLocale]
  }
  
  @scala.inline
  implicit class ArrayLocaleMutableBuilder[Self <: ArrayLocale] (val x: Self) extends AnyVal {
    
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
  }
}
