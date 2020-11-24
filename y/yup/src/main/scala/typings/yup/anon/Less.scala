package typings.yup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Less extends js.Object {
  
  var less: Double = js.native
}
object Less {
  
  @scala.inline
  def apply(less: Double): Less = {
    val __obj = js.Dynamic.literal(less = less.asInstanceOf[js.Any])
    __obj.asInstanceOf[Less]
  }
  
  @scala.inline
  implicit class LessOps[Self <: Less] (val x: Self) extends AnyVal {
    
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
    def setLess(value: Double): Self = this.set("less", value.asInstanceOf[js.Any])
  }
}
