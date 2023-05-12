package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLocale extends StObject {
  
  var noUnknown: js.UndefOr[Message[Any]] = js.undefined
}
object ObjectLocale {
  
  inline def apply(): ObjectLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectLocale] (val x: Self) extends AnyVal {
    
    inline def setNoUnknown(value: Message[Any]): Self = StObject.set(x, "noUnknown", value.asInstanceOf[js.Any])
    
    inline def setNoUnknownFunction1(value: /* params */ Any & MessageParams => Any): Self = StObject.set(x, "noUnknown", js.Any.fromFunction1(value))
    
    inline def setNoUnknownUndefined: Self = StObject.set(x, "noUnknown", js.undefined)
  }
}
