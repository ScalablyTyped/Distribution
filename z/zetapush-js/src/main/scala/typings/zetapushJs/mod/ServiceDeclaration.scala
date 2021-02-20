package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceDeclaration extends StObject {
  
  var Type: Service = js.native
  
  var deploymentId: js.UndefOr[String] = js.native
  
  var listener: js.UndefOr[js.Any] = js.native
}
object ServiceDeclaration {
  
  @scala.inline
  def apply(Type: Service): ServiceDeclaration = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDeclaration]
  }
  
  @scala.inline
  implicit class ServiceDeclarationMutableBuilder[Self <: ServiceDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    @scala.inline
    def setListener(value: js.Any): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
    
    @scala.inline
    def setType(value: Service): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
