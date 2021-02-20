package typings.zchatBrowser.mod

import typings.zchatBrowser.zchatBrowserStrings.offline
import typings.zchatBrowser.zchatBrowserStrings.online
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Department extends StObject {
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var status: online | offline = js.native
}
object Department {
  
  @scala.inline
  def apply(id: Double, name: String, status: online | offline): Department = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Department]
  }
  
  @scala.inline
  implicit class DepartmentMutableBuilder[Self <: Department] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: online | offline): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
