package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartClientOptions
  extends StObject
     with Options {
  
  var deployment: js.UndefOr[SmartClientDeployment] = js.undefined
}
object SmartClientOptions {
  
  inline def apply(sandboxId: String): SmartClientOptions = {
    val __obj = js.Dynamic.literal(sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartClientOptions] (val x: Self) extends AnyVal {
    
    inline def setDeployment(value: SmartClientDeployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
  }
}
