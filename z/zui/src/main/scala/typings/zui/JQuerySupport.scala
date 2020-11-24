package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuerySupport extends js.Object {
  
  var transition: Boolean | TransitionEventNames = js.native
}
object JQuerySupport {
  
  @scala.inline
  def apply(transition: Boolean | TransitionEventNames): JQuerySupport = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySupport]
  }
  
  @scala.inline
  implicit class JQuerySupportOps[Self <: JQuerySupport] (val x: Self) extends AnyVal {
    
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
    def setTransition(value: Boolean | TransitionEventNames): Self = this.set("transition", value.asInstanceOf[js.Any])
  }
}
