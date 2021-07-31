package typings.yup.mod

import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.anon.PartialTestMessageParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayLocale extends StObject {
  
  var max: js.UndefOr[TestOptionsMessage[Max, js.Any]] = js.undefined
  
  var min: js.UndefOr[TestOptionsMessage[Min, js.Any]] = js.undefined
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
    def setMax(value: TestOptionsMessage[Max, js.Any]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFunction1(value: /* params */ Max & PartialTestMessageParams => js.Any): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: TestOptionsMessage[Min, js.Any]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFunction1(value: /* params */ Min & PartialTestMessageParams => js.Any): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
