package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends js.Object {
  
  var DEFAULT_DEPLOYMENT_ID: String = js.native
}
object Service {
  
  @scala.inline
  def apply(DEFAULT_DEPLOYMENT_ID: String): Service = {
    val __obj = js.Dynamic.literal(DEFAULT_DEPLOYMENT_ID = DEFAULT_DEPLOYMENT_ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDEFAULT_DEPLOYMENT_ID(value: String): Self = this.set("DEFAULT_DEPLOYMENT_ID", value.asInstanceOf[js.Any])
  }
}
