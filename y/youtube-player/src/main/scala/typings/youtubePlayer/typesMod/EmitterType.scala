package typings.youtubePlayer.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitterType extends js.Object {
  
  def trigger(eventName: String, event: js.Object): Unit = js.native
}
object EmitterType {
  
  @scala.inline
  def apply(trigger: (String, js.Object) => Unit): EmitterType = {
    val __obj = js.Dynamic.literal(trigger = js.Any.fromFunction2(trigger))
    __obj.asInstanceOf[EmitterType]
  }
  
  @scala.inline
  implicit class EmitterTypeOps[Self <: EmitterType] (val x: Self) extends AnyVal {
    
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
    def setTrigger(value: (String, js.Object) => Unit): Self = this.set("trigger", js.Any.fromFunction2(value))
  }
}
