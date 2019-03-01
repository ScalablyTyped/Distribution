package typings
package zoneDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicroTask extends Task {
  @JSName("type")
  var type_MicroTask: zoneDotJsLib.zoneDotJsLibStrings.microTask
}

object MicroTask {
  @scala.inline
  def apply(
    callback: js.Function,
    cancelScheduleRequest: js.Function0[scala.Unit],
    invoke: js.Function,
    runCount: scala.Double,
    source: java.lang.String,
    state: TaskState,
    `type`: zoneDotJsLib.zoneDotJsLibStrings.microTask,
    zone: Zone,
    cancelFn: js.Function1[/* task */ Task, scala.Unit] = null,
    data: TaskData = null,
    scheduleFn: js.Function1[/* task */ Task, scala.Unit] = null
  ): MicroTask = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("cancelScheduleRequest")(cancelScheduleRequest)
    __obj.updateDynamic("invoke")(invoke)
    __obj.updateDynamic("runCount")(runCount)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("zone")(zone)
    if (cancelFn != null) __obj.updateDynamic("cancelFn")(cancelFn)
    if (data != null) __obj.updateDynamic("data")(data)
    if (scheduleFn != null) __obj.updateDynamic("scheduleFn")(scheduleFn)
    __obj.asInstanceOf[MicroTask]
  }
}

