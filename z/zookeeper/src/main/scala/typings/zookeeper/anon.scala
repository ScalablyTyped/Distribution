package typings.zookeeper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Auth extends StObject {
    
    var auth: String
    
    var perms: Double
    
    var scheme: String
  }
  object Auth {
    
    inline def apply(auth: String, perms: Double, scheme: String): Auth = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], perms = perms.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth]
    }
    
    extension [Self <: Auth](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setPerms(value: Double): Self = StObject.set(x, "perms", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
}
