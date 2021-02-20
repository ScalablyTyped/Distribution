package typings.zoneJs

import typings.zoneJs.zoneJsStrings.microTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MicroTask extends Task {
  
  @JSName("type")
  var type_MicroTask: microTask = js.native
}
object MicroTask {
  
  @scala.inline
  def apply(
    callback: js.Function,
    cancelScheduleRequest: () => Unit,
    invoke: js.Function,
    runCount: Double,
    source: String,
    state: TaskState,
    `type`: microTask,
    zone: Zone
  ): MicroTask = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], cancelScheduleRequest = js.Any.fromFunction0(cancelScheduleRequest), invoke = invoke.asInstanceOf[js.Any], runCount = runCount.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicroTask]
  }
  
  @scala.inline
  implicit class MicroTaskMutableBuilder[Self <: MicroTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: microTask): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
