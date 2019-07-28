package typings.zoneDotJs

import typings.zoneDotJs.zoneDotJsStrings.eventTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTask extends Task {
  @JSName("type")
  var type_EventTask: eventTask
}

object EventTask {
  @scala.inline
  def apply(
    callback: js.Function,
    cancelScheduleRequest: () => Unit,
    invoke: js.Function,
    runCount: Double,
    source: String,
    state: TaskState,
    `type`: eventTask,
    zone: Zone,
    cancelFn: /* task */ Task => Unit = null,
    data: TaskData = null,
    scheduleFn: /* task */ Task => Unit = null
  ): EventTask = {
    val __obj = js.Dynamic.literal(callback = callback, cancelScheduleRequest = js.Any.fromFunction0(cancelScheduleRequest), invoke = invoke, runCount = runCount, source = source, state = state, zone = zone)
    __obj.updateDynamic("type")(`type`)
    if (cancelFn != null) __obj.updateDynamic("cancelFn")(js.Any.fromFunction1(cancelFn))
    if (data != null) __obj.updateDynamic("data")(data)
    if (scheduleFn != null) __obj.updateDynamic("scheduleFn")(js.Any.fromFunction1(scheduleFn))
    __obj.asInstanceOf[EventTask]
  }
}

