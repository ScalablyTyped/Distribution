package typings.yup.mod

import typings.yup.anon.Less
import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.anon.More
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberLocale extends StObject {
  
  var integer: js.UndefOr[Message[Any]] = js.undefined
  
  var lessThan: js.UndefOr[Message[Less]] = js.undefined
  
  var max: js.UndefOr[Message[Max]] = js.undefined
  
  var min: js.UndefOr[Message[Min]] = js.undefined
  
  var moreThan: js.UndefOr[Message[More]] = js.undefined
  
  var negative: js.UndefOr[Message[Less]] = js.undefined
  
  var positive: js.UndefOr[Message[More]] = js.undefined
}
object NumberLocale {
  
  inline def apply(): NumberLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberLocale] (val x: Self) extends AnyVal {
    
    inline def setInteger(value: Message[Any]): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    inline def setIntegerFunction1(value: /* params */ Any & MessageParams => Any): Self = StObject.set(x, "integer", js.Any.fromFunction1(value))
    
    inline def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
    
    inline def setLessThan(value: Message[Less]): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
    
    inline def setLessThanFunction1(value: /* params */ Less & MessageParams => Any): Self = StObject.set(x, "lessThan", js.Any.fromFunction1(value))
    
    inline def setLessThanUndefined: Self = StObject.set(x, "lessThan", js.undefined)
    
    inline def setMax(value: Message[Max]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxFunction1(value: /* params */ Max & MessageParams => Any): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Message[Min]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinFunction1(value: /* params */ Min & MessageParams => Any): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMoreThan(value: Message[More]): Self = StObject.set(x, "moreThan", value.asInstanceOf[js.Any])
    
    inline def setMoreThanFunction1(value: /* params */ More & MessageParams => Any): Self = StObject.set(x, "moreThan", js.Any.fromFunction1(value))
    
    inline def setMoreThanUndefined: Self = StObject.set(x, "moreThan", js.undefined)
    
    inline def setNegative(value: Message[Less]): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeFunction1(value: /* params */ Less & MessageParams => Any): Self = StObject.set(x, "negative", js.Any.fromFunction1(value))
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    inline def setPositive(value: Message[More]): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    inline def setPositiveFunction1(value: /* params */ More & MessageParams => Any): Self = StObject.set(x, "positive", js.Any.fromFunction1(value))
    
    inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
  }
}
