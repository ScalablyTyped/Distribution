package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanLocale extends StObject {
  
  var isValue: js.UndefOr[Message[Any]] = js.undefined
}
object BooleanLocale {
  
  inline def apply(): BooleanLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BooleanLocale] (val x: Self) extends AnyVal {
    
    inline def setIsValue(value: Message[Any]): Self = StObject.set(x, "isValue", value.asInstanceOf[js.Any])
    
    inline def setIsValueFunction1(value: /* params */ Any & MessageParams => Any): Self = StObject.set(x, "isValue", js.Any.fromFunction1(value))
    
    inline def setIsValueUndefined: Self = StObject.set(x, "isValue", js.undefined)
  }
}
