package typings.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasTaskState extends js.Object {
  
  var change: TaskType = js.native
  
  var eventTask: Boolean = js.native
  
  var macroTask: Boolean = js.native
  
  var microTask: Boolean = js.native
}
object HasTaskState {
  
  @scala.inline
  def apply(change: TaskType, eventTask: Boolean, macroTask: Boolean, microTask: Boolean): HasTaskState = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], eventTask = eventTask.asInstanceOf[js.Any], macroTask = macroTask.asInstanceOf[js.Any], microTask = microTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasTaskState]
  }
  
  @scala.inline
  implicit class HasTaskStateOps[Self <: HasTaskState] (val x: Self) extends AnyVal {
    
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
    def setChange(value: TaskType): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTask(value: Boolean): Self = this.set("eventTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacroTask(value: Boolean): Self = this.set("macroTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicroTask(value: Boolean): Self = this.set("microTask", value.asInstanceOf[js.Any])
  }
}
