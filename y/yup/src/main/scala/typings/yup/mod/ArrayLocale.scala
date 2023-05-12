package typings.yup.mod

import typings.yup.anon.Length
import typings.yup.anon.Max
import typings.yup.anon.Min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayLocale extends StObject {
  
  var length: js.UndefOr[Message[Length]] = js.undefined
  
  var max: js.UndefOr[Message[Max]] = js.undefined
  
  var min: js.UndefOr[Message[Min]] = js.undefined
}
object ArrayLocale {
  
  inline def apply(): ArrayLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayLocale] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Message[Length]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthFunction1(value: /* params */ Length & MessageParams => Any): Self = StObject.set(x, "length", js.Any.fromFunction1(value))
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMax(value: Message[Max]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxFunction1(value: /* params */ Max & MessageParams => Any): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Message[Min]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinFunction1(value: /* params */ Min & MessageParams => Any): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
