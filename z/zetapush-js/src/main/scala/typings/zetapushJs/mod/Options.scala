package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var apiUrl: js.UndefOr[String] = js.undefined
  
  var forceHttps: js.UndefOr[Boolean] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var sandboxId: String
  
  var transports: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object Options {
  
  inline def apply(sandboxId: String): Options = {
    val __obj = js.Dynamic.literal(sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setApiUrl(value: String): Self = StObject.set(x, "apiUrl", value.asInstanceOf[js.Any])
    
    inline def setApiUrlUndefined: Self = StObject.set(x, "apiUrl", js.undefined)
    
    inline def setForceHttps(value: Boolean): Self = StObject.set(x, "forceHttps", value.asInstanceOf[js.Any])
    
    inline def setForceHttpsUndefined: Self = StObject.set(x, "forceHttps", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setSandboxId(value: String): Self = StObject.set(x, "sandboxId", value.asInstanceOf[js.Any])
    
    inline def setTransports(value: js.Array[js.Any]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
    
    inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
    
    inline def setTransportsVarargs(value: js.Any*): Self = StObject.set(x, "transports", js.Array(value :_*))
  }
}
