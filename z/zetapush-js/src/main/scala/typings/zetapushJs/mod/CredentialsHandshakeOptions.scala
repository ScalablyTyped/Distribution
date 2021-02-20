package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialsHandshakeOptions extends StObject {
  
  var authType: String = js.native
  
  var deploymentId: String = js.native
  
  var login: String = js.native
  
  var password: String = js.native
}
object CredentialsHandshakeOptions {
  
  @scala.inline
  def apply(authType: String, deploymentId: String, login: String, password: String): CredentialsHandshakeOptions = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsHandshakeOptions]
  }
  
  @scala.inline
  implicit class CredentialsHandshakeOptionsMutableBuilder[Self <: CredentialsHandshakeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
