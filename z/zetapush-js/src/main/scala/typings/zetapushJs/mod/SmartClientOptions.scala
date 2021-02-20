package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartClientOptions extends Options {
  
  var deployment: js.UndefOr[SmartClientDeployment] = js.native
}
object SmartClientOptions {
  
  @scala.inline
  def apply(sandboxId: String): SmartClientOptions = {
    val __obj = js.Dynamic.literal(sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartClientOptions]
  }
  
  @scala.inline
  implicit class SmartClientOptionsMutableBuilder[Self <: SmartClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployment(value: SmartClientDeployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
  }
}
