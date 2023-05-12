package typings.yup.mod

import typings.yup.anon.Regex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchOptions extends StObject {
  
  var excludeEmptyString: js.UndefOr[Boolean] = js.undefined
  
  var message: Message[Regex]
  
  var name: js.UndefOr[String] = js.undefined
}
object MatchOptions {
  
  inline def apply(message: Message[Regex]): MatchOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchOptions] (val x: Self) extends AnyVal {
    
    inline def setExcludeEmptyString(value: Boolean): Self = StObject.set(x, "excludeEmptyString", value.asInstanceOf[js.Any])
    
    inline def setExcludeEmptyStringUndefined: Self = StObject.set(x, "excludeEmptyString", js.undefined)
    
    inline def setMessage(value: Message[Regex]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction1(value: /* params */ Regex & MessageParams => Any): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
