package typings.yup.mod

import typings.yup.anon.PartialTestMessageParams
import typings.yup.anon.`0`
import typings.yup.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateLocale extends StObject {
  
  var max: js.UndefOr[TestOptionsMessage[`1`, js.Any]] = js.undefined
  
  var min: js.UndefOr[TestOptionsMessage[`0`, js.Any]] = js.undefined
}
object DateLocale {
  
  inline def apply(): DateLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateLocale]
  }
  
  extension [Self <: DateLocale](x: Self) {
    
    inline def setMax(value: TestOptionsMessage[`1`, js.Any]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxFunction1(value: /* params */ `1` & PartialTestMessageParams => js.Any): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: TestOptionsMessage[`0`, js.Any]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinFunction1(value: /* params */ `0` & PartialTestMessageParams => js.Any): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
