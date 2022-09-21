package typings.zchatBrowser.mod

import typings.zchatBrowser.zchatBrowserStrings.away
import typings.zchatBrowser.zchatBrowserStrings.offline
import typings.zchatBrowser.zchatBrowserStrings.online
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Department extends StObject {
  
  var id: Double
  
  var name: String
  
  var status: online | away | offline
}
object Department {
  
  inline def apply(id: Double, name: String, status: online | away | offline): Department = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Department]
  }
  
  extension [Self <: Department](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: online | away | offline): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
