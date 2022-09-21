package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceDeclaration extends StObject {
  
  var Type: Service
  
  var deploymentId: js.UndefOr[String] = js.undefined
  
  var listener: js.UndefOr[Any] = js.undefined
}
object ServiceDeclaration {
  
  inline def apply(Type: Service): ServiceDeclaration = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDeclaration]
  }
  
  extension [Self <: ServiceDeclaration](x: Self) {
    
    inline def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setListener(value: Any): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
    
    inline def setType(value: Service): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
