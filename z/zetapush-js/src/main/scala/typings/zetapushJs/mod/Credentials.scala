package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  var login: String
  
  var password: String
}
object Credentials {
  
  @scala.inline
  def apply(login: String, password: String): Credentials = {
    val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
