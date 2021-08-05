package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialsHandshake
  extends StObject
     with AbstractHandshake {
  
  var authData: CredentialsAuthData
  
  var login: String
  
  var password: String
}
object CredentialsHandshake {
  
  inline def apply(
    authData: CredentialsAuthData,
    authType: String,
    authVersion: String,
    deploymentId: String,
    getHandshakeFields: Client => HandshakeFields,
    login: String,
    password: String,
    sandboxId: String
  ): CredentialsHandshake = {
    val __obj = js.Dynamic.literal(authData = authData.asInstanceOf[js.Any], authType = authType.asInstanceOf[js.Any], authVersion = authVersion.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], getHandshakeFields = js.Any.fromFunction1(getHandshakeFields), login = login.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsHandshake]
  }
  
  extension [Self <: CredentialsHandshake](x: Self) {
    
    inline def setAuthData(value: CredentialsAuthData): Self = StObject.set(x, "authData", value.asInstanceOf[js.Any])
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
