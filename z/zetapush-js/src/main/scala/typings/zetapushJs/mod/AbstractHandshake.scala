package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractHandshake extends StObject {
  
  var authType: String = js.native
  
  var authVersion: String = js.native
  
  var deploymentId: String = js.native
  
  def getHandshakeFields(client: Client): HandshakeFields = js.native
  
  var sandboxId: String = js.native
}
object AbstractHandshake {
  
  @scala.inline
  def apply(
    authType: String,
    authVersion: String,
    deploymentId: String,
    getHandshakeFields: Client => HandshakeFields,
    sandboxId: String
  ): AbstractHandshake = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], authVersion = authVersion.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], getHandshakeFields = js.Any.fromFunction1(getHandshakeFields), sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractHandshake]
  }
  
  @scala.inline
  implicit class AbstractHandshakeMutableBuilder[Self <: AbstractHandshake] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthVersion(value: String): Self = StObject.set(x, "authVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetHandshakeFields(value: Client => HandshakeFields): Self = StObject.set(x, "getHandshakeFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSandboxId(value: String): Self = StObject.set(x, "sandboxId", value.asInstanceOf[js.Any])
  }
}
