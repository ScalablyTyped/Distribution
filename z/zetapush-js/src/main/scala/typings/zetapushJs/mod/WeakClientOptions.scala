package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeakClientOptions
  extends StObject
     with Options {
  
  var deploymentId: js.UndefOr[String] = js.undefined
}
object WeakClientOptions {
  
  @scala.inline
  def apply(sandboxId: String): WeakClientOptions = {
    val __obj = js.Dynamic.literal(sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakClientOptions]
  }
  
  @scala.inline
  implicit class WeakClientOptionsMutableBuilder[Self <: WeakClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
  }
}
