package typings.yup.mod

import typings.yup.anon.`2`
import typings.yup.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateLocale extends StObject {
  
  var max: js.UndefOr[Message[`3`]] = js.undefined
  
  var min: js.UndefOr[Message[`2`]] = js.undefined
}
object DateLocale {
  
  inline def apply(): DateLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateLocale] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Message[`3`]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxFunction1(value: /* params */ `3` & MessageParams => Any): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Message[`2`]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinFunction1(value: /* params */ `2` & MessageParams => Any): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
