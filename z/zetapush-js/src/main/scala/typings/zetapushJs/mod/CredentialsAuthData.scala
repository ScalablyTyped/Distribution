package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialsAuthData extends StObject {
  
  var login: String
  
  var password: String
}
object CredentialsAuthData {
  
  inline def apply(login: String, password: String): CredentialsAuthData = {
    val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsAuthData]
  }
  
  extension [Self <: CredentialsAuthData](x: Self) {
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
