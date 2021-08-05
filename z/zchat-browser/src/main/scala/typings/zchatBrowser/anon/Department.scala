package typings.zchatBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Department extends StObject {
  
  var department: js.UndefOr[Double] = js.undefined
  
  var email: String
  
  var message: String
  
  var name: String
  
  var phone: js.UndefOr[String] = js.undefined
}
object Department {
  
  inline def apply(email: String, message: String, name: String): Department = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Department]
  }
  
  extension [Self <: Department](x: Self) {
    
    inline def setDepartment(value: Double): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    inline def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
  }
}
