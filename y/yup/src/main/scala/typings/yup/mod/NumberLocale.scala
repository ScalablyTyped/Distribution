package typings.yup.mod

import typings.yup.anon.Less
import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.anon.More
import typings.yup.anon.PartialTestMessageParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberLocale extends StObject {
  
  var integer: js.UndefOr[TestOptionsMessage[js.Object, js.Any]] = js.undefined
  
  var lessThan: js.UndefOr[TestOptionsMessage[Less, js.Any]] = js.undefined
  
  var max: js.UndefOr[TestOptionsMessage[Max, js.Any]] = js.undefined
  
  var min: js.UndefOr[TestOptionsMessage[Min, js.Any]] = js.undefined
  
  var moreThan: js.UndefOr[TestOptionsMessage[More, js.Any]] = js.undefined
  
  var negative: js.UndefOr[TestOptionsMessage[Less, js.Any]] = js.undefined
  
  var positive: js.UndefOr[TestOptionsMessage[More, js.Any]] = js.undefined
}
object NumberLocale {
  
  inline def apply(): NumberLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberLocale]
  }
  
  extension [Self <: NumberLocale](x: Self) {
    
    inline def setInteger(value: TestOptionsMessage[js.Object, js.Any]): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    inline def setIntegerFunction1(value: /* params */ js.Object & PartialTestMessageParams => js.Any): Self = StObject.set(x, "integer", js.Any.fromFunction1(value))
    
    inline def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
    
    inline def setLessThan(value: TestOptionsMessage[Less, js.Any]): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
    
    inline def setLessThanFunction1(value: /* params */ Less & PartialTestMessageParams => js.Any): Self = StObject.set(x, "lessThan", js.Any.fromFunction1(value))
    
    inline def setLessThanUndefined: Self = StObject.set(x, "lessThan", js.undefined)
    
    inline def setMax(value: TestOptionsMessage[Max, js.Any]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxFunction1(value: /* params */ Max & PartialTestMessageParams => js.Any): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: TestOptionsMessage[Min, js.Any]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinFunction1(value: /* params */ Min & PartialTestMessageParams => js.Any): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMoreThan(value: TestOptionsMessage[More, js.Any]): Self = StObject.set(x, "moreThan", value.asInstanceOf[js.Any])
    
    inline def setMoreThanFunction1(value: /* params */ More & PartialTestMessageParams => js.Any): Self = StObject.set(x, "moreThan", js.Any.fromFunction1(value))
    
    inline def setMoreThanUndefined: Self = StObject.set(x, "moreThan", js.undefined)
    
    inline def setNegative(value: TestOptionsMessage[Less, js.Any]): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeFunction1(value: /* params */ Less & PartialTestMessageParams => js.Any): Self = StObject.set(x, "negative", js.Any.fromFunction1(value))
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    inline def setPositive(value: TestOptionsMessage[More, js.Any]): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    inline def setPositiveFunction1(value: /* params */ More & PartialTestMessageParams => js.Any): Self = StObject.set(x, "positive", js.Any.fromFunction1(value))
    
    inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
  }
}
