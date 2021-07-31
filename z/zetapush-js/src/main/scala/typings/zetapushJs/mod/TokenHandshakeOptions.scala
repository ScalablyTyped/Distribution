package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenHandshakeOptions extends StObject {
  
  var authType: String
  
  var deploymentId: String
  
  var token: String
}
object TokenHandshakeOptions {
  
  @scala.inline
  def apply(authType: String, deploymentId: String, token: String): TokenHandshakeOptions = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenHandshakeOptions]
  }
  
  @scala.inline
  implicit class TokenHandshakeOptionsMutableBuilder[Self <: TokenHandshakeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
