package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var apiUrl: js.UndefOr[String] = js.native
  
  var forceHttps: js.UndefOr[Boolean] = js.native
  
  var resource: js.UndefOr[String] = js.native
  
  var sandboxId: String = js.native
  
  var transports: js.UndefOr[js.Array[_]] = js.native
}
object Options {
  
  @scala.inline
  def apply(sandboxId: String): Options = {
    val __obj = js.Dynamic.literal(sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiUrl(value: String): Self = StObject.set(x, "apiUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUrlUndefined: Self = StObject.set(x, "apiUrl", js.undefined)
    
    @scala.inline
    def setForceHttps(value: Boolean): Self = StObject.set(x, "forceHttps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceHttpsUndefined: Self = StObject.set(x, "forceHttps", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setSandboxId(value: String): Self = StObject.set(x, "sandboxId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransports(value: js.Array[_]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
    
    @scala.inline
    def setTransportsVarargs(value: js.Any*): Self = StObject.set(x, "transports", js.Array(value :_*))
  }
}
