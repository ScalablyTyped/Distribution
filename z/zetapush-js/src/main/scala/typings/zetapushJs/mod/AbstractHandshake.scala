package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractHandshake extends StObject {
  
  var authType: String
  
  var authVersion: String
  
  var deploymentId: String
  
  def getHandshakeFields(client: Client): HandshakeFields
  
  var sandboxId: String
}
object AbstractHandshake {
  
  inline def apply(
    authType: String,
    authVersion: String,
    deploymentId: String,
    getHandshakeFields: Client => HandshakeFields,
    sandboxId: String
  ): AbstractHandshake = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], authVersion = authVersion.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], getHandshakeFields = js.Any.fromFunction1(getHandshakeFields), sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractHandshake]
  }
  
  extension [Self <: AbstractHandshake](x: Self) {
    
    inline def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setAuthVersion(value: String): Self = StObject.set(x, "authVersion", value.asInstanceOf[js.Any])
    
    inline def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setGetHandshakeFields(value: Client => HandshakeFields): Self = StObject.set(x, "getHandshakeFields", js.Any.fromFunction1(value))
    
    inline def setSandboxId(value: String): Self = StObject.set(x, "sandboxId", value.asInstanceOf[js.Any])
  }
}
