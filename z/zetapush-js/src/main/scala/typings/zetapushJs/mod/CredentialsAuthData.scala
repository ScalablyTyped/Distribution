package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialsAuthData extends StObject {
  
  var login: String = js.native
  
  var password: String = js.native
}
object CredentialsAuthData {
  
  @scala.inline
  def apply(login: String, password: String): CredentialsAuthData = {
    val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsAuthData]
  }
  
  @scala.inline
  implicit class CredentialsAuthDataMutableBuilder[Self <: CredentialsAuthData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
