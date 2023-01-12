package typings.zoneJs

import typings.zoneJs.zoneJsStrings.eventTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTask
  extends StObject
     with Task {
  
  @JSName("type")
  var type_EventTask: eventTask
}
object EventTask {
  
  inline def apply(
    callback: js.Function,
    cancelScheduleRequest: () => Unit,
    invoke: js.Function,
    runCount: Double,
    source: String,
    state: TaskState,
    zone: Zone
  ): EventTask = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], cancelScheduleRequest = js.Any.fromFunction0(cancelScheduleRequest), invoke = invoke.asInstanceOf[js.Any], runCount = runCount.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("eventTask")
    __obj.asInstanceOf[EventTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventTask] (val x: Self) extends AnyVal {
    
    inline def setType(value: eventTask): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
