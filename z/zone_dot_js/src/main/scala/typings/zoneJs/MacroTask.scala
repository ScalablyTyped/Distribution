package typings.zoneJs

import typings.zoneJs.zoneJsStrings.macroTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacroTask extends Task {
  
  @JSName("type")
  var type_MacroTask: macroTask = js.native
}
object MacroTask {
  
  @scala.inline
  def apply(
    callback: js.Function,
    cancelScheduleRequest: () => Unit,
    invoke: js.Function,
    runCount: Double,
    source: String,
    state: TaskState,
    `type`: macroTask,
    zone: Zone
  ): MacroTask = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], cancelScheduleRequest = js.Any.fromFunction0(cancelScheduleRequest), invoke = invoke.asInstanceOf[js.Any], runCount = runCount.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacroTask]
  }
  
  @scala.inline
  implicit class MacroTaskMutableBuilder[Self <: MacroTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: macroTask): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
