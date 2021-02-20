package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractHandshakeOptions extends StObject {
  
  var authType: String = js.native
  
  var deploymentId: String = js.native
  
  var sandboxId: String = js.native
}
object AbstractHandshakeOptions {
  
  @scala.inline
  def apply(authType: String, deploymentId: String, sandboxId: String): AbstractHandshakeOptions = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractHandshakeOptions]
  }
  
  @scala.inline
  implicit class AbstractHandshakeOptionsMutableBuilder[Self <: AbstractHandshakeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxId(value: String): Self = StObject.set(x, "sandboxId", value.asInstanceOf[js.Any])
  }
}
