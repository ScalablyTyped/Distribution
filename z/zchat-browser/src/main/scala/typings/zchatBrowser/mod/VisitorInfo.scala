package typings.zchatBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisitorInfo extends StObject {
  
  var display_name: String
  
  var email: String
  
  var phone: String
}
object VisitorInfo {
  
  inline def apply(display_name: String, email: String, phone: String): VisitorInfo = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisitorInfo] (val x: Self) extends AnyVal {
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
  }
}
