package typings.yup.anon

import typings.yup.mod.WhenOptionsBuilderObjectIs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Is extends js.Object {
  
  var is: WhenOptionsBuilderObjectIs = js.native
  
  var otherwise: js.Any = js.native
  
  var `then`: js.Any = js.native
}
object Is {
  
  @scala.inline
  def apply(otherwise: js.Any, `then`: js.Any): Is = {
    val __obj = js.Dynamic.literal(otherwise = otherwise.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Is]
  }
  
  @scala.inline
  implicit class IsOps[Self <: Is] (val x: Self) extends AnyVal {
    
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
    def setOtherwise(value: js.Any): Self = this.set("otherwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThen(value: js.Any): Self = this.set("then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFunction1(value: /* repeated */ js.Any => Boolean): Self = this.set("is", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIs(value: WhenOptionsBuilderObjectIs): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNull: Self = this.set("is", null)
  }
}
