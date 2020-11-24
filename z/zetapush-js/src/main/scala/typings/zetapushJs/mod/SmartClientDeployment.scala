package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartClientDeployment extends js.Object {
  
  var simple: js.UndefOr[String] = js.native
  
  var weak: js.UndefOr[String] = js.native
}
object SmartClientDeployment {
  
  @scala.inline
  def apply(): SmartClientDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartClientDeployment]
  }
  
  @scala.inline
  implicit class SmartClientDeploymentOps[Self <: SmartClientDeployment] (val x: Self) extends AnyVal {
    
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
    def setSimple(value: String): Self = this.set("simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimple: Self = this.set("simple", js.undefined)
    
    @scala.inline
    def setWeak(value: String): Self = this.set("weak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeak: Self = this.set("weak", js.undefined)
  }
}
